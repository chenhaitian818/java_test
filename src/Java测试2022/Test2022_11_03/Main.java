package Test2022_11_03;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("123");
        linkedList.add("456");
        linkedList.add("789");
        Iterator<String> iterator=linkedList.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
