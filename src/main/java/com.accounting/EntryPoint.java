package com.accounting;

import com.accounting.dao.Account;
import com.accounting.dao.MyDynomoDB;
import com.accounting.utils.Test3;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;

public class EntryPoint {


    public AwsProxyResponse handler(AwsProxyRequest request) {
//
//        String body = request.getBody();
//        Bank bank = JsonUtil.convertJsonToJava(body, Bank.class);
//        System.out.println("bank - " + bank);
//        System.out.println("body - " + body);
//
//        ResponseDto responseDto = new ResponseDto();
//        responseDto.setName(bank.getName());
//        Calendar date = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
//        String time = date.getTime().toString();
//        int ii = decuctBalance(bank);
//        responseDto.setCurrentBalance(bank.getBalanceCalc());
//        responseDto.setBalanceNextMonth(ii);
//        responseDto.setDate(time);

//        AwsProxyResponse response = new AwsProxyResponse();
//        response.setStatusCode(201);
//        String responseBody = JsonUtil.convertJavaToJson(responseDto);
//        response.setBody(responseBody);


//

//        String body1 = request.getBody();
//        A a = JsonUtil.convertJsonToJava(body1, A.class);
//        B b = new B();
//        String i = a.getA();
//        b.setB(i);
//        AwsProxyResponse response3 = new AwsProxyResponse();
//        String responseBody3 = JsonUtil.convertJavaToJson(b);
//        response3.setStatusCode(201);
//        response3.setBody(responseBody3);
//        System.out.println("test text");
        Account account = new Account();
        account.setId("XYZ");
        account.setSum(10000);
        account.setNewAttribute(123);
        account.setCity("London");
        account.setName("no name");
        MyDynomoDB myDynomoDB = new MyDynomoDB();
        myDynomoDB.save(account);

//        Account account1 = myDynomoDB.load(account);
//
//        System.out.println("account1: " + account1);

//        String body = request.getBody();
//        AppTransaction appTransaction = JsonUtil.convertJsonToJava(body, AppTransaction.class);
//        Bank bank = appTransaction.getBank();
        AwsProxyResponse response = new AwsProxyResponse();
//        String responseBody = JsonUtil.convertJavaToJson(bank);
        response.setStatusCode(202);
//        response.setBody(responseBody);
        return response;

    }


    private String aToB(A a) {
        return a.getA() + " is cool";
    }

    private String listMaker(Test3 test3) {
        String i = test3.getName() + test3.getSurname() + test3.getId();

        return i;
    }


}
