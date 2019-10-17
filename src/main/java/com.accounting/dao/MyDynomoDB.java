package com.accounting.dao;

import com.amazonaws.regions.Regions;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;

public class MyDynomoDB {

    private AmazonDynamoDB amazonDynamoDB = AmazonDynamoDBClientBuilder.standard()
            .withRegion(Regions.EU_WEST_2)
            .build();

    private DynamoDBMapper dynamoDBMapper = new DynamoDBMapper(amazonDynamoDB);

    public void save(Account account) {
        dynamoDBMapper.save(account);
    }

    public Account load(Account account) {
        return dynamoDBMapper.load(account);
    }

    public Account load(String email) {
        Account account = new Account();
        account.setEmail(email);
        return dynamoDBMapper.load(account);
    }
}
