
/*        System.out.println("--------------欢迎使用计算机--------------");
        System.out.println("----------请选择你要进行的复数运算类型-------");
        System.out.println("----------1、复数的加法运算---------------");
        System.out.println("----------2、复数的减法运算---------------");
        System.out.println("----------3、复数的乘法运算---------------");
        System.out.println("----------4、复数的除法运算---------------");
        System.out.println("----------0、退出程序--------------------");
        Scanner scanner=new Scanner(System.in);
        switch (scanner.nextInt()){
            Complex com1=new Complex(scanner.nextDouble(),scanner.nextDouble());
            Complex com2=new Complex(scanner.nextDouble(),scanner.nextDouble());
            Complex com3=new Complex();
            case 1:
                System.out.println("复数加法：");
                com3=com3.add(com1,com2);
                com3.print();
                break;
            case 2:
                System.out.println("复数减法：");
                com3=com3.subduction(com1,com2);
                com3.print();
                break;
            case 3:
                System.out.println("复数乘法：");
                com5=com5.multiplication(com3,com4);//(5.0+6.0i)*(4.0+8.0i)=-28.0+64.0i
                com5.print();
                break;
            case 4:
                System.out.println("复数除法：");//(1.0+2.0i)/(4.0+8.0i)=0.25+0.0i
                com5=com5.division(com1,com4);
                com5.print();
                break;
            case 0:
                System.out.println();
                break;
            default:
                System.out.println("输入错误程序结束");
                break;*/
//        }
package Test2022_10_27;

import static Test2022_10_27.Complex.module;

        public class Main {
            public static void main(String[] args)
            {
        Complex com1=new Complex(1,1);
        com1.print();
        Complex com2=new Complex(2,2);
        com2.print();
        Complex com5=new Complex(0,0);
        System.out.println("复数加法：");
        com5=com5.add(com1,com2);
        com5.print();
        System.out.println("-----------------------");
        System.out.println("复数减法：");
        com5=com5.subduction(com1,com2);
        com5.print();
        System.out.println("-----------------------");
        System.out.println("复数乘法：");
        com5=com5.multiplication(com1,com2);
        com5.print();
        System.out.println("-----------------------");
        System.out.println("复数除法：");
        com5=com5.division(com1,com2);
        com5.print();
        System.out.println("-----------------------");
        System.out.println("复数的模：");
        double x=module(com2);
        System.out.println(x);
        System.out.println("-----------------------");
    }
}
