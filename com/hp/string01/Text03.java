package com.hp.string01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * 输入某人生日，格式为"yyyy-MM-dd"，输出到现在为止经过了多少周。

 *
 */
public class Text03 {
    public static void main(String[] args) {
        xu();
    }
    private static void xu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你的生日，格式为yyyy-MM-dd");
       String sc = scanner.nextLine();
       String strDateFormat = "yyyy-MM-dd";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
        long i = new Date().getTime(); // //获得真实的时间，long值
        try {
            Date parse = sdf.parse(sc);
            i -= parse.getTime();
            System.out.println("到今天经历了" + i / 86400000 / 7 + "周");
        } catch (ParseException e) {
            System.out.println("输入格式错误");
            e.printStackTrace();
        }
    }

}
