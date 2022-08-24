public class Account {
    private double balance;
    public Account(){}
    public Account(double startBalance){
        balance = startBalance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}
