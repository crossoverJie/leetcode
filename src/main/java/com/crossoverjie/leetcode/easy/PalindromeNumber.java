package com.crossoverjie.leetcode.easy;

/**
 * Function:判断一个数是否为回文
 *
 * @author crossoverJie
 *         Date: 04/12/2017 23:06
 * @since JDK 1.8
 */
public class PalindromeNumber {
    public boolean isPalindrome(int x){
        if (x < 0){
            return false ;
        }

        int result = 0 ;
        int temp = x ;
        for (; x != 0 ; x = x /10 ){
            result = result * 10 + x % 10 ;
        }
        if (result == temp){
            return true ;
        } else {
            return false ;
        }
    }
}
