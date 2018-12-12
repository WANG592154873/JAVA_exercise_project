package cn.xiaotian.GeoCalendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

/**
 *获取当前的时间并输出一个日历
 */
public class GreCalendar {
    public static void main(String[] args) {
        Date d1 = new Date();
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy");
        SimpleDateFormat s2 = new SimpleDateFormat("MM");
        SimpleDateFormat s3 = new SimpleDateFormat("dd");
        int s1_ = Integer.parseInt(s1.format(d1));
        int s2_ = Integer.parseInt(s2.format(d1));
        int s3_ = Integer.parseInt(s3.format(d1));
//        System.out.print("现在是" + s1_ + "年");
//        System.out.print(s2_ + "月");
//        System.out.println(s3_ + "日");

        Calendar calendar = new GregorianCalendar(s1_,s2_-1,s3_);
//        System.out.println(calendar.get(Calendar.YEAR));
//        System.out.println(calendar.get(Calendar.MONTH));
//        System.out.println(calendar.get(Calendar.DATE));
        int nowYear = calendar.get(Calendar.YEAR);
        int nowMonth = calendar.get(Calendar.MONTH) + 1;
        int nowDay = calendar.get(Calendar.DATE);
        System.out.println("当前的日期为：" + nowYear + "年" + nowMonth + "月" + nowDay + "日");
        System.out.println("本月有" + calendar.getActualMaximum(Calendar.DATE) + "天");
        Calendar calendarTemp = new GregorianCalendar(s1_,s2_-1,s3_);
        calendarTemp.set(Calendar.DATE,1);
        int everyMonth1st = calendarTemp.get(Calendar.DAY_OF_WEEK);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int day = 1;
        for(int i = 1; i < calendar.getActualMaximum(Calendar.DATE) + everyMonth1st ; i++){
            if(i < everyMonth1st){
                System.out.print("\t");
            }else{
                System.out.print(day);
                if(day == s3_){
                    System.out.print("*" + "\t");
                }else{
                    System.out.print("\t");
                }
                day++;
            }
            if(i%7==0){
                System.out.println();
            }
        }


    }
}
