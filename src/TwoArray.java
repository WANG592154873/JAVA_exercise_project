public class TwoArray {
    public static void main(String args[]){
//        int twodata[][] = new int[][]{{1,2},{3,4}};//静态初始化二维数组
        /*动态初始化*/
        int twodata[][] = new int[2][2];
        twodata[0][0] = 1;
        twodata[0][1] = 2;
        twodata[1][0] = 3;
        twodata[1][1] = 4;
        for(int i = 0;i < twodata.length; i++)
        {
            for(int j = 0;j < twodata[i].length; j++)
            {
                System.out.print(twodata[i][j] + "、");
            }
            /*以下两个方法都可以实现换行*/
            //System.out.print("\n");
            System.out.println();
        }
    }
    
}
