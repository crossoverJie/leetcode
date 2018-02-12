package com.crossoverjie.leetcode.easy;

/**
 * Function: 去除掉数组中重复项，并返回去除之后的数组大小
 *
 * @author crossoverJie
 *         Date: 12/02/2018 15:56
 * @since JDK 1.8
 */
public class RemoveDuplicatesSortedArray {


    public int removeDuplicates(int[] nums) {

        if (nums == null || nums.length == 0){
            return 0 ;
        }


        int duplicateSize = 0;
        for (int i = 0; i < nums.length; i++) {
            int preIndex = i - 1;

            if (preIndex < 0) {
                continue;
            }

            if (nums[preIndex] != nums[i]) {
                duplicateSize++;
                nums[duplicateSize] = nums[i] ;
            }

        }

        return duplicateSize + 1;
    }
}
