package cn.xiaotian.io;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter流,向指定文件写入内容
 */
public class JavaIODemo07 {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("d:/a.txt");
            char[] c = {'t','e','s','t'};
            /**
             * 此处写入文件会覆盖现有的内容
             */
            fw.write(c);
            fw.write('\t');
            fw.write("使用FileWrite写入成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            fw.close();//关闭
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
