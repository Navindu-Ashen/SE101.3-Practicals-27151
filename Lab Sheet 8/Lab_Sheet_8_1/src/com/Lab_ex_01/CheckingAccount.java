package com.Lab_ex_01;

public class CheckingAccount extends BankAccount{
    private static final double interestForChecking = 0.02;
    @Override
    double calculateInterest(){
        return getBalance()*interestForChecking;
    }
}
