package 力扣题;

import java.util.HashSet;
import java.util.Set;

public class Solution100294 {
    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("aaAbcBC"));
    }
    public static int numberOfSpecialChars(String word) {
        int answer = 0;
        int[] sm = new int[26];
        int[] bg = new int[26];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)<='z'&&word.charAt(i)>='a'){
                sm[word.charAt(i)-'a']++;

            }
            if (word.charAt(i)<='Z'&&word.charAt(i)>='A'){
                bg[word.charAt(i)-'A']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (sm[i]>0&&bg[i]>0){
                answer++;
            }
        }
        return answer;
    }
}
