package cn.xiaotian.study.testArrayList;

public class WriteArrayList {
    /**
     * The value is used for character storage.
     */
    Object[] value;

    /**
     * The size is the number of characters used.
     */
    int size;

    /**
     * This no-arg constructor is necessary for serialization of subclasses.
     */
    public WriteArrayList() {
        value  = new Object[10];
    }

    public WriteArrayList(Object[] obj) {
        value  = new Object[10];
        value[size] = obj;
        size++;
    }


    public int length(){
        return size;
    }
    public Object append(Object obj){
        value[size] = obj;
        size++;
        return this;
    }
    public boolean isEmpty() {
        return size == 0;
    }

    public Object getValue(int index) {
        return value[index];
    }

}
