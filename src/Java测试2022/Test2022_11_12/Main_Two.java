package Test2022_11_12;

public class Main_Two {
    public static void main(String[] args) {
        MyThread myThread=new MyThread();
        myThread.start();
        MyThread2 myThread2=new MyThread2();
        myThread2.start();
        Thread thread5=new Thread(new MyThread5());
        thread5.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->"+i);
        }
    }
    static class MyThread extends Thread{
        @Override
        public void run() {
            MyThread3 myThread3=new MyThread3();
            myThread3.start();
            for (int i = 0; i < 1000; i++) {
                System.out.println("分支线程--->"+i);
            }
        }
    }
    static class MyThread2 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("分支线程2--->"+i);
            }
        }
}
    static class MyThread3 extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("分支线程3--->"+i);
            }
        }
    }
    static class MyThread5 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 1000; i++) {
                System.out.println("分支线程5--->"+i);
            }
        }
    }
}
