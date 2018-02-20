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

            if (current < target) {
                continue;
            }

            if (current > target) {
                return i;
            }

            if (current == target) {
                return i;
            }
        }

        return nums.length;
    }
}
