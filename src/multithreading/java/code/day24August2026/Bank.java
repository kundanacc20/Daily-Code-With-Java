package multithreading.java.code.day24August2026;

public class Bank {
    void transfer(Account from, Account to, int amount){
        synchronized (from){
            synchronized (to){
                if(from.getBalance() >= amount){
                    from.withdraw(amount);
                    to.deposit(amount);
                }
            }
        }
    }
}
