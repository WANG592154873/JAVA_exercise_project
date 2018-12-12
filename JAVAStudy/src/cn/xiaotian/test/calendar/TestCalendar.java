package cn.xiaotian.test.calendar;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestCalendar {
    public static void main(String[] args) {
        long now = System.currentTimeMillis();
        System.out.println(now);
        Date dt = new Date();
        System.out.println(dt.toString());
        Date dt1 = new Date();
        System.out.println(dt1.getTime());;
        System.out.println("#####################");
        SimpleDateFormat s1 = new SimpleDateFormat("yyyy-MM-dd");
        String daytime = s1.format(dt);
        System.out.println(daytime);
        Date dt2 = null;
        try {
            dt2 = s1.parse(daytime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println(dt2);
    }
}
