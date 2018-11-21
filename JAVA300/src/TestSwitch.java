public class TestSwitch {
    public static void main(String[] args){
        int month = (int)(12*Math.random() + 1);
        System.out.println("现在是" + month + "月");
        switch(month){
            case 1 :
                System.out.println("要过元旦了！");
                break;
            case 2 :
                System.out.println("要过春节了！");
                break;
            case 3 :
                System.out.println("春节结束了！");
                break;
            default:
                System.out.println("这是其它月份！！！！！！！！");
        }
        System.out.println("############################");
        char c = 'a';
        int rand = (int)(26 * Math.random());
        char c2 = (char)(c + rand);
        System.out.println("c2 = " + c2);
        switch(c2){
            case 'a' :System.out.println("遍历了a");
            case 'e' :System.out.println("遍历了e");
            case 'i' :System.out.println("遍历了i");
            case 'o' :System.out.println("遍历了o");
            case 'u' :System.out.println("遍历了u");
                System.out.println("元音");
                break;
            case 'y' :System.out.println("遍历了y");
            case 'w' :
                System.out.println("半元音");
                break;
            default:
                System.out.println("辅音");

        }
    }
}

