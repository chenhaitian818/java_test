package Test2022_11_25;

import java.util.ArrayList;

public class MyStackDemo {
    public static void main(String[] args) {
        ArrayStack<Integer> stackDemo = new ArrayStack();
        //入栈两个元素
        stackDemo.push(1);
        stackDemo.push(2);

        System.out.println("栈顶元素：" + stackDemo.top());
        System.out.println("栈大小：" + stackDemo.size());

        stackDemo.pop();
        System.out.println("栈第一次弹出元素");

        stackDemo.pop();
        System.out.println("栈第二次弹出元素");

        stackDemo.pop();
    }
}

class ArrayStack<T> {
    private ArrayList<T> arrayList;
    private int stackSize;

    public ArrayStack() {
        this.stackSize = 0;
        this.arrayList = new ArrayList<>();
    }

    int size() {
        return stackSize;
    }

    boolean isEmpty() {
        return this.stackSize == 0;
    }

    //返回栈顶元素
    T top() {
        if (isEmpty()) {
            return null;
        }
        return arrayList.get(stackSize - 1);
    }

    //元素出栈
    T pop() {
        if (stackSize > 0) {
            return arrayList.get(--stackSize);
        } else {
            System.out.println("栈中无元素了");
            return null;
        }
    }

    //元素入栈
    void push(T item) {
        arrayList.add(item);
        stackSize++;
    }
}