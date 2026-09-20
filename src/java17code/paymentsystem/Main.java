package java17code.paymentsystem;

public class Main {
    public static void main(String[] args){
        //start timer
        long startTimer = System.nanoTime();
        Payment creditCard = new CreditCard();
        Payment upi = new UPI();

        creditCard.payingPayment();
        upi.payingPayment();
        //end timer
        long endTimer = System.nanoTime();

        //program time
        long programTime = (endTimer - startTimer)/1_000_000;
        System.out.println("program time : "+programTime+" ms");
    }
}
