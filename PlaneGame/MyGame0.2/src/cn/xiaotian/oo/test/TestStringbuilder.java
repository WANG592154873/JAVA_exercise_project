package cn.xiaotian.oo.test;

public class TestStringbuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder(20);
        StringBuilder sb2 = new StringBuilder("test");
        System.out.println(sb.length());
        System.out.println(sb1.length());
        System.out.println(sb2.length());
    }

}
