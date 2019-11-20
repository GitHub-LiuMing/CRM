package com.liuming.crm.entity.followUpRecordEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FollowUpRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FollowUpRecordExample() {
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

        public Criteria andFollowUpRecordIdIsNull() {
            addCriterion("follow_up_record_id is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdIsNotNull() {
            addCriterion("follow_up_record_id is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdEqualTo(String value) {
            addCriterion("follow_up_record_id =", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdNotEqualTo(String value) {
            addCriterion("follow_up_record_id <>", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdGreaterThan(String value) {
            addCriterion("follow_up_record_id >", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up_record_id >=", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdLessThan(String value) {
            addCriterion("follow_up_record_id <", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdLessThanOrEqualTo(String value) {
            addCriterion("follow_up_record_id <=", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdLike(String value) {
            addCriterion("follow_up_record_id like", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdNotLike(String value) {
            addCriterion("follow_up_record_id not like", value, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdIn(List<String> values) {
            addCriterion("follow_up_record_id in", values, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdNotIn(List<String> values) {
            addCriterion("follow_up_record_id not in", values, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdBetween(String value1, String value2) {
            addCriterion("follow_up_record_id between", value1, value2, "followUpRecordId");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordIdNotBetween(String value1, String value2) {
            addCriterion("follow_up_record_id not between", value1, value2, "followUpRecordId");
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

        public Criteria andFollowUpDateIsNull() {
            addCriterion("follow_up_date is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateIsNotNull() {
            addCriterion("follow_up_date is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_date =", value, "followUpDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_date <>", value, "followUpDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateGreaterThan(Date value) {
            addCriterionForJDBCDate("follow_up_date >", value, "followUpDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_date >=", value, "followUpDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateLessThan(Date value) {
            addCriterionForJDBCDate("follow_up_date <", value, "followUpDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("follow_up_date <=", value, "followUpDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateIn(List<Date> values) {
            addCriterionForJDBCDate("follow_up_date in", values, "followUpDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("follow_up_date not in", values, "followUpDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("follow_up_date between", value1, value2, "followUpDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("follow_up_date not between", value1, value2, "followUpDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeIsNull() {
            addCriterion("follow_up_theme is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeIsNotNull() {
            addCriterion("follow_up_theme is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeEqualTo(String value) {
            addCriterion("follow_up_theme =", value, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeNotEqualTo(String value) {
            addCriterion("follow_up_theme <>", value, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeGreaterThan(String value) {
            addCriterion("follow_up_theme >", value, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeGreaterThanOrEqualTo(String value) {
            addCriterion("follow_up_theme >=", value, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeLessThan(String value) {
            addCriterion("follow_up_theme <", value, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeLessThanOrEqualTo(String value) {
            addCriterion("follow_up_theme <=", value, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeLike(String value) {
            addCriterion("follow_up_theme like", value, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeNotLike(String value) {
            addCriterion("follow_up_theme not like", value, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeIn(List<String> values) {
            addCriterion("follow_up_theme in", values, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeNotIn(List<String> values) {
            addCriterion("follow_up_theme not in", values, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeBetween(String value1, String value2) {
            addCriterion("follow_up_theme between", value1, value2, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andFollowUpThemeNotBetween(String value1, String value2) {
            addCriterion("follow_up_theme not between", value1, value2, "followUpTheme");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateIsNull() {
            addCriterion("next_remind_date is null");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateIsNotNull() {
            addCriterion("next_remind_date is not null");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateEqualTo(Date value) {
            addCriterionForJDBCDate("next_remind_date =", value, "nextRemindDate");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("next_remind_date <>", value, "nextRemindDate");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateGreaterThan(Date value) {
            addCriterionForJDBCDate("next_remind_date >", value, "nextRemindDate");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("next_remind_date >=", value, "nextRemindDate");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateLessThan(Date value) {
            addCriterionForJDBCDate("next_remind_date <", value, "nextRemindDate");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("next_remind_date <=", value, "nextRemindDate");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateIn(List<Date> values) {
            addCriterionForJDBCDate("next_remind_date in", values, "nextRemindDate");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("next_remind_date not in", values, "nextRemindDate");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("next_remind_date between", value1, value2, "nextRemindDate");
            return (Criteria) this;
        }

        public Criteria andNextRemindDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("next_remind_date not between", value1, value2, "nextRemindDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeIsNull() {
            addCriterion("follow_up_record_type is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeIsNotNull() {
            addCriterion("follow_up_record_type is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeEqualTo(Integer value) {
            addCriterion("follow_up_record_type =", value, "followUpRecordType");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeNotEqualTo(Integer value) {
            addCriterion("follow_up_record_type <>", value, "followUpRecordType");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeGreaterThan(Integer value) {
            addCriterion("follow_up_record_type >", value, "followUpRecordType");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_up_record_type >=", value, "followUpRecordType");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeLessThan(Integer value) {
            addCriterion("follow_up_record_type <", value, "followUpRecordType");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeLessThanOrEqualTo(Integer value) {
            addCriterion("follow_up_record_type <=", value, "followUpRecordType");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeIn(List<Integer> values) {
            addCriterion("follow_up_record_type in", values, "followUpRecordType");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeNotIn(List<Integer> values) {
            addCriterion("follow_up_record_type not in", values, "followUpRecordType");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_record_type between", value1, value2, "followUpRecordType");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_record_type not between", value1, value2, "followUpRecordType");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusIsNull() {
            addCriterion("follow_up_record_status is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusIsNotNull() {
            addCriterion("follow_up_record_status is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusEqualTo(Integer value) {
            addCriterion("follow_up_record_status =", value, "followUpRecordStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusNotEqualTo(Integer value) {
            addCriterion("follow_up_record_status <>", value, "followUpRecordStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusGreaterThan(Integer value) {
            addCriterion("follow_up_record_status >", value, "followUpRecordStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("follow_up_record_status >=", value, "followUpRecordStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusLessThan(Integer value) {
            addCriterion("follow_up_record_status <", value, "followUpRecordStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusLessThanOrEqualTo(Integer value) {
            addCriterion("follow_up_record_status <=", value, "followUpRecordStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusIn(List<Integer> values) {
            addCriterion("follow_up_record_status in", values, "followUpRecordStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusNotIn(List<Integer> values) {
            addCriterion("follow_up_record_status not in", values, "followUpRecordStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_record_status between", value1, value2, "followUpRecordStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("follow_up_record_status not between", value1, value2, "followUpRecordStatus");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateIsNull() {
            addCriterion("follow_up_record_create_date is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateIsNotNull() {
            addCriterion("follow_up_record_create_date is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateEqualTo(Date value) {
            addCriterion("follow_up_record_create_date =", value, "followUpRecordCreateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateNotEqualTo(Date value) {
            addCriterion("follow_up_record_create_date <>", value, "followUpRecordCreateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateGreaterThan(Date value) {
            addCriterion("follow_up_record_create_date >", value, "followUpRecordCreateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("follow_up_record_create_date >=", value, "followUpRecordCreateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateLessThan(Date value) {
            addCriterion("follow_up_record_create_date <", value, "followUpRecordCreateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("follow_up_record_create_date <=", value, "followUpRecordCreateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateIn(List<Date> values) {
            addCriterion("follow_up_record_create_date in", values, "followUpRecordCreateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateNotIn(List<Date> values) {
            addCriterion("follow_up_record_create_date not in", values, "followUpRecordCreateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateBetween(Date value1, Date value2) {
            addCriterion("follow_up_record_create_date between", value1, value2, "followUpRecordCreateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("follow_up_record_create_date not between", value1, value2, "followUpRecordCreateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateIsNull() {
            addCriterion("follow_up_record_update_date is null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateIsNotNull() {
            addCriterion("follow_up_record_update_date is not null");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateEqualTo(Date value) {
            addCriterion("follow_up_record_update_date =", value, "followUpRecordUpdateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateNotEqualTo(Date value) {
            addCriterion("follow_up_record_update_date <>", value, "followUpRecordUpdateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateGreaterThan(Date value) {
            addCriterion("follow_up_record_update_date >", value, "followUpRecordUpdateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("follow_up_record_update_date >=", value, "followUpRecordUpdateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateLessThan(Date value) {
            addCriterion("follow_up_record_update_date <", value, "followUpRecordUpdateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("follow_up_record_update_date <=", value, "followUpRecordUpdateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateIn(List<Date> values) {
            addCriterion("follow_up_record_update_date in", values, "followUpRecordUpdateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateNotIn(List<Date> values) {
            addCriterion("follow_up_record_update_date not in", values, "followUpRecordUpdateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateBetween(Date value1, Date value2) {
            addCriterion("follow_up_record_update_date between", value1, value2, "followUpRecordUpdateDate");
            return (Criteria) this;
        }

        public Criteria andFollowUpRecordUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("follow_up_record_update_date not between", value1, value2, "followUpRecordUpdateDate");
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