package com.Lab_ex_01;

public class SavingsAccount extends BankAccount{
    private static final double interestForSaving = 0.12;
    @Override
    double calculateInterest(){
        return getBalance()*interestForSaving;
    }
}
