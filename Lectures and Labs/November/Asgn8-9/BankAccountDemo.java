class BankAccount {
    private
      double balance;
    public
      void deposit(double d)    { balance = d; }
      double checkBalance()     { return balance; }
  }
  class CheckingAccount extends BankAccount {
    private
      double monthlyFee = 5;
      double mainBalance = checkBalance();
  
    public
      double getMonthlyFee()            {  return monthlyFee; }
      void applyMonthlyFee(double fee)  { fee = monthlyFee;   mainBalance = mainBalance - fee; }
  }
  class SavingAccount extends BankAccount {
    private
      double interestRate = 3; //percent
      double mainBalance = checkBalance();
    
    public
      double getInterestRate()              { return interestRate; }
      void applyInterestRate(double rate)   { rate = 3 * mainBalance / 100;   mainBalance = mainBalance + rate; }
  }
  
  class BankAccountDemo {
    public static void main (String args []) {
      //create the object instance of the bank account
      BankAccount account = new BankAccount();
      SavingAccount svAccount = new SavingAccount();
      CheckingAccount chAccount = new CheckingAccount();
      //check the balance at the begining
      System.out.println("The Balance Is: " + account.checkBalance());
      //give 1000 balance through object constructor
      account.deposit(1000);
      //show interest rate 
      System.out.println("Interest Rate Is: " + svAccount.getInterestRate() + "%");
      //apply interest rate
      double rate = svAccount.getInterestRate();
      svAccount.applyInterestRate(rate);
      //show the monthly fee 
      System.out.println("Montly Fee Is: " + chAccount.getMonthlyFee() + " $");
      //apply monthly fee
      double fee = chAccount.getMonthlyFee();
      chAccount.applyMonthlyFee(fee);
      //calculate the balance again and show it
      System.out.println(account.checkBalance());
    }
  }