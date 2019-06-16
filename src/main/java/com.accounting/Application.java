package com.accounting;

import com.accounting.utils.JsonUtil;
import com.fasterxml.jackson.core.JsonProcessingException;

import java.util.*;

public class Application {


    public static void main(String[] args) throws JsonProcessingException {


        Bank bank = new Bank();
        bank.setName("HSBC");
        bank.setBalance(100);
        String bb=JsonUtil.convertJavaToJson(bank);
        System.out.println(bb);


//        LedgerAccount supplier = new LedgerAccount();
//        LedgerAccount taxes = new LedgerAccount();
//        LedgerAccount rent = new LedgerAccount();
//        LedgerAccount travel = new LedgerAccount();
//        LedgerAccount rates = new LedgerAccount();
//        supplier.setName("Salaries");
//        taxes.setName("taxes");
//        rent.setName("rent");
//        travel.setName("travel");
//        rates.setName("rates");
//        System.out.println(bank.getBalanceCalc());
//
//
        List<LedgerAccount> ledgerList = new ArrayList<>();
//        ledgerList.add(supplier);
//        ledgerList.add(taxes);
//        ledgerList.add(rent);
//        ledgerList.add(travel);
//        ledgerList.add(rates);
//
//
        Map<Integer, transaction> transRecorder = new HashMap<>();
        int internalRef = 1;
//        transRecorder.put(internalRef++, billOfTransaction("d", "ff", "fddf", 50, supplier, bank));
//        transRecorder.put(internalRef++, billOfTransaction("d", "ff", "fddf", -700, supplier, bank));
//        transRecorder.put(internalRef++, billOfTransaction("05/05/19", "fgdd", "nothing", -10, rent, bank));
//        transRecorder.put(internalRef++, billOfTransaction("05/02/19", "fjjj", "nothing", 15, travel, bank));
//        transRecorder.put(internalRef++, billOfTransaction("03/08/19", "5555", "3xPOTATO", 99, taxes, bank));
//        transRecorder.put(internalRef++, billOfTransaction("18/05/19", "1654gg", "sand", 190, rent, bank));
//        transRecorder.put(internalRef++, billOfTransaction("19/05/19", "dfs99", "gardeiing", 5000, rates, bank));
//        transRecorder.put(internalRef++, billOfTransaction("01/02/19", "7894", "nothing", -560, rates, bank));
//
//        for (LedgerAccount i : ledgerList) {
//            System.out.println(i.name + " current balance is £" + i.getBalanceCalc());
//        }
//        System.out.println(transRecorder.keySet());


////////////////////////////////////////////////////////////////////////////////////
//        Scanner sc = new Scanner(System.in);
//        Map<String, LedgerAccount> ledgerMap = new HashMap<>();
//
//        boolean quit = false;
//
//
//        do {
//            System.out.println("chose option");
//            System.out.println("0 - quit ");
//            System.out.println("1 - new payee");
//            System.out.println("2 - make a payment");
//            System.out.println("3 - see reports");
//            System.out.println("4 - search");
//            int x = sc.nextInt();
//            LedgerAccount ledgerAccount = new LedgerAccount();
//
//            switch (x) {
//                case 1:
//                    System.out.println("name of payee");
//                    String name = sc.next();
//                    ledgerAccount.setName(name);
//                    ledgerMap.put(name.toUpperCase(), ledgerAccount);
//                    for (Map.Entry<String, LedgerAccount> pair : ledgerMap.entrySet()) {
//                        System.out.println(pair.getKey() + " " + pair.getValue());
//                    }
//                    break;
//                case 2:
//                    System.out.println("Enter date ");
//                    String date = sc.next();
//                    System.out.println("Enter externalRef ");
//                    String externalRef = sc.next();
//                    System.out.println("Enter notes ");
//                    String notes = sc.next();
//                    System.out.println("enter sum");
//                    int sum = sc.nextInt();
//                    System.out.println("which company?");
//                    String tempLedger = sc.next().toUpperCase();
//                    if (ledgerMap.containsKey(tempLedger)) {
//                        ledgerAccount = ledgerMap.load(tempLedger);
//                    }
//                    transRecorder.put(internalRef++, billOfTransaction(date, externalRef, notes, sum, ledgerAccount, bank));
//                    for (Map.Entry<Integer, transaction> pair : transRecorder.entrySet()) {
//                        System.out.println(pair.getKey() + " " + pair.getValue());
//                    }
//                    break;
//                case 3:
//                    System.out.println("option2");
//                    for (Map.Entry<String, LedgerAccount> pair : ledgerMap.entrySet()) {
//                        System.out.println(pair.getKey() + pair.getValue());
//                    }
//                    for (Map.Entry<Integer, transaction> pair : transRecorder.entrySet()) {
//                        System.out.println(pair.getKey() + " " + pair.getValue());
//                    }
//                    break;
//                case 4:
//                    System.out.println("Please type reference");
//                    String search = sc.next();
//
//                    for (Map.Entry<Integer, transaction> i : transRecorder.entrySet()) {
//                        if (i.getValue().externalRef.equals(search)) {
//                            System.out.println("matched here");
//                            System.out.println(i.getKey() + " " + i.getValue());
//                        } else {
//                            System.out.println("nothing");
//                        }
//                    }
//                    System.out.println("lol");
//
//
//                    break;
//                case 0:
//                    quit = true;
//                    break;
//            }
//        } while (!quit);
//
//
//    }
//
//    public static transaction billOfTransaction(String date, String externalRef, String notes, int sum, LedgerAccount ledgerAccount, Bank bank) {
//        transaction trans = new transaction(date, externalRef, notes, sum, ledgerAccount, bank);
//
//        return trans;
    }


}
