package 力扣题;

public class Solution8049 {
    public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) {
        int column=Math.abs(fx-sx);
        int row=Math.abs(fy-sy);
        if (column+row==0&&t==1)return false;
        return ((t >= (Math.max(column, row))) && (t <= column + row))||(t>=column+row);
    }
}
