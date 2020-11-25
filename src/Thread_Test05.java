
/*
线程的sleep方法（线程阻塞方法）
    1、静态方法
    2、参数是毫秒
    3、让当前线程进入休眠状态。
 */
public class Thread_Test05 {
    public static void main(String[] args) {
        Thread t = new MyThread1();
        t.setName("t1");
        t.start();

        try {
            t.sleep(1000 * 5);//sleep在执行的时候会转换成Thread.sleep
            //会让主线程进入休眠
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Hello World！！");

    }
}

class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(Thread.currentThread() + "——>" + i);
        }
    }
}


