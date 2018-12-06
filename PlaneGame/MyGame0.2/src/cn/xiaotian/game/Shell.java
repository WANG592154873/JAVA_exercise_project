package cn.xiaotian.game;

import java.awt.*;

/**
 * 炮弹类
 */
public class Shell extends GameObject{
    double degree;
    Shell(){
        x = 200;
        y = 200;
        width = 10;
        height = 10;
        speed = 9;
        degree = Math.random()*Math.PI*360;

    }
    public void draw(Graphics g){
        Color c = g.getColor();
        g.setColor(Color.YELLOW);
        g.fillOval((int)x,(int)y,width,height);
        //炮弹沿着任意角度飞行
        x +=speed*Math.cos(degree);
        y +=speed*Math.sin(degree);
        if(x<0||x>Constant.GAME_WIDTH-width){
            degree = Math.PI - degree;

        }if(y<50||y>Constant.GAME_HEIGHT-height){
            degree = - degree;

        }



        g.setColor(c);

    }
}
