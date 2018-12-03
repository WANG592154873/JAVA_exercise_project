/***
 * 测试方法的重写 Override
 */
package cn.xiaotian.oo2;

public class TestOverride {
    public static void main(String[] args){
        Animal an = new Animal();
        Dog dg = new Dog();
        an.said();
        dg.said();

    }
}
class Animal{
    public void said(){
        System.out.println("hahahahah");
    }
}
class Dog extends Animal{
    @Override
    public void said(){
        System.out.println("newnewnenwenw");
    }
}