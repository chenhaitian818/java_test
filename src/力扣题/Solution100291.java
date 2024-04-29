package 力扣题;

public class Solution100291 {
    public static void main(String[] args) {
        System.out.println(numberOfSpecialChars("AbBCab"));
    }
    public static int numberOfSpecialChars(String word) {
        int answer = 0;
        int[] sm = new int[26];
        int[] bg = new int[26];
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)<='z'&&word.charAt(i)>='a'){
                sm[word.charAt(i)-'a'] = i+1;

            }
            if (word.charAt(i)<='Z'&&word.charAt(i)>='A'&&bg[word.charAt(i)-'A']==0){
                bg[word.charAt(i)-'A']=i+1;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (sm[i]<bg[i]&&sm[i]!=0){
                answer++;
            }
        }
        return answer;
    }
}
