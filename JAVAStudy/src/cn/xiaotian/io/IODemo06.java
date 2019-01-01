package cn.xiaotian.io;

import java.io.File;

/**
 * 文件夹的拷贝
 * 1、文件赋值 Filecopy
 * 2、文件创建 mkdirs()
 * 3、递归
 */
public class IODemo06 {
    public static void main(String[] args) {
        String srcPath = "d:/java/1";
        String destPath = "d:/java/test";
        File src = new File(srcPath);
        File dest = new File(destPath);
        copyDirDetail(src,dest);


    }
    public static void copyDirDetail(File src,File dest){
        if(src.isFile()){//是文件的情况
            FileCopy.Filecopy(src,dest);
        }else if(src.isDirectory()){
            dest.mkdir();
            for(File temp:src.listFiles()){
                System.out.println(temp.getName());
                copyDirDetail(temp,new File(dest,temp.getName()));
            }
        }
    }
}
