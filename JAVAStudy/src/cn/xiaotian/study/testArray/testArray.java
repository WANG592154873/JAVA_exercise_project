package cn.xiaotian.study.testArray;

public class testArray {
    /**
     * 打印二维数组
     * @param a
     */
    public static void printArray(int[][] a){
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    /**
     * 两个矩阵相加
     * @param a
     * @param b
     * @return
     */
    public static int[][] add(int[][] a,int[][] b){
        int[][] c = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++){
            for(int j = 0; j < a[i].length; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int[][] twoArray = new int[2][2];
        twoArray[0][0] = 1;
        twoArray[0][1] = 2;
        twoArray[1][0] = 3;
        twoArray[1][1] = 4;
        int[][] addArray ={
                {1,1},
                {2,2}
        };
        printArray(twoArray);
        printArray(add(twoArray,addArray));;

    }



}
