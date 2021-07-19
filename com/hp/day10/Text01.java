package com.hp.day10;


import java.io.File;
import java.util.Scanner;

// 作业1:   遍历 你D盘 的 其中一个文件夹 , 并查找出 文件中带有 java 的 文件.
public class Text01 {
    public static void main(String[] args) {
           File file = new File("D:/实训");
           all(file);
    }
private  static  void  all(File file){
        File[] files = file.listFiles();
    for (File file1 : files) {
        System.out.println("file1 = " + file1);
        if (file1.isDirectory()) {
            all(file1);
        }else if (file1.isFile()) {
           String[] split = file.getName().split("\\.");
            boolean Class= split[split.length-1].equals("java");

            if (Class ) {
                System.out.println("filel = " +file1.toString());
            }

        }
    }
        
}


}