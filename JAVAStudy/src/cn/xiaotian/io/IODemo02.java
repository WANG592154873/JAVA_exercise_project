package cn.xiaotian.io;

import java.io.*;

/**
 * 经典IO流写法
 */
public class IODemo02 {
    public static void main(String[] args) {
        FileInputStream fis1 = null;
        try {

            fis1 = new FileInputStream("d:/a.txt");
            StringBuilder sb = new StringBuilder();
            int temp = 0;
            while((temp = fis1.read())!=-1){
                sb.append((char)temp);
            }
            System.out.println(sb);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis1.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
