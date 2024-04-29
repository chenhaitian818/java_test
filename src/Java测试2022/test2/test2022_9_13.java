
package test2;

public class test2022_9_13 {
    public static void main(String[] arge){
//        System.out.println('"');
    int a = 10;
        int x=a+++a;//a+++a中先计算a++  然后先运算再a+1 所以x的值是a（10）+a（11）=21
        System.out.println("x="+x);
        System.out.println("a="+a);
    }
}
