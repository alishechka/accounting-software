package com.accounting;

public class ResponseDto {
    private String name;
    private int currentBalance;
    private int balanceNextMonth;
    private String date;

    public int getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(int currentBalance) {
        this.currentBalance = currentBalance;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalanceNextMonth() {
        return balanceNextMonth;
    }

    public void setBalanceNextMonth(int balanceNextMonth) {
        this.balanceNextMonth = balanceNextMonth;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
