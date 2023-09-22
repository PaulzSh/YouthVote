package com.votez.common.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
import com.amazonaws.services.dynamodbv2.AmazonDynamoDBClientBuilder;
import com.amazonaws.services.dynamodbv2.document.DynamoDB;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DynamoDBConfig {

    String accessKey = "AKIAWQZPCAL44WWQR763";
    String secretKey = "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";


    @Bean
    public DynamoDB getDynamoDB() {
        BasicAWSCredentials awsCredentials = new BasicAWSCredentials(accessKey, secretKey);
        // 配置DynamoDB客户端
        AmazonDynamoDB client = AmazonDynamoDBClientBuilder.standard()
                .withCredentials(new AWSStaticCredentialsProvider(awsCredentials))
                .withRegion("us-east-1") // 设置所需的AWS区域
                .build();
        return new DynamoDB(client);
    }
}
