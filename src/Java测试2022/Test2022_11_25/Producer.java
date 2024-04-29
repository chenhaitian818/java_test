package Test2022_11_25;


import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {
    private BlockingQueue<String> queue;

    public Producer(BlockingQueue<String> q) {
        this.queue = q;
    }

    @Override
    public void run() {
        //produce Strings
        for (int i = 0; i < 100; i++) {
            String msg = i + "";
            try {
                Thread.sleep(i);
                queue.put(msg);
                System.out.println("Produced " + msg);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //adding exit String
        String msg = new String("exit");
        try {
            queue.put(msg);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}