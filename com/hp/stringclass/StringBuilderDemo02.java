package com.hp.stringclass;

/*sb 对性能形象
*
*
* */
public class StringBuilderDemo02 {
    public static void main(String[] args) {
        String str ="a";
      StringBuilder sb =new StringBuilder(str);
        for (int i = 0; i < 30; i++) {
            sb.append(str);
            System.out.println("sb = " + sb);
        }
        System.out.println("str = " + str);
    }

}
