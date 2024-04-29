package Test2022_10_31;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        collection.add(123);
        collection.add(321);
        Iterator iterator=collection.iterator();
        while (iterator.hasNext()){
            Object obj=iterator.next();
            System.out.println(obj);
        }
    }
}
