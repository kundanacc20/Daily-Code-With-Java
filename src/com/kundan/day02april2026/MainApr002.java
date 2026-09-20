package com.kundan.day02april2026;

import java.util.Stack;

public class MainApr002 {
    public boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for(char c : s.toCharArray()){
            if(c=='(')
                stack.push(')');
            else if (c=='{')
                stack.push('}');
            else if (c=='[')
                stack.push(']');
            else {
                if (stack.isEmpty() || stack.pop() !=c)
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        MainApr002 vp = new MainApr002();
        System.out.println(vp.isValid("()"));        // true
        System.out.println(vp.isValid("()[]{}"));    // true
        System.out.println(vp.isValid("(]"));        // false
        System.out.println(vp.isValid("([)]"));      // false
        System.out.println(vp.isValid("{[]}"));      // true
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }
}
