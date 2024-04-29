package Test2022_11_18;

import java.util.Arrays;
import java.util.Comparator;

public class Main {


    public static void main(String[] args) {
        Integer[] arr = {9, 8, 7, 2, 3, 4, 1, 0, 6, 5};
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        for (int x : arr) {
            System.out.print(x);
        }
    }
}
