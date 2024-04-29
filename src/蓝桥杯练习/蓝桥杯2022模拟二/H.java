package 蓝桥杯2022模拟二;

import java.util.Scanner;

public class H {
    public static boolean hw(String s){
        for (int i = 0; i < s.length(); i++) {
            int j=s.length()-1-i;
            if (s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s= scanner.next();
        if (hw(s)) {
            System.out.println(s);
            return;
        }
        String add ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            add+=s.charAt(i);
        }
        int j=0;
        for (int i = 1; i < s.length(); i++) {
            if (hw(s.substring(i))){
                j=i;
                break;
            }
        }
        System.out.println(s+add.substring(add.length()-j,add.length()));
    }
}
