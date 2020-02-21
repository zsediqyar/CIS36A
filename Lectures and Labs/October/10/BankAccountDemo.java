class BankAccountDemo {
    public static void main (String args []) {
    BankAccount myAccount = new BankAccount(1000);
    
    myAccount.deposit(500);
    System.out.println("I have " + myAccount.getBalance() + "$ in my account");

    myAccount.withdraw(500);
    System.out.println("I have " + myAccount.getBalance() + "$ in my account");
    
    myAccount.withdraw(-200);

    }
}