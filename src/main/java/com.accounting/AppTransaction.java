package com.accounting;

public class AppTransaction {

    private int sum;
    private String ref;
    private LedgerAccount ledgerAccount;
    private Bank bank;

    public AppTransaction() {
    }

    public AppTransaction(int sum, String ref, LedgerAccount ledgerAccount, Bank bank) {
        this.sum = sum;
        this.ref = ref;
        this.ledgerAccount = ledgerAccount;
        this.bank = bank;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public LedgerAccount getLedgerAccount() {
        return ledgerAccount;
    }

    public void setLedgerAccount(LedgerAccount ledgerAccount) {
        this.ledgerAccount = ledgerAccount;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }
}
