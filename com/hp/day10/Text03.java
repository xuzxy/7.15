package com.hp.day10;

import java.text.SimpleDateFormat;
import java.util.Date;

// 作业3:  使用线程的sleep方法 做一个控制台显示时间 ,  格式是:  2021-07-17 23:45:动态的秒
/// 时间是动态的..
public class Text03 {
    public static void main(String[] args) throws InterruptedException {
        int i = 0;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        while (true) {
            Date date = new Date();
            System.out.println("time = " + simpleDateFormat.format(date));
            Thread.sleep(1000);
        }

    }
}
