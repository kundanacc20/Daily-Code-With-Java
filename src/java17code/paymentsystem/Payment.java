package java17code.paymentsystem;

sealed public class Payment permits CreditCard, UPI {
    public void payingPayment(){
        System.out.println("in the payment class");
    }
}
