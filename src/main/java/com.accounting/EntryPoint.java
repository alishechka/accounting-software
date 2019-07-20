package com.accounting;

import com.accounting.dao.Account;
import com.accounting.dao.MyDynomoDB;
import com.accounting.utils.JsonUtil;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EntryPoint {


    public AwsProxyResponse handler(AwsProxyRequest request) {

        Account account = JsonUtil.convertJsonToJava(request.getBody(), Account.class);

        MyDynomoDB myDynomoDB = new MyDynomoDB();
        myDynomoDB.save(account);

        Map<String, String> headers=new HashMap<>();
        headers.put("Access-Control-Allow-Origin", "*");
        headers.put("Access-Control-Allow-Credentials", "true");
        headers.put("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD");
        headers.put("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With");

        AwsProxyResponse response=new AwsProxyResponse();
        response.setStatusCode(200);
        response.setHeaders(headers);

        return response;

    }


}
