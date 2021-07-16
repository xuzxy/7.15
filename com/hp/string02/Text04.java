package com.hp.string02;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合并添加元素0-9
 * 然后获取子集[3,4,5,6]
 * 然后将子集元素扩大10倍
 * 然后输出原集合。
 * 之后删除集合中的[7,8,9]
 * @author Xiloer
 *
 */
public class Text04 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <=9 ; i++) {
            list.add(i);  //添加元素
        }

        List<Integer> s = list.subList(3,7);
        System.out.println(s);
        //将子集元素扩大10倍
        for (int i = 0; i <s.size(); i++) {
            s.set(i,list.get(i)*10);
        }
        //输出原集合。
        System.out.println("list =" + list);
        //删除集合中的[7,8,9]
        list.subList(7,9).clear();
        System.out.println(list);


    }

}
