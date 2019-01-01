package cn.xiaotian.io;

import java.io.*;

/**
 * 文件拷贝
 * src必须存在
 * dest可存在可不存在
 */
public class IODemo05 {


    public static void main(String[] args) {

        File src = null;
        File dest = null;
        src = new File("d:/a.txt");
        dest = new File("d:/sxt_copy_a.txt");
        FileCopy.Filecopy(src,dest);


    }
}
