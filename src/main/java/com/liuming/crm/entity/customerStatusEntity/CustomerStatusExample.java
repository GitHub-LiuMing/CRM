package com.liuming.crm.entity.customerStatusEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomerStatusExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerStatusExample() {
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

        public Criteria andCustomerStatusStatusIsNull() {
            addCriterion("customer_status_status is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusIsNotNull() {
            addCriterion("customer_status_status is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusEqualTo(Integer value) {
            addCriterion("customer_status_status =", value, "customerStatusStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusNotEqualTo(Integer value) {
            addCriterion("customer_status_status <>", value, "customerStatusStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusGreaterThan(Integer value) {
            addCriterion("customer_status_status >", value, "customerStatusStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_status_status >=", value, "customerStatusStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusLessThan(Integer value) {
            addCriterion("customer_status_status <", value, "customerStatusStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusLessThanOrEqualTo(Integer value) {
            addCriterion("customer_status_status <=", value, "customerStatusStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusIn(List<Integer> values) {
            addCriterion("customer_status_status in", values, "customerStatusStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusNotIn(List<Integer> values) {
            addCriterion("customer_status_status not in", values, "customerStatusStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusBetween(Integer value1, Integer value2) {
            addCriterion("customer_status_status between", value1, value2, "customerStatusStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_status_status not between", value1, value2, "customerStatusStatus");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateIsNull() {
            addCriterion("customer_status_created_date is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateIsNotNull() {
            addCriterion("customer_status_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateEqualTo(Date value) {
            addCriterion("customer_status_created_date =", value, "customerStatusCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateNotEqualTo(Date value) {
            addCriterion("customer_status_created_date <>", value, "customerStatusCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateGreaterThan(Date value) {
            addCriterion("customer_status_created_date >", value, "customerStatusCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_status_created_date >=", value, "customerStatusCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateLessThan(Date value) {
            addCriterion("customer_status_created_date <", value, "customerStatusCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("customer_status_created_date <=", value, "customerStatusCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateIn(List<Date> values) {
            addCriterion("customer_status_created_date in", values, "customerStatusCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateNotIn(List<Date> values) {
            addCriterion("customer_status_created_date not in", values, "customerStatusCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateBetween(Date value1, Date value2) {
            addCriterion("customer_status_created_date between", value1, value2, "customerStatusCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("customer_status_created_date not between", value1, value2, "customerStatusCreatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateIsNull() {
            addCriterion("customer_status_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateIsNotNull() {
            addCriterion("customer_status_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateEqualTo(Date value) {
            addCriterion("customer_status_updated_date =", value, "customerStatusUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateNotEqualTo(Date value) {
            addCriterion("customer_status_updated_date <>", value, "customerStatusUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateGreaterThan(Date value) {
            addCriterion("customer_status_updated_date >", value, "customerStatusUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("customer_status_updated_date >=", value, "customerStatusUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateLessThan(Date value) {
            addCriterion("customer_status_updated_date <", value, "customerStatusUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("customer_status_updated_date <=", value, "customerStatusUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateIn(List<Date> values) {
            addCriterion("customer_status_updated_date in", values, "customerStatusUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateNotIn(List<Date> values) {
            addCriterion("customer_status_updated_date not in", values, "customerStatusUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("customer_status_updated_date between", value1, value2, "customerStatusUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andCustomerStatusUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("customer_status_updated_date not between", value1, value2, "customerStatusUpdatedDate");
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