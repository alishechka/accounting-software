package com.accounting;

import com.accounting.dao.Account;
import com.accounting.dao.MyDynomoDB;
import com.accounting.utils.JsonUtil;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;

import java.util.HashMap;
import java.util.Map;

public class EntryPoint {


    public AwsProxyResponse handler(AwsProxyRequest request) {


        MyDynomoDB myDynomoDB = new MyDynomoDB();
        Account account = JsonUtil.convertJsonToJava(request.getBody(), Account.class);
        Account account1 = myDynomoDB.load(account.getEmail());
        AwsProxyResponse response = new AwsProxyResponse();

        if (account1 != null && account.getEmail().equals(account1.getEmail())) {
            response.setStatusCode(400);
        } else {
            myDynomoDB.save(account);
            response.setStatusCode(200);

        }

        Map<String, String> headers = headersMap();
        response.setHeaders(headers);

        return response;

    }

    public AwsProxyResponse getUser(AwsProxyRequest request) {

        Map<String, String> queryParam = request.getQueryStringParameters();
        String email = queryParam.get("email");

        MyDynomoDB myDynomoDB = new MyDynomoDB();
        Account account = myDynomoDB.load(email);

        Map<String, String> headers = headersMap();


        String body = JsonUtil.convertJavaToJson(account);
        AwsProxyResponse response = new AwsProxyResponse();
        response.setStatusCode(202);
        response.setHeaders(headers);
        response.setBody(body);

        return response;
    }

    private Map<String, String> headersMap() {
        Map<String, String> headers = new HashMap<>();
        headers.put("Access-Control-Allow-Origin", "*");
        headers.put("Access-Control-Allow-Credentials", "true");
        headers.put("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT, OPTIONS, HEAD");
        headers.put("Access-Control-Allow-Headers", "Content-Type, Accept, X-Requested-With");
        return headers;
    }


}
