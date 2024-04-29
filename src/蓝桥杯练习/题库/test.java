package 蓝桥杯练习.题库;

public class test {
    public static void main(String[] args) {
        int res=0;
        int a=1;
        int ha=a;
        int b=2;
        int hb=b;
        int n=2;
        res=1+(a+b+a*b)*n;
        while (ha>0){
            res+=ha*b;
            --ha;
        }
        while (hb>0){
            res+=hb*a;
            --hb;
        }
        System.out.println(res);
    }
}
