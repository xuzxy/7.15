package com.hp.string02;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个字符串数组:{"one","two","three"}
 * 然后将该数组转换为一个List集合
 * @author Xiloer
 *
 */

public class Text06 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        String[] sc={"one","two","three"};

        for (int i = 0; i < sc.length; i++) {
            list.add(sc[i]);

        }
        System.out.println("list= " + list);
    }
}

