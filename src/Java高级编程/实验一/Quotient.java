package Java高级编程.实验一;

public class Quotient {
    public static float quotient(float c,float bc){
        try {
            throw_quotient(c,bc);
            return c/bc;
        }
        catch (My_error my_error){
            System.out.println("My_error"+my_error.getMessage());
            my_error.printStackTrace();
        }
        finally {
            System.out.println("输入的数据已经被检查过了");
        }
        return 0;
    }
    public static void throw_quotient(float c,float bc) throws My_error{
        if (c>100||c<1||bc>100||bc<1){
            throw new My_error("输入的数不在规定范围内");
        }
    }
}
