package Accounting;

public class Bank implements ledgerInterface {

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
    public  void  transaction(Integer amount) {
        this.balance =balance+amount*-1;
    }



    @Override
    public String toString() {
        return "Accounting.Bank{" +
                "name='" + name + '\'' +
                '}';
    }
}
