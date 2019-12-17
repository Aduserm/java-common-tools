package com.zeroten.common.util;

import java.util.Arrays;
import org.junit.Test;

/**
 * @Author: jingji.lin
 * @Description:
 * @Date: 2019/12/17 11:42
 * @Version: 1.0
 */
public class ArrayUtilsTest {

    @Test
    public void test() {
        int[] arr = new int[] {12, 33, 15, 6, 7, 11, 22};
        int[] sort = ArrayUtils.sort(arr);
        System.out.println(Arrays.toString(sort));
    }

}
