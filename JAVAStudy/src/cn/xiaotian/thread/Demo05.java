package cn.xiaotian.thread;

/**
 * 暂停线程的方法，使用yield()
 */
public class Demo05 extends Thread{
    @Override
    public void run() {
        for(int i = 0; i < 50;i++){
            System.out.println(Thread.currentThread().getName() + "" + i);
            Thread.yield();//只有extends Thread方法才有yield()
        }
    }

    public static void main(String[] args) {
        Demo05 d5 = new Demo05();
        Thread th5 = new Thread(d5);
        th5.start();
//        for(int i = 0; i < 50;i++){
//            System.out.println(Thread.currentThread().getName() + "" + i);
//        }

    }
}
