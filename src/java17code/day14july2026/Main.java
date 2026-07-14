package java17code.day14july2026;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Human manish = new Manish();
        Human vartika = new Vartika();
        Human anjali = new Anjali();
        Vartika varikaChild = new VartikaChild();

        manish.printName();
        vartika.printName();
        anjali.printName();
        varikaChild.printName();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer-startTimer)/1_000_000;
        System.out.println("Program time: "+programTime+" ms");
    }
}
