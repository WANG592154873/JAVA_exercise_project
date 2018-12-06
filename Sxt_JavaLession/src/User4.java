/***
 * 测试参数传值机制
 */
public class User4 {
    int id;
    String name;
    String pwd;
    public User4(int id,String name){
        this.id = id;
        this.name = name;
    }
    public void testParameterTransfer01(User4 u){
        u.name = "进行参数传递完成";
    }
    public void testParameterTransfer02(User4 u){
        u = new User4(666,"新建");
    }


    public static void main(String[] args){
        User4 u4 = new User4(20,"测试");
        System.out.println(u4.name);
        System.out.println("#################");
        u4.testParameterTransfer01(u4);
        System.out.println(u4.name);
        u4.testParameterTransfer02(u4);
        System.out.println(u4.name);


    }
}
