package com.kundan.day20march2026;

import java.util.Stack;

public class MainM020 {
    public static boolean isValid(String s){
        Stack<Character> stack = new Stack<>();
        for (char c: s.toCharArray()){
            if(c=='('|| c=='{' || c=='[')
                stack.push(c);
            else {
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();

                if((c==')' && top != '(') ||
                        (c=='}' && top != '{')||
                        (c==']' && top != '['))
                    return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        System.out.println("Pairing of the parentheses is: "+isValid("()[]{}"));
        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" millisecond");
    }
}
