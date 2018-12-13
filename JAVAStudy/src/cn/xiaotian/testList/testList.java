package cn.xiaotian.testList;
/**
 * 测试数组容器的使用
 */

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class testList {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(33333);
        list.add("name");
        list.add(new Date());
        System.out.println(list.size());
        System.out.println(list.get(1));
        System.out.println(list.get(0));
    }
}