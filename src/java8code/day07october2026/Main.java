package java8code.day07october2026;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//Find the largest and smallest element in an array.
        /*int[] arr = {1,9,2,11,22,10,67,4,5};
        int max = 0;

        for(int i =0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        int i =0;
        int maxValue = 0;
        while (i < arr.length){
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
            i++;
        }
        System.out.println(maxValue);
         */
        /*int[] arrayNumber = {1,9,11,21,99,110,6,0,8,7,5};

        int max = Arrays.stream(arrayNumber).max().getAsInt();
        int min = Arrays.stream(arrayNumber).min().getAsInt();
        System.out.println("Min value: "+min);
        System.out.println("Max value : "+max);
         */
       /* int[] array = {1,11,77,12,0,999,9};

        System.out.println(findMaxValue(array));
        */

        int[] array = {1,8,11,3,15,2,9};

        int largestNumber = Integer.MIN_VALUE;
        int secondLargestNumber = Integer.MIN_VALUE;

        for(int i =0; i < array.length; i++){
            if(array[i] > largestNumber){
                secondLargestNumber = largestNumber;
                largestNumber = array[i];
            } else if(array[i] > secondLargestNumber && array[i] != largestNumber){
                secondLargestNumber = array[i];
            }
        }
        System.out.println("Largest Number: " + largestNumber + " secondlargest: " + secondLargestNumber);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer) / 1_000_000;

        System.out.println(programTime + " ms");
    }
/*
    private static int findMaxValue(int[] array) {
        return Arrays.stream(array).max().getAsInt();
    }
 */

}
