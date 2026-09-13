package javagenerics.day13september2026;

import java.util.List;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        /* GenericStack<Integer> stack = new GenericStack<>();

        stack.push(1);
        stack.push(2);
        stack.push(6);
        stack.push(8);

        stack.printElements();

         */

        /*GenericStack<String> stringGenericStack = new GenericStack<>();
        stringGenericStack.push("kundan");
        stringGenericStack.push("kumar");
        stringGenericStack.push("harshit");
        stringGenericStack.push("kumar singh");

        stringGenericStack.printElements();
        System.out.println(stringGenericStack.pop());
        stringGenericStack.printElements();
        System.out.println(stringGenericStack.peek());
        stringGenericStack.printElements();

         */
        ListPrinter.printList(List.of(1,2,3,4));
        ListPrinter.printList(List.of("k","u","n","d","a","n"));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;
    }
}
