package exceptional.handling.day03october2026;

public class BankAccount {
    private int balance = 5000;

    public void withdraw(int amount) throws InsufficientBalanceException{
        if(amount > balance){
            throw new InsufficientBalanceException(
                    "insufficient balance"
            );
        }
        balance = balance -amount;
        System.out.println("withdrawal is successful: ");
        System.out.println("your remaining balance is :"+balance);
    }
}
