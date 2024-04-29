package Test2022_10_16;

public class Main {
    public static void main(String[] args) {
        Adrres adrres=new Adrres();
        People people=new People();
        people.adrres=adrres;
//        people.adrres=new Adrres();
        System.out.println(people.adrres.code);
    }
}
