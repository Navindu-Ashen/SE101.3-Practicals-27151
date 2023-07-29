package com.Lab_ex_01;

public class Bank {
    public static void main(String[] args){
        var savingAccount1 = new SavingsAccount();
        savingAccount1.setAccountNumber(123456);
        savingAccount1.setBalance(20_000_000);
        System.out.println("Account no: "+savingAccount1.getAccountNumber());
        System.out.println("Interest for saving account: "+savingAccount1.calculateInterest());

        var checkingAccount1 = new CheckingAccount();
        checkingAccount1.setAccountNumber(456798);
        checkingAccount1.setBalance(1_000_000);
        System.out.println("Account no: "+checkingAccount1.getAccountNumber());
        System.out.println("Interest for checking account: "+checkingAccount1.calculateInterest());
    }

}
