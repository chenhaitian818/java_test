package test2;

public class test2022_9_20 {
    public static void main(String[] arge){
        int i;
        int j;
        a:for(i=0;i<=250;i++)    {
            b:for (j=0;j<=2;j++){
            System.out.println("i="+i);
            continue a;//下面不执行了跳到a:for
        }

        }
    }

}
