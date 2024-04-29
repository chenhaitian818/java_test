package 算法;
//二叉树递归遍历(中序)（纸的折痕问题）
public class PaperFolding {
    public static void printAllFolds(int n) {
        printProcess(1, n, true);
    }

    public static void printProcess(int i, int n, boolean down) {
        if (i > n) {
            return;
        }
        printProcess(i + 1, n, true);
        System.out.println(down ? "凹" : "凸");
        printProcess(i + 1, n, false);
    }

    public static void main(String[] args) {
        int n = 3;
        printAllFolds(n);
    }
}
