package 力扣题;

public class Solution1750 {
    public int minimumLength(String s) {
        int l=0,r=s.length()-1;
        while (s.charAt(l)==s.charAt(r)&&r>l){
            char n=s.charAt(l);
            while (s.charAt(l)==n){
                l++;
                if (l==s.length())
                    return r-l+1;
            }
            while (s.charAt(r)==n&&r>l){
                r--;
            }
        }
        return r-l+1;
    }
}
