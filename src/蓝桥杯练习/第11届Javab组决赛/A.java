package 蓝桥杯练习.第11届Javab组决赛;

public class A {
    public static void main(String[] args) {
        int result = 0;
        for (int i = 1; i <= 2020 ; ++i) {
            int help=i;
            while (true){
                if (help%10==2){
                    ++result;
                    break;
                }
                if (help>9){
                    help/=10;
                }else break;
            }
        }
        System.out.println(result);
    }
//    答案563
}
