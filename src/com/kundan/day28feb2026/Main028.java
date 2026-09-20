package com.kundan.day28feb2026;

import java.util.Random;

public class Main028 {
    public static void main(String[] args){
        //Start_timer
        long startTimer= System.nanoTime();
//-----------------------Program start timer-------------------------------------
//        String word = "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis" +
//                "pneumonoultramicroscopicsilicovolcanoconiosis";
//        String reversed_word= new StringBuilder(word)
//                .reverse()
//                .toString();
//        System.out.println(reversed_word);

//        char[] chars =new char[100_000_000];
//        java.util.Arrays.fill(chars,'A');
//        String word = new String(chars);
//
//        String reversedWord = new StringBuilder(word)
//                .reverse()
//                        .toString();
//
//        System.out.println("word length: "+word.length());
//        System.out.println(reversedWord);
//        //Total time: 262 ms for one million character
        //Total time: 1223 ms for ten million character

//        char[] chars = new char[100_000_000];
//        java.util.Arrays.fill(chars,'k');
//        String word = new String(chars);
//        StringBuilder reversedWord = new StringBuilder(word);
//
//        StringBuilder reversedFinalWord = new StringBuilder("");
//        for (int i = reversedWord.length() - 1; i >= 0; i--){
//            reversedFinalWord.append(reversedWord.charAt(i));
//        }
//        System.out.println(reversedFinalWord);
//        //Total time: 260 ms for one million character
//        //Total time: 2107 ms for 10 million character

        //10 million different character in word
        int length =10_000_000;
        Random random =new Random();
        StringBuilder word = new StringBuilder(length);

        //generate random characters
        for(int i=0;i < length; i++){
            int choice = random.nextInt();
            char c;
            if(choice==0){
                c=(char)('A'+random.nextInt(26));
            } else if (choice ==1) {
                c=(char) ('a'+random.nextInt(26));
            }else {
                c=(char) ('0'+random.nextInt(10));
            }
            word.append(c);
        }

        String input = word.toString();
        String reversed = new StringBuilder(input)
                .reverse()
                .toString();
        System.out.println(reversed);
        //Total time: 531 ms

        //----------------------------Program end timer---------------------------
        //end_timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;

        System.out.println("Total time: "+programTime+" ms");
    }
}
