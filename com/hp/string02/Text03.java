package com.hp.string02;

import com.hp.jihe.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 创建一个List集合(ArrayList,LinkedList均可)
 * 存放元素"one","two","three","four"。
 * 获取集合第二个元素并输出。
 * 将集合第三个元素设置为"3"
 * 在集合第二个位置上插入元素"2"
 * 删除集合第三个元素。
 * @author Xiloer
 *
 */
public class Text03 {
    public static void main(String[] args) {
          List<String> list = new ArrayList<>();
          String[] xu={"one","two","three","four"};
          for (int i = 0; i < xu.length; i++) {
            list.add(xu[i]);
            }
        System.out.println("list.get(1) = " + list.get(1));
        list.set(2,"3");
        System.out.println( list.get(2));
        list.add(1,"2");
        System.out.println("a = " + list);
        list.remove(2);
        System.out.println("a = " + list);
        /*if ( list  == null) {
            list.get(1);
            System.out.println("list = " + list);*/
        }
        }


