package 第13届蓝桥杯JavaC组_2022_12_2;

public class C {
    public static void main(String[] args) {
        for (int i = 10; ; i++) {
            String hex= String.valueOf(i);
            int parseInt = Integer.parseInt(hex,16);
            if ((parseInt%i)==0) {
                System.out.println(i);
                return;
            }
        }
    }
}
