import java.util.Scanner;

public class AccountApplication {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Account wage_account = new Account();
        System.out.println("Welcome to the account application");
        int amount;
        do {
            System.out.println("Please enter the amount, 0 (zero) to terminate");
            amount = myScanner.nextInt();
            if (amount != 0) {
                System.out.println("To deposit, press +, to withdraw, press -");
                String methode = myScanner.next();
                switch (methode) {
                    case "+" -> wage_account.deposit(amount);
                    case "-" -> wage_account.withdraw(amount);
                    case "=" -> System.out.println(wage_account.getBalance());
                    default -> System.out.println("This methode is not available");
                }
            }
        } while (amount != 0);
        System.out.println("Final balance: " + wage_account.getBalance());
    }
}
