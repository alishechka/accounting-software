package com.accounting;

public class transaction {

    private int internalRef;
    private String date;
    private String externalRef;
    private String notes;
    private int sum;
    private LedgerAccount ledgerAccount;
    private Bank bank;


    public transaction(String date, String externalRef, String notes, int sum, LedgerAccount ledgerAccount, Bank bank) {
        this.date = date;
        this.externalRef = externalRef;
        this.notes = notes;
        this.sum = sum;
        this.ledgerAccount = ledgerAccount;
        this.bank = bank;

        bank.transaction(sum);
        ledgerAccount.transaction(sum);

    }

    public int getInternalRef() {
        return internalRef;
    }

    public void setInternalRef(int internalRef) {
        this.internalRef = internalRef;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getExternalRef() {
        return externalRef;
    }

    public void setExternalRef(String externalRef) {
        this.externalRef = externalRef;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
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

    @Override
    public String toString() {
        return "Accounting.transaction{" +
                "internalRef=" + internalRef +
                ", date='" + date + '\'' +
                ", externalRef='" + externalRef + '\'' +
                ", notes='" + notes + '\'' +
                ", sum=" + sum +
                ", ledgerAccount=" + ledgerAccount +
                ", bank=" + bank +
                '}';
    }
}



