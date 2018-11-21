/**
 * 测试嵌套循环
 */
public class NestLoop {
    public static void main(String[] args){
        for(int i=1;i <= 5; i++){
            for(int j=1;j <= 5; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println("############################");
        //打印算术乘法表
        for(int i=1;i <= 9; i++)
        {
            for(int j=1;j <= i; j++)
            {
                System.out.print(i + "*" + j + "=" + i*j + " ");
            }
            System.out.println();

        }
        System.out.println("#############课堂练习###############");
        //用while分别计算100以内偶数/奇数的和，并输出
        int num = 0;
        int sum_single = 0,sum_double = 0;
        while(num <= 100){
            if(num % 2 == 0)
            {
                sum_double += num;
                num++;
            }else{
                sum_single += num;
                num++;
            }
        }
        System.out.println("100以内的偶数和为：" + sum_double);
        System.out.println("100以内的奇数和为：" + sum_single);
        //用while循环输出1-1000之间能被5整除的数，且每行输出5个
        for(int i = 1,j = 1;i <= 1000;i++){
            if (i % 5 == 0) {
                System.out.print(i + " ");
                j++;
            }
            if(j == 5){
                System.out.println();
                j = 0;
            }
        }

    }
}

