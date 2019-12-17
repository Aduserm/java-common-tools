package com.zeroten.common.util;

/**
 * @Author: jingji.lin
 * @Description:
 * @Date: 2019/12/17 11:36
 * @Version: 1.0
 */
public class ArrayUtils {

    public static int[] sort(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {
            for(int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

}
