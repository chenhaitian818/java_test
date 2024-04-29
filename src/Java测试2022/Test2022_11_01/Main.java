package Test2022_11_01;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Collection collection=new ArrayList();
        User u1=new User("abc");
        collection.add(u1);
        User u2=new User("123");
        collection.remove(u1);
        System.out.println(collection.size());
        Map map=new HashMap();
    }
}
class User{
    public User() {
    }
    public User(String string){

    }
}