package model;

import java.util.ArrayList;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andCardNumberIsNull() {
            addCriterion("cardNumber is null");
            return (Criteria) this;
        }

        public Criteria andCardNumberIsNotNull() {
            addCriterion("cardNumber is not null");
            return (Criteria) this;
        }

        public Criteria andCardNumberEqualTo(String value) {
            addCriterion("cardNumber =", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotEqualTo(String value) {
            addCriterion("cardNumber <>", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThan(String value) {
            addCriterion("cardNumber >", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("cardNumber >=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThan(String value) {
            addCriterion("cardNumber <", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLessThanOrEqualTo(String value) {
            addCriterion("cardNumber <=", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberLike(String value) {
            addCriterion("cardNumber like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotLike(String value) {
            addCriterion("cardNumber not like", value, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberIn(List<String> values) {
            addCriterion("cardNumber in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotIn(List<String> values) {
            addCriterion("cardNumber not in", values, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberBetween(String value1, String value2) {
            addCriterion("cardNumber between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andCardNumberNotBetween(String value1, String value2) {
            addCriterion("cardNumber not between", value1, value2, "cardNumber");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNull() {
            addCriterion("companyName is null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIsNotNull() {
            addCriterion("companyName is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyNameEqualTo(String value) {
            addCriterion("companyName =", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotEqualTo(String value) {
            addCriterion("companyName <>", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThan(String value) {
            addCriterion("companyName >", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameGreaterThanOrEqualTo(String value) {
            addCriterion("companyName >=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThan(String value) {
            addCriterion("companyName <", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLessThanOrEqualTo(String value) {
            addCriterion("companyName <=", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameLike(String value) {
            addCriterion("companyName like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotLike(String value) {
            addCriterion("companyName not like", value, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameIn(List<String> values) {
            addCriterion("companyName in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotIn(List<String> values) {
            addCriterion("companyName not in", values, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameBetween(String value1, String value2) {
            addCriterion("companyName between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyNameNotBetween(String value1, String value2) {
            addCriterion("companyName not between", value1, value2, "companyName");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNull() {
            addCriterion("companyAddress is null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIsNotNull() {
            addCriterion("companyAddress is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressEqualTo(String value) {
            addCriterion("companyAddress =", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotEqualTo(String value) {
            addCriterion("companyAddress <>", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThan(String value) {
            addCriterion("companyAddress >", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressGreaterThanOrEqualTo(String value) {
            addCriterion("companyAddress >=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThan(String value) {
            addCriterion("companyAddress <", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLessThanOrEqualTo(String value) {
            addCriterion("companyAddress <=", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressLike(String value) {
            addCriterion("companyAddress like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotLike(String value) {
            addCriterion("companyAddress not like", value, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressIn(List<String> values) {
            addCriterion("companyAddress in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotIn(List<String> values) {
            addCriterion("companyAddress not in", values, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressBetween(String value1, String value2) {
            addCriterion("companyAddress between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyAddressNotBetween(String value1, String value2) {
            addCriterion("companyAddress not between", value1, value2, "companyAddress");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeIsNull() {
            addCriterion("companyCreditCode is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeIsNotNull() {
            addCriterion("companyCreditCode is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeEqualTo(String value) {
            addCriterion("companyCreditCode =", value, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeNotEqualTo(String value) {
            addCriterion("companyCreditCode <>", value, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeGreaterThan(String value) {
            addCriterion("companyCreditCode >", value, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeGreaterThanOrEqualTo(String value) {
            addCriterion("companyCreditCode >=", value, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeLessThan(String value) {
            addCriterion("companyCreditCode <", value, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeLessThanOrEqualTo(String value) {
            addCriterion("companyCreditCode <=", value, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeLike(String value) {
            addCriterion("companyCreditCode like", value, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeNotLike(String value) {
            addCriterion("companyCreditCode not like", value, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeIn(List<String> values) {
            addCriterion("companyCreditCode in", values, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeNotIn(List<String> values) {
            addCriterion("companyCreditCode not in", values, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeBetween(String value1, String value2) {
            addCriterion("companyCreditCode between", value1, value2, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andCompanyCreditCodeNotBetween(String value1, String value2) {
            addCriterion("companyCreditCode not between", value1, value2, "companyCreditCode");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameIsNull() {
            addCriterion("legalRepName is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameIsNotNull() {
            addCriterion("legalRepName is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameEqualTo(String value) {
            addCriterion("legalRepName =", value, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameNotEqualTo(String value) {
            addCriterion("legalRepName <>", value, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameGreaterThan(String value) {
            addCriterion("legalRepName >", value, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameGreaterThanOrEqualTo(String value) {
            addCriterion("legalRepName >=", value, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameLessThan(String value) {
            addCriterion("legalRepName <", value, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameLessThanOrEqualTo(String value) {
            addCriterion("legalRepName <=", value, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameLike(String value) {
            addCriterion("legalRepName like", value, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameNotLike(String value) {
            addCriterion("legalRepName not like", value, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameIn(List<String> values) {
            addCriterion("legalRepName in", values, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameNotIn(List<String> values) {
            addCriterion("legalRepName not in", values, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameBetween(String value1, String value2) {
            addCriterion("legalRepName between", value1, value2, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepNameNotBetween(String value1, String value2) {
            addCriterion("legalRepName not between", value1, value2, "legalRepName");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdIsNull() {
            addCriterion("legalRepId is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdIsNotNull() {
            addCriterion("legalRepId is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdEqualTo(String value) {
            addCriterion("legalRepId =", value, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdNotEqualTo(String value) {
            addCriterion("legalRepId <>", value, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdGreaterThan(String value) {
            addCriterion("legalRepId >", value, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdGreaterThanOrEqualTo(String value) {
            addCriterion("legalRepId >=", value, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdLessThan(String value) {
            addCriterion("legalRepId <", value, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdLessThanOrEqualTo(String value) {
            addCriterion("legalRepId <=", value, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdLike(String value) {
            addCriterion("legalRepId like", value, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdNotLike(String value) {
            addCriterion("legalRepId not like", value, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdIn(List<String> values) {
            addCriterion("legalRepId in", values, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdNotIn(List<String> values) {
            addCriterion("legalRepId not in", values, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdBetween(String value1, String value2) {
            addCriterion("legalRepId between", value1, value2, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepIdNotBetween(String value1, String value2) {
            addCriterion("legalRepId not between", value1, value2, "legalRepId");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrIsNull() {
            addCriterion("legalRepAddr is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrIsNotNull() {
            addCriterion("legalRepAddr is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrEqualTo(String value) {
            addCriterion("legalRepAddr =", value, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrNotEqualTo(String value) {
            addCriterion("legalRepAddr <>", value, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrGreaterThan(String value) {
            addCriterion("legalRepAddr >", value, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrGreaterThanOrEqualTo(String value) {
            addCriterion("legalRepAddr >=", value, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrLessThan(String value) {
            addCriterion("legalRepAddr <", value, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrLessThanOrEqualTo(String value) {
            addCriterion("legalRepAddr <=", value, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrLike(String value) {
            addCriterion("legalRepAddr like", value, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrNotLike(String value) {
            addCriterion("legalRepAddr not like", value, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrIn(List<String> values) {
            addCriterion("legalRepAddr in", values, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrNotIn(List<String> values) {
            addCriterion("legalRepAddr not in", values, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrBetween(String value1, String value2) {
            addCriterion("legalRepAddr between", value1, value2, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepAddrNotBetween(String value1, String value2) {
            addCriterion("legalRepAddr not between", value1, value2, "legalRepAddr");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelIsNull() {
            addCriterion("legalRepTel is null");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelIsNotNull() {
            addCriterion("legalRepTel is not null");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelEqualTo(String value) {
            addCriterion("legalRepTel =", value, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelNotEqualTo(String value) {
            addCriterion("legalRepTel <>", value, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelGreaterThan(String value) {
            addCriterion("legalRepTel >", value, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelGreaterThanOrEqualTo(String value) {
            addCriterion("legalRepTel >=", value, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelLessThan(String value) {
            addCriterion("legalRepTel <", value, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelLessThanOrEqualTo(String value) {
            addCriterion("legalRepTel <=", value, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelLike(String value) {
            addCriterion("legalRepTel like", value, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelNotLike(String value) {
            addCriterion("legalRepTel not like", value, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelIn(List<String> values) {
            addCriterion("legalRepTel in", values, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelNotIn(List<String> values) {
            addCriterion("legalRepTel not in", values, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelBetween(String value1, String value2) {
            addCriterion("legalRepTel between", value1, value2, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andLegalRepTelNotBetween(String value1, String value2) {
            addCriterion("legalRepTel not between", value1, value2, "legalRepTel");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNull() {
            addCriterion("createdAt is null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIsNotNull() {
            addCriterion("createdAt is not null");
            return (Criteria) this;
        }

        public Criteria andCreatedAtEqualTo(String value) {
            addCriterion("createdAt =", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotEqualTo(String value) {
            addCriterion("createdAt <>", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThan(String value) {
            addCriterion("createdAt >", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtGreaterThanOrEqualTo(String value) {
            addCriterion("createdAt >=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThan(String value) {
            addCriterion("createdAt <", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLessThanOrEqualTo(String value) {
            addCriterion("createdAt <=", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtLike(String value) {
            addCriterion("createdAt like", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotLike(String value) {
            addCriterion("createdAt not like", value, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtIn(List<String> values) {
            addCriterion("createdAt in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotIn(List<String> values) {
            addCriterion("createdAt not in", values, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtBetween(String value1, String value2) {
            addCriterion("createdAt between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andCreatedAtNotBetween(String value1, String value2) {
            addCriterion("createdAt not between", value1, value2, "createdAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNull() {
            addCriterion("updatedAt is null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIsNotNull() {
            addCriterion("updatedAt is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtEqualTo(String value) {
            addCriterion("updatedAt =", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotEqualTo(String value) {
            addCriterion("updatedAt <>", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThan(String value) {
            addCriterion("updatedAt >", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtGreaterThanOrEqualTo(String value) {
            addCriterion("updatedAt >=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThan(String value) {
            addCriterion("updatedAt <", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLessThanOrEqualTo(String value) {
            addCriterion("updatedAt <=", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtLike(String value) {
            addCriterion("updatedAt like", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotLike(String value) {
            addCriterion("updatedAt not like", value, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtIn(List<String> values) {
            addCriterion("updatedAt in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotIn(List<String> values) {
            addCriterion("updatedAt not in", values, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtBetween(String value1, String value2) {
            addCriterion("updatedAt between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andUpdatedAtNotBetween(String value1, String value2) {
            addCriterion("updatedAt not between", value1, value2, "updatedAt");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNull() {
            addCriterion("business is null");
            return (Criteria) this;
        }

        public Criteria andBusinessIsNotNull() {
            addCriterion("business is not null");
            return (Criteria) this;
        }

        public Criteria andBusinessEqualTo(String value) {
            addCriterion("business =", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotEqualTo(String value) {
            addCriterion("business <>", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThan(String value) {
            addCriterion("business >", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessGreaterThanOrEqualTo(String value) {
            addCriterion("business >=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThan(String value) {
            addCriterion("business <", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLessThanOrEqualTo(String value) {
            addCriterion("business <=", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessLike(String value) {
            addCriterion("business like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotLike(String value) {
            addCriterion("business not like", value, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessIn(List<String> values) {
            addCriterion("business in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotIn(List<String> values) {
            addCriterion("business not in", values, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessBetween(String value1, String value2) {
            addCriterion("business between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andBusinessNotBetween(String value1, String value2) {
            addCriterion("business not between", value1, value2, "business");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNull() {
            addCriterion("deleted is null");
            return (Criteria) this;
        }

        public Criteria andDeletedIsNotNull() {
            addCriterion("deleted is not null");
            return (Criteria) this;
        }

        public Criteria andDeletedEqualTo(Integer value) {
            addCriterion("deleted =", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotEqualTo(Integer value) {
            addCriterion("deleted <>", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThan(Integer value) {
            addCriterion("deleted >", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("deleted >=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThan(Integer value) {
            addCriterion("deleted <", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("deleted <=", value, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedIn(List<Integer> values) {
            addCriterion("deleted in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotIn(List<Integer> values) {
            addCriterion("deleted not in", values, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedBetween(Integer value1, Integer value2) {
            addCriterion("deleted between", value1, value2, "deleted");
            return (Criteria) this;
        }

        public Criteria andDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("deleted not between", value1, value2, "deleted");
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