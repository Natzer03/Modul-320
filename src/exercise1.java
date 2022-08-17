import java.util.Scanner;
public class exercise1 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        double accountBalance = 0;
        int amount;
        System.out.println("Welcome to the account application");
        boolean decision = false;
        while (!decision){
            System.out.println("Please enter the amount, 0 (zero) to terminate");
            amount = myScanner.nextInt();
            if (amount == 0){
                decision = true;
            }
            if (decision){
                break;
            }
            System.out.println("To deposit, press +, to withdraw, press -");
            String methode = myScanner.next();
            if (methode.equals("+")){
                accountBalance+=amount;
            }
            else {
                accountBalance-=amount;
            }
        }
        System.out.println("Final balance: "+accountBalance);
    }
}
