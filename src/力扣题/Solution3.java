package 力扣题;

import java.util.HashSet;

public class Solution3 {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hashSet =new HashSet<Character>();
        int n = s.length();
        int right=-1,ans=0;
        for (int left = 0; left < n; ++left) {
            if (left!=0){
                hashSet.remove(s.charAt(left-1));
            }
            while (right+1<n && !hashSet.contains(s.charAt(right+1))){
                hashSet.add(s.charAt(right+1));
                ++right;
            }
            ans=Math.max(ans,right-left+1);
        }
        return ans;
    }
}
