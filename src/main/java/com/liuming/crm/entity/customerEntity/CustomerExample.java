package com.liuming.crm.entity.customerEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CustomerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(String value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(String value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(String value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(String value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(String value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLike(String value) {
            addCriterion("customer_id like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotLike(String value) {
            addCriterion("customer_id not like", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<String> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<String> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(String value1, String value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(String value1, String value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNull() {
            addCriterion("customer_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIsNotNull() {
            addCriterion("customer_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerNameEqualTo(String value) {
            addCriterion("customer_name =", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotEqualTo(String value) {
            addCriterion("customer_name <>", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThan(String value) {
            addCriterion("customer_name >", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_name >=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThan(String value) {
            addCriterion("customer_name <", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLessThanOrEqualTo(String value) {
            addCriterion("customer_name <=", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameLike(String value) {
            addCriterion("customer_name like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotLike(String value) {
            addCriterion("customer_name not like", value, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameIn(List<String> values) {
            addCriterion("customer_name in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotIn(List<String> values) {
            addCriterion("customer_name not in", values, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameBetween(String value1, String value2) {
            addCriterion("customer_name between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerNameNotBetween(String value1, String value2) {
            addCriterion("customer_name not between", value1, value2, "customerName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdIsNull() {
            addCriterion("customer_status_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdIsNotNull() {
            addCriterion("customer_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdEqualTo(String value) {
            addCriterion("customer_status_id =", value, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdNotEqualTo(String value) {
            addCriterion("customer_status_id <>", value, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdGreaterThan(String value) {
            addCriterion("customer_status_id >", value, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("customer_status_id >=", value, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdLessThan(String value) {
            addCriterion("customer_status_id <", value, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdLessThanOrEqualTo(String value) {
            addCriterion("customer_status_id <=", value, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdLike(String value) {
            addCriterion("customer_status_id like", value, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdNotLike(String value) {
            addCriterion("customer_status_id not like", value, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdIn(List<String> values) {
            addCriterion("customer_status_id in", values, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdNotIn(List<String> values) {
            addCriterion("customer_status_id not in", values, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdBetween(String value1, String value2) {
            addCriterion("customer_status_id between", value1, value2, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusIdNotBetween(String value1, String value2) {
            addCriterion("customer_status_id not between", value1, value2, "customerStatusId");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameIsNull() {
            addCriterion("customer_status_name is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameIsNotNull() {
            addCriterion("customer_status_name is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameEqualTo(String value) {
            addCriterion("customer_status_name =", value, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameNotEqualTo(String value) {
            addCriterion("customer_status_name <>", value, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameGreaterThan(String value) {
            addCriterion("customer_status_name >", value, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameGreaterThanOrEqualTo(String value) {
            addCriterion("customer_status_name >=", value, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameLessThan(String value) {
            addCriterion("customer_status_name <", value, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameLessThanOrEqualTo(String value) {
            addCriterion("customer_status_name <=", value, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameLike(String value) {
            addCriterion("customer_status_name like", value, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameNotLike(String value) {
            addCriterion("customer_status_name not like", value, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameIn(List<String> values) {
            addCriterion("customer_status_name in", values, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameNotIn(List<String> values) {
            addCriterion("customer_status_name not in", values, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameBetween(String value1, String value2) {
            addCriterion("customer_status_name between", value1, value2, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusNameNotBetween(String value1, String value2) {
            addCriterion("customer_status_name not between", value1, value2, "customerStatusName");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(String value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(String value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(String value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(String value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(String value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLike(String value) {
            addCriterion("user_id like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotLike(String value) {
            addCriterion("user_id not like", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<String> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<String> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(String value1, String value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(String value1, String value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateIsNull() {
            addCriterion("last_follow_up_date is null");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateIsNotNull() {
            addCriterion("last_follow_up_date is not null");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateEqualTo(Date value) {
            addCriterionForJDBCDate("last_follow_up_date =", value, "lastFollowUpDate");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("last_follow_up_date <>", value, "lastFollowUpDate");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateGreaterThan(Date value) {
            addCriterionForJDBCDate("last_follow_up_date >", value, "lastFollowUpDate");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_follow_up_date >=", value, "lastFollowUpDate");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateLessThan(Date value) {
            addCriterionForJDBCDate("last_follow_up_date <", value, "lastFollowUpDate");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("last_follow_up_date <=", value, "lastFollowUpDate");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateIn(List<Date> values) {
            addCriterionForJDBCDate("last_follow_up_date in", values, "lastFollowUpDate");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("last_follow_up_date not in", values, "lastFollowUpDate");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_follow_up_date between", value1, value2, "lastFollowUpDate");
            return (Criteria) this;
        }

        public Criteria andLastFollowUpDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("last_follow_up_date not between", value1, value2, "lastFollowUpDate");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNull() {
            addCriterion("province_code is null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIsNotNull() {
            addCriterion("province_code is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeEqualTo(String value) {
            addCriterion("province_code =", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotEqualTo(String value) {
            addCriterion("province_code <>", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThan(String value) {
            addCriterion("province_code >", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("province_code >=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThan(String value) {
            addCriterion("province_code <", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLessThanOrEqualTo(String value) {
            addCriterion("province_code <=", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeLike(String value) {
            addCriterion("province_code like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotLike(String value) {
            addCriterion("province_code not like", value, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeIn(List<String> values) {
            addCriterion("province_code in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotIn(List<String> values) {
            addCriterion("province_code not in", values, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeBetween(String value1, String value2) {
            addCriterion("province_code between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceCodeNotBetween(String value1, String value2) {
            addCriterion("province_code not between", value1, value2, "provinceCode");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameIsNull() {
            addCriterion("province_short_name is null");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameIsNotNull() {
            addCriterion("province_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameEqualTo(String value) {
            addCriterion("province_short_name =", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameNotEqualTo(String value) {
            addCriterion("province_short_name <>", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameGreaterThan(String value) {
            addCriterion("province_short_name >", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("province_short_name >=", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameLessThan(String value) {
            addCriterion("province_short_name <", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameLessThanOrEqualTo(String value) {
            addCriterion("province_short_name <=", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameLike(String value) {
            addCriterion("province_short_name like", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameNotLike(String value) {
            addCriterion("province_short_name not like", value, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameIn(List<String> values) {
            addCriterion("province_short_name in", values, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameNotIn(List<String> values) {
            addCriterion("province_short_name not in", values, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameBetween(String value1, String value2) {
            addCriterion("province_short_name between", value1, value2, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andProvinceShortNameNotBetween(String value1, String value2) {
            addCriterion("province_short_name not between", value1, value2, "provinceShortName");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNull() {
            addCriterion("city_code is null");
            return (Criteria) this;
        }

        public Criteria andCityCodeIsNotNull() {
            addCriterion("city_code is not null");
            return (Criteria) this;
        }

        public Criteria andCityCodeEqualTo(String value) {
            addCriterion("city_code =", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotEqualTo(String value) {
            addCriterion("city_code <>", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThan(String value) {
            addCriterion("city_code >", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("city_code >=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThan(String value) {
            addCriterion("city_code <", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLessThanOrEqualTo(String value) {
            addCriterion("city_code <=", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeLike(String value) {
            addCriterion("city_code like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotLike(String value) {
            addCriterion("city_code not like", value, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeIn(List<String> values) {
            addCriterion("city_code in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotIn(List<String> values) {
            addCriterion("city_code not in", values, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeBetween(String value1, String value2) {
            addCriterion("city_code between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityCodeNotBetween(String value1, String value2) {
            addCriterion("city_code not between", value1, value2, "cityCode");
            return (Criteria) this;
        }

        public Criteria andCityShortNameIsNull() {
            addCriterion("city_short_name is null");
            return (Criteria) this;
        }

        public Criteria andCityShortNameIsNotNull() {
            addCriterion("city_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andCityShortNameEqualTo(String value) {
            addCriterion("city_short_name =", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameNotEqualTo(String value) {
            addCriterion("city_short_name <>", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameGreaterThan(String value) {
            addCriterion("city_short_name >", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("city_short_name >=", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameLessThan(String value) {
            addCriterion("city_short_name <", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameLessThanOrEqualTo(String value) {
            addCriterion("city_short_name <=", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameLike(String value) {
            addCriterion("city_short_name like", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameNotLike(String value) {
            addCriterion("city_short_name not like", value, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameIn(List<String> values) {
            addCriterion("city_short_name in", values, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameNotIn(List<String> values) {
            addCriterion("city_short_name not in", values, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameBetween(String value1, String value2) {
            addCriterion("city_short_name between", value1, value2, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andCityShortNameNotBetween(String value1, String value2) {
            addCriterion("city_short_name not between", value1, value2, "cityShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNull() {
            addCriterion("district_code is null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIsNotNull() {
            addCriterion("district_code is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeEqualTo(String value) {
            addCriterion("district_code =", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotEqualTo(String value) {
            addCriterion("district_code <>", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThan(String value) {
            addCriterion("district_code >", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeGreaterThanOrEqualTo(String value) {
            addCriterion("district_code >=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThan(String value) {
            addCriterion("district_code <", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLessThanOrEqualTo(String value) {
            addCriterion("district_code <=", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeLike(String value) {
            addCriterion("district_code like", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotLike(String value) {
            addCriterion("district_code not like", value, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeIn(List<String> values) {
            addCriterion("district_code in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotIn(List<String> values) {
            addCriterion("district_code not in", values, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeBetween(String value1, String value2) {
            addCriterion("district_code between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictCodeNotBetween(String value1, String value2) {
            addCriterion("district_code not between", value1, value2, "districtCode");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameIsNull() {
            addCriterion("district_short_name is null");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameIsNotNull() {
            addCriterion("district_short_name is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameEqualTo(String value) {
            addCriterion("district_short_name =", value, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameNotEqualTo(String value) {
            addCriterion("district_short_name <>", value, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameGreaterThan(String value) {
            addCriterion("district_short_name >", value, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameGreaterThanOrEqualTo(String value) {
            addCriterion("district_short_name >=", value, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameLessThan(String value) {
            addCriterion("district_short_name <", value, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameLessThanOrEqualTo(String value) {
            addCriterion("district_short_name <=", value, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameLike(String value) {
            addCriterion("district_short_name like", value, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameNotLike(String value) {
            addCriterion("district_short_name not like", value, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameIn(List<String> values) {
            addCriterion("district_short_name in", values, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameNotIn(List<String> values) {
            addCriterion("district_short_name not in", values, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameBetween(String value1, String value2) {
            addCriterion("district_short_name between", value1, value2, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andDistrictShortNameNotBetween(String value1, String value2) {
            addCriterion("district_short_name not between", value1, value2, "districtShortName");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusIsNull() {
            addCriterion("customer_public_area_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusIsNotNull() {
            addCriterion("customer_public_area_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusEqualTo(Integer value) {
            addCriterion("customer_public_area_status =", value, "customerPublicAreaStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusNotEqualTo(Integer value) {
            addCriterion("customer_public_area_status <>", value, "customerPublicAreaStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusGreaterThan(Integer value) {
            addCriterion("customer_public_area_status >", value, "customerPublicAreaStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_public_area_status >=", value, "customerPublicAreaStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusLessThan(Integer value) {
            addCriterion("customer_public_area_status <", value, "customerPublicAreaStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_public_area_status <=", value, "customerPublicAreaStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusIn(List<Integer> values) {
            addCriterion("customer_public_area_status in", values, "customerPublicAreaStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusNotIn(List<Integer> values) {
            addCriterion("customer_public_area_status not in", values, "customerPublicAreaStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_public_area_status between", value1, value2, "customerPublicAreaStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerPublicAreaStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_public_area_status not between", value1, value2, "customerPublicAreaStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateIsNull() {
            addCriterion("customer_created_date is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateIsNotNull() {
            addCriterion("customer_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateEqualTo(Date value) {
            addCriterion("customer_created_date =", value, "customerCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateNotEqualTo(Date value) {
            addCriterion("customer_created_date <>", value, "customerCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateGreaterThan(Date value) {
            addCriterion("customer_created_date >", value, "customerCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_created_date >=", value, "customerCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateLessThan(Date value) {
            addCriterion("customer_created_date <", value, "customerCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("customer_created_date <=", value, "customerCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateIn(List<Date> values) {
            addCriterion("customer_created_date in", values, "customerCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateNotIn(List<Date> values) {
            addCriterion("customer_created_date not in", values, "customerCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateBetween(Date value1, Date value2) {
            addCriterion("customer_created_date between", value1, value2, "customerCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("customer_created_date not between", value1, value2, "customerCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateIsNull() {
            addCriterion("customer_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateIsNotNull() {
            addCriterion("customer_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateEqualTo(Date value) {
            addCriterion("customer_updated_date =", value, "customerUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateNotEqualTo(Date value) {
            addCriterion("customer_updated_date <>", value, "customerUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateGreaterThan(Date value) {
            addCriterion("customer_updated_date >", value, "customerUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_updated_date >=", value, "customerUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateLessThan(Date value) {
            addCriterion("customer_updated_date <", value, "customerUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("customer_updated_date <=", value, "customerUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateIn(List<Date> values) {
            addCriterion("customer_updated_date in", values, "customerUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateNotIn(List<Date> values) {
            addCriterion("customer_updated_date not in", values, "customerUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("customer_updated_date between", value1, value2, "customerUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("customer_updated_date not between", value1, value2, "customerUpdatedDate");
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