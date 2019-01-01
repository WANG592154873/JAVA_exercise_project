package cn.xiaotian.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 缓冲流 BufferInputStream类读取文件
 */
public class JavaIODemo08 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        int rd = 0;//读取
        try {
            fis = new FileInputStream("d:/a.txt");
            bis = new BufferedInputStream(fis);
            //循环读取文件的前6个字节，并输出
            System.out.println("----循环输出6个字节----");
            for(int i =0;i<6&&(rd = fis.read())!=-1;i++){
                System.out.print((char)rd);
            }
            System.out.println();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }
}
