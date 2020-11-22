package cn.rjxy.mypet.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PetExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PetExample() {
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

        public Criteria andPetNameIsNull() {
            addCriterion("pet_name is null");
            return (Criteria) this;
        }

        public Criteria andPetNameIsNotNull() {
            addCriterion("pet_name is not null");
            return (Criteria) this;
        }

        public Criteria andPetNameEqualTo(String value) {
            addCriterion("pet_name =", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotEqualTo(String value) {
            addCriterion("pet_name <>", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameGreaterThan(String value) {
            addCriterion("pet_name >", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameGreaterThanOrEqualTo(String value) {
            addCriterion("pet_name >=", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLessThan(String value) {
            addCriterion("pet_name <", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLessThanOrEqualTo(String value) {
            addCriterion("pet_name <=", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameLike(String value) {
            addCriterion("pet_name like", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotLike(String value) {
            addCriterion("pet_name not like", value, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameIn(List<String> values) {
            addCriterion("pet_name in", values, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotIn(List<String> values) {
            addCriterion("pet_name not in", values, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameBetween(String value1, String value2) {
            addCriterion("pet_name between", value1, value2, "petName");
            return (Criteria) this;
        }

        public Criteria andPetNameNotBetween(String value1, String value2) {
            addCriterion("pet_name not between", value1, value2, "petName");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayIsNull() {
            addCriterion("pet_birthday is null");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayIsNotNull() {
            addCriterion("pet_birthday is not null");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayEqualTo(Date value) {
            addCriterion("pet_birthday =", value, "petBirthday");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayNotEqualTo(Date value) {
            addCriterion("pet_birthday <>", value, "petBirthday");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayGreaterThan(Date value) {
            addCriterion("pet_birthday >", value, "petBirthday");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("pet_birthday >=", value, "petBirthday");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayLessThan(Date value) {
            addCriterion("pet_birthday <", value, "petBirthday");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("pet_birthday <=", value, "petBirthday");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayIn(List<Date> values) {
            addCriterion("pet_birthday in", values, "petBirthday");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayNotIn(List<Date> values) {
            addCriterion("pet_birthday not in", values, "petBirthday");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayBetween(Date value1, Date value2) {
            addCriterion("pet_birthday between", value1, value2, "petBirthday");
            return (Criteria) this;
        }

        public Criteria andPetBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("pet_birthday not between", value1, value2, "petBirthday");
            return (Criteria) this;
        }

        public Criteria andPetAgeIsNull() {
            addCriterion("pet_age is null");
            return (Criteria) this;
        }

        public Criteria andPetAgeIsNotNull() {
            addCriterion("pet_age is not null");
            return (Criteria) this;
        }

        public Criteria andPetAgeEqualTo(String value) {
            addCriterion("pet_age =", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeNotEqualTo(String value) {
            addCriterion("pet_age <>", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeGreaterThan(String value) {
            addCriterion("pet_age >", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeGreaterThanOrEqualTo(String value) {
            addCriterion("pet_age >=", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeLessThan(String value) {
            addCriterion("pet_age <", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeLessThanOrEqualTo(String value) {
            addCriterion("pet_age <=", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeLike(String value) {
            addCriterion("pet_age like", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeNotLike(String value) {
            addCriterion("pet_age not like", value, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeIn(List<String> values) {
            addCriterion("pet_age in", values, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeNotIn(List<String> values) {
            addCriterion("pet_age not in", values, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeBetween(String value1, String value2) {
            addCriterion("pet_age between", value1, value2, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetAgeNotBetween(String value1, String value2) {
            addCriterion("pet_age not between", value1, value2, "petAge");
            return (Criteria) this;
        }

        public Criteria andPetSexIsNull() {
            addCriterion("pet_sex is null");
            return (Criteria) this;
        }

        public Criteria andPetSexIsNotNull() {
            addCriterion("pet_sex is not null");
            return (Criteria) this;
        }

        public Criteria andPetSexEqualTo(Integer value) {
            addCriterion("pet_sex =", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotEqualTo(Integer value) {
            addCriterion("pet_sex <>", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexGreaterThan(Integer value) {
            addCriterion("pet_sex >", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_sex >=", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexLessThan(Integer value) {
            addCriterion("pet_sex <", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexLessThanOrEqualTo(Integer value) {
            addCriterion("pet_sex <=", value, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexIn(List<Integer> values) {
            addCriterion("pet_sex in", values, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotIn(List<Integer> values) {
            addCriterion("pet_sex not in", values, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexBetween(Integer value1, Integer value2) {
            addCriterion("pet_sex between", value1, value2, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetSexNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_sex not between", value1, value2, "petSex");
            return (Criteria) this;
        }

        public Criteria andPetDescribeIsNull() {
            addCriterion("pet_describe is null");
            return (Criteria) this;
        }

        public Criteria andPetDescribeIsNotNull() {
            addCriterion("pet_describe is not null");
            return (Criteria) this;
        }

        public Criteria andPetDescribeEqualTo(String value) {
            addCriterion("pet_describe =", value, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeNotEqualTo(String value) {
            addCriterion("pet_describe <>", value, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeGreaterThan(String value) {
            addCriterion("pet_describe >", value, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeGreaterThanOrEqualTo(String value) {
            addCriterion("pet_describe >=", value, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeLessThan(String value) {
            addCriterion("pet_describe <", value, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeLessThanOrEqualTo(String value) {
            addCriterion("pet_describe <=", value, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeLike(String value) {
            addCriterion("pet_describe like", value, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeNotLike(String value) {
            addCriterion("pet_describe not like", value, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeIn(List<String> values) {
            addCriterion("pet_describe in", values, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeNotIn(List<String> values) {
            addCriterion("pet_describe not in", values, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeBetween(String value1, String value2) {
            addCriterion("pet_describe between", value1, value2, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetDescribeNotBetween(String value1, String value2) {
            addCriterion("pet_describe not between", value1, value2, "petDescribe");
            return (Criteria) this;
        }

        public Criteria andPetStateIsNull() {
            addCriterion("pet_state is null");
            return (Criteria) this;
        }

        public Criteria andPetStateIsNotNull() {
            addCriterion("pet_state is not null");
            return (Criteria) this;
        }

        public Criteria andPetStateEqualTo(Integer value) {
            addCriterion("pet_state =", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateNotEqualTo(Integer value) {
            addCriterion("pet_state <>", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateGreaterThan(Integer value) {
            addCriterion("pet_state >", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("pet_state >=", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateLessThan(Integer value) {
            addCriterion("pet_state <", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateLessThanOrEqualTo(Integer value) {
            addCriterion("pet_state <=", value, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateIn(List<Integer> values) {
            addCriterion("pet_state in", values, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateNotIn(List<Integer> values) {
            addCriterion("pet_state not in", values, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateBetween(Integer value1, Integer value2) {
            addCriterion("pet_state between", value1, value2, "petState");
            return (Criteria) this;
        }

        public Criteria andPetStateNotBetween(Integer value1, Integer value2) {
            addCriterion("pet_state not between", value1, value2, "petState");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNull() {
            addCriterion("category_code is null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIsNotNull() {
            addCriterion("category_code is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeEqualTo(String value) {
            addCriterion("category_code =", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotEqualTo(String value) {
            addCriterion("category_code <>", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThan(String value) {
            addCriterion("category_code >", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("category_code >=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThan(String value) {
            addCriterion("category_code <", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLessThanOrEqualTo(String value) {
            addCriterion("category_code <=", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeLike(String value) {
            addCriterion("category_code like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotLike(String value) {
            addCriterion("category_code not like", value, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeIn(List<String> values) {
            addCriterion("category_code in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotIn(List<String> values) {
            addCriterion("category_code not in", values, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeBetween(String value1, String value2) {
            addCriterion("category_code between", value1, value2, "categoryCode");
            return (Criteria) this;
        }

        public Criteria andCategoryCodeNotBetween(String value1, String value2) {
            addCriterion("category_code not between", value1, value2, "categoryCode");
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