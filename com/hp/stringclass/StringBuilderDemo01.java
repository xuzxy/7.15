package com.hp.stringclass;

/*StringBuilder/Buffer 解决字符串频繁修改的问题
意思是把String升级了
String 类重点 重用性
StringBuilder /buffer 倾向于 对字符串的修改
当用到字符大量的，追加/修改/删除的时候，就是用StringBuilder,StringBuffer
StringBuilder的有点： 内部有个可变字符数组，书读快，内存消耗小
在公司实际开发中，字符串的增删改查，要用StringBuilder,StringBuffer


*/
public class StringBuilderDemo01 {
    public static void main(String[] args) {
        String str = "好好学习Java";
        StringBuilder sb =new StringBuilder(str);
        //1.追加
        sb.append("为了找一份优质工作");
        System.out.println("sb=" +sb);
        //2.修改 为了找一份优质工作改为 为了改变世界
        sb.replace(10,19,"为了改变世界");
        System.out.println("sb="+sb);
        //3.删除
        sb.deleteCharAt(1); //删除指定字符
        System.out.println("sb = " + sb);
        //3.1 删除 字符区间 常用， 比如 www.goods.baidu.com
        sb.delete(2,5);
        System.out.println("sb = " + sb);
        //3.2 删除全部
       // sb.delete();
        //4.插入 增加
        sb.insert(0,"努力活着");
        System.out.println("sb = " + sb);
        //对字符串 反转
        sb.reverse();
        System.out.println(sb);
    }
}
