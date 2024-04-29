package Java高级编程.实验七;

import java.io.*;

public class SerializeStudent {
    public static void main(String[] args) {
        String filePath = "Student.txt";

        // 创建学员对象并初始化数据
        Student student = new Student("张三", 20, "男");

        // 将学员对象信息序列化到文件中
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(student);

            oos.close();
            fos.close();

            System.out.println("学员信息已经成功写入到文件！");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // 从文件中反序列化学员对象信息并输出到控制台
        try {
            FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s = (Student) ois.readObject();

            System.out.println(s);

            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
