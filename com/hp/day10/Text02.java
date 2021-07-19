package com.hp.day10;

import java.io.File;
import java.io.FileFilter;
import java.util.ArrayList;
import java.util.List;

// 作业2:   遍历 你D盘 的 其中一个文件夹 , 并查找出 文件后缀名带有.class的文件
public class Text02 {
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
                boolean Class= split[split.length-1].equals("class");

                if (Class ) {
                    System.out.println("filel = " +file1.toString());
                }

            }
        }

    }


}