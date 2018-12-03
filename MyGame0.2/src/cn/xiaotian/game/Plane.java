package cn.xiaotian.game;

import java.awt.*;
import java.awt.event.KeyEvent;

public class Plane extends GameObject {
    int speed = 3;
    boolean up,down,right,left;
    boolean live = true;
    @Override
    public void drawSelf(Graphics g){
        if(live){
            g.drawImage(img,(int)x,(int)y,null);
            if(left){
                x -= speed;

            }if(up){
                y -= speed;

            }if(down){
                y += speed;

            }if(right){
                x += speed;

            }
        }

    }
    public Plane(Image img,int x,int y){
        this.img = img;
        this.y = y;
        this.x = x;
        this.speed = 3;
        this.width = img.getWidth(null);
        this.height = img.getHeight(null);

    }
    //按下某个键增加相应的方向
    public void addDirection(KeyEvent e){
        System.out.println("按下" + e.getKeyCode());
        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = true;
                break;
            case KeyEvent.VK_UP:
                up = true;
                break;
            case KeyEvent.VK_RIGHT:
                right = true;
                break;
            case KeyEvent.VK_DOWN:
                down = true;
                break;
        }
    }
    //按下某个键取消相应的方向
    public void minusDirection(KeyEvent e){
        System.out.println("抬起" + e.getKeyCode());
        switch(e.getKeyCode()){
            case KeyEvent.VK_LEFT:
                left = false;
                break;
            case KeyEvent.VK_UP:
                up = false;
                break;
            case KeyEvent.VK_RIGHT:
                right = false;
                break;
            case KeyEvent.VK_DOWN:
                down = false;
                break;
        }
    }
}
