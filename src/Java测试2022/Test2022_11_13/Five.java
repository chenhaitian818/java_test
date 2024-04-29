package Test2022_11_13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        int[][] ints=new int[100][100];
        for (int i = 0; i <100 ; i++) {
            for (int j = 0; j <100 ; j++) {
                ints [i][j]=i+j*2+1;
            }
        }
        for (int[] ss:ints
             ) {
            System.out.println(Arrays.toString(ss));
        }

        }
    }

