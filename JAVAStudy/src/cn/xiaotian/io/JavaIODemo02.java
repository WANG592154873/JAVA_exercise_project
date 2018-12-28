package cn.xiaotian.io;
/**
 * 文件操作
 */

import java.io.*;
import java.text.SimpleDateFormat;

public class JavaIODemo02 {
    public static void main(String[] args) {
        String name = "a.txt";//文件名
        String path = "d:/";//路径名
        File file = new File(path,name);
        if(file.exists()){
            System.out.println("----文件信息----");
            System.out.println("文件名称："+file.getName());
            System.out.println("文件路径："+file.getPath());
            System.out.println("绝对路径："+file.getAbsolutePath());
            System.out.println(file.isFile()?"是文件":"不是文件");
            System.out.println(file.isDirectory()?"是路径":"不是路径");
            System.out.println("文件长度："+file.length());
            SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
            System.out.println("文件最后修改时间："+s1.format(file.lastModified()));
        }else{
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
