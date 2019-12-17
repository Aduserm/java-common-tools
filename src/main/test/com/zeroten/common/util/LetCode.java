package com.zeroten.common.util;

import java.util.Arrays;
import org.junit.Test;

/**
 * @Author: jingji.lin
 * @Description:
 * @Date: 2019/12/16 12:04
 * @Version: 1.0
 */
public class LetCode {
    @Test
    public void test() {
        int[] nums = new int[] {2, 3, 5, 7};
        int[] arr = twoSum(nums, 9);
        System.out.println(Arrays.toString(arr));
    }

    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        for(int i = 0; i < nums.length - 1; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return null;
    }
}
