package Java高级编程.实验七;

import java.io.*;

public class CopyImage_Buffered {
    public static void main(String[] args) {
        String sourcePath = "E:\\java_test\\src\\Java高级编程\\实验七\\img1\\test.png";
        String targetPath = "E:\\java_test\\src\\Java高级编程\\实验七\\img2\\test.png";

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(sourcePath));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(targetPath));
            int len;
            byte[] buffer = new byte[1024];

            while ((len = bis.read(buffer)) != -1) {
                bos.write(buffer, 0, len);
            }

            bos.close();
            bis.close();

            System.out.println("图片文件拷贝完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
