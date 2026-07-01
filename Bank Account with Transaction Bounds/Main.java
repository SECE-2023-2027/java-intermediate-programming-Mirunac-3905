import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("===== Bank Account Details =====");

        System.out.print("Enter Account Number: ");
        String accountNumber = sc.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        BankAccount account = new BankAccount(accountNumber, accountHolderName, balance);

        System.out.print("Enter Deposit Amount: ");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);

        System.out.print("Enter Withdraw Amount: ");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);

        System.out.println("\n===== Account Details =====");
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Account Holder : " + account.getAccountHolderName());
        System.out.println("Balance : " + account.getBalance());

        sc.close();
    }
}
