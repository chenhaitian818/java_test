package Test2022_10_20;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(2);
        myStack.Push("1");
        myStack.Push("2");
        System.out.println(myStack.Pop());
        System.out.println(myStack.Pop());
    }
}
