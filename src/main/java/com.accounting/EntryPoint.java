package com.accounting;

import com.accounting.utils.JsonUtil;
import com.accounting.utils.Test3;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;

import java.util.*;

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
//        responseDto.setCurrentBalance(bank.getBalance());
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

        String body = request.getBody();
        Test3 test3 = JsonUtil.convertJsonToJava(body, Test3.class);
        Test4 test4 = new Test4();
        String ii = listMaker(test3);
        test4.setInfoAsString(ii);

        AwsProxyResponse response = new AwsProxyResponse();
        String responseBody = JsonUtil.convertJavaToJson(test4);
        response.setStatusCode(303);
        response.setBody(responseBody);
        System.out.println("it worked");
        return response;


    }

    private int decuctBalance(Bank bank) {
        return bank.getBalance() - bank.getDeduct();
    }

    private String aToB(A a) {
        return a.getA() + " is cool";
    }

    private String listMaker(Test3 test3) {
        String i = test3.getName() + test3.getSurname() + test3.getId();

        return i;
    }

}
