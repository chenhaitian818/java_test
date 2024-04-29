package Test2022_10_20;

public class MyStack {
    Object[] elements;
    int index;

    public MyStack(int index) {
        this.elements = new Object[index+1];
    }

    public void Push(Object obj) {
        if (index==elements.length-1){
            System.out.println("失败");
            return;
        }
        elements[index] = obj;
        index++;
    }

    public Object Pop() {
        if (index==0) {
            System.out.println("失败");
            return null;
        }
        Object o = elements[index];
        index--;
        return o;
    }
}
