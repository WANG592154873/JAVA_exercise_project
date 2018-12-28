package cn.xiaotian.thread;

/**
 * 获取线程基本信息的方法
 */
public class Demo07 {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        Thread demo7 = new Thread(mt,"666");
        demo7.start();
        System.out.println("Thread name is " + demo7.getName());
        System.out.println(Thread.currentThread().getName());
        try {
            Thread.currentThread().sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Demo07 is Alive?" + demo7.isAlive());
        System.out.println("over!");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Demo07 is Alive?" + demo7.isAlive());
        System.out.println("over!");
    }
}
class MyThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("倒计时" + i);
        }
    }
}