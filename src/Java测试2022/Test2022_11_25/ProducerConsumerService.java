package Test2022_11_25;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ProducerConsumerService {

    public static void main(String[] args) {
        //Creating BlockingQueue of size 10
        BlockingQueue<String> queue = new ArrayBlockingQueue<>(10);
        Producer producer = new Producer(queue);
        Consumer consumer = new Consumer(queue);
        //starting producer to produce Strings in queue
        new Thread(producer).start();
        //starting consumer to consume Strings from queue
        new Thread(consumer).start();
        System.out.println("Producer and Consumer has been started");
    }

}