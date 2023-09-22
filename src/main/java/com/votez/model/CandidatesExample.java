package com.votez.model;

import java.util.ArrayList;
import java.util.List;

public class CandidatesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CandidatesExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andCandidatenameIsNull() {
            addCriterion("Candidatename is null");
            return (Criteria) this;
        }

        public Criteria andCandidatenameIsNotNull() {
            addCriterion("Candidatename is not null");
            return (Criteria) this;
        }

        public Criteria andCandidatenameEqualTo(String value) {
            addCriterion("Candidatename =", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameNotEqualTo(String value) {
            addCriterion("Candidatename <>", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameGreaterThan(String value) {
            addCriterion("Candidatename >", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameGreaterThanOrEqualTo(String value) {
            addCriterion("Candidatename >=", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameLessThan(String value) {
            addCriterion("Candidatename <", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameLessThanOrEqualTo(String value) {
            addCriterion("Candidatename <=", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameLike(String value) {
            addCriterion("Candidatename like", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameNotLike(String value) {
            addCriterion("Candidatename not like", value, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameIn(List<String> values) {
            addCriterion("Candidatename in", values, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameNotIn(List<String> values) {
            addCriterion("Candidatename not in", values, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameBetween(String value1, String value2) {
            addCriterion("Candidatename between", value1, value2, "candidatename");
            return (Criteria) this;
        }

        public Criteria andCandidatenameNotBetween(String value1, String value2) {
            addCriterion("Candidatename not between", value1, value2, "candidatename");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNull() {
            addCriterion("LastName is null");
            return (Criteria) this;
        }

        public Criteria andLastnameIsNotNull() {
            addCriterion("LastName is not null");
            return (Criteria) this;
        }

        public Criteria andLastnameEqualTo(String value) {
            addCriterion("LastName =", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotEqualTo(String value) {
            addCriterion("LastName <>", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThan(String value) {
            addCriterion("LastName >", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameGreaterThanOrEqualTo(String value) {
            addCriterion("LastName >=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThan(String value) {
            addCriterion("LastName <", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLessThanOrEqualTo(String value) {
            addCriterion("LastName <=", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameLike(String value) {
            addCriterion("LastName like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotLike(String value) {
            addCriterion("LastName not like", value, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameIn(List<String> values) {
            addCriterion("LastName in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotIn(List<String> values) {
            addCriterion("LastName not in", values, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameBetween(String value1, String value2) {
            addCriterion("LastName between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andLastnameNotBetween(String value1, String value2) {
            addCriterion("LastName not between", value1, value2, "lastname");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationIsNull() {
            addCriterion("PartyAffiliation is null");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationIsNotNull() {
            addCriterion("PartyAffiliation is not null");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationEqualTo(String value) {
            addCriterion("PartyAffiliation =", value, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationNotEqualTo(String value) {
            addCriterion("PartyAffiliation <>", value, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationGreaterThan(String value) {
            addCriterion("PartyAffiliation >", value, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationGreaterThanOrEqualTo(String value) {
            addCriterion("PartyAffiliation >=", value, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationLessThan(String value) {
            addCriterion("PartyAffiliation <", value, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationLessThanOrEqualTo(String value) {
            addCriterion("PartyAffiliation <=", value, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationLike(String value) {
            addCriterion("PartyAffiliation like", value, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationNotLike(String value) {
            addCriterion("PartyAffiliation not like", value, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationIn(List<String> values) {
            addCriterion("PartyAffiliation in", values, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationNotIn(List<String> values) {
            addCriterion("PartyAffiliation not in", values, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationBetween(String value1, String value2) {
            addCriterion("PartyAffiliation between", value1, value2, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andPartyaffiliationNotBetween(String value1, String value2) {
            addCriterion("PartyAffiliation not between", value1, value2, "partyaffiliation");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesIsNull() {
            addCriterion("Candidateimages is null");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesIsNotNull() {
            addCriterion("Candidateimages is not null");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesEqualTo(String value) {
            addCriterion("Candidateimages =", value, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesNotEqualTo(String value) {
            addCriterion("Candidateimages <>", value, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesGreaterThan(String value) {
            addCriterion("Candidateimages >", value, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesGreaterThanOrEqualTo(String value) {
            addCriterion("Candidateimages >=", value, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesLessThan(String value) {
            addCriterion("Candidateimages <", value, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesLessThanOrEqualTo(String value) {
            addCriterion("Candidateimages <=", value, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesLike(String value) {
            addCriterion("Candidateimages like", value, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesNotLike(String value) {
            addCriterion("Candidateimages not like", value, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesIn(List<String> values) {
            addCriterion("Candidateimages in", values, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesNotIn(List<String> values) {
            addCriterion("Candidateimages not in", values, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesBetween(String value1, String value2) {
            addCriterion("Candidateimages between", value1, value2, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCandidateimagesNotBetween(String value1, String value2) {
            addCriterion("Candidateimages not between", value1, value2, "candidateimages");
            return (Criteria) this;
        }

        public Criteria andCampaignIsNull() {
            addCriterion("Campaign is null");
            return (Criteria) this;
        }

        public Criteria andCampaignIsNotNull() {
            addCriterion("Campaign is not null");
            return (Criteria) this;
        }

        public Criteria andCampaignEqualTo(String value) {
            addCriterion("Campaign =", value, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignNotEqualTo(String value) {
            addCriterion("Campaign <>", value, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignGreaterThan(String value) {
            addCriterion("Campaign >", value, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignGreaterThanOrEqualTo(String value) {
            addCriterion("Campaign >=", value, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignLessThan(String value) {
            addCriterion("Campaign <", value, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignLessThanOrEqualTo(String value) {
            addCriterion("Campaign <=", value, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignLike(String value) {
            addCriterion("Campaign like", value, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignNotLike(String value) {
            addCriterion("Campaign not like", value, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignIn(List<String> values) {
            addCriterion("Campaign in", values, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignNotIn(List<String> values) {
            addCriterion("Campaign not in", values, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignBetween(String value1, String value2) {
            addCriterion("Campaign between", value1, value2, "campaign");
            return (Criteria) this;
        }

        public Criteria andCampaignNotBetween(String value1, String value2) {
            addCriterion("Campaign not between", value1, value2, "campaign");
            return (Criteria) this;
        }

        public Criteria andDescribtionIsNull() {
            addCriterion("Describtion is null");
            return (Criteria) this;
        }

        public Criteria andDescribtionIsNotNull() {
            addCriterion("Describtion is not null");
            return (Criteria) this;
        }

        public Criteria andDescribtionEqualTo(String value) {
            addCriterion("Describtion =", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionNotEqualTo(String value) {
            addCriterion("Describtion <>", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionGreaterThan(String value) {
            addCriterion("Describtion >", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionGreaterThanOrEqualTo(String value) {
            addCriterion("Describtion >=", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionLessThan(String value) {
            addCriterion("Describtion <", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionLessThanOrEqualTo(String value) {
            addCriterion("Describtion <=", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionLike(String value) {
            addCriterion("Describtion like", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionNotLike(String value) {
            addCriterion("Describtion not like", value, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionIn(List<String> values) {
            addCriterion("Describtion in", values, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionNotIn(List<String> values) {
            addCriterion("Describtion not in", values, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionBetween(String value1, String value2) {
            addCriterion("Describtion between", value1, value2, "describtion");
            return (Criteria) this;
        }

        public Criteria andDescribtionNotBetween(String value1, String value2) {
            addCriterion("Describtion not between", value1, value2, "describtion");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}