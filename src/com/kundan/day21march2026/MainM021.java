package com.kundan.day21march2026;

public class MainM021 {
    public static int[] merge(int[] a,int[] b){
        int[] result = new int[a.length + b.length];
        int i=0, j=0, k=0;

        while (i<a.length && j<b.length){
            if(a[i]<b[j])
                result[k++]=a[i++];
            else
                result[k++] =b[j++];
        }
        while (i<a.length)
            result[k++] =b[i++];
        while (j<b.length)
            result[k++] = b[j++];
        return result;
    }
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        int[] arr1 ={1,3,5,7};
        int[] arr2 ={2,4,6,8,10};

        int[] merged = merge(arr1,arr2);
        System.out.println("Merged Array: ");
        for(int num : merged){
            System.out.print(num+" ");
        }
        System.out.println();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Program Time: "+programTime +" ms");
    }
}
