package com.votez.service.impl;

import com.amazonaws.services.dynamodbv2.document.*;
import com.amazonaws.services.dynamodbv2.document.spec.GetItemSpec;
import com.amazonaws.services.dynamodbv2.document.spec.QuerySpec;
import com.amazonaws.services.dynamodbv2.document.utils.ValueMap;
import com.votez.common.config.SnowflakeConfig;
import com.votez.mapper.CandidatesMapper;
import com.votez.model.Candidates;
import com.votez.model.CandidatesExample;
import com.votez.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateServiceImpl implements CandidateService {
    /*@Autowired
    private CandidatesMapper candidatesMapper;*/

    @Autowired
    private DynamoDB dynamoDB;

    @Autowired
    private SnowflakeConfig snowflakeConfig;

    // 指定要操作的表名
    String tableName = "candidate";

    @Override
    public Item SelectbyID(int id) {
        GetItemSpec spec = new GetItemSpec().withPrimaryKey("id",id);
        Table table = dynamoDB.getTable(tableName);
        Item outcome = table.getItem(spec);
        return outcome;

    }

    @Override
    public ItemCollection<QueryOutcome> SelectbyCandidatename(String Candidatename) {
        Table table = dynamoDB.getTable("tableName");
        QuerySpec spec = new QuerySpec()
                .withKeyConditionExpression("Candidatename = :value")
                .withValueMap(new ValueMap().withString(":value", Candidatename));
        ItemCollection<QueryOutcome> items = table.query(spec);
        return items;
    }

    @Override
    public ItemCollection<QueryOutcome> SelectbyParty(String PartyAffiliation) {
        Table table = dynamoDB.getTable("tableName");
        QuerySpec spec = new QuerySpec()
                .withKeyConditionExpression("PartyAffiliation = :value")
                .withValueMap(new ValueMap().withString(":value", PartyAffiliation));
        ItemCollection<QueryOutcome> items = table.query(spec);
        return items;
    }

    @Override
    public ItemCollection<QueryOutcome> SelectbyCampaign(String Campaign) {
        Table table = dynamoDB.getTable("tableName");
        QuerySpec spec = new QuerySpec()
                .withKeyConditionExpression("Campaign = :value")
                .withValueMap(new ValueMap().withString(":value", Campaign));
        ItemCollection<QueryOutcome> items = table.query(spec);
        return items;
    }

    /*@Override
    public void Insert(Candidates candidates) {
        candidatesMapper.insert(candidates);
    }*/
}
