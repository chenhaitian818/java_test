package Test2022_11_15;

public class Main {
    public static void main(String[] args) {
        int[][] Array=new int[100][100];
        for (int i = 0; i <= 99; i++) {
            for (int j = 0; j <= 99; j++) {
                Array[i][j]=i+j*2+1;
            }
        }
        for (int[] ss:Array) {
            for (int s:ss){
                System.out.print(s+"\t");
            }
            System.out.println();
        }

    }
}
