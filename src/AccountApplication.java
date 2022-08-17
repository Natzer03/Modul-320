import java.util.Scanner;

public class AccountApplication {
    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        Account lohnkonto = new Account();
        System.out.println("Welcome to the account application");
        int amount;
        do {
            System.out.println("Please enter the amount, 0 (zero) to terminate");
            amount = myScanner.nextInt();
            if (amount != 0) {
                System.out.println("To deposit, press +, to withdraw, press -");
                String methode = myScanner.next();
                switch (methode) {
                    case "+":
                        lohnkonto.deposit(amount);
                        break;
                    case "-":
                        lohnkonto.withdraw(amount);
                        break;
                    case "=":
                        System.out.println(lohnkonto.getBalance());
                        break;
                    default:
                        System.out.println("This methode is not available");
                        break;
                }
            }
        } while (amount != 0);
        System.out.println("Final balance: " + lohnkonto.getBalance());
    }
}
