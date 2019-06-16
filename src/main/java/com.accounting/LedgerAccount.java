package com.accounting;

public class LedgerAccount implements ledgerInterface {

    private String name;
    private int balance;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void setName(String name) {
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
