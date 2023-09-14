import java.util.Scanner;

public class atm {
    private static double balance = 1000.0; // Initial balance for demonstration purposes

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("Welcome to the ATM!");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Please select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    depositMoney(scanner);
                    break;
                case 3:
                    withdrawMoney(scanner);
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }

        System.out.println("Thank you for using the ATM. Goodbye!");
        scanner.close();
    }

    private static void checkBalance() {
        System.out.println("Your balance is: $" + balance);
    }

    private static void depositMoney(Scanner scanner) {
        System.out.print("Enter the amount to deposit: $");
        double amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid amount. Deposit failed.");
        }
    }

    private static void withdrawMoney(Scanner scanner) {
        System.out.print("Enter the amount to withdraw: $");
        double amount = scanner.nextDouble();
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Invalid amount or insufficient funds. Withdrawal failed.");
        }
    }
}