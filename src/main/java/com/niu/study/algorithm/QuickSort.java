package com.niu.study.algorithm;

import java.util.Arrays;

/**
 * 快速排序
 *
 * @author niuqingsong
 * @date 2021/4/6
 */
public class QuickSort {

    /**
     * 测试
     * @param args
     */
    public static void main(String[] args) {
        int[] num = {11, 45, 78, 52, 3, 44, 33, 64, 55, 33, 11, 99, 18};
        System.out.println("排序前：" + Arrays.toString(num));
        quickSort(num, 0, num.length - 1);
        System.out.println("排序后：" + Arrays.toString(num));
        System.out.println("数组个数：" + num.length);
    }

    private static void quickSort(int[] num, int left, int right) {
        //如果left和right相等，则表明只有一个元素
        if (right <= left) {
            return;
        }

        int key = num[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (num[j] >= key && i < j) {
                j--;
            }
            int tempa = num[i];
            num[i] = num[j];
            num[j] = tempa;

            while (num[i] <= key && i < j) {
                i++;
            }

            //交换
            int tempb = num[i];
            num[i] = num[j];
            num[j] = tempb;
        }

        System.out.println("排序中：" + Arrays.toString(num));

        quickSort(num, left, i - 1);
        quickSort(num, i + 1, right);
    }

    /**
     * 将一个int类型数组转化为字符
     * @param arr
     * @param flag
     * @return
     */
    private static String arrayToString(int[] arr, String flag) {
        String str = "数组为(" + flag + ")：";
        for (int a : arr) {
            str += a + "\t";
        }
        return str;
    }
}