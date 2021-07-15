package com.hp.string01;


import java.util.Date;

/**
 * 使用Date输出当前系统时间，以及3天后这一刻的时间
 *
 *
 */
public class Text01 {
    public static void main(String[] args) {
        //获取当前系统时间
        Date date = new Date();
        System.out.println("date = " + date);
        long time = date.getTime();
        System.out.println("time = " + time);
       //3天后这一刻时间
        long time1 = 1000*60*60*24*3;
        date.setTime(date.getTime()+time1);
        System.out.println("date = " + date);


    }
}
