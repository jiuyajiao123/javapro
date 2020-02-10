package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/4.
 */
public class Text2 {
    public static void main(String[] args) {
        /**
         * 1-4 任意三个数有多少种组合
         * */
        int[] array = {1, 2, 3, 4};
        for (int i : array) {
            for (int j : array) {
                if (i != j) {
                    for (int k : array) {
                        if (k != i && k != j) {
                            System.out.println(i * 100 + j * 10 + k);
                        }
                    }
                }
            }
            /**
             * 1-100的偶数和
             **/
            int sum = 0;
            for (i = 1; i <= 100; i++) {
                if (i % 2 == 0) {
                    sum += i;
                }
            }
            System.out.println(sum);
        }
        /**
         * 计算M的n次方
         **/
        int m = 6;
        int n = 3;
        int s = 1;
        for (int i = 0; i < n; i++) {
            s = s * m;
        }
        System.out.println(s);
        /**
         * 100-900之间的水仙花数 例如 135=1*3+5*3+3*3
         **/
        for (int i = 100; i <= 999; i++) {
            int a = i / 100;
            int b = i % 100 / 10;
            int c = i % 10;
            if (a * a * a + b * b * b + c * c * c == i) {
                System.out.println(i);
            }
        }
        /**
         * 两个正整数的最大公约数和最小公倍数
         **/
        int x = 600;
        int y = 256;
        int max = 1;
        int min = max(x, y);
        for (int i = 1; i <= x && i >= y; i++) {
            if (x % i == 0 && y % x == 0) {
                max = i;
            }
        }
        for (int i = max(x, y); i <= x * y; i++) {
            if (i % x == 0 && i % y == 0) {
                min = i;
                break;
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
