package com.kundan.day19feb2026;

import com.kundan.day5fab2026.Main;

public class Main019 {
//    private String message ="hello from outer class";
//
//    class  InnerClass {
//        void display(){
//            System.out.println(message);
//        }
//    }
      public String nonStaticMethod(){
          return "returning from non-static method to static main method";
      }

    public static void main(String[] args){
//        Main019 outer = new Main019();
//
//        Main019.InnerClass inner= outer.new InnerClass();
//        inner.display();

        // calling a non static method in the static main method.

        Main019 ob = new Main019();

        System.out.println(ob.nonStaticMethod());
    }
}
