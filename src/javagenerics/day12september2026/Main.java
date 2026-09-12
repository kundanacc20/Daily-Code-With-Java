package javagenerics.day12september2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
//        Pair<String,Integer> stringIntegerPair = new Pair<>("kundan",27);
//
//        System.out.println(stringIntegerPair);
//        // string , string
//        Pair<String,String> stringStringPair = new Pair<>("kundan","kumar");
//        System.out.println(stringStringPair);
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;

        System.out.println("program time: "+programTime+" ms");
    }
}
