package 力扣题;

public class 翻转字符串单词 {
    public String reverseWords(String s) {
        StringBuilder x = new StringBuilder();
        int i = s.length() - 1;
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) == ' ') {
                i--;
            }
            int end = i;
            while (i >= 0 && s.charAt(i) != ' ') {
                i--;
            }
            if (i != end) {
                x.append(s.substring(i + 1, end + 1));
                x.append(" ");
            }
        }
        x.delete(x.length() - 1, x.length());
        return new String(x.toString());
    }
}
