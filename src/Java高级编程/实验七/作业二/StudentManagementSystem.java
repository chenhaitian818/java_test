package Java高级编程.实验七.作业二;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private static final String FILE_PATH = "Student.dat";

    // 添加学生信息
    private static void addStudent() {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入学员姓名：");
        String name = input.next();
        System.out.print("请输入学员年龄：");
        int age = input.nextInt();
        System.out.print("请输入学员性别：");
        String gender = input.next();

        Student student = new Student(name, age, gender);
        List<Student> studentList = readFromFile();
        studentList.add(student);
        writeToFile(studentList);

        System.out.println("添加学生信息成功！");
    }

    // 修改学生信息
    private static void updateStudent() {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入要修改的学员姓名：");
        String name = input.next();
        boolean flag = false;

        List<Student> studentList = readFromFile();

        for (int i = 0; i < studentList.size(); i++) {
            Student student = studentList.get(i);

            if (student.getName().equals(name)) {
                System.out.print("请输入学员年龄：");
                int age = input.nextInt();
                System.out.print("请输入学员性别：");
                String gender = input.next();

                student.setAge(age);
                student.setGender(gender);

                studentList.set(i, student);
                writeToFile(studentList);

                System.out.println("修改学生信息成功！");
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("未找到该学生信息！");
        }
    }

    // 删除学生信息
    private static void deleteStudent() {
        List<Student> studentList = new ArrayList<>();
        writeToFile(studentList);

        System.out.println("删除学生信息成功！");
    }

    // 查找学生信息
    private static void searchStudent() {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入要查找的学员姓名：");
        String name = input.next();
        boolean flag = false;

        List<Student> studentList = readFromFile();

        for (Student student : studentList) {
            if (student.getName().equals(name)) {
                System.out.println(student);
                flag = true;
                break;
            }
        }

        if (!flag) {
            System.out.println("未找到该学生信息！");
        }
    }

    // 从文件中读取学生信息
    private static List<Student> readFromFile() {
        List<Student> studentList = new ArrayList<>();

        try {
            FileInputStream fileIn = new FileInputStream(FILE_PATH);
            ObjectInputStream in = new ObjectInputStream(fileIn);
            studentList = (List<Student>) in.readObject();
            in.close();
            fileIn.close();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("文件不存在或读取错误！");
        }

        return studentList;
    }

    // 将学生信息写入文件
    private static void writeToFile(List<Student> studentList) {
        try {
            FileOutputStream fileOut = new FileOutputStream(FILE_PATH);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(studentList);
            out.close();
            fileOut.close();
        } catch (IOException e) {
            System.out.println("文件写入错误！");
        }
    }

    // 操作选择界面
    private static int choice() {
        Scanner input = new Scanner(System.in);
        System.out.println("*************学生管理系统****************");
        System.out.println("【1】添加学生");
        System.out.println("【2】修改学生");
        System.out.println("【3】删除学生");
        System.out.println("【4】查找学生");
        System.out.println("【0】退出系统");
        System.out.print("请输入您的选择（0-4）：");

        while (!input.hasNextInt()) {
            System.out.println("您的输入有误，请重新输入：");
            input.next();
        }

        int choice = input.nextInt();
        input.nextLine();

        if (choice < 0 || choice > 4) {
            System.out.println("您的输入有误，请重新输入：");
            choice = choice();
        }

        return choice;
    }

    public static void main(String[] args) {
        int choice;

        do {
            choice = choice();

            switch (choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    searchStudent();
                    break;
                case 0:
                    System.out.println("即将退出系统，谢谢使用！");
                    break;
                default:
                    break;
            }
        } while (choice != 0);
    }
}