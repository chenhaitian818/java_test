package Test2022_11_03;

import java.util.LinkedList;

public class Main2 {
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        linkedList.add("123");
        linkedList.add("456");
        linkedList.add("789");
        for (Object s:linkedList) {
            System.out.println(s);
        }
    }
}
