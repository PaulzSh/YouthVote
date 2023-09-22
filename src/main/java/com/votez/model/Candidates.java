package com.votez.model;

public class Candidates {
    private Integer id;

    private String candidatename;

    private String lastname;

    private String partyaffiliation;

    private String candidateimages;

    private String campaign;

    private String describtion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCandidatename() {
        return candidatename;
    }

    public void setCandidatename(String candidatename) {
        this.candidatename = candidatename == null ? null : candidatename.trim();
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname == null ? null : lastname.trim();
    }

    public String getPartyaffiliation() {
        return partyaffiliation;
    }

    public void setPartyaffiliation(String partyaffiliation) {
        this.partyaffiliation = partyaffiliation == null ? null : partyaffiliation.trim();
    }

    public String getCandidateimages() {
        return candidateimages;
    }

    public void setCandidateimages(String candidateimages) {
        this.candidateimages = candidateimages == null ? null : candidateimages.trim();
    }

    public String getCampaign() {
        return campaign;
    }

    public void setCampaign(String campaign) {
        this.campaign = campaign == null ? null : campaign.trim();
    }

    public String getDescribtion() {
        return describtion;
    }

    public void setDescribtion(String describtion) {
        this.describtion = describtion == null ? null : describtion.trim();
    }
}