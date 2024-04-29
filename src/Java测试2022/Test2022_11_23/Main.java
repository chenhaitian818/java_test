package Test2022_11_23;

public class Main {
    public static void main(String[] args) {
        int x = 0,k;
        for (int i = 0;; i++) {
            k=i;
            while (k>=1){
                if ((k%10)==1){
                    x++;}
                 k/=10;
                if (k==0)
                    break;
            }
            if (x==2021){
                System.out.println(i);
                return;
            }
        }
    }
}