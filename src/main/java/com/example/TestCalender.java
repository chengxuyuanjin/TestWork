package com.example;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalender {
    public static void main(String[] args) {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");

        Calendar cal = Calendar.getInstance();//获取一个Calendar对象
        int thisYear=cal.get(Calendar.YEAR);
        System.out.println(thisYear);
        int thisMonth=cal.get(Calendar.MONTH);
        System.out.println(thisMonth);
        int thisDay=cal.get(Calendar.DATE);
        System.out.println(thisDay);
//        cal.set(thisYear,thisMonth,thisDay,0,0,0);
//        cal.setTime( );
        System.out.println("当前时间:"+sdf.format(cal.getTime()));
        System.out.println("当天"+sdf.format(cal.getTime().getTime())+"\n"+"当天减1000"+sdf.format(cal.getTime().getTime()-1000));
        cal.add(Calendar.MONTH, -1);//获取当前时间上一个月
        System.out.println("当前时间上一个月:"+sdf.format(cal.getTime()));
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMinimum(Calendar.DAY_OF_MONTH));//获取上个月的第一天
        Date lastMonth = cal.getTime();//得到上个月的第一天
        System.out.println("当前时间上个月第一天:"+sdf.format(lastMonth));

        cal.add(Calendar.MONTH, 1);//获取当前时间的下一个月
        cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));//获取下一个月的最后一天
        Date preMonth=cal.getTime();//得到下个月的最后一天

    }
}
