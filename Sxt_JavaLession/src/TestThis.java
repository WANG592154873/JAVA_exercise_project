public class TestThis {
    void sing(){
        System.out.println("调用了sing");
    }
    void eat(){
        this.sing();//调用本类中的sing
        System.out.println("调用了eat");

    }
    public static void main(String[] args){
        TestThisPoint p = new TestThisPoint(3.0,4.0);
        TestThisPoint origin = new TestThisPoint(5.0,5.0);
        TestThis tt = new TestThis();
        tt.eat();
        System.out.println(origin.getDistance(p));
    }
}
class TestThisPoint{
    double x;
    double y;
    double z;
    //构造方法的名称和类名必须保持一致
    public TestThisPoint(double x,double y) {
        this.x = x;
        this.y = y;
    }
    public TestThisPoint(double x,double y,double z) {
        this(x,y);//构造器的调用必须为第一句，放在第二句会报错
        this.z = z;
    }
    public double getDistance(TestThisPoint p){
        return Math.sqrt((x - p.x)*(x - p.x) +
                (y - p.y)*(y - p.y));
    }
}