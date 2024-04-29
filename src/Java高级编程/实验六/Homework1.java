package Java高级编程.实验六;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Homework1 {
    private String name;
    private String gender;
    private int age;

    public Homework1(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "姓名：" + name + "，性别：" + gender + "，年龄：" + age;
    }

    public static void main(String[] args) {
        List<Homework1> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("请输入学生信息（格式：姓名 性别 年龄），输入 exit 结束：");
        while (true) {
            String line = sc.nextLine();
            if ("exit".equals(line)) {
                break;
            }

            String[] parts = line.split(" ");
            Homework1 student = new Homework1(parts[0], parts[1], Integer.parseInt(parts[2]));
            students.add(student);
        }

        // for 循环输出
        System.out.println("使用 for 循环输出学员信息列表：");
        for (int i = 0; i < students.size(); i++) {
            Homework1 student = students.get(i);
            System.out.println(student);
        }

        // Iterator 迭代器输出
        System.out.println("\n使用 Iterator 迭代器输出学员信息列表：");
        Iterator<Homework1> it = students.iterator();
        while (it.hasNext()) {
            Homework1 student = it.next();
            System.out.println(student);
        }
    }
}