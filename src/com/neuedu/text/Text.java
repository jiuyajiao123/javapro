package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/3.
 */
public class Text {
    public static void main(String[] args) {
        int[] array = {11, 82, 43, 94, 25, 16, 97};
        for (int i = 0; i <= array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int sum = array[i + 1];
                array[i + 1] = array[i];
                array[i] = sum;
            }
            System.out.println(array[i]);
        }

    }
}
