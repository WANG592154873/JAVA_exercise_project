package cn.xiaotian.thread;

public class Demo06{
    public static void main(String[] args) {
        Thread demo6 = new Thread(new FatherThread());
        demo6.start();

    }
}
class FatherThread implements Runnable{

    @Override
    public void run() {
        System.out.println("父亲给了儿子钱，让儿子去买烟");
        SonThread son = new SonThread();
        Thread th6 = new Thread(son);
        th6.start();
        System.out.println("老爸在等待过程中...");
        try {
            th6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("儿子拿着钱跑了！！！！");
            System.exit(1);//结束jvm，0表示正常结束，非0表示非正常结束
        }
        System.out.println("儿子买烟回来了~~~");

    }
}
class SonThread implements Runnable{
    @Override
    public void run() {
        System.out.println("儿子去买烟了...");
        try {
            for(int i=0;i<10;i++){
                System.out.println("已经用时"+ i +"分钟");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("儿子拿着钱跑了~~~");
        }
    }
}