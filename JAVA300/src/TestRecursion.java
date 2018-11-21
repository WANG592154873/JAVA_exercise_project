/**
 * 测试递归
 */
public class TestRecursion {
    public static void main(String[] args){
        a();
        long d1 = System.currentTimeMillis();

        System.out.printf("%d递归的结果为%s\n",10,factorial(10));
        long d2 = System.currentTimeMillis();
        System.out.printf("%d递归的总用时间为%s\n",10,d2 - d1);

    }
    static int count = 0;
    static void a(){
        System.out.println("a");
        count++;
        if(count < 10){
            a();
        }else{
            return;
        }
    }
    static long factorial(int n){
        if(n == 1){//递归头
            return 1;
        }else{//递归体
            return n*factorial(n - 1);
        }
    }
}
