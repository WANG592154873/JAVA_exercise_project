/**
 *测试while循环求1+2+...+100
 */
public class TestWhile {
    public static void main(String[] args){
        int i = 1;
        int sum = 0;
        while(i <= 100)
        {
            sum = sum + i;
            i++;
        }
        System.out.println("1+2+...+100的和为" + sum);
    }
}
