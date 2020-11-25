package com.cqvie2;

public class Test {
    public static void main(String[] args) {
        Account act = new Account("act-01", 10000);

        Thread t1 = new Account_Thread(act);
        Thread t2 = new Account_Thread(act);

        t1.start();
        t2.start();

    }
}
