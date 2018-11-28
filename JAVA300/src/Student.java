/**
 * 写一个简单的类
 * 一个.java文件可以写多个类，但是只能有一个public修饰类
 */
public class Student {
    //fields 属性
    int id;
    String name;
    int age;

    Computer comp;//计算机
    //方法
    void study(){
        System.out.println("我正在学习！" + comp.brand);
    }
    void game(){
        System.out.println("我正在打王者农药！");
    }
    //构造方法，用于创建这个类的对象，无参构造方法可以由系统自动创建
    Student(){

    }
    //程序运行的入口main，必须要有，但是不一定在此文件内，程序内有
    public static void main(String[] args){
        Student stu = new Student();
        stu.id = 10001;
        stu.name = "测试";
        stu.age = 18;
        Computer c1 = new Computer();
        c1.brand = "HP";
        stu.comp = c1;

        stu.study();
        stu.game();

    }
}
class Computer{
    String brand;
}