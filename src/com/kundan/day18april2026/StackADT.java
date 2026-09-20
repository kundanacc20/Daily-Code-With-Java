package com.kundan.day18april2026;



public class StackADT<T> {
    private java.util.ArrayList<T> stack;

    public StackADT(){
        stack = new java.util.ArrayList<>();
    }

    //push operation
    public void push(T item){
        stack.add(item);
    }

    //pop operation
    public T pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack underflow");
        }
        return stack.remove(stack.size() -1);
    }

    //peek operation
    public T peek(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty");
        }
        return stack.get(stack.size()-1);
    }
    //check if empty
    public boolean isEmpty(){
        return stack.isEmpty();
    }
    // print all element in the stack
    public void printStack(){
        if(isEmpty()){
            System.out.println("Stack is empty ");
        } else {
            System.out.println("Stack elements: ");
            for(T item : stack){
                System.out.print(item+" ");
            }
            System.out.println();
        }
    }
}
