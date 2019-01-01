package cn.xiaotian.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * 字节流读取
 */
public class IODemo03 {
    public static void main(String[] args) {
        File fis = null;
        InputStream is = null;
        fis = new File("d:/a.txt");

        try {
            is = new FileInputStream(fis);
            byte[] by = new byte[1024];
            int len=0;
            while(-1!=(len = is.read(by))){
                String st = new String(by,0,len);
                System.out.println(st);

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
