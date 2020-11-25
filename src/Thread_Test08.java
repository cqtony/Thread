public class Thread_Test08 {
    public static void main(String[] args) {
        MyRunnable5 r = new MyRunnable5();//创建MyRunnable5对象，通过对象调内部的参数
        //若使用内部类无法调用类中的对象
        Thread t = new Thread(r);
        t.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        r.run = false;
        System.out.println("Hello World!!");
    }
}

class MyRunnable5 implements Runnable {

    boolean run = true;

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "----->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                //结束之前可以对数据进行处理
                //终止当前线程
                return;
            }
        }
    }
}