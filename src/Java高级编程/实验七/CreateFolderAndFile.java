package Java高级编程.实验七;

import java.io.*;

public class CreateFolderAndFile {
    public static void main(String[] args) {
        // 创建文件夹和子文件夹
        File folder = new File("E:\\java_test\\src\\Java高级编程\\实验七\\Folder");
        folder.mkdirs();
        File subfolder = new File(folder, "Subfolder");
        subfolder.mkdirs();

        // 在子文件夹中创建一个记事本文件
        File file = new File(subfolder, "note.txt");
        try {
            file.createNewFile();
            FileWriter fw = new FileWriter(file);
            fw.write("这是一个记事本文件。");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("文件夹、子文件夹和记事本文件创建成功！");
    }
}
