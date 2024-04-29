package Test2022_11_16;

public class numberOfSteps {
    public int numberOfSteps(int num) {
        int x=0;
        while(num!=0){
            if(num%2==0){
                num=(num/2);
                x++;
            }else
                num-=1;
            x++;
        }
        return x;
    }
}
