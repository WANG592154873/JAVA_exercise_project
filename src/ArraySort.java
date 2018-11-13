public class ArraySort {
    public static void main(String args[])
    {
        int data[] = new int[]{9,7,3,3,5,6};
        printarray(data);
        Bubblesortarray(data);
        printarray(data);
    }
    public static void printarray(int temp[]){
        for(int i = 0;i < temp.length; i++)
        {
            System.out.print(temp[i] + "、");
        }
        System.out.println();
    }
    public static void Bubblesortarray(int _temp[]){//冒泡排序
        for(int i = 0;i < _temp.length; i++)
        {
            for(int j = _temp.length - 1;j > 0; j--)
            {
                if(_temp[j] < _temp[j-1])
                {
                    int __temp = _temp[j];
                    _temp[j] = _temp[j-1];
                    _temp[j-1] = __temp;
                }
            }
        }
    }
}
