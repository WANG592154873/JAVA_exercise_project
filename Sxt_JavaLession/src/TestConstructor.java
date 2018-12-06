class Point{
    double x;
    double y;
    //构造方法的名称和类名必须保持一致
    public Point(double _x,double _y) {
        x = _x;
        y = _y;
    }
    public double getDistance(Point p){
        return Math.sqrt((x - p.x)*(x - p.x) +
                (y - p.y)*(y - p.y));
    }
}
public class TestConstructor {
    public static void main(String[] args){
        Point p = new Point(3.0,4.0);
        Point origin = new Point(5.0,5.0);
        System.out.println(origin.getDistance(p));
    }

}
