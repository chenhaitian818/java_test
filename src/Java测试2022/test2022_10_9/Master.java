package test2022_10_9;

public class Master {

    public Master(){

    }
    public void feed(String s,Pet pet){
        if(s.equals("ture")){
            System.out.println(pet.eat());
        }else {
            System.out.println("你的宠物饿死了");
        }
    }
}
