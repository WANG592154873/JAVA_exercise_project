package cn.xiaotian.thread;

/**
 * 通过Runnable实现多线程
 */
public class Demo02 implements Runnable{
    public static void main(String[] args) {
        Thread dem2 = new Thread(new Demo02());
        dem2.start();
        Thread dem21 = new Thread(new Demo02());
        dem21.start();

    }

    @Override
    public void run() {
        for(int i = 0;i < 50; i++){
            System.out.println(Thread.currentThread().getName() + "  Demo线程  " + i);
        }
    }
}
