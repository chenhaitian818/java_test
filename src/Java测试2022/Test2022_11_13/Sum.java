package Test2022_11_13;

public class Sum {
    public void add() {
        int sum = 0;
        for (int i = 1; ; i++) {
            sum += 1 / i;
            if (sum > 12) {
                System.out.println(i);
            }
        }
    }}

