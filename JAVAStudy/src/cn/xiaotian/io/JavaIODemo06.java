package cn.xiaotian.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * FileReader流
 */
public class JavaIODemo06 {
    public static void main(String[] args) {
        FileReader fr = null;
        File file = null;
        int rd = 0;//读取字节
        file = new File("d:/a.txt");
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("----按字符读取----");
        try {
            while((rd=fr.read())!=-1){//按字节读取
                System.out.print((char)rd);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println();
            System.out.println("----读取结束----");
        } catch (IOException e) {
            e.printStackTrace();
        }
        if(fr!=null){
            try {
                fr.close();//关闭
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
