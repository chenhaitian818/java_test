package 力扣题;

import java.util.Arrays;

public class Solution100209 {
    public static void main(String[] args) {
        int[] nums = new int[]{13,4,4,11,4,14,10,20};
        int[][] queries = new int[][]{{7,1},{3,2},{0,4},{7,4}};
        System.out.println(Arrays.toString(unmarkedSumArray(nums, queries)));
    }

    public static long[] unmarkedSumArray(int[] nums, int[][] queries) {
        int[] help = Arrays.copyOf(nums, nums.length);
        Arrays.sort(help);
        int help_i = 0;
        long answer = 0;
        long[] answer_arr = new long[queries.length];
        for (int num : nums) {
            answer += num;
        }
        for (int i = 0; i < queries.length; i++) {
            //第一种情况根本不用管他
            if (help_i <= nums.length - 1 && nums[queries[i][0]] < help[help_i]) {
            }

            //这里处理指定下标对应指正值相同时的情况并且当前没给挖掉的情况
            if (help_i <= nums.length - 1 &&nums[queries[i][0]] == help[help_i]) {
                long computer = 0;
                long help_computer = 0;
                for (int j = help_i; j < nums.length && help[j] == help[help_i]; j++) {
                    computer++;
                }
                for (int j = nums.length - 1; j >= queries[i][0]; j--) {
                    if (nums[j] == help[help_i]) help_computer++;
                }
                if (help_computer <= computer) {
                    //能进来说明他其实是存在的我们现在要把他在help数组中移除
                    int help_num = nums[queries[i][0]];
                    answer -= help_num;//answer先减去这个
                    //这里进行移除
                    for (int j = help_i; j < nums.length && help[j] <= help_num; j++) {
                        if (help[j] == help_num) {
                            help[j] = -1;
                            break;
                        }
                    }
                }
                //这里有一个统一操作就是在原数组挖空
                nums[queries[i][0]] = -1;
            }


            //这里开始处理第三种情况
            //就是他大于了
            //这段可以提取方法这里没时间先不写了
            if (help_i <= nums.length - 1 &&nums[queries[i][0]] > help[help_i]) {
                //大于很好处理原数组挖空，help数组也搞掉就行
                //原数组挖空
                int help_nums = nums[queries[i][0]];
                answer -= help_nums;
                nums[queries[i][0]] = -1;
                //answer先减去这个
                //这里对help数组进行移除
                for (int j = help_i; j < nums.length && help[j] <= help_nums; j++) {
                    if (help[j] == help_nums) {
                        help[j] = -1;
                        break;
                    }
                }
            }


            //最后还要减去queries数组中[i][1]个最小数这里是三种情况合一处理
            //把已经移除的搞掉
            while (help_i <= nums.length - 1 && help[help_i] == -1) {
                    help_i++;
            }
            for (int j = queries[i][1]; help_i < nums.length && j > 0; j--) {
                //每次走前先给他把-1减掉
                while (help_i <= nums.length - 1 && help[help_i] == -1) {
                        help_i++;
                }
                if (help_i<nums.length) {
                    answer -= help[help_i];
                    help_i++;
                }
            }
            while (help_i <= nums.length - 1 && help[help_i] == -1) {
                    help_i++;
            }

            //最后一步就是把answer搞到answer_arr数组中
            answer_arr[i] = answer;
        }
        return answer_arr;
    }
}
//{18,5,5,5,5,18,13,5,10,13,18,13,19,14,14,13,14,13,11}   {{6,0},{14,1},{13,3},{7,2},{5,2},{8,1},{5,3},{9,0},{4,2},{4,4},{9,2},{15,0},{1,3},{13,1},{11,0},{16,4},{3,2},{17,3},{11,1}}