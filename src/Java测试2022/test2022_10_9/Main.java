package test2022_10_9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Parrot parrot = new Parrot();
        System.out.println("请问你是要喂养你的宠物狗呢，还是喂养你的宠物猫呢，还是说你的鹦鹉呢？");
        System.out.println("如果要喂狗就扣1，喂猫扣2，喂鹦鹉扣3");
        Scanner sr2 = new Scanner(System.in);
        int name = sr2.nextInt();
        Pet a = null;
        if (name == 1) {
             a = new Dog();
        } else if (name == 2) {
             a = new Cat();
        } else if (name == 3) {
             a = new Parrot();
        }
        Master people = new Master();
        System.out.println("你是否要喂你的宠物？");
        Scanner sr = new Scanner(System.in);
        System.out.println("如果是请输入ture，如果不是请输入false");
        String command =sr.next();
//        System.out.println(a.eat());
        people.feed(command,a);
    }
}
