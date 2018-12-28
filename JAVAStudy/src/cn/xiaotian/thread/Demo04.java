package cn.xiaotian.thread;

/**
 * 暂停线程的方法，使用Thread.sleep()
 */
public class Demo04 implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 50;i++){
            System.out.println(Thread.currentThread().getName() + "" + i);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        Demo04 d4 = new Demo04();
        Thread t4 = new Thread(d4);
        t4.start();


    }
}
