package cn.xiaotian.io;

import java.io.*;

public class FileCopy {
    /**
     * 文件拷贝
     * @param src 源File对象
     * @param dest 目标File对象
     */
    public static void Filecopy(File src, File dest){
        InputStream is = null;
        OutputStream os = null;
        if(src.isDirectory()||dest.isDirectory()){
            System.out.println("不得输入目录");
            return;
        }
        try {
            is = new FileInputStream(src);
            os = new FileOutputStream(dest,true);
            byte[] by = new byte[1024];
            int len = 0;
            while(-1!=(len = is.read(by))){
                os.write(by,0,by.length);
            }
            os.flush();
        } catch (FileNotFoundException e) {
            System.out.println("未找到要复制的源文件");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("文件读取错误");
            e.printStackTrace();
        }
        try {
            os.close();
            is.close();
        } catch (IOException e) {
            System.out.println("文件关闭错误");
            e.printStackTrace();
        }
    }
    public static void Diccopy(File src, File dest){
        if(src.isDirectory()){
            dest.mkdir();//创建文件夹
            for(File temp:src.listFiles()){
                Diccopy(temp,new File(dest,temp.getName()));
            }

        }

    }
}
