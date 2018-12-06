public class Array {
    public static void main(String args[])
    {
//        int data[] = new int[3];
//        data[0] = 1;
//        data[1] = 2;
//        data[2] = 3;
        int data[] = new int[]{1,2,3};
        int test[] = null;
        test = data;
        test[0] = 6;
        printarray(data);
    }
    public static void printarray(int temp[])
    {
        for(int i = 0;i < temp.length;i++)
            System.out.print(temp[i] + "、");
    }
}
