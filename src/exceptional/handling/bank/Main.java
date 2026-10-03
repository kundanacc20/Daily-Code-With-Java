package exceptional.handling.bank;

public class Main {
    public static void main(String[] args){
        BankService bank = new BankService();

        BankAccount a1 = new BankAccount(101,"kundan",25000);
        BankAccount a2 = new BankAccount(102,"harshit",15000);

        bank.addAccount(a1);
        bank.addAccount(a2);

        BankExceptionHandler handler =
                new BankExceptionHandler();

        try {
            bank.transfer(101,102,5000);
            System.out.println("Transfer completed.");

            bank.transfer(101,102,9000);
        } catch (BankException e){
            handler.handle(e);
        } finally {
            System.out.println("processing completed.");
        }

        System.out.println("\n Final Balances: ");

        try {
            bank.displayBalance(101);
            bank.displayBalance(102);
        } catch (AccountNotFoundException e){
            handler.handle(e);
        }
        System.out.println("\n Transaction History: ");
        a1.displayTransactions();
        a2.displayTransactions();
    }
}
