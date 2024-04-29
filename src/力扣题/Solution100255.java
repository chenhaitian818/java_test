package 力扣题;

public class Solution100255 {
    public static void main(String[] args) {
        System.out.println(minimumDeletions("zzfzzzzppfp", 1));
    }

    static int max = -1;
    static int min = 1000000;

    static int max_i = 0;
    static int min_i = 0;

    public static void max_function(int[] help) {
        max = -1;
        for (int i = 0; i < 26; i++) {
            if (help[i] > max) {
                max = Math.max(help[i], max);
                max_i = i;
            }
        }
    }

    public static void min_function(int[] help) {
        min = 10000000;
        for (int i = 0; i < 26; i++) {
            if (help[i] != 0) {
                if (help[i] < min) {
                    min = Math.min(min, help[i]);
                    min_i = i;
                }
            }
        }
    }

    public static int minimumDeletions(String word, int k) {
        int answer = 0;
        int how = 0;
        int[] help = new int[26];
        for (int i = 0; i < word.length(); i++) {
            help[word.charAt(i) - 'a']++;
        }
        for (int i = 0; i < help.length; i++) {
            if (help[i] > 0) {
                how++;
            }
        }
        max_function(help);
        min_function(help);
        //找最大最小值确定他们数组坐标

        while (max - min > k) {
            if (how == 1) return answer;
            //两种减的情况
            //第一种判断是不是减小的
            int now_max=max;
            int now_max_i=max_i;
            help[max_i]--;
            max_function(help);
            if (max!=now_max&&help[min_i] >= now_max - k - min) {
                help[now_max_i]--;
                answer++;
            } else if (help[min_i] <= now_max - min) {
                int help_i = help[min_i];
                help[min_i] = 0;
                answer += help_i;
                how--;
            } else {
                help[now_max_i]--;
                answer++;
            }
            help[now_max_i]++;
            min_function(help);
            max_function(help);
        }
        return answer;
    }
}
//"aaabaaa" 2
//"itatwtiwwi" 1   1
//"vvnowvov" 2

//"zzfzzzzppfp" 1