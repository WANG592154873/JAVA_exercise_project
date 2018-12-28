package cn.xiaotian.io;

import java.io.*;

/**
 * 目录操作
 */
public class JavaIODemo03 {
    public static void main(String[] args) {
        String path = "d:/a.txt";
        File pathfile = new File(path);
        if(pathfile.exists()){
            if(pathfile.isDirectory()){//如果是目录
                String[] paths = pathfile.list();
                System.out.println("----指定目录下的文件和目录----");
                for(String temp:paths){
                    System.out.println(temp);
                }
            }else{
                System.out.println("这不是目录，结束运行！");
                return;
            }
        }else{
            //目录不存在，创建指定目录
            System.out.println("目录不存在，创建指定目录");
            pathfile.mkdir();
        }
    }
}
