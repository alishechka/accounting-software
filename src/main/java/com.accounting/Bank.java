package com.accounting;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

public class Bank implements ledgerInterface {

    private String name;
    private int balance;



    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    //    @Override
    public void setName(String name) {
        this.name = name;

    }

    //    @Override
    public void transaction(Integer amount) {
        this.balance = balance + amount * -1;
    }


    @Override
    public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
