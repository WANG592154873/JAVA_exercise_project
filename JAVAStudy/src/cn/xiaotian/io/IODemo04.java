package cn.xiaotian.io;

import java.io.*;

/**
 * 字节输出流
 */
public class IODemo04 {
    public static void main(String[] args) {
        File file = null;
        OutputStream out = null;
        file = new File("d:/a.txt");
        try {
            out = new FileOutputStream(file,true);//以追加的形式
            String str = "Look at me, I am testing!";
            out.write(str.getBytes());
            out.flush();//强制刷新出去



        } catch (FileNotFoundException e) {
            System.out.println("找不到文件");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件写出失败");
            e.printStackTrace();
        }
        try {
            out.close();
        } catch (IOException e) {
            System.out.println("文件关闭失败");
            e.printStackTrace();
        }


    }
}
