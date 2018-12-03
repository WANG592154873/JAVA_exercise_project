/***
 *
 * 飞机游戏的主窗口
 */
package cn.xiaotian.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import cn.xiaotian.game.GameUtil;

public class MyGameFrame extends JFrame {
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
    Image bg = GameUtil.getImage("images/bg.jpg");
    Image plane = GameUtil.getImage("images/plane.png");
    int PlaneX = 250, PlaneY = 250;
    @Override
    public void paint(Graphics g) {//自动被调用，g相当于一只画笔
        g.drawImage(bg,0,0,null);
        g.drawImage(plane,PlaneX,PlaneY,null);
        PlaneY++;
        PlaneX++;


    }

    class PaintThread extends Thread{
        @Override
        public void run() {
            while(true){
                System.out.println("启动窗口重画线程");
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
    * 初始化窗口
    * */
    public void launchFrame(){
        this.setTitle("小天的第一个java游戏");
        this.setVisible(true);//设置可见，默认可见
        this.setSize(800,800);
        this.setLocation(200,200);//设置窗口的位置

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//0表示正常结束，负数表示异常结束
            }
        });
        new PaintThread().start();//启动窗口重画线程

    }


    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }
}
