package Java测试2022.Test2022_12_25;

public class 数据结构第八次作业 {
    public static void sort(int[] a, int low, int high) {
        int start = low;
        int end = high;
        int key = a[low];
        while (end > start) {
            while (end > start && a[end] >= key)
                end--;
            if (a[end] < key) {
                int temp = a[end];
                a[end] = a[start];
                a[start] = temp;
            }
            while (end > start && a[start] <= key)
                start++;
            if (a[start] > key) {
                int temp = a[start];
                a[start] = a[end];
                a[end] = temp;
            }
        }
        if (start > low) sort(a, low, start - 1);
        if (end < high) sort(a, end + 1, high);
    }

    public static int recursionBinarySearch(int[] arr, int key, int low, int high) {
        if (key < arr[low] || key > arr[high] || low > high) {
            return -1;
        }
        int middle = (low + high) / 2;
        if (arr[middle] > key) {
            return recursionBinarySearch(arr, key, low, middle - 1);
        } else if (arr[middle] < key) {
            return recursionBinarySearch(arr, key, middle + 1, high);
        } else {
            return middle;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        sort(arr, 0, arr.length - 1);
        for (int a : arr
        ) {
            System.out.print(a + " ");
        }
        System.out.println(" ");
        System.out.println("查询的数字在数组的" + recursionBinarySearch(arr, 9, 0, arr.length - 1) + "位置");
    }

}