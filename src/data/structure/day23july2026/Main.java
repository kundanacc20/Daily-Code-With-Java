package data.structure.day23july2026;

public class Main {
 public static void main(String[] args){
     //start timer
     long startTimer = System.nanoTime();
     String input = "abcabbb";
     int result = SubstringUtil.lengthOfLongestSubstring(input);
     System.out.println("Longest substring length: "+result);
     //end timer
     long endTimer = System.nanoTime();

     //program time
     long programTime = (endTimer - startTimer)/1_000_000;

     System.out.println("Program Time: "+programTime+ " ms");
 }
}
