/***
 *
 * 飞机游戏的主窗口
 * Game0.1版本
 */
package cn.xiaotian.game;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MyGameFrame extends JFrame {
    /*
    * 初始化窗口
    * */
    public void launchFrame(){
        this.setTitle("小天的第一个java游戏");
        this.setVisible(true);//设置可见，默认可见
        this.setSize(500,500);
        this.setLocation(200,200);//设置窗口的位置

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);//0表示正常结束，负数表示异常结束
            }
        });

    }


    public static void main(String[] args) {
        MyGameFrame f = new MyGameFrame();
        f.launchFrame();
    }
}
