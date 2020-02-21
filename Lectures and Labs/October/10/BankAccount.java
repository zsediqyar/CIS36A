class BankAccount {
    //INSTANCE VARIABLES
    private double balance;

    BankAccount (double b) {
        balance = b;
    }

    //setter methods
    void deposit(double amount) {
        balance = balance + amount;
    }

    double withdraw(double amount) {
        if(amount < 0) {
            System.out.println("Transaction Invalid: Insufficient Balance");
            return 0;
        }
        else if(amount <= balance){
            balance = balance - amount;
            return amount;
        }
        else {
            System.out.println("Transaction Invalid: Insufficient Balance");
            return 0;
        }
    }
    //getter methods
    double getBalance() {
        return this.balance;
    }
}