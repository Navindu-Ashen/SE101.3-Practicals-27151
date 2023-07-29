package com.Lab_ex_01;

public abstract class BankAccount {
    private int accountNumber;
    private float balance;

    abstract double calculateInterest();

    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getBalance(){
        return balance;
    }
    public void setBalance(float balance){
        this.balance = balance;
    }
}
