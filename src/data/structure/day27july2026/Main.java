package data.structure.day27july2026;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // start timer
        long startTimer = System.nanoTime();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        int[] nums = new int[n];

        System.out.println("Enter array elements (space-separated):");
        String[] parts = sc.nextLine().trim().split(" ");
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(parts[i]);
        }

        int result = KadaneUtil.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);

        sc.close();

        // end timer
        long endTimer = System.nanoTime();

        // program time
        long programTime = (endTimer - startTimer) / 1_000_000;
        System.out.println("Program time: " + programTime + " ms");
    }
}
