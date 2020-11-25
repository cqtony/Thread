/*
采用匿名类方式
 */
public class Thread_Test03 {
    public static void main(String[] args) {
        //创建线程
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 1000; i++) {
                    System.out.println("分支线程——————>" + i);
                }
            }
        });
        //启动线程
        t.start();

        for (int i = 0; i < 1000; i++) {
            System.out.println("主线程——-————>" + i);
        }
    }
}
