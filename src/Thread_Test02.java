
//编写类实现java.lang.Runnable接口
//可以实现线程的创建
//常用此方法，因为可以进行多继承。
public class Thread_Test02 {
    public static void main(String[] args) {

        Thread x = new Thread(new MyRunnable());
        x.start();
        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程————>" + i);
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("线程1————>" + i);
        }
    }
}
