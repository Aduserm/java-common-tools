package com.zeroten.common.util;

import org.junit.Test;

/**
 * @Author: jingji.lin
 * @Description:
 * @Date: 2019/12/11 15:18
 * @Version: 1.0
 */
public class CheckUtilsTest {

    @Test
    public void test() {
        String str1 = "hello";
        String str3 = "hello";
//        String str2 = "world";
        String str2 = "";
        String st3 = new String("hello");
        String st4 = new String("world");
        String[] arr = new String[] {"12", "", "231"};
        String[] arr3 = new String[] {"12", "111", "231"};
        String[] arr2 = new String[] {};
        Integer n1 = 128;
        Integer n2 = new Integer(128);
        Integer n3 = 127;
        Integer n4 = 127;

        System.out.println("isAnyEmpty（str2为空）: " + CheckUtils.isAnyEmpty(str1, str2, str3));
        System.out.println("isAnyEmpty（都有值）: " + CheckUtils.isAnyEmpty(str1, "111", str3));
        System.out.println("isAnyEmpty（都为null）: " + CheckUtils.isAnyEmpty(null, null, null));
        System.out.println("isEmpty（有个参数为空）: "+ CheckUtils.isEmpty(arr));
        System.out.println("isEmpty（空数组）: "+ CheckUtils.isEmpty(arr2));
        System.out.println("isEmpty（都有值）: "+ CheckUtils.isEmpty(arr3));
        System.out.println("String equals（都有值）: "+ CheckUtils.equals(str1, st3));
        System.out.println("String equals（str2为空）: "+ CheckUtils.equals(str2, st4));
        System.out.println("String equals（有个null值）: "+ CheckUtils.equals(str2, null));
        System.out.println("Integer isEmpty（一个new出来的值）: "+ CheckUtils.equals(n1, n2));
        System.out.println("Integer isEmpty（都有值）: "+ CheckUtils.equals(n3, n4));
        System.out.println("Integer isEmpty（一个null值）: "+ CheckUtils.equals(n3, null));
        assert n1.equals(n2);
    }
}
