class SavingsAccount extends BankAccount {
    private String name;
    private double balance;
    private double interestRate;
    private int withdrawCount;
    
    public SavingsAccount(String name, double initialBalance, double interestRate) throws Exception {
        super(name, initialBalance);
        this.interestRate = interestRate;
        withdrawCount = 0;
    }
    
    public void addInterest() {
        balance += (interestRate * balance);
    }
    public int getWithdrawCount() { return withdrawCount; }
    
    @Override
    public void withdraw(double amount) throws Exception {
        if (withdrawCount > 6) throw new Exception("You've withdrawn too many times!'");
        super.withdraw(amount);
        withdrawCount++;
    }
}
