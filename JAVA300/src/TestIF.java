/**
 * 掷塞子游戏
 * */
public class TestIF {
    public static void main(String[] args){
        int i = (int)(6*Math.random() + 1);
        int j = (int)(6*Math.random() + 1);
        int k = (int)(6*Math.random() + 1);
        int count = i + j + k;
        if(count < 10)
        {
            System.out.println("今天运气不太好嘛！");
            System.out.println("投了" + count + "点");
        }
        if(count < 15 && count >= 10)
        {
            System.out.println("今天运气还可以嘛！");
            System.out.println("投了" + count + "点");
        }
        if(count >= 15)
        {
            System.out.println("今天运气不错嘛！");
            System.out.println("投了" + count + "点");
        }
    }
}
