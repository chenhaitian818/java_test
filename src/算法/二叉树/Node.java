package 算法.二叉树;

public class Node {
    Node left;
    Node right;
    char date;

    public Node(char data) {
        left = null;
        right = null;
        this.date = data;
    }

    public char getDate() {
        return date;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setDate(char date) {
        this.date = date;
    }
}
