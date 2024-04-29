package Java高级编程.实验九;

public class MyThreadThree implements Runnable {

    private Integer sum = 0;
    private int num = 0;

    public void run() {
        while (true) {
            synchronized (MyThreadThree.class) {
                if (num>100)
                    break;
                sum += num;
                System.out.println(Thread.currentThread().getName() + "：" + sum);
                num++;
            }
        }
    }

    public static void main(String[] args) {
        MyThreadThree threadThree = new MyThreadThree();
        Thread thread1 = new Thread(threadThree, "线程一");
        Thread thread2 = new Thread(threadThree, "线程二");
        Thread thread3 = new Thread(threadThree, "线程三");

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
