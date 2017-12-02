package com.crossoverjie.leetcode;

/**
 * Function: [2, 7, 11, 15], target = 9 return [0,1]
 *
 * @author crossoverJie
 *         Date: 02/12/2017 22:47
 * @since JDK 1.8
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] ret = new int[2];
        for(int i =0; i<nums.length ;i++){

            for (int j = nums.length -1 ;j > 0 ;j-- ){

                if (nums[i] + nums[j] == target){
                    ret = new int[]{i, j};
                    return ret;
                }
            }
        }
        return ret ;
    }
}
