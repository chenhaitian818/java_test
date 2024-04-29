package Java高级编程.实验九;

public class MyThreadTwo implements Runnable {
    // 重写run()方法
    public void run() {
        // 执行线程任务
        System.out.println("线程执行任务");
    }

    public static void main(String[] args) {
        // 创建两个ThreadTwo实例
        MyThreadTwo threadTwo1 = new MyThreadTwo();
        MyThreadTwo threadTwo2 = new MyThreadTwo();

        // 分别创建每个ThreadTwo实例的三个线程，并启动它们
        Thread thread1 = new Thread(threadTwo1);
        Thread thread2 = new Thread(threadTwo1);
        Thread thread3 = new Thread(threadTwo1);

        thread1.start();
        thread2.start();
        thread3.start();

        Thread thread4 = new Thread(threadTwo2);
        Thread thread5 = new Thread(threadTwo2);
        Thread thread6 = new Thread(threadTwo2);

        thread4.start();
        thread5.start();
        thread6.start();
    }
}
