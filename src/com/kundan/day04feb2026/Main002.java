package com.kundan.day04feb2026;

import java.util.Arrays;

public class Main002 {
    public static void main(String[] args) {
        //Remove the duplicate element from the array and print it
        int[] arr={1,1,2,2,3,4,1,8,2,6,9,1,9,11,2,4,7,2,77,44,33,11,0,33,8,12,};
        Arrays.sort(arr);
        int i =0;

        for(int j=1;j<arr.length;j++) {
            if (arr[j] != arr[i]) {
                i++;
                arr[i] = arr[j];
            }

        }
        int newLength = i+1;

            System.out.println("New length "+newLength);
            System.out.println("Array:");
            for(int k=0;k<newLength;k++){
                System.out.print(arr[k]+" ");
            }
    }
}
