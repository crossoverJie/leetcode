package com.crossoverjie.leetcode.easy;

/**
 * Function:
 *
 * @author crossoverJie
 *         Date: 21/02/2018 00:34
 * @since JDK 1.8
 */
public class SearchInsertPosition {


    public int searchInsert(int[] nums, int target) {

        if (nums == null || nums.length == 0) {
            return -1;
        }


        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];

            //当前值比目标值小就跳过
            if (current < target) {
                continue;
            }

            //当前值比目标值大时，当前的位置就应该是目标值插入的索引位置
            if (current > target) {
                return i;
            }

            //相等直接返回当前的索引
            if (current == target) {
                return i;
            }
        }


        //如果遍历完都没有，目标值就应该放在最后，所有索引应该是数组长度
        return nums.length;
    }
}
