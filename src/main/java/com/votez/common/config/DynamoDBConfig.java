package com.votez.common.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClient;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    @Bean
    public DynamoDB getDynamoDB() {

        AmazonDynamoDBClient dynamoDBClient = new AmazonDynamoDBClient(new DefaultAWSCredentialsProviderChain());
//        AmazonDynamoDB client = new DefaultAWSCredentialsProviderChain();
        return new DynamoDB(dynamoDBClient);
    }
}
