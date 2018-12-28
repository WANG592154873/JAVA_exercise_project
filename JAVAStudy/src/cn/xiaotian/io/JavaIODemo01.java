package cn.xiaotian.io;

import java.io.IOException;

/**
 * 预定义流
 */
public class JavaIODemo01 {
    public static void main(String[] args) {
        byte b[] = new byte[16];//存放数据的数组
        System.out.println("请输入数据：");
        try {
            System.in.read(b);//定义从键盘读取数据存放到数组中，读取b.length个字节
            System.out.println("您输入的内容为：");
            for(byte temp:b){
                System.out.println((char)temp);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
