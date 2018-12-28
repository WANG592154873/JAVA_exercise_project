package cn.xiaotian.thread;

/**
 * 测试线程同步
 */
public class Demo09 {
    public static void main(String[] args) {
        Account a1 = new Account(100,"Test");
        Drawing dr1 = new Drawing(80,a1);
        Drawing dr2 = new Drawing(80,a1);
        Thread t1 = new Thread(dr1);
        Thread t2 = new Thread(dr2);
        t1.start();
        t2.start();
    }
}

/**
 * 我的账户类
 */
class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }

}

/**
 * 模拟提款
 */
class Drawing implements Runnable{
    int drawmoney; //要取的钱数
    Account account;//取钱的账户
    int totalmoney; //总共取得钱数

    public Drawing(int drawmoney, Account account) {
        this.drawmoney = drawmoney;
        this.account = account;
    }

    @Override
    public void run() {
        if(account.money - drawmoney < 0){
            return;
        }
        try {
            Thread.sleep(1000);//判断完之后阻塞，其他线程开始运行
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money = account.money - drawmoney;
        totalmoney = totalmoney + drawmoney;
        System.out.println(Thread.currentThread().getName() + "--账户余额： " + account.money);
        System.out.println(Thread.currentThread().getName() + "--总共取出来了： " + totalmoney);
    }
}