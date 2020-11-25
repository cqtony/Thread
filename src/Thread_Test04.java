/*
获取当前线程的对象、名字
修改线程对象的名字
 */
public class Thread_Test04 {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getName());
        //获取默认的名字

        System.out.println(t.getName());//Thread-0

        //设置线程的名字
        t.setName("tttt");
        //获取修改后的名字
        System.out.println(t.getName());

      /*  for (int i = 0; i < 1000; i++) {
            System.out.println("主线程——————>" + i);
        }*/
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("分支线程——————>" + i);
        }
    }
}
