package Java高级编程.实验十;

import java.net.*;
import java.io.*;

public class URLDemo {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.baidu.com");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();
            conn.setRequestMethod("GET");
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
