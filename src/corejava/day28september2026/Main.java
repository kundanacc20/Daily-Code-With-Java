package corejava.day28september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        /*LRUCache cache = new LRUCache(2);

        cache.putValue(1,160);
        cache.putValue(2,170);

        System.out.println(cache.getValue(1));

        cache.putValue(3,399);
        System.out.println(cache.getValue(2));
        System.out.println(cache.getValue(3));

         */

        LongestSubstring longestSubstring = new LongestSubstring();
        int result = longestSubstring.lengthOfLongestSubstring("abcabcbb");
        System.out.println(result);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
