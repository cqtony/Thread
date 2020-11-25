public class Thread_Test09 {
    public static void main(String[] args) {
        System.out.println("main begain!!");

        Thread t = new Thread(new MyRunnable6());
        t.start();

        try {
            t.join();//线程合并，将t线程合并到主线程中，
            //只有在t线程执行完毕后才能继续执行主线程
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("main over!!");
    }
}

class MyRunnable6 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(Thread.currentThread().getName() + "分支线程---->" + i);
        }
    }
}