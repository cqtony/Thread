

public class Thread_Test01 {
    public static void main(String[] args) {
        thread x = new thread();
        //启动线程
        //x.run();//不会启动线程，不会分配分支栈（单线程）

        //start()方法的作用：启动一个分支线程，仅仅是在JVM中开辟一个新的栈空间
        //开辟了空间就立刻结束
        //结束后会自动调用run方法。
        x.start();

        //主线程
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程--->" + i);
        }
    }
}

class thread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("开辟的线程---->" + i);
        }
    }
}