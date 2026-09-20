package com.kundan.day5fab2026;

public class Main {
    public static void main(String[] args) {

        // Find the second largest distinct element in the array
        /* Input : {10,5,2,1,88,2,20,11,10}
           Output : 20

           Approach
           ->maintain two variables:
            ->largest
            ->secondLargest
         */


//        int[] arr={10,5,2,1,88,2,20,11,10};
//
//        int largest = Integer.MIN_VALUE;
//        int secondLargest = Integer.MIN_VALUE;
//
////        System.out.println("largest="+largest);
////        System.out.println("secondLargest="+secondLargest);
//
//        for (int num : arr) {
//            if(num>largest) {
//                secondLargest = largest;
//                largest = num;
//            } else if(num>secondLargest && num != largest) {
//                secondLargest = num;
//            }
//        }
//        if(secondLargest == Integer.MIN_VALUE) {
//            System.out.println("no second largest element");
//        } else {
//            System.out.println("second largest element: " + secondLargest);
//        }

//        //check if array is sorted
//        int[] arr ={1,2,3,4,5,6,7,8,9};
//
//        boolean isSorted = true;
//
//        for(int i=0;i<arr.length-1;i++){
//            if(arr[i] >arr[i+1]){
//                isSorted =false;
//                break;
//            }
//        }
//
//        System.out.println(isSorted);

        // find the max element in the array

//        int[] arr={3,5,2,9,7,5,999};
//
//        int max =arr[0];
//
//        for(int num:arr){
//            if(num>max){
//                max = num;
//            }
//        }
//        System.out.println("largest element in array is: "+max);


    }
}
