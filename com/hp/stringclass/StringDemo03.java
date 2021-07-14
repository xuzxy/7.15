package com.hp.stringclass;
//string 类常见API
public class StringDemo03 {
    public static void main(String[] args) {
        // 0 123456789012345
        String str ="thinking in java";//java编程思想
        //查询10 的字符是什么
        char c = str.charAt(10);
        System.out.println("c = " + c);
        int length = str.length();//注意：length()是个方法，数组的长度是属性
        System.out.println("length = " + length);
        char[] chars = str.toCharArray();// 应用点 ：
           int x =chars.length; //数组不带 原括弧
        System.out.println("x = " + x);
        for (char aChar : chars) {
            System.out.println("aChar = " + aChar);
        }

        //查找给定的字符串的位置
        //如：查找in的位置 ，查找出来的是第一次出现的位置
        int i = str.indexOf("in");
        System.out.println("i = " + i);
        //从指定位置 进行检索
        int i1 = str.indexOf("in",3);
        System.out.println("i1 = " + i1);
        //也可以检索最后一次出现的位置
        int i2 = str.lastIndexOf("in");
        System.out.println("i2 = " + i2);
        String str1 = "thinking in java";//java编程思想
        //判断
        boolean th = str1.startsWith("th1111");
        System.out.println("th = " + th);
        boolean va = str1.endsWith("va");
        System.out.println("va = " + va);

        String str2 = "www.oracle.com";

      /*  boolean tr = str1.startsWith("tr1111");
        System.out.println("tr = " + tr);
        boolean var = str1.endsWith("va");
        System.out.println("va = " + va);

        String str3 = "www.java.oracle.com.cn";*/
        //String substring(in beginIndex,int endIndex)截取字符串
        //含头部含尾
        String substring = str2.substring(4,10);
        System.out.println("substring = " + substring);
        //一下子 截取末尾
        String substring1 = str2.substring(4);
        System.out.println("substring1 = " + substring1);
        String str3 =" 杨 洋 ";
        String trim = str3.trim();
        System.out.println("trim = " + trim); //trim只能删除字符串2边空格，不能删除中间的
        String m ="ABC";
        String m1 =m.toLowerCase();
        System.out.println("m1 = " + m1);
        String n ="abc";
        String n1 = n.toUpperCase();
        System.out.println("n1 = " + n1);
        System.out.println(m.equals(n));
        System.out.println(m.equalsIgnoreCase(n));//true忽略大小写，验证码专用
        
        
        //把数字转换成字符串
        int u =110;
        String s =String.valueOf(u);
        System.out.println("s +1 = " + s +1);
        //split() 分割数组
        String nn = "yangyang.avi";
        String[] split = nn.split("\\.");
        for (String s1 : split) {
            System.out.println("s1 = " + s1);

        }
        //练习 ：{"username":"tangseng","age":"500"} 提取json中的的  k 和  v .. 赋值到一个对象

        //数据替换
        String mm ="t,我爱你"; //甜蜜的
        String mmstr = mm.replaceAll("[^a-z]","甜蜜蜜");
        System.out.println("mmstr = " + mmstr);
        System.out.println(mm);
        
        //数据包含
        String mmo ="我想静静了 ";
        boolean jj= mmo.contains("静静");
        System.out.println("jj = " + jj);


        //练习:写一个private方法，需要传一个string 的网址参数，返回处理后的数据
        //嘉定 大数据获取了网址，我想要www --- com 之间的内容
        //有一下 几类网址
        //www.oracle.com ---> oracle
        //www.oracle.com.cn --> oracle
        //www.java.oracle.com.cn --> java.game.qq
        //www.lol.game.qq.com.cn --> lol.game.qq
        //www.game.mycom.com.cn --> game.mycom
        //www.girl.mycom.com.cn --> girl.mycom
        //www.computer.mycom.com.cn --> computer.mycom


        }
    }

