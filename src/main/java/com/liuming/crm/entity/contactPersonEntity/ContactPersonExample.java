package com.liuming.crm.entity.contactPersonEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContactPersonExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContactPersonExample() {
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

        public Criteria andContactPersonIdIsNull() {
            addCriterion("contact_person_id is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdIsNotNull() {
            addCriterion("contact_person_id is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdEqualTo(String value) {
            addCriterion("contact_person_id =", value, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdNotEqualTo(String value) {
            addCriterion("contact_person_id <>", value, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdGreaterThan(String value) {
            addCriterion("contact_person_id >", value, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person_id >=", value, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdLessThan(String value) {
            addCriterion("contact_person_id <", value, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdLessThanOrEqualTo(String value) {
            addCriterion("contact_person_id <=", value, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdLike(String value) {
            addCriterion("contact_person_id like", value, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdNotLike(String value) {
            addCriterion("contact_person_id not like", value, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdIn(List<String> values) {
            addCriterion("contact_person_id in", values, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdNotIn(List<String> values) {
            addCriterion("contact_person_id not in", values, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdBetween(String value1, String value2) {
            addCriterion("contact_person_id between", value1, value2, "contactPersonId");
            return (Criteria) this;
        }

        public Criteria andContactPersonIdNotBetween(String value1, String value2) {
            addCriterion("contact_person_id not between", value1, value2, "contactPersonId");
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

        public Criteria andContactPersonNameIsNull() {
            addCriterion("contact_person_name is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameIsNotNull() {
            addCriterion("contact_person_name is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameEqualTo(String value) {
            addCriterion("contact_person_name =", value, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameNotEqualTo(String value) {
            addCriterion("contact_person_name <>", value, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameGreaterThan(String value) {
            addCriterion("contact_person_name >", value, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person_name >=", value, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameLessThan(String value) {
            addCriterion("contact_person_name <", value, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameLessThanOrEqualTo(String value) {
            addCriterion("contact_person_name <=", value, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameLike(String value) {
            addCriterion("contact_person_name like", value, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameNotLike(String value) {
            addCriterion("contact_person_name not like", value, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameIn(List<String> values) {
            addCriterion("contact_person_name in", values, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameNotIn(List<String> values) {
            addCriterion("contact_person_name not in", values, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameBetween(String value1, String value2) {
            addCriterion("contact_person_name between", value1, value2, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonNameNotBetween(String value1, String value2) {
            addCriterion("contact_person_name not between", value1, value2, "contactPersonName");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneIsNull() {
            addCriterion("contact_person_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneIsNotNull() {
            addCriterion("contact_person_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneEqualTo(String value) {
            addCriterion("contact_person_phone =", value, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneNotEqualTo(String value) {
            addCriterion("contact_person_phone <>", value, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneGreaterThan(String value) {
            addCriterion("contact_person_phone >", value, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person_phone >=", value, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneLessThan(String value) {
            addCriterion("contact_person_phone <", value, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_person_phone <=", value, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneLike(String value) {
            addCriterion("contact_person_phone like", value, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneNotLike(String value) {
            addCriterion("contact_person_phone not like", value, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneIn(List<String> values) {
            addCriterion("contact_person_phone in", values, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneNotIn(List<String> values) {
            addCriterion("contact_person_phone not in", values, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneBetween(String value1, String value2) {
            addCriterion("contact_person_phone between", value1, value2, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_person_phone not between", value1, value2, "contactPersonPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatIsNull() {
            addCriterion("contact_person_wechat is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatIsNotNull() {
            addCriterion("contact_person_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatEqualTo(String value) {
            addCriterion("contact_person_wechat =", value, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatNotEqualTo(String value) {
            addCriterion("contact_person_wechat <>", value, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatGreaterThan(String value) {
            addCriterion("contact_person_wechat >", value, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person_wechat >=", value, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatLessThan(String value) {
            addCriterion("contact_person_wechat <", value, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatLessThanOrEqualTo(String value) {
            addCriterion("contact_person_wechat <=", value, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatLike(String value) {
            addCriterion("contact_person_wechat like", value, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatNotLike(String value) {
            addCriterion("contact_person_wechat not like", value, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatIn(List<String> values) {
            addCriterion("contact_person_wechat in", values, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatNotIn(List<String> values) {
            addCriterion("contact_person_wechat not in", values, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatBetween(String value1, String value2) {
            addCriterion("contact_person_wechat between", value1, value2, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWechatNotBetween(String value1, String value2) {
            addCriterion("contact_person_wechat not between", value1, value2, "contactPersonWechat");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangIsNull() {
            addCriterion("contact_person_wangwang is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangIsNotNull() {
            addCriterion("contact_person_wangwang is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangEqualTo(String value) {
            addCriterion("contact_person_wangwang =", value, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangNotEqualTo(String value) {
            addCriterion("contact_person_wangwang <>", value, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangGreaterThan(String value) {
            addCriterion("contact_person_wangwang >", value, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person_wangwang >=", value, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangLessThan(String value) {
            addCriterion("contact_person_wangwang <", value, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangLessThanOrEqualTo(String value) {
            addCriterion("contact_person_wangwang <=", value, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangLike(String value) {
            addCriterion("contact_person_wangwang like", value, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangNotLike(String value) {
            addCriterion("contact_person_wangwang not like", value, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangIn(List<String> values) {
            addCriterion("contact_person_wangwang in", values, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangNotIn(List<String> values) {
            addCriterion("contact_person_wangwang not in", values, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangBetween(String value1, String value2) {
            addCriterion("contact_person_wangwang between", value1, value2, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonWangwangNotBetween(String value1, String value2) {
            addCriterion("contact_person_wangwang not between", value1, value2, "contactPersonWangwang");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusIsNull() {
            addCriterion("contact_person_status is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusIsNotNull() {
            addCriterion("contact_person_status is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusEqualTo(Integer value) {
            addCriterion("contact_person_status =", value, "contactPersonStatus");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusNotEqualTo(Integer value) {
            addCriterion("contact_person_status <>", value, "contactPersonStatus");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusGreaterThan(Integer value) {
            addCriterion("contact_person_status >", value, "contactPersonStatus");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("contact_person_status >=", value, "contactPersonStatus");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusLessThan(Integer value) {
            addCriterion("contact_person_status <", value, "contactPersonStatus");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusLessThanOrEqualTo(Integer value) {
            addCriterion("contact_person_status <=", value, "contactPersonStatus");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusIn(List<Integer> values) {
            addCriterion("contact_person_status in", values, "contactPersonStatus");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusNotIn(List<Integer> values) {
            addCriterion("contact_person_status not in", values, "contactPersonStatus");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusBetween(Integer value1, Integer value2) {
            addCriterion("contact_person_status between", value1, value2, "contactPersonStatus");
            return (Criteria) this;
        }

        public Criteria andContactPersonStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("contact_person_status not between", value1, value2, "contactPersonStatus");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateIsNull() {
            addCriterion("contact_person_created_date is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateIsNotNull() {
            addCriterion("contact_person_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateEqualTo(Date value) {
            addCriterion("contact_person_created_date =", value, "contactPersonCreatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateNotEqualTo(Date value) {
            addCriterion("contact_person_created_date <>", value, "contactPersonCreatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateGreaterThan(Date value) {
            addCriterion("contact_person_created_date >", value, "contactPersonCreatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("contact_person_created_date >=", value, "contactPersonCreatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateLessThan(Date value) {
            addCriterion("contact_person_created_date <", value, "contactPersonCreatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("contact_person_created_date <=", value, "contactPersonCreatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateIn(List<Date> values) {
            addCriterion("contact_person_created_date in", values, "contactPersonCreatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateNotIn(List<Date> values) {
            addCriterion("contact_person_created_date not in", values, "contactPersonCreatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateBetween(Date value1, Date value2) {
            addCriterion("contact_person_created_date between", value1, value2, "contactPersonCreatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("contact_person_created_date not between", value1, value2, "contactPersonCreatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateIsNull() {
            addCriterion("contact_person_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateIsNotNull() {
            addCriterion("contact_person_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateEqualTo(Date value) {
            addCriterion("contact_person_updated_date =", value, "contactPersonUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateNotEqualTo(Date value) {
            addCriterion("contact_person_updated_date <>", value, "contactPersonUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateGreaterThan(Date value) {
            addCriterion("contact_person_updated_date >", value, "contactPersonUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("contact_person_updated_date >=", value, "contactPersonUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateLessThan(Date value) {
            addCriterion("contact_person_updated_date <", value, "contactPersonUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("contact_person_updated_date <=", value, "contactPersonUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateIn(List<Date> values) {
            addCriterion("contact_person_updated_date in", values, "contactPersonUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateNotIn(List<Date> values) {
            addCriterion("contact_person_updated_date not in", values, "contactPersonUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("contact_person_updated_date between", value1, value2, "contactPersonUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andContactPersonUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("contact_person_updated_date not between", value1, value2, "contactPersonUpdatedDate");
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