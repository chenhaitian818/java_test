package test2;

public class Customer {
    public static void main(String[] args) {
        Account Jane_Smith = new Account("1000", 2000, "1");
        Jane_Smith.withdraw(100);
        Jane_Smith.deposit(960);
        Jane_Smith.deposit(2000);
    }
}

