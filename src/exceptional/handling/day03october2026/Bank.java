package exceptional.handling.day03october2026;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> accounts = new ArrayList<>();

    public void addAccount(BankAccount account){
        accounts.add(account);
    }

    public BankAccount findAccount(int accountNumber)
        throws AccountNotFoundException {
        return accounts.stream()
                .filter(a -> a.getAccountNumber()==accountNumber)
                .findFirst()
                .orElseThrow(()->
                        new AccountNotFoundException(
                                "Account not found: "+accountNumber
                        ));
    }

    public void transfer(int from, int to, double amount)
        throws AccountNotFoundException, InvalidAmountException
        ,InsufficientBalanceException,DailyLimitExceededException {
        if(from == to){
            throw new IllegalArgumentException(
                    "cannot transfer to the same account"
            );
        }
        BankAccount sender = findAccount(from);
        BankAccount receiver = findAccount(to);

        sender.withdraw(amount);
        receiver.deposit(amount);

        System.out.println("Transfer successful: ");
    }


}
