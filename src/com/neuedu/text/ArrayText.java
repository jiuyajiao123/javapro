package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/6.
 */
public class ArrayText {
    public static void main(String[] args) {
        Array p1 = new Array();
        for (int i = 1; i <= 10; i++) {
            p1.add(i);
        }
        for (int i = 0; i < p1.getsize(); i++) {
            System.out.println(p1.getsize(i));
        }
    }
}
