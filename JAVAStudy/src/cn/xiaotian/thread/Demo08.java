package cn.xiaotian.thread;

/**
 * 测试线程的优先级
 */
public class Demo08 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new TestPriority(),"t1");
        Thread t2 = new Thread(new TestPriority(),"t2");
        t1.setPriority(10);
        t2.setPriority(1);
        t1.start();
        t2.start();
    }

}
class TestPriority implements Runnable{
    @Override
    public void run() {
        for(int i =0;i<10;i++){
            System.out.println(Thread.currentThread().getName() +" " + i);
        }
    }
}