package 蓝桥杯练习.第12届JavaA组;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class E {
    static ArrayList<Integer>[] list;
    static Map<String,Long> set=new HashMap<String,Long>();
    public static void main(String[] args) {

/*        for (int i = 1; i <=21 ; ++i) {

        }*/

    }

    public static boolean hz(int a, int b) {
        int c = a * b;
        return c % a != 0 && c % b != 0;
    }
}
