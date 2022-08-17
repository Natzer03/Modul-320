import java.util.Scanner;

public class auftrag01 {
    static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {
        double counter = 0;
        int amount;
        System.out.println("Welcome to the account application");
        boolean decision = false;
        while (!decision){
            System.out.println("Please enter the amount, 0 (zero) to terminate");
            amount = myScanner.nextInt();
            if (amount == 0){
                decision = true;
            }
            if (decision == true){
                break;
            }
            System.out.println("To deposit, press +, to withdraw, press -");
            String methode = myScanner.next();
            if (methode.equals("+")){
                counter+=amount;
            }
            else {
                counter-=amount;
            }

        }
        System.out.println("Final balance: "+counter);
    }
}
