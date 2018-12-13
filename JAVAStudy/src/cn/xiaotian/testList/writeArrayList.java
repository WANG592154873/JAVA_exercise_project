package cn.xiaotian.testList;

import java.util.Date;

public class writeArrayList {
    public static void main(String[] args) {
        myArrayList mylist = new myArrayList(1);
        myArrayList mylist1 = new myArrayList(100);
        mylist.add(22222);
        mylist.add(new Date());
        mylist.add(22312);
        mylist.add(222323222);
        mylist.add(new String("test"));
        System.out.println(mylist.get(0));
        System.out.println(mylist.set(0,new Integer(3333)));;
        System.out.println(mylist.get(0));

    }
}

class myArrayList{
    private Object[] elementData;
    private int size;


    /**
     * 构造函数
     */
    public myArrayList() {
        this.elementData = new Object[10];
    }

    /**
     * 构造函数
     * @param initialCapacity
     */
    public myArrayList(int initialCapacity) {
        if(initialCapacity > 0) {
            this.elementData = new Object[initialCapacity];
        }
    }

    /**
     * add操作
     * @param obj
     */
    public void add(Object obj){
        if(elementData.length > size)
        {
            elementData[size] = obj;
            size++;
        }else{
            Object[] tempElementData = new Object[size*2];
            System.arraycopy(elementData,0,tempElementData,0,size);
            elementData = tempElementData;
            elementData[size] = obj;
            System.out.println("目前容器的容量为" + elementData.length);
            size++;
        }
    }

    /**
     * get操作
     * @param index
     * @return
     */
    public Object get(int index) {
        rangeCheck(index);
        return elementData[index];
    }

    /**
     * set操作
     * @param index
     * @param obj
     * @return
     */
    public Object set(int index,Object obj){
        rangeCheck(index);
        Object oldobj = elementData[index];
        elementData[index] = obj;
        return oldobj;
    }

    /**
     * remove操作
     * @param index
     * @return
     */
    public Object remove(int index){
        rangeCheck(index);
        Object oldElementData = elementData[index];
        Object[] tempElementData = new Object[size*2];
        System.arraycopy(elementData,0,tempElementData,0,size);
        elementData = tempElementData;
        return oldElementData;
    }

    /**
     * 数据超出边界报错信息输出
     * @param index
     * @return
     */
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }

    /**
     * rangeCheck索引范围检查
     * @param index
     */
    private void rangeCheck(int index){
        if(index<0||index>size){
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }

}