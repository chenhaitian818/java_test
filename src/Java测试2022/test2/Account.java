package test2;

import java.util.jar.JarEntry;

public class Account {
    String id;
    int balance;
    String annualInterestRate;

    public int withdraw(int money) {
        this.balance = balance + money;
        System.out.println("成功存入：" + balance);
        return balance;
    }

    public int deposit(int money) {
        if (money > balance) {
            System.out.println("余额不足，取钱失败");
            return 0;
        }
        this.balance = balance - money;
        System.out.println("成功取出：" + balance);
        return balance;

    }

    public Account() {

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Account(String id, int balance, String annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(String annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }
}
//class Customer{
//    public void main (String[] args) {
//        Account Jane_Smith = new Account("1000", 2000, "1");
//        Jane_Smith.withdraw(100);
//        Jane_Smith.deposit(960);
//        Jane_Smith.deposit(2000);
//    }
//}