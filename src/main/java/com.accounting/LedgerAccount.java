package com.accounting;

public class LedgerAccount implements ledgerInterface {

    String name;
    int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void accountName(String name) {
        this.name = name;

    }

    @Override
    public void transaction(Integer amount) {
        this.balance = balance + amount;
    }

    @Override
    public String toString() {
        return "Accounting.LedgerAccount{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
