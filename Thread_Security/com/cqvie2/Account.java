package com.cqvie2;

/*
银行账户
    使用线程同步机制解决问题
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
        //使用线程排队:synchronized(线程同步代码块)
        //一个线程执行完了才能继续执行下一个线程。


        //（）中的内容必须使用的是
        //多线程共享的数据。
        //synchronized() 中的参数不一定是this，但一定是多线程共享的那个对象。
        synchronized (this) {
            double before = this.getBalance();
            double after = before - money;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            this.setBalance(after);
        }
    }
}
