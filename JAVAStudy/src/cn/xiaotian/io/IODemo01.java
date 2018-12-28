package cn.xiaotian.io;

import java.io.*;


/**
 * 不规范的写法，仅用于测试
 */
public class IODemo01 {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("d:/a.txt");
            int s1 = fis.read();
            int s2 = fis.read();
            int s3 = fis.read();
            int s4 = fis.read();
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);
            System.out.println(s4);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
