package Test2022_11_06;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"123");
        map.put(2,"234");
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        for (Map.Entry<Integer,String> node : set){
            System.out.println(node.getKey()+"--->"+node.getValue());
        }
        Iterator<Map.Entry<Integer,String>> it1=set.iterator();
        while (it1.hasNext()){
            Map.Entry<Integer,String> node2= it1.next();
            Integer key= node2.getKey();
            String value=node2.getValue();
            System.out.println(key+"="+value);
        }
    }
}
