package com.zeroten.common.util;

/**
 * @Author: jingji.lin
 * @Description:
 * @Date: 2019/12/11 14:56
 * @Version: 1.0
 */
public class CheckUtils {

    /**
     * @Author linjingji
     * @Description 判断 strings 的值是否为空
     * @Date 16:07 2019/12/11
     * @param strings 一个或者多个参数
     * @return
     **/
    public static boolean isAnyEmpty(String... strings) {
        for (int i = 0; i < strings.length; i++) {
            if (strings[i] == null || strings[i] == "") {
                return false;
            }
        }
        return true;
    }

    /**
     * @Author linjingji
     * @Description 判断 arr 数组是否为空
     * @Date 16:07 2019/12/11
     * @param arr Object类型参数
     * @return boolean
     **/
    public static boolean isEmpty(Object[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null || arr[i] != "") {
                return false;
            }
        }
        return true;
    }

    /**
     * @Author linjingji
     * @Description 判断两个String类型的值是否相等
     * @Date 16:07 2019/12/11
     * @param str1 参数 1
     * @param str2 参数 2
     * @return boolean
     **/
    public static boolean equals(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return false;
        }
        if (!str1.equals(str2)) {
            return false;
        }
        return true;
    }

    /**
     * @Author linjingji
     * @Description 判断两个Integer类型的值是否相等
     * @Date 16:07 2019/12/11
     * @param n1 参数 1
     * @param n2 参数 2
     * @return boolean
     **/
    public static boolean equals(Integer n1, Integer n2) {
        if (n1 == null || n2 == null) {
            return false;
        }
        if (!n1.equals(n2)) {
            return false;
        }
        return true;
    }

}
