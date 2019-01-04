package cn.xiaotian.io;

import java.io.*;

/**
 * BufferedReader和BufferWriter 字符缓冲流
 */
public class IODemo10 {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter wt = null;
        try {
            reader = new BufferedReader(new FileReader("d:a.txt"));
            wt = new BufferedWriter(new FileWriter("d:/b.txt",true));//文件存不存在不重要

            String line = null;
            while(null!=(line=reader.readLine())){
                System.out.println(line);
                wt.write(line);
                wt.newLine();//换行符号

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
