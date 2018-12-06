/**
 * 利用for循环求1到100的和
 */
public class TestFor {
    public static void main(String[] args){
        int sum = 0;
        for(int i = 1;i <= 100;i++){
            sum += i;
        }
        System.out.println("1+2+...+100 = " + sum);
    }
}
