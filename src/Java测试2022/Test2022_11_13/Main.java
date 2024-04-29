package Test2022_11_13;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread=new MyThread();
        myThread.start();
        MyThread2 myThread2=new MyThread2();
        myThread2.start();
        Thread currentThread=Thread.currentThread();
        myThread2.join();
        for (int i = 0; i < 100; i++) {
            System.out.println(currentThread+""+i);
        }
    }
    static class MyThread extends Thread{
        public void run(){
            for (int i = 0; i < 100; i++) {
                Thread currentThread =Thread.currentThread();
                System.out.println(currentThread.getName()+"--->"+i);
            }
        }
    }
    static class MyThread2 extends Thread{
        public void run(){
            for (int i = 0; i < 100; i++) {
                Thread currentThread =Thread.currentThread();
                System.out.println(currentThread.getName()+"--->"+i);
            }
        }
    }
}
