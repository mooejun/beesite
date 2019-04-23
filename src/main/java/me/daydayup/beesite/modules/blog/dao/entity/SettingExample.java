package me.daydayup.beesite.modules.blog.dao.entity;

import java.util.ArrayList;
import java.util.List;

public class SettingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SettingExample() {
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

        public Criteria andSiteNameIsNull() {
            addCriterion("site_name is null");
            return (Criteria) this;
        }

        public Criteria andSiteNameIsNotNull() {
            addCriterion("site_name is not null");
            return (Criteria) this;
        }

        public Criteria andSiteNameEqualTo(String value) {
            addCriterion("site_name =", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotEqualTo(String value) {
            addCriterion("site_name <>", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThan(String value) {
            addCriterion("site_name >", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameGreaterThanOrEqualTo(String value) {
            addCriterion("site_name >=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThan(String value) {
            addCriterion("site_name <", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLessThanOrEqualTo(String value) {
            addCriterion("site_name <=", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameLike(String value) {
            addCriterion("site_name like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotLike(String value) {
            addCriterion("site_name not like", value, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameIn(List<String> values) {
            addCriterion("site_name in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotIn(List<String> values) {
            addCriterion("site_name not in", values, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameBetween(String value1, String value2) {
            addCriterion("site_name between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteNameNotBetween(String value1, String value2) {
            addCriterion("site_name not between", value1, value2, "siteName");
            return (Criteria) this;
        }

        public Criteria andSiteDonationIsNull() {
            addCriterion("site_donation is null");
            return (Criteria) this;
        }

        public Criteria andSiteDonationIsNotNull() {
            addCriterion("site_donation is not null");
            return (Criteria) this;
        }

        public Criteria andSiteDonationEqualTo(String value) {
            addCriterion("site_donation =", value, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationNotEqualTo(String value) {
            addCriterion("site_donation <>", value, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationGreaterThan(String value) {
            addCriterion("site_donation >", value, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationGreaterThanOrEqualTo(String value) {
            addCriterion("site_donation >=", value, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationLessThan(String value) {
            addCriterion("site_donation <", value, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationLessThanOrEqualTo(String value) {
            addCriterion("site_donation <=", value, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationLike(String value) {
            addCriterion("site_donation like", value, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationNotLike(String value) {
            addCriterion("site_donation not like", value, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationIn(List<String> values) {
            addCriterion("site_donation in", values, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationNotIn(List<String> values) {
            addCriterion("site_donation not in", values, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationBetween(String value1, String value2) {
            addCriterion("site_donation between", value1, value2, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteDonationNotBetween(String value1, String value2) {
            addCriterion("site_donation not between", value1, value2, "siteDonation");
            return (Criteria) this;
        }

        public Criteria andSiteMusicIsNull() {
            addCriterion("site_music is null");
            return (Criteria) this;
        }

        public Criteria andSiteMusicIsNotNull() {
            addCriterion("site_music is not null");
            return (Criteria) this;
        }

        public Criteria andSiteMusicEqualTo(String value) {
            addCriterion("site_music =", value, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicNotEqualTo(String value) {
            addCriterion("site_music <>", value, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicGreaterThan(String value) {
            addCriterion("site_music >", value, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicGreaterThanOrEqualTo(String value) {
            addCriterion("site_music >=", value, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicLessThan(String value) {
            addCriterion("site_music <", value, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicLessThanOrEqualTo(String value) {
            addCriterion("site_music <=", value, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicLike(String value) {
            addCriterion("site_music like", value, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicNotLike(String value) {
            addCriterion("site_music not like", value, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicIn(List<String> values) {
            addCriterion("site_music in", values, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicNotIn(List<String> values) {
            addCriterion("site_music not in", values, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicBetween(String value1, String value2) {
            addCriterion("site_music between", value1, value2, "siteMusic");
            return (Criteria) this;
        }

        public Criteria andSiteMusicNotBetween(String value1, String value2) {
            addCriterion("site_music not between", value1, value2, "siteMusic");
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