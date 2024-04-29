package Java高级编程.实验一;

public class My_error extends Exception{
    private String message;
    public My_error(String message){
        super(message);
        this.message=message;
    }
}
