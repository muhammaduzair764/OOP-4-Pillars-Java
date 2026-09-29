// Program 1.2: Bank Account Balance Protection
public class Encapsulation2 {
    static class BankAccount {
        private double balance;

        public BankAccount(double initialBalance) {
            balance = (initialBalance >= 0) ? initialBalance : 0;
        }

        public void deposit(double amount) {
            if (amount > 0) balance += amount;
        }

        public void withdraw(double amount) {
            if (amount > 0 && amount <= balance) balance -= amount;
        }

        public double getBalance() { return balance; }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        acc.withdraw(200);
        System.out.println("Current Balance: $" + acc.getBalance());
    }
}
