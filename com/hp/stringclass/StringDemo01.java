package com.hp.stringclass;

public class StringDemo01 {
    public static void main(String[] args) {
        String s1 ="abc";
        String s2 ="abc";
        System.out.println(s1 == s2); //true
        //原因：以上为什么是true 因为s2重用了s1的对象
        s1 =s1+ "!";
        System.out.println(s1 == s2);
        //原因：以上为什么是false 因为1 根本不相等 2 ，深层原因，是对象被修改
        String s3 ="a"+"bc";
        System.out.println(s2 == s3);//true
        //原因： 字符串的连接 就等于没链接
        String s4 =new String("abc");
        String s5 =new String("abc");
        System.out.println(s4 == s2); //false
        //原因：s2 是常量
        System.out.println(s4);
        System.out.println(s4 == s5);
    }
}
