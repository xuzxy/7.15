package com.hp.string01;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 将当前系统时间以"yyyy-MM-dd HH:mm:ss"格式输出
 *
 *
 */
public class Text02 {
    public static void main(String[] args) {
        //定义一个日期
        Date date = new Date();
        System.out.println("date = " + date);
        //修改 日期显示格式 yyyy必须小写
       String pattern="yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        String chinaDateStr = sdf.format(date);
        System.out.println("chinaDateStr = " + chinaDateStr);
    }
}
