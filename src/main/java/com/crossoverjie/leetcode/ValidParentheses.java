package com.crossoverjie.leetcode;

import java.util.Stack;

/**
 * Function:校验括号
 *
 * @author crossoverJie
 *         Date: 06/12/2017 00:46
 * @since JDK 1.8
 */
public class ValidParentheses {


    /**
     * 1.使用栈来存储字符
     * 2.当遍历字符时是 （ { （ 时则压栈
     * 3.不是的时候首先判断栈是否为空，如果为空则肯定没有和左括号匹配完整，那么肯定返回false
     * 4.栈不为空时就判断栈顶的括号和当前的括号是否一对，如果是一对则将栈顶移出。
     * 5.如果不是一对 那么肯定就是false了。
     * 6.最后看栈是否为空，为空则说明全部匹配也就是返回 true
     * @param s
     * @return
     */
    public boolean isValid(String s) {


        Stack<Character> stack = new Stack<>() ;

        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (isLeft(ch)){
                stack.push(ch) ;
            } else {

                //判断栈是否为空
                if (stack.empty()){
                    return false ;
                }

                if (isaBoolean(stack, ch)){
                    stack.pop() ;
                }else {
                    return false ;
                }

            }

        }

        return stack.isEmpty() ;
    }

    private boolean isaBoolean(Stack<Character> stack, char ch) {
        return (stack.peek() == '(' && ch == ')')
                || (stack.peek() == '{' && ch == '}')
                || (stack.peek() == '[' && ch == ']');
    }

    private boolean isLeft(char ch){
        if (ch == '[' || ch == '{' || ch == '('){
            return true ;
        } else {
            return false ;
        }
    }
}
