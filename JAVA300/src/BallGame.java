import java.awt.*;
import javax.swing.*;


//main方法是程序执行的入口
public class BallGame extends JFrame{//继承JFrame的窗口类
    //加载图片
    Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");

    double x = 100;//小球的横坐标
    double y = 100;//小球的纵坐标
    boolean right = true;//方向
    //画窗口的方法
    public void paint(Graphics g) {
        System.out.println("窗口被画了一次！");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int) x, (int) y, null);
        if (right) {
            x = x + 10;
        } else {
            x = x - 10;
        }

        if (x > 856 - 40 - 30) {//856是窗口宽度，40是桌子边框，30是小球直径
            right = false;
        }
        if(x < 40){//40是桌子边框
            right = true;
        }
     }
    //窗口加载
    void launchFrame(){
        setSize(856,500);
        setLocation(400,400);
        setVisible(true);
        //重画窗口,每秒画25次
        while(true){
            repaint();
            try{
                Thread.sleep(40);//  40ms
            }catch(Exception e)
            {
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args){
        System.out.println("Hello World!");
        BallGame game = new BallGame();
        game.launchFrame();
    }

}
