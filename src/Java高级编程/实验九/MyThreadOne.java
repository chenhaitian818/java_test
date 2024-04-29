package Java高级编程.实验九;

public class MyThreadOne extends Thread {
    // 重写run()方法
    public void run() {
        // 执行线程任务
        System.out.println("线程执行任务");
    }

    public static void main(String[] args) {
        // 创建三个ThreadOne实例，并启动它们
        MyThreadOne thread1 = new MyThreadOne();
        MyThreadOne thread2 = new MyThreadOne();
        MyThreadOne thread3 = new MyThreadOne();

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
