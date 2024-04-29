package Test2022_12_13;

public class Main {
    public static boolean checkIfPangram(String sentence){
        int[] arr=new int[26];
        for (int i = 0; i < sentence.length(); i++) {
            arr[sentence.charAt(i)-'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (arr[i]==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}
