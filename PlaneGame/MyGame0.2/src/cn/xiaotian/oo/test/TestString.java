package cn.xiaotian.oo.test;

public class TestString {
    public static void main(String[] args) {
        String str1 = "testabcdefgh";
        String str2 = "";
        String str3 = null;
        System.out.println(str3);
        str3 = new String("str2_test");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1.length());
        System.out.println(str3.isEmpty());
        System.out.println(str1.charAt(2));
        char[] str_copy = new char[10];
        try {
            str1.getChars(1,8, str_copy,0);
            System.out.println(str_copy);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("######################");
        String str4 = "abc";
        String str5 = "abc";
        String str6 = str4;
        String str7 = new String("abc");
        System.out.println(str4 == str5);
        System.out.println(str4 == str6);
        System.out.println(str4 == str7);
        System.out.println(str4.equals(str5));
        System.out.println(str4.equals(str6));
        System.out.println(str4.equals(str7));
        String str8 = "abc";
        System.out.println(str4.equalsIgnoreCase(str8));
        System.out.println(str4.startsWith("b"));
        System.out.println(str4.endsWith("c"));
        System.out.println(str4.hashCode());
        System.out.println(str4.indexOf("a"));
        System.out.println(str4.toString());
        System.out.println(str4.charAt(2));

    }
}
