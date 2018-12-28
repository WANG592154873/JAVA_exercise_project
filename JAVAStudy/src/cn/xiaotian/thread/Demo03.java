package cn.xiaotian.thread;

/**
 * 终止线程的典型方式，定义boolean变量
 */
public class Demo03 implements Runnable {
    private boolean live = true;
    @Override
    public void run() {
        int i = 0;
        while(live){
            System.out.println(Thread.currentThread().getName() + " " + (i++));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void terminate() {
        this.live = false;
    }
    public static void main(String[] args) {
        Demo03 d3 = new Demo03();
        Thread demo3 = new Thread(d3);
        demo3.start();

        for(int j = 5; j < 10;j++){
            System.out.println(Thread.currentThread().getName() + " " + j);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        d3.terminate();


    }
}
