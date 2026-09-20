package selfpracticejavacode.day20september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        int[] myArray = {1,2,3,4,5,1,6,7,8,9,10};

        int k = 4;

        System.out.println(slidingWindow(myArray,k));
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime+" ms");
    }

    public static int slidingWindow(int[] myArray, int k) {
        int left = 0;
        int windowSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int right = 0; right < myArray.length; right++){
            windowSum += myArray[right];

            if(right - left + 1 == k){
                maxSum = Math.max(maxSum,windowSum);

                windowSum -= myArray[left];
                left++;
            }
        }

        return maxSum;
    }
}
