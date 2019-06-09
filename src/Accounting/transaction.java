package Accounting;

public class transaction {

    int internalRef;
    String date;
    String externalRef;
    String notes;
    int sum;
    LedgerAccount ledgerAccount;
    Bank bank;


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



