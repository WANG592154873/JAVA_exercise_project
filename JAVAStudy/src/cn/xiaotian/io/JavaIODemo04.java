package cn.xiaotian.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * 使用FileInputStream类读取字节文件
 */
public class JavaIODemo04 {
    public static void main(String[] args) {
        FileInputStream filein = null;
        File path = null;
        path = new File("d:/a.txt");//指定文件的路径
        try {
            filein = new FileInputStream(path);//打开指定文件

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        int byte_get = 0;//获取读取的字节
        byte[] by = new byte[(int)path.length()];//创建字节数组，长度由path.length指定
        System.out.println("----按字节读取----");
        try {
            while((byte_get=filein.read(by))!=-1){
                //读取f.length个字节，放入字节数组by中
                String s = new String(by);
                System.out.println(s);
                System.out.println("共读取了"+byte_get+"个字节");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("读取结束");
        System.out.println("此时filein = " + filein);
        if(filein!=null){
            try {
                filein.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
