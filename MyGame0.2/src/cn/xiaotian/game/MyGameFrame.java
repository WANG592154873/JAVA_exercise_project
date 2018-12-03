/***
 *
 * 飞机游戏的主窗口
 */
package cn.xiaotian.game;


import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {

    Image bg = GameUtil.getImage("images/bg.jpg");
    Image planeimg = GameUtil.getImage("images/plane.png");


    Plane p = new Plane(planeimg,250,250);
    Shell[] shells = new Shell[50];



    @Override
    public void paint(Graphics g) {//自动被调用，g相当于一只画笔
        g.drawImage(bg,0,0,null);
        p.drawSelf(g);//画飞机
        for(int i = 0; i < shells.length; i++ ){
            shells[i].draw(g);//画炮弹

            //飞机和炮弹的碰撞检测
            boolean peng = shells[i].getRect().intersects(p.getRect());
            if(peng)
            {
                System.out.println("Peng!!!!");
                p.live = false;
            }
        }



    }

    class PaintThread extends Thread{
        @Override
        public void run() {
            while(true){
//                System.out.println("启动窗口重画线程");
                repaint();//重画

                try {
                    Thread.sleep(40);//40ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /*
     * 定义键盘监听的内部类
     */
    class KeyMonitor extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            p.addDirection(e);
        }

        @Override
        public void keyReleased(KeyEvent e) {
            p.minusDirection(e);
        }
    }

    /*
    * 初始化窗口
    * */
    public void launchFrame(){
        this.setTitle("小天的第一个java游戏");
        this.setVisible(true);//设置可见，默认可见
        this.setSize(Constant.GAME_WIDTH,Constant.GAME_HEIGHT);
        this.setLocation(200,200);//设置窗口的位置

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//0表示正常结束，负数表示异常结束
            }
        });
        new PaintThread().start();//启动窗口重画线程
        addKeyListener(new KeyMonitor());//给窗口增加键盘的监听

        /*
        * 初始化50个炮弹
        * */
        for(int i = 0; i < shells.length; i++ ){
            shells[i] = new Shell();
        }

    }


    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }
    /*
     * 双缓冲技术
     * */
    private Image offScreenImage = null;
    public void update(Graphics g){
        if(offScreenImage == null){
            offScreenImage = this.createImage(800,800);//游戏窗口的宽度和高度

            Graphics gOff = offScreenImage.getGraphics();
            paint(gOff);
            g.drawImage(offScreenImage,0,0,null);
        }
    }
}
