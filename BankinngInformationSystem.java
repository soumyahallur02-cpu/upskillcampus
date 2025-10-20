import java.util.Scanner;

public class BankingInformationSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        int choice;

        System.out.println("===================================");
        System.out.println("     Welcome to Banking System     ");
        System.out.println("===================================");

        do {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("💰 Current Balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ₹");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("✅ Deposited Successfully!");
                    } else {
                        System.out.println("❌ Invalid amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ₹");
                    double withdraw = sc.nextDouble();
                    if (withdraw > 0 && withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("✅ Withdrawal Successful!");
                    } else {
                        System.out.println("❌ Insufficient balance or invalid amount.");
                    }
                    break;

                case 4:
                    System.out.println("👋 Thank you for using our Banking System!");
                    break;

                default:
                    System.out.println("⚠️ Invalid choice! Please try again.");
            }
        } while (choice != 4);

        sc.close();
    }
}
