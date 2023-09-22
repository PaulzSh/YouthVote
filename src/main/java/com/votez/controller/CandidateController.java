package com.votez.controller;

import com.amazonaws.services.dynamodbv2.document.Item;
import com.amazonaws.services.dynamodbv2.document.ItemCollection;
import com.amazonaws.services.dynamodbv2.document.QueryOutcome;
import com.votez.model.Candidates;
import com.votez.service.impl.CandidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/voter/candidates")
public class CandidateController {

    @Autowired
    CandidateServiceImpl candidateService;


    @GetMapping("/Searchforname")
    public Item Detailname(int id)  {
        return  candidateService.SelectbyID(id);
    }
    @GetMapping("/SelectbyCampaign")
    public ItemCollection<QueryOutcome> DetailCampaign(String  Campaign)  {
        return candidateService.SelectbyCampaign(Campaign);
    }
    @GetMapping("/SelectbyParty")
    public ItemCollection<QueryOutcome> DetailParty(String Party)  {
        return candidateService.SelectbyParty(Party);
    }

}
