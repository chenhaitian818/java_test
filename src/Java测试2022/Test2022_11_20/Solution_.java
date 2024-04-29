package Test2022_11_20;

class Solution_ {
    public double champagneTower(int poured, int query_row, int query_glass) {
        double[][] arr = new double[query_row + 2][query_row + 2];
        arr[1][1] = poured;
        for (int row = 2; row <= query_row + 1; row++) {
            for (int column = 1; column <= row; column++) {
                arr[row][column] = Math.max(arr[row - 1][column - 1] - 1, 0) / 2 + Math.max(arr[row - 1][column] - 1, 0) / 2;
            }
        }
        return Math.min(arr[query_row + 1][query_glass + 1], 1);
    }
}
