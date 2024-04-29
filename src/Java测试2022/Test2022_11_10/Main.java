package Test2022_11_10;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        File srcFile = new File("E:\\java_test");
        File destFile=new File("E:\\copy练习");
        copyDir(srcFile,destFile);
    }
    private static void copyDir(File srcFile,File destFile){
        if (srcFile.isFile()){
            return ;
        }
        File[] files=srcFile.listFiles();
        for (File file :files){
            System.out.println(file.getAbsolutePath());
            copyDir(file,destFile);
        }
    }
}
