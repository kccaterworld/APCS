import java.util.*;
import java.io.*;

abstract class BankAccount implements BankAccountInterface {
    private String name;
    private double balance;
    
    public BankAccount(String name, double initialDeposit) throws Exception {
        if (name.length() < 3) throw new Exception("Name must be at least three characters.");
        this.name = name;
        if (initialDeposit < 0) throw new Exception("Deposit value must be a natural number.");
        balance = initialDeposit;
    }
    
    public double getBalance() { return balance; }
    public String getName() { return name; }
    
    public void deposit(double amount) throws Exception {
        if (amount < 0) throw new Exception("Deposit value must be a natural number.");
        balance += amount;
    }
    public void withdraw(double amount) throws Exception {
        if (amount < 0) throw new Exception("Deposit value must be a natural number.");
        balance -= amount;
    }
    public void transfer(double amount, BankAccount destination) throws Exception{
        if (amount < 0) throw new Exception("Deposit value must be a natural number.");
        balance -= amount;
        destination.deposit(amount);
    }
}
