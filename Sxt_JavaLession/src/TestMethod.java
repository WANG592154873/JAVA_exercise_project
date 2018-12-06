public class TestMethod {
    public static void main(String[] args){
        TestMethod tm = new TestMethod();
        tm.printTex();
        int sum = tm.add(1,2,3);
        System.out.println(sum);




    }
    int add(int a,int b,int c){
        return a+b+c;
    }
    void printTex(){
        System.out.println("Test 1");
        System.out.println("Test 2");
        System.out.println("Test 3");
    }
}
