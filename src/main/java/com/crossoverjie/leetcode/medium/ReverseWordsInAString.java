package com.crossoverjie.leetcode.medium;

import java.util.Stack;

/**
 * Function:翻转字符
 *
 * 输入 the sky is blue
 * 输出 blue is sky the
 *
 * @author crossoverJie
 *         Date: 17/02/2018 23:28
 * @since JDK 1.8
 */
public class ReverseWordsInAString {

    /**
     * 根据栈的特性
     * @param s
     * @return
     */
    public String reverseWords(String s) {

        StringBuilder str = new StringBuilder() ;

        if (s.isEmpty()){
            return str.toString() ;
        }

        String[] strings = s.split(" ");
        if (strings.length == 0){
            return str.toString() ;
        }

        Stack<String> stack = new Stack<>() ;
        for (String string : strings) {
            if (string.isEmpty()){
                continue ;
            }
            stack.push(string) ;
        }

        while (!stack.isEmpty()){
            str.append(stack.pop()).append(" ") ;
        }

        return str.toString().trim() ;
    }
}
