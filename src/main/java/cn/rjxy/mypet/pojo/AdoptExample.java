package cn.rjxy.mypet.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class AdoptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdoptExample() {
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

        public Criteria andAdoptCodeIsNull() {
            addCriterion("adopt_code is null");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeIsNotNull() {
            addCriterion("adopt_code is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeEqualTo(String value) {
            addCriterion("adopt_code =", value, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeNotEqualTo(String value) {
            addCriterion("adopt_code <>", value, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeGreaterThan(String value) {
            addCriterion("adopt_code >", value, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeGreaterThanOrEqualTo(String value) {
            addCriterion("adopt_code >=", value, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeLessThan(String value) {
            addCriterion("adopt_code <", value, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeLessThanOrEqualTo(String value) {
            addCriterion("adopt_code <=", value, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeLike(String value) {
            addCriterion("adopt_code like", value, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeNotLike(String value) {
            addCriterion("adopt_code not like", value, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeIn(List<String> values) {
            addCriterion("adopt_code in", values, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeNotIn(List<String> values) {
            addCriterion("adopt_code not in", values, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeBetween(String value1, String value2) {
            addCriterion("adopt_code between", value1, value2, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptCodeNotBetween(String value1, String value2) {
            addCriterion("adopt_code not between", value1, value2, "adoptCode");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeIsNull() {
            addCriterion("adopt_time is null");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeIsNotNull() {
            addCriterion("adopt_time is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeEqualTo(Date value) {
            addCriterion("adopt_time =", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeNotEqualTo(Date value) {
            addCriterion("adopt_time <>", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeGreaterThan(Date value) {
            addCriterion("adopt_time >", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("adopt_time >=", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeLessThan(Date value) {
            addCriterion("adopt_time <", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeLessThanOrEqualTo(Date value) {
            addCriterion("adopt_time <=", value, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeIn(List<Date> values) {
            addCriterion("adopt_time in", values, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeNotIn(List<Date> values) {
            addCriterion("adopt_time not in", values, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeBetween(Date value1, Date value2) {
            addCriterion("adopt_time between", value1, value2, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptTimeNotBetween(Date value1, Date value2) {
            addCriterion("adopt_time not between", value1, value2, "adoptTime");
            return (Criteria) this;
        }

        public Criteria andAdoptStateIsNull() {
            addCriterion("adopt_state is null");
            return (Criteria) this;
        }

        public Criteria andAdoptStateIsNotNull() {
            addCriterion("adopt_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdoptStateEqualTo(Integer value) {
            addCriterion("adopt_state =", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateNotEqualTo(Integer value) {
            addCriterion("adopt_state <>", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateGreaterThan(Integer value) {
            addCriterion("adopt_state >", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("adopt_state >=", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateLessThan(Integer value) {
            addCriterion("adopt_state <", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateLessThanOrEqualTo(Integer value) {
            addCriterion("adopt_state <=", value, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateIn(List<Integer> values) {
            addCriterion("adopt_state in", values, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateNotIn(List<Integer> values) {
            addCriterion("adopt_state not in", values, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateBetween(Integer value1, Integer value2) {
            addCriterion("adopt_state between", value1, value2, "adoptState");
            return (Criteria) this;
        }

        public Criteria andAdoptStateNotBetween(Integer value1, Integer value2) {
            addCriterion("adopt_state not between", value1, value2, "adoptState");
            return (Criteria) this;
        }

        public Criteria andPetCodeIsNull() {
            addCriterion("pet_code is null");
            return (Criteria) this;
        }

        public Criteria andPetCodeIsNotNull() {
            addCriterion("pet_code is not null");
            return (Criteria) this;
        }

        public Criteria andPetCodeEqualTo(String value) {
            addCriterion("pet_code =", value, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeNotEqualTo(String value) {
            addCriterion("pet_code <>", value, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeGreaterThan(String value) {
            addCriterion("pet_code >", value, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeGreaterThanOrEqualTo(String value) {
            addCriterion("pet_code >=", value, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeLessThan(String value) {
            addCriterion("pet_code <", value, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeLessThanOrEqualTo(String value) {
            addCriterion("pet_code <=", value, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeLike(String value) {
            addCriterion("pet_code like", value, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeNotLike(String value) {
            addCriterion("pet_code not like", value, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeIn(List<String> values) {
            addCriterion("pet_code in", values, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeNotIn(List<String> values) {
            addCriterion("pet_code not in", values, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeBetween(String value1, String value2) {
            addCriterion("pet_code between", value1, value2, "petCode");
            return (Criteria) this;
        }

        public Criteria andPetCodeNotBetween(String value1, String value2) {
            addCriterion("pet_code not between", value1, value2, "petCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNull() {
            addCriterion("user_code is null");
            return (Criteria) this;
        }

        public Criteria andUserCodeIsNotNull() {
            addCriterion("user_code is not null");
            return (Criteria) this;
        }

        public Criteria andUserCodeEqualTo(String value) {
            addCriterion("user_code =", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotEqualTo(String value) {
            addCriterion("user_code <>", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThan(String value) {
            addCriterion("user_code >", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeGreaterThanOrEqualTo(String value) {
            addCriterion("user_code >=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThan(String value) {
            addCriterion("user_code <", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLessThanOrEqualTo(String value) {
            addCriterion("user_code <=", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeLike(String value) {
            addCriterion("user_code like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotLike(String value) {
            addCriterion("user_code not like", value, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeIn(List<String> values) {
            addCriterion("user_code in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotIn(List<String> values) {
            addCriterion("user_code not in", values, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeBetween(String value1, String value2) {
            addCriterion("user_code between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andUserCodeNotBetween(String value1, String value2) {
            addCriterion("user_code not between", value1, value2, "userCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeIsNull() {
            addCriterion("admin_code is null");
            return (Criteria) this;
        }

        public Criteria andAdminCodeIsNotNull() {
            addCriterion("admin_code is not null");
            return (Criteria) this;
        }

        public Criteria andAdminCodeEqualTo(String value) {
            addCriterion("admin_code =", value, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeNotEqualTo(String value) {
            addCriterion("admin_code <>", value, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeGreaterThan(String value) {
            addCriterion("admin_code >", value, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeGreaterThanOrEqualTo(String value) {
            addCriterion("admin_code >=", value, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeLessThan(String value) {
            addCriterion("admin_code <", value, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeLessThanOrEqualTo(String value) {
            addCriterion("admin_code <=", value, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeLike(String value) {
            addCriterion("admin_code like", value, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeNotLike(String value) {
            addCriterion("admin_code not like", value, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeIn(List<String> values) {
            addCriterion("admin_code in", values, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeNotIn(List<String> values) {
            addCriterion("admin_code not in", values, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeBetween(String value1, String value2) {
            addCriterion("admin_code between", value1, value2, "adminCode");
            return (Criteria) this;
        }

        public Criteria andAdminCodeNotBetween(String value1, String value2) {
            addCriterion("admin_code not between", value1, value2, "adminCode");
            return (Criteria) this;
        }
    }

    /**
     */
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