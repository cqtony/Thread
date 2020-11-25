package com.cqvie;

/*
银行账户
    不使用线程同步机制的时候会造成线程的安全问题。
 */

public class Account {
    //账户
    private String actno;
    //余额
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //取款方法
    public void withdraw(double money) {
        //取款前的余额
        double before = this.getBalance();
        //取款后的余额
        double after = before - money;
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //更新余额
        this.setBalance(after);
    }
}
