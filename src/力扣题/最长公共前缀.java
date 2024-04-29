package 力扣题;

public class 最长公共前缀 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length ==0||minvalue(strs)==0)
            return "";
        int x = 1;
        String y = strs[0].substring(0,x);
        int i = 0;
        while (strs[i].startsWith(y)&&x<=minvalue(strs)) {
            if (i == strs.length - 1) {
                i = 0;
                x++;
                y = strs[0].substring(0,x);
            }
                i++;
        }
        if (x==1)
            return "";
        return strs[0].substring(0,x-1);
    }
    public int minvalue(String[] strs){
        int n=0;
        for (int i = 1; i < strs.length-1; i++) {
            n=Math.min(strs[i-1].length(),strs[i].length());
        }
        return n;
    }
}
