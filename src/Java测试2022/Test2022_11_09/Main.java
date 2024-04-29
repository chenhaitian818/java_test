package Test2022_11_09;

import javax.swing.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream=null;
        try {
            fileInputStream =new FileInputStream("C:\\Users\\陈楚\\Desktop\\java_test\\qqdd.txt");
            byte[] bytes =new byte[4];
            while (true){
                int readCount = fileInputStream.read(bytes);
                if(readCount == -1){
                    break;
                }
                System.out.println(new String(bytes,0,readCount));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (fileInputStream !=null){
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            }
    }
    }
