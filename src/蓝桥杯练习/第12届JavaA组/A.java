package 蓝桥杯练习.第12届JavaA组;

public class A {
    public static void main(String[] args) {
        for (double i = 1; i <= 1000000007; i++) {
            if ((i*2021)%1000000007==999999999){
                System.out.println(i);
            return;
            }
        }
    }
}
