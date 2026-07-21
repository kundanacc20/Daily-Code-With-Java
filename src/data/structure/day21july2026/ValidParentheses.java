package data.structure.day21july2026;

import java.util.Stack;

public class ValidParentheses {
   public boolean isValid(String s){
       //data structure
       Stack<Character> stack = new Stack<>();

       for(char c: s.toCharArray()){
           if(c == '(')
               stack.push(')');
           else if(c == '{')
               stack.push('}');
           else if(c == '[')
               stack.push(']');
           else {
               if(stack.isEmpty() || stack.pop() != c)
                   return false;
           }
       }
       return stack.isEmpty();
   }
}
