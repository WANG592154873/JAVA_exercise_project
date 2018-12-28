package cn.xiaotian.thread;

/**
 * 测试继承Thread实现多线程
 */
public class Demo01 extends Thread{
    @Override
    public void run(){
        for(int i = 0;i < 50; i++){
            System.out.println("Demo线程" + i);
        }
    }

    public static void main(String[] args) {
        Demo01 de1 = new Demo01();
        de1.start();
        for(int i = 0;i < 50; i++){
            System.out.println("main线程" + i);
        }


    }
}
