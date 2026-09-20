package data.structure.day21july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        ValidParentheses vp = new ValidParentheses();

        String s = "((([])))";
        System.out.println(vp.isValid(s));

        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
