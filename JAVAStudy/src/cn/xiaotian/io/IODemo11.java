package cn.xiaotian.io;

import java.io.*;

/**
 * 解决字符流乱码
 */
public class IODemo11 {
    public static void main(String[] args) {
        try {
            //读取文件
            BufferedReader br =
                    new BufferedReader(new InputStreamReader(
                            new FileInputStream(
                                    new File("d:/a.txt")),"Unicode"));
            //写出文件
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File("d:/aencode.txt")));
            String info = null;
            while(null!=(info = br.readLine())){
                System.out.println(info);
                bw.write(info);
                bw.flush();
            }
            bw.close();
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
