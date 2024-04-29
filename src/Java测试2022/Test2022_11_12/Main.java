package Test2022_11_12;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        FileReader reader=new FileReader("E:\\java_test\\qqdd.txt");
        Properties properties=new Properties();
        properties.load(reader);
        String username=properties.getProperty("username");
        System.out.println(username);
    }
}
