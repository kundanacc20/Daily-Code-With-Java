package bank;

import java.util.Scanner;

public class BankApp {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BankService bank = new BankService();

        while (true){
            System.out.println("=====Mini Bank======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Check Balance");
            System.out.println("5. Transaction History");
            System.out.println("6. Exit");

            int choice = sc.nextInt();

            try{
                switch (choice){
                    case 1 -> {
                        System.out.println("Enter Account No.");
                        int accNo = sc.nextInt();
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        System.out.print("Initial Balance: ");
                        double bal = sc.nextDouble();
                        bank.createAccount(accNo, name, bal);
                    }
                    case 2 ->{
                        System.out.print("Account No: ");
                        int accNo = sc.nextInt();
                        System.out.println("Amount: ");
                        double amt = sc.nextDouble();
                        bank.deposit(accNo,amt);
                    }
                    case 3 ->{
                        System.out.print("Account no: ");
                        int accNo = sc.nextInt();
                        System.out.print("Amount: ");
                        double amt = sc.nextDouble();
                        bank.withdraw(accNo,amt);
                    }
                    case 4 ->{
                        System.out.print("Account No: ");
                        int accNo = sc.nextInt();
                        bank.checkBalance(accNo);
                    }
                    case 6 ->{
                        System.out.println("Thank you!");
                        return;
                    }
                    default -> System.out.println("Invalid choice!");
                }
            }catch (Exception e) {
                System.out.println("Error: "+e.getMessage());
            }
        }
    }
}
