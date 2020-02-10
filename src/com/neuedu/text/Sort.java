package com.neuedu.text;

/**
 * Created by 86183 on 2020/2/5.
 */
public class Sort {

    public static void main(String[] args) {

        /**
         * 冒泡排序
         **/
        /*int[] array={8,74,38,18,3,73,17,48,39};
        for(int i=0;i<array.length-1;i++){
            int flag=0;
            for(int j=0;j<array.length-1-i;j++){
                if (array[j] > array[j+1]) {
                    int a=array[j];
                   array[j]=array[j+1];
                    array[j+1]=a;
                    flag++;
                }
            }
            if(flag==0){
                break;
            }
        }
        for(int c:array){
            System.out.println(c);
        }
    }*/
        /**
         * 选择排序
         **/
        /*int[] array = {8, 74, 38, 18, 3, 73, 17, 48, 39};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int a = array[j];
                    array[j] = array[i];
                    array[i] = a;
                }
            }
        }
        for (int c : array) {
            System.out.println(c);
        }*/
        /**
         * 查找
         **/
        int array[] = new int[10000];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        int a = 3000;
        int index = search(array, a);
        System.out.println(index);
    }

    public static int find(int[] array, int value) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count++;
            if (array[i] == value) {
                System.out.println("查找了" + count + "次");
                return i;
            }
        }
        return -1;
    }

    /**
     * 二分搜索 有序
     **/
    public static int search(int[] array, int value) {
        int min = 0;
        int max = array.length - 1;
        int mid;
        int count = 0;
        while (min <= max) {
            count++;
            mid = (min + max) / 2;
            if (value == array[mid]) {
                System.out.println("查找了" + count + "次");
                return array[mid];
            } else if (value <= array[mid]) {
                max = mid - 1;
            } else {
                min = mid + 1;
            }
        }
        return -1;
    }
}
