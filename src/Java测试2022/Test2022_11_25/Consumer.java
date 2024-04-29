package Test2022_11_25;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{

    private BlockingQueue<String> queue;

    public Consumer(BlockingQueue<String> q){
        this.queue=q;
    }

    @Override
    public void run() {
        try{
            String msg;
            //consuming Strings until exit String is received
            while(!(msg = queue.take()).equals("exit")){
                Thread.sleep(10);
                System.out.println("Consumed "+msg);
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}