/***
 *
 * 测试继承
 */
package cn.xiaotian.oo2;

public class TestExtends {
    public static void main(String[] args){
        Student stu = new Student();
        stu.name = "测试";
        stu.height = 666;
        stu.rest();
        stu.study();
        System.out.println(stu instanceof Student);//运行时指出对象是否是特定类的一个实例
        System.out.println(stu instanceof Person);
        System.out.println(stu instanceof Object);
        System.out.println(new Person() instanceof Student);

    }
}


class Person /*extends Object*/{

    String name;
    int height;

    public void rest(){
        System.out.println("休息一会儿");
    }
}
class Student extends Person{
//    String name;
//    int height;
    String major;
    public Student(){}
    public Student(String name,int height,String major){
        this.name = name;
        this.height = height;
        this.major = major;
    }
    public void study(){
        System.out.println("学习两个小时");
    }
//    public void rest(){
//        System.out.println("休息一会儿");
//    }
}