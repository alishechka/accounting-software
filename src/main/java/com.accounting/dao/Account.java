package com.accounting.dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "ali-table")
public class Account {

    @DynamoDBHashKey
    private String id;
    @DynamoDBAttribute
    private int sum;
    @DynamoDBAttribute
    private int newAttribute;
    @DynamoDBAttribute
    private String city;
    @DynamoDBAttribute
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int getNewAttribute() {
        return newAttribute;
    }

    public void setNewAttribute(int newAttribute) {
        this.newAttribute = newAttribute;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
