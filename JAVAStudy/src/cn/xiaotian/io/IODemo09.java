package cn.xiaotian.io;

import java.io.*;

/**
 * 纯文本拷贝
 */
public class IODemo09 {
    public static void main(String[] args) {
        Reader reader = null;
        Writer wt = null;
        try {
            reader = new FileReader("d:a.txt");
            wt = new FileWriter("d:/b.txt",true);//文件存不存在不重要
            char[] rd = new char[1024];
            int len = 0;
            while(-1!=(len=reader.read(rd))){
                String str = new String(rd,0,len);//注意此处
                System.out.println(str);
                wt.write(str);
                wt.flush();
            }

        } catch (FileNotFoundException e) {
            System.out.println("文件打开失败");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件读取失败");
            e.printStackTrace();
        } finally {
            try {
                if(null!=wt){
                    wt.close();}
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
