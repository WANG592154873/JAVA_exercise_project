package cn.xiaotian.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 字符流 Writer
 */
public class IODemo08 {
    public static void main(String[] args) {
        Writer wt = null;
        try {
            wt = new FileWriter("d:/b.txt",true);//文件存不存在不重要
            String msg = "test";
            wt.write(msg);
            wt.append(msg);
            wt.flush();
        } catch (IOException e) {
            System.out.println("文件打开失败");
            e.printStackTrace();
        } finally {
            try {
                if(null!=wt){
                    wt.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
