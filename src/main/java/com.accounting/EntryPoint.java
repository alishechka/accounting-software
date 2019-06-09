package com.accounting;

import com.accounting.utils.JsonUtil;
import com.amazonaws.serverless.proxy.model.AwsProxyRequest;
import com.amazonaws.serverless.proxy.model.AwsProxyResponse;

public class EntryPoint {

    public AwsProxyResponse handler(AwsProxyRequest request) {

        String body = request.getBody();
        System.out.println("body - " + body);
        return null;
    }
}
