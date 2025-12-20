class SavingsAccountChild extends SavingsAccount {
    private String parentName;
    
    public SavingsAccountChild(String name, double initialDeposit, double interestRate, String parentName) throws Exception {
        super(name, initialDeposit, interestRate);
        if (parentName.length() < 3) throw new Exception("Parent name must be at least 3 characters long!");
        this.parentName = parentName;
    }
    public void withdraw(double amount, String parentName) throws Exception {
        if (parentName.equals(this.parentName)) { super.withdraw(amount); }
        else { throw new Exception("Parent names do not match"); }
    }
}
