package com.cqvie2;

public class Account_Thread extends Thread {
    private Account act;

    public Account_Thread(Account act) {
        this.act = act;
    }

    public void run() {
        double money = 5000;
        act.withdraw(money);

        System.out.println("对" + act.getActno() + "取款:" + money + ",余额:" + act.getBalance());
    }
}
