package com.kundan.day17june2026;

import java.util.Stack;

public class BalancedChecker {
    public boolean isBalanced(String str){
        Stack<Character> stack = new Stack<>();

        for(char ch : str.toCharArray()){
            if(ch == '(' || ch == '{' || ch =='['){
                stack.push(ch);
            } else {
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();

                if((ch == ')' && top != '(') ||
                        (ch =='}' && top != '{') ||
                        (ch == ']' && top != '[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
