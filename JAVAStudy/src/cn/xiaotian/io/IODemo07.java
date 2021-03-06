package cn.xiaotian.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 字符流 Reader
 */
public class IODemo07 {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("d:a.txt");
            char[] rd = new char[1024];
            int len = 0;
            while(-1!=(len=reader.read(rd))){
                String str = new String(rd,0,len);//注意此处
                System.out.println(str);
            }
        } catch (FileNotFoundException e) {
            System.out.println("文件打开失败");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件读取失败");
            e.printStackTrace();
        } finally {
            try {
                if(null!=reader){
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("文件关闭失败");
                e.printStackTrace();
            }
        }
    }
}
