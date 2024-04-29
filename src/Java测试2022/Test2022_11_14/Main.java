package Test2022_11_14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
            Scanner scanner=new Scanner(System.in);
            String []Array=new String[30];
            for(int i=0;i<30;i++){
                Array[i]=scanner.next();
            }
            //System.out.println("Over!");
            int count=0;
            for(int l=1;l<29;l++) //第一行和最后一行元素的上下左右不全部存在，不用比较
                for (int c=1;c<59;c++){ //同理第列和最后一列元素也不用比较
                    if(Array[l].charAt(c)<Array[l-1].charAt(c)&&Array[l].charAt(c)<Array[l+1].charAt(c)&&Array[l].charAt(c)<Array[l].charAt(c-1)&&Array[l].charAt(c)<Array[l].charAt(c+1))
                        count++;
                }
            System.out.print(count);
        }

    }

