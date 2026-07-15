package java17code.day15july2026;

import sun.misc.Unsafe;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        try {
            Field unsafeField = Unsafe.class.getDeclaredField("theUnsafe");
            unsafeField.setAccessible(true);

            Unsafe unsafe = (Unsafe) unsafeField.get(null);

            System.out.println("Unsafe instance obtained: "+unsafe);
            System.out.println("This should not print in java 17 without -- add-opens");

        } catch (NoSuchFieldException e){
            System.out.println("Field not found: "+e.getMessage());
        } catch (IllegalAccessException e){
            System.out.println("Illegal access: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Error : "+e.getClass().getName());
            System.out.println("Messgae: "+e.getMessage());
            e.printStackTrace();
        }
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer -startTimer)/1_000_000;

        System.out.println("Program time: "+programTime+" ms");
    }
}
