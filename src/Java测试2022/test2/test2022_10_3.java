package test2;

public class test2022_10_3 {
    public static void main(String[] args){
        Person people=new Person();
        System.out.println(people.age);
        people.age=-100;
        System.out.println(people.age);
        Person New=new Person();
        System.out.println(New.age);
    }
}
class Person{
    int age;
}
