package 算法.二叉树;

public class Tree {
    Node root;
    int size;
    char[] data;

    public Tree(char[] data) {
        this.data = data;
        size = data.length;
        root = createTree(0);
    }

    public Node createTree(int index) {
        if (index >= size)
            return null;
        if (data[index] == '0')
            return null;
        Node node = new Node(data[index]);
        node.setLeft(createTree(2 * index + 1));
        node.setRight(createTree(2 * index + 2));
        return node;
    }

    public void preShow(Node node) {//先序遍历
        if (node != null) {
            System.out.println(node.getDate() + " ");
            preShow(node.getLeft());
            preShow(node.getRight());
        }
    }

    public void middleShow(Node node) {//中序遍历
        if (node != null) {
            middleShow(node.getLeft());
            System.out.println(node.getDate() + " ");
            middleShow(node.getRight());
        }
    }

    public void backShow(Node node) {//后续遍历
        if (node != null) {
            backShow(node.getLeft());
            backShow(node.getRight());
            System.out.println(node.getDate() + " ");
        }
    }

    public Node getRoot() {//得到根节点
        return root;
    }
}
