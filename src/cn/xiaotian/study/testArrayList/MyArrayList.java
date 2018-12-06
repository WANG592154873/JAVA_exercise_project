package cn.xiaotian.study.testArrayList;

import cn.xiaotian.study.testArrayList.People;
import cn.xiaotian.study.testArrayList.WriteArrayList;

/**
 * 实现一个简单的容器ArrayList
 * @author xiaotian
 */
public class MyArrayList {
    public static void main(String[] args) {
        WriteArrayList wa = new WriteArrayList();
        System.out.println(wa.isEmpty());
        System.out.println(wa.length());
        wa.append(new People("name",10,"girl"));
        System.out.println(wa.isEmpty());
        System.out.println(wa.getValue(0));
        People p = (People)wa.getValue(0);
        System.out.println(p.getName());
        p.setName("Change!!!!!!");
        System.out.println(p.getName());
    }


}