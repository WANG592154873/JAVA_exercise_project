package cn.xiaotian.GeoCalendarInput;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *输入一个时间并输出日历
 */
public class GreCalendarInput {
    public static void main(String[] args) {
        System.out.println("请输入日期，格式为yyyy-MM-dd，如2019-02-03");
        Scanner scanner = new Scanner(System.in);
        String strDate = scanner.nextLine();
        String[] str = strDate.split("-");
        int InputYear = new Integer(str[0]);
        int InputMonth = new Integer(str[1]);
        int InputDay = new Integer(str[2]);
        Calendar Inputcalendar = new GregorianCalendar(InputYear,InputMonth-1,InputDay);
        System.out.println("输入的日期为：" + InputYear + "年" + InputMonth + "月" + InputDay + "日");
        System.out.println("本月有" + Inputcalendar.getActualMaximum(Calendar.DATE) + "天");
        Calendar InputcalendarTemp = new GregorianCalendar(InputYear,InputMonth - 1,InputDay);
        InputcalendarTemp.set(Calendar.DATE,1);
        int InputeveryMonth1st = InputcalendarTemp.get(Calendar.DAY_OF_WEEK);
        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int day = 1;
        for(int i = 1; i < Inputcalendar.getActualMaximum(Calendar.DATE) + InputeveryMonth1st ; i++){
            if(i < InputeveryMonth1st){
                System.out.print("\t");
            }else{
                System.out.print(day);
                if(day == InputDay){
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
