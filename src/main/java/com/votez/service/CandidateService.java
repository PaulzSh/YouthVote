package com.votez.service;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.votez.model.Candidates;

import java.util.List;

public interface CandidateService {
    Item SelectbyID(int id);//通过id查询候选人
    ItemCollection<QueryOutcome> SelectbyCandidatename(String Candidatename);
    ItemCollection<QueryOutcome> SelectbyParty(String PartyAffiliation);
    ItemCollection<QueryOutcome> SelectbyCampaign(String Campaign);
    //void Insert(Candidates candidates);

}
