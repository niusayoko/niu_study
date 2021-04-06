package com.niu.study.algorithm;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author niuqingsong
 * @date 2021/4/6
 */
public class BubbleSort {

    public static void main(String[] args) {
        int a[] = {2, 3, 6, 4, 0, 1, 7, 8, 9, 5};
        bubbleSort(a);
    }

    private static void bubbleSort(int[] a) {
        //原理，相邻两个比较，每次比较一圈后，最右侧的肯定是最大的，
        //第二圈遍历的时候，最后一个就不用了遍历了
        //temp用来交换时做临时存储使用
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    //左边大于右边，需要交换
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        //打印结果
        System.out.println(Arrays.toString(a));
    }
}