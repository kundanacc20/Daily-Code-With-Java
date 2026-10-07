package java8code.day07october2026;

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
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println(programTime+" ms");
    }
}
