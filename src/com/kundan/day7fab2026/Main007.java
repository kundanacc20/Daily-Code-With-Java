package com.kundan.day7fab2026;

public class Main007 {
    public static void main(String[] args) {
//        //reverse the string

//        String s = "hello world";
//        char[] c = s.toCharArray();
//
//        //define two pointer
//        int left =0 ,right = c.length -1;
//
//        //condition
//        while (left<right){
//            char temp = c[left];
//            c[left]=c[right];
//            c[right]=temp;
//            left++;
//            right--;
//        }
//        System.out.println(new String(c));

//        //check palindrome number
//        String s = "abcdefgedcba";
//
//        //declaring two pointer
//        int left=0 , right=s.length()-1;
//        boolean isPalindrome = true;
//
//        //checking the condition
//        while (left<right){
//            if(s.charAt(left) != s.charAt(right)){
//                isPalindrome=false;
//                break;
//            }
//            left++;
//            right--;
//        }
//        System.out.println(isPalindrome);

        //find missing number(1 to n)

        int[] arr ={1,2,3,4,5,7,8,9};
        int n =arr.length+1;
//        System.out.println(n);
        int expectedSum = n*(n+1)/2;
        int actualSum =0;

        for(int num: arr){
            actualSum+=num;
        }
        System.out.println("missing number is :"+(expectedSum-actualSum));
    }
}
