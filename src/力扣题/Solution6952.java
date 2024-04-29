package 力扣题;

public class Solution6952 {
    public static void main(String[] args) {
        System.out.println();
    }

    public String finalString(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='i'&& result==null){
                ++i;
            }
            if (s.charAt(i) == 'i' && result != null) {
                result=down(result);
            } else {
                result = result + s.charAt(i);
            }
        }
        return result;
    }

    public String down(String s) {
        char[] characters = s.toCharArray();
        int left = 0;
        int right = characters.length - 1;
        while (left < right) {
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            left++;
            right--;
        }
        return new String(characters);
    }
}
