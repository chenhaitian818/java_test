package Java高级编程.实验七;


import java.io.*;

public class CopyImage_File {
    public static void main(String[] args) {
        String sourcePath = "E:\\java_test\\src\\Java高级编程\\实验七\\img1\\test.png";
        String targetPath = "E:\\java_test\\src\\Java高级编程\\实验七\\img2\\test.png";

        try {
            FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(targetPath);
            int len;
            byte[] buffer = new byte[1024];

            while ((len = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
            }

            fos.close();
            fis.close();

            System.out.println("图片文件拷贝完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
