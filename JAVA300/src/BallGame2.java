import java.awt.*;
import javax.swing.*;


//main方法是程序执行的入口
public class BallGame2 extends JFrame{//继承JFrame的窗口类
    //加载图片
    Image ball = Toolkit.getDefaultToolkit().getImage("image/ball.png");
    Image desk = Toolkit.getDefaultToolkit().getImage("image/desk.jpg");

    double x = 100;//小球的横坐标
    double y = 100;//小球的纵坐标
    double degree = 3.14/3; //弧度 此处为60度
    //画窗口的方法
    public void paint(Graphics g) {
        System.out.println("窗口被画了一次！");
        g.drawImage(desk, 0, 0, null);
        g.drawImage(ball, (int) x, (int) y, null);
        x = x + 10*Math.cos(degree);
        y = y + 10*Math.sin(degree);
        if(y > 500 - 40 - 30 || y < 40 + 40)  //其中第一个40是标题栏40 第二个才是边缘的40 30是球直径
        {
            degree = -degree;
        }
        if(x < 40 || x > 856 - 40 - 30){
            degree = 3.14 -degree;
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
        BallGame2 game = new BallGame2();
        game.launchFrame();
    }

}
