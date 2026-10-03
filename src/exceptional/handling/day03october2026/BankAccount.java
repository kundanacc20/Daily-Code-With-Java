package exceptional.handling.day03october2026;

public class BankAccount {
    private int accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(int accountNumber, String holderName, double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(double amount) throws InvalidAmountException {
        if(amount <= 0){
            throw new InvalidAmountException(
                    "Deposit Amount must be positive"
            );
        }
        balance = balance + amount;
        System.out.println("Deposit is successful: ");
    }
    public void withdraw(int amount) throws InsufficientBalanceException
    , InvalidAmountException {
        if(amount <= 0){
            throw new InvalidAmountException(
                    "withdrawal must be positive"
            );
        }
        if(amount > balance){
            throw new InsufficientBalanceException(
                    "insufficient balance"
            );
        }
        balance = balance -amount;
        System.out.println("withdrawal is successful: ");
        System.out.println("your remaining balance is :"+balance);
    }

    public void displayDetails(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Holder Name : "+holderName);
        System.out.println("Balance: "+balance);
    }
}
