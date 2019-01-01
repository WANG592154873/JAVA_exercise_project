package cn.xiaotian.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaIODemo05 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        int read_by = 0;//读取字节
        int count = 0;//统计字节数
        try {
            fis = new FileInputStream("d:/a.txt");
            fos = new FileOutputStream("d:/copy_a.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            int i = 1;
            while((read_by=fis.read())!=-1){//读入一个字节
                System.out.println("运行了"+(i++)+"次！");
                fos.write(read_by);//写入一个字节
                count++;
            }
            System.out.println("文件复制完成，共复制"+count+"个字节");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            if(fis!=null){
                fis.close();
            }
            if(fos!=null){
                fos.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
