/***
 *
 *
 * 游戏物体的父类
 */
package cn.xiaotian.game;


import java.awt.*;

public class GameObject {
     Image img;
     double x,y;
     int speed;
     int width,height;

    public GameObject(Image img, double x, double y, int speed, int width, int height) {
        this.img = img;
        this.x = x;
        this.y = y;
        this.speed = speed;
        this.width = width;
        this.height = height;
    }

    public GameObject(Image img, double x, double y) {
        this.img = img;
        this.x = x;
        this.y = y;
    }

    public GameObject() {
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void drawSelf(Graphics g){
        g.drawImage(img,(int)x,(int)y,null);

    }

    /***
     * 返回物体所在的矩形，用于后期的碰撞检测
     * @return
     */
    public Rectangle getRect(){
        return new Rectangle((int)x,(int)y,width,height);
    }
}

