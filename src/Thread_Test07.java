public class Thread_Test07 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable4());
        t.start();

        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //在5S后终止t线程
        //t.stop();//能用但时不建议（已过时）
        /*
        直接将线程杀掉
        容易导致线程中的数据丢失
         */

        System.out.println("Hello World！！");

    }
}

class MyRunnable4 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("分支线程----->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
