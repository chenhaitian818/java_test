package test2;

public class Test2022_10_6 {
    public static void main(String[] args) {
        Husband h=new Husband(110,"zhangshan","flase",null);
        Wife w=new Wife(110,"zhangshan","flase",null);
        h.wife=w;
        w.husband=h;
        System.out.println();
    }

}

class Husband {
    int id;
    String name;
    String cs;
    Wife wife;

    public Husband() {

    }

    public Husband(int i, String n, String c, Wife w) {
        i = id;
        n = name;
        c = cs;
        w = wife;
    }
}

class Wife {
    int id;
    String name;
    String cs;
    Husband husband;

    public Wife() {

    }

    public Wife(int i, String n, String c, Husband h) {
        i = id;
        n = name;
        c = cs;
        h = husband;
    }
}