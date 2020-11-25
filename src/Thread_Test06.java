
/*
停止线程的阻塞
叫醒正在睡眠的线程
 */
public class Thread_Test06 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread3());
        t.start();

        try {
            Thread.sleep(100 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //唤醒线程
        t.interrupt();//依靠java的异常处理机制

        //System.out.println("Hello World!!");
    }
}

class MyThread3 implements Runnable {

    public void run() {
        System.out.println(Thread.currentThread().getName() + "----->" + "begin");

        /*
        此处不能进行throws抛出异常是因为子类不能比父类抛出更多的异常
        只能使用try-catch
         */
        try {
            Thread.sleep(1000 * 60 * 60 * 24);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "----->" + "end");
    }
}


