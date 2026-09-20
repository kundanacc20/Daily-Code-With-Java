package selfpracticejavacode.day20september2026;

public class SlidingWindowUtil {
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
