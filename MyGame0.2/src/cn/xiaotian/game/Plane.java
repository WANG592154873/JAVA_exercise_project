package cn.xiaotian.game;

import java.awt.*;

public class Plane extends GameObject {
    @Override
    public void drawSelf(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);
        x++;

    }
    public Plane(Image img,int x,int y){
        this.img = img;
        this.y = y;
        this.x = x;

    }
}
