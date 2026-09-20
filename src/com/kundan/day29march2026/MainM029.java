package com.kundan.day29march2026;

public class MainM029 {
    public int maxArea(int[] height){
        int left =0, right = height.length-1;
        int max =0;

        while (left<right){
            int area = Math.min(height[left],height[right])*(right - left);
            max = Math.max(max,area);

            if(height[left]<height[right]){
                left++;
            } else {
                right--;
            }
        }
        return max;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        MainM029 solution = new MainM029();
        int[] height = {1,8,6,2,5,4,8,3,7};
        int result = solution.maxArea(height);
        System.out.println("Maximum water container area: "+result);
        //end timer
        long endTimer = System.nanoTime();
        //program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Program time: "+programTime+" millisecond");
    }
}
