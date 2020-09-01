package oop.exer1;

/**
 * @author MrKino
 * @version 1.0
 * @date 2020/8/28 12:26
 */

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id,double balance,double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void withdraw(double amount){
        if (balance<amount){
            System.out.println("余额不足，取款失败");
            return;
        }else{
            balance -= amount;
            System.out.println("成功取出" + amount + "元");
        }
    }

    public void deposit(double amount){
        if (amount>0){
            balance += amount;
            System.out.println("成功存款" + amount + "元");
        }else{
            System.out.println("存款不能为0或负数");
        }
    }

}
