package com.liuming.crm.entity.workReportEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkReportExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkReportExample() {
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

        public Criteria andWorkReportIdIsNull() {
            addCriterion("work_report_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdIsNotNull() {
            addCriterion("work_report_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdEqualTo(String value) {
            addCriterion("work_report_id =", value, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdNotEqualTo(String value) {
            addCriterion("work_report_id <>", value, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdGreaterThan(String value) {
            addCriterion("work_report_id >", value, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_report_id >=", value, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdLessThan(String value) {
            addCriterion("work_report_id <", value, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdLessThanOrEqualTo(String value) {
            addCriterion("work_report_id <=", value, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdLike(String value) {
            addCriterion("work_report_id like", value, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdNotLike(String value) {
            addCriterion("work_report_id not like", value, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdIn(List<String> values) {
            addCriterion("work_report_id in", values, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdNotIn(List<String> values) {
            addCriterion("work_report_id not in", values, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdBetween(String value1, String value2) {
            addCriterion("work_report_id between", value1, value2, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportIdNotBetween(String value1, String value2) {
            addCriterion("work_report_id not between", value1, value2, "workReportId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdIsNull() {
            addCriterion("work_report_user_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdIsNotNull() {
            addCriterion("work_report_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdEqualTo(String value) {
            addCriterion("work_report_user_id =", value, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdNotEqualTo(String value) {
            addCriterion("work_report_user_id <>", value, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdGreaterThan(String value) {
            addCriterion("work_report_user_id >", value, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("work_report_user_id >=", value, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdLessThan(String value) {
            addCriterion("work_report_user_id <", value, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdLessThanOrEqualTo(String value) {
            addCriterion("work_report_user_id <=", value, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdLike(String value) {
            addCriterion("work_report_user_id like", value, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdNotLike(String value) {
            addCriterion("work_report_user_id not like", value, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdIn(List<String> values) {
            addCriterion("work_report_user_id in", values, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdNotIn(List<String> values) {
            addCriterion("work_report_user_id not in", values, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdBetween(String value1, String value2) {
            addCriterion("work_report_user_id between", value1, value2, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserIdNotBetween(String value1, String value2) {
            addCriterion("work_report_user_id not between", value1, value2, "workReportUserId");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameIsNull() {
            addCriterion("work_report_user_name is null");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameIsNotNull() {
            addCriterion("work_report_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameEqualTo(String value) {
            addCriterion("work_report_user_name =", value, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameNotEqualTo(String value) {
            addCriterion("work_report_user_name <>", value, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameGreaterThan(String value) {
            addCriterion("work_report_user_name >", value, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("work_report_user_name >=", value, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameLessThan(String value) {
            addCriterion("work_report_user_name <", value, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameLessThanOrEqualTo(String value) {
            addCriterion("work_report_user_name <=", value, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameLike(String value) {
            addCriterion("work_report_user_name like", value, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameNotLike(String value) {
            addCriterion("work_report_user_name not like", value, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameIn(List<String> values) {
            addCriterion("work_report_user_name in", values, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameNotIn(List<String> values) {
            addCriterion("work_report_user_name not in", values, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameBetween(String value1, String value2) {
            addCriterion("work_report_user_name between", value1, value2, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportUserNameNotBetween(String value1, String value2) {
            addCriterion("work_report_user_name not between", value1, value2, "workReportUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdIsNull() {
            addCriterion("reviews_user_id is null");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdIsNotNull() {
            addCriterion("reviews_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdEqualTo(String value) {
            addCriterion("reviews_user_id =", value, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdNotEqualTo(String value) {
            addCriterion("reviews_user_id <>", value, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdGreaterThan(String value) {
            addCriterion("reviews_user_id >", value, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("reviews_user_id >=", value, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdLessThan(String value) {
            addCriterion("reviews_user_id <", value, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdLessThanOrEqualTo(String value) {
            addCriterion("reviews_user_id <=", value, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdLike(String value) {
            addCriterion("reviews_user_id like", value, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdNotLike(String value) {
            addCriterion("reviews_user_id not like", value, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdIn(List<String> values) {
            addCriterion("reviews_user_id in", values, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdNotIn(List<String> values) {
            addCriterion("reviews_user_id not in", values, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdBetween(String value1, String value2) {
            addCriterion("reviews_user_id between", value1, value2, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserIdNotBetween(String value1, String value2) {
            addCriterion("reviews_user_id not between", value1, value2, "reviewsUserId");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameIsNull() {
            addCriterion("reviews_user_name is null");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameIsNotNull() {
            addCriterion("reviews_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameEqualTo(String value) {
            addCriterion("reviews_user_name =", value, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameNotEqualTo(String value) {
            addCriterion("reviews_user_name <>", value, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameGreaterThan(String value) {
            addCriterion("reviews_user_name >", value, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("reviews_user_name >=", value, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameLessThan(String value) {
            addCriterion("reviews_user_name <", value, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameLessThanOrEqualTo(String value) {
            addCriterion("reviews_user_name <=", value, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameLike(String value) {
            addCriterion("reviews_user_name like", value, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameNotLike(String value) {
            addCriterion("reviews_user_name not like", value, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameIn(List<String> values) {
            addCriterion("reviews_user_name in", values, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameNotIn(List<String> values) {
            addCriterion("reviews_user_name not in", values, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameBetween(String value1, String value2) {
            addCriterion("reviews_user_name between", value1, value2, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andReviewsUserNameNotBetween(String value1, String value2) {
            addCriterion("reviews_user_name not between", value1, value2, "reviewsUserName");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeIsNull() {
            addCriterion("work_report_type is null");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeIsNotNull() {
            addCriterion("work_report_type is not null");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeEqualTo(Integer value) {
            addCriterion("work_report_type =", value, "workReportType");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeNotEqualTo(Integer value) {
            addCriterion("work_report_type <>", value, "workReportType");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeGreaterThan(Integer value) {
            addCriterion("work_report_type >", value, "workReportType");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_report_type >=", value, "workReportType");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeLessThan(Integer value) {
            addCriterion("work_report_type <", value, "workReportType");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeLessThanOrEqualTo(Integer value) {
            addCriterion("work_report_type <=", value, "workReportType");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeIn(List<Integer> values) {
            addCriterion("work_report_type in", values, "workReportType");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeNotIn(List<Integer> values) {
            addCriterion("work_report_type not in", values, "workReportType");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeBetween(Integer value1, Integer value2) {
            addCriterion("work_report_type between", value1, value2, "workReportType");
            return (Criteria) this;
        }

        public Criteria andWorkReportTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("work_report_type not between", value1, value2, "workReportType");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateIsNull() {
            addCriterion("work_report_created_date is null");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateIsNotNull() {
            addCriterion("work_report_created_date is not null");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateEqualTo(Date value) {
            addCriterion("work_report_created_date =", value, "workReportCreatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateNotEqualTo(Date value) {
            addCriterion("work_report_created_date <>", value, "workReportCreatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateGreaterThan(Date value) {
            addCriterion("work_report_created_date >", value, "workReportCreatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("work_report_created_date >=", value, "workReportCreatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateLessThan(Date value) {
            addCriterion("work_report_created_date <", value, "workReportCreatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateLessThanOrEqualTo(Date value) {
            addCriterion("work_report_created_date <=", value, "workReportCreatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateIn(List<Date> values) {
            addCriterion("work_report_created_date in", values, "workReportCreatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateNotIn(List<Date> values) {
            addCriterion("work_report_created_date not in", values, "workReportCreatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateBetween(Date value1, Date value2) {
            addCriterion("work_report_created_date between", value1, value2, "workReportCreatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportCreatedDateNotBetween(Date value1, Date value2) {
            addCriterion("work_report_created_date not between", value1, value2, "workReportCreatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateIsNull() {
            addCriterion("work_report_updated_date is null");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateIsNotNull() {
            addCriterion("work_report_updated_date is not null");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateEqualTo(Date value) {
            addCriterion("work_report_updated_date =", value, "workReportUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateNotEqualTo(Date value) {
            addCriterion("work_report_updated_date <>", value, "workReportUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateGreaterThan(Date value) {
            addCriterion("work_report_updated_date >", value, "workReportUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateGreaterThanOrEqualTo(Date value) {
            addCriterion("work_report_updated_date >=", value, "workReportUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateLessThan(Date value) {
            addCriterion("work_report_updated_date <", value, "workReportUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateLessThanOrEqualTo(Date value) {
            addCriterion("work_report_updated_date <=", value, "workReportUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateIn(List<Date> values) {
            addCriterion("work_report_updated_date in", values, "workReportUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateNotIn(List<Date> values) {
            addCriterion("work_report_updated_date not in", values, "workReportUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateBetween(Date value1, Date value2) {
            addCriterion("work_report_updated_date between", value1, value2, "workReportUpdatedDate");
            return (Criteria) this;
        }

        public Criteria andWorkReportUpdatedDateNotBetween(Date value1, Date value2) {
            addCriterion("work_report_updated_date not between", value1, value2, "workReportUpdatedDate");
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