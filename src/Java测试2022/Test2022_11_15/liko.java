package Test2022_11_15;

import java.util.Arrays;
import java.util.List;

class Solution {
    public List<String> fizzBuzz(int n) {
        String[] answer=new String[n];
        for( int i=0;i<answer.length;i++){
            answer[i]=(i+1)+"";
            if((i+1%3==0)&&(i+1%5==0)){
                answer[i]="FizzBuzz";
            }else
            if(i+1%3==0){
                answer[i]="Fizz";
            }
            else
            if(i+1%5==0){
                answer[i]="Buzz";
            }
        }
        return Arrays.asList(answer);
    }
}