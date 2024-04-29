package Test2022_10_28;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        while (true) {
            int s = random.nextInt(10000) % (10000 - 1000 + 1) + 1000;
            if(s==10000) {
                System.out.println(s);
                break;
            }
        }

    }
}
