public class TestOverload {
    public static void main(String[] args){

        int sum1 = add(1,2,3);
        double sum2 = add(1.0,2,3);
        int sum3 = add(1,2);
        System.out.println(sum1);
        System.out.println(sum2);
        System.out.println(sum3);




    }
    public static int add(int a,int b,int c){
        return a+b+c;
    }
    public static double add(double a,int b,int c){
        return a+b+c;
    }
    public static int add(int a,int b){
        return a+b;
    }

}
