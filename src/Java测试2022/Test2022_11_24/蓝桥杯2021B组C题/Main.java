package Test2022_11_24.蓝桥杯2021B组C题;

public class Main {
    public static void main(String[] args) {
    }
    private int Straight_line_add(int point){
        int x=0;
        for (int i = point-1; i>=1; i--) {
            x+=i;
        }
        return  x;
    }
}
