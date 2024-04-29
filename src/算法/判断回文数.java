package 算法;

import java.util.Stack;

public class 判断回文数 {
    public static class Node {
        public int value;
        public Node next;

        public Node(int data) {
            this.value = data;
        }
    }

    public static boolean isPalindrome1(Node head) {
        Stack<Node> stack = new Stack<Node>();
        Node cur =head;
        while (cur!=null){
            stack.push(cur);
            cur=cur.next;
        }
        while (head !=null){
            if (head.value!=stack.pop().value)
                return false;
        }
        return true;
    }
}
