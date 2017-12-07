package com.crossoverjie.leetcode.easy;

/**
 * Function: 交换整数 Input: 123  Output:  321
 *
 * @author crossoverJie
 *         Date: 04/12/2017 22:10
 * @since JDK 1.8
 */
public class ReverseInteger {

    public int reverse(int x) {
        long result = 0 ;

        for (; x !=0 ; x = x / 10){
            result = result * 10 + x % 10 ;
        }

        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0 ;
        }

        return (int) result;
    }

}
