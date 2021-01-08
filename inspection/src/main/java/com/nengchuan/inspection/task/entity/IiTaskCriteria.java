package com.nengchuan.inspection.task.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IiTaskCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IiTaskCriteria() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNull() {
            addCriterion("station_type is null");
            return (Criteria) this;
        }

        public Criteria andStationTypeIsNotNull() {
            addCriterion("station_type is not null");
            return (Criteria) this;
        }

        public Criteria andStationTypeEqualTo(String value) {
            addCriterion("station_type =", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotEqualTo(String value) {
            addCriterion("station_type <>", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThan(String value) {
            addCriterion("station_type >", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeGreaterThanOrEqualTo(String value) {
            addCriterion("station_type >=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThan(String value) {
            addCriterion("station_type <", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLessThanOrEqualTo(String value) {
            addCriterion("station_type <=", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeLike(String value) {
            addCriterion("station_type like", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotLike(String value) {
            addCriterion("station_type not like", value, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeIn(List<String> values) {
            addCriterion("station_type in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotIn(List<String> values) {
            addCriterion("station_type not in", values, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeBetween(String value1, String value2) {
            addCriterion("station_type between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationTypeNotBetween(String value1, String value2) {
            addCriterion("station_type not between", value1, value2, "stationType");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNull() {
            addCriterion("station_id is null");
            return (Criteria) this;
        }

        public Criteria andStationIdIsNotNull() {
            addCriterion("station_id is not null");
            return (Criteria) this;
        }

        public Criteria andStationIdEqualTo(String value) {
            addCriterion("station_id =", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotEqualTo(String value) {
            addCriterion("station_id <>", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThan(String value) {
            addCriterion("station_id >", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdGreaterThanOrEqualTo(String value) {
            addCriterion("station_id >=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThan(String value) {
            addCriterion("station_id <", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLessThanOrEqualTo(String value) {
            addCriterion("station_id <=", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdLike(String value) {
            addCriterion("station_id like", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotLike(String value) {
            addCriterion("station_id not like", value, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdIn(List<String> values) {
            addCriterion("station_id in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotIn(List<String> values) {
            addCriterion("station_id not in", values, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdBetween(String value1, String value2) {
            addCriterion("station_id between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationIdNotBetween(String value1, String value2) {
            addCriterion("station_id not between", value1, value2, "stationId");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNull() {
            addCriterion("station_name is null");
            return (Criteria) this;
        }

        public Criteria andStationNameIsNotNull() {
            addCriterion("station_name is not null");
            return (Criteria) this;
        }

        public Criteria andStationNameEqualTo(String value) {
            addCriterion("station_name =", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotEqualTo(String value) {
            addCriterion("station_name <>", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThan(String value) {
            addCriterion("station_name >", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameGreaterThanOrEqualTo(String value) {
            addCriterion("station_name >=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThan(String value) {
            addCriterion("station_name <", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLessThanOrEqualTo(String value) {
            addCriterion("station_name <=", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameLike(String value) {
            addCriterion("station_name like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotLike(String value) {
            addCriterion("station_name not like", value, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameIn(List<String> values) {
            addCriterion("station_name in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotIn(List<String> values) {
            addCriterion("station_name not in", values, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameBetween(String value1, String value2) {
            addCriterion("station_name between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andStationNameNotBetween(String value1, String value2) {
            addCriterion("station_name not between", value1, value2, "stationName");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdIsNull() {
            addCriterion("superior_id is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdIsNotNull() {
            addCriterion("superior_id is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdEqualTo(String value) {
            addCriterion("superior_id =", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotEqualTo(String value) {
            addCriterion("superior_id <>", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdGreaterThan(String value) {
            addCriterion("superior_id >", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdGreaterThanOrEqualTo(String value) {
            addCriterion("superior_id >=", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdLessThan(String value) {
            addCriterion("superior_id <", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdLessThanOrEqualTo(String value) {
            addCriterion("superior_id <=", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdLike(String value) {
            addCriterion("superior_id like", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotLike(String value) {
            addCriterion("superior_id not like", value, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdIn(List<String> values) {
            addCriterion("superior_id in", values, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotIn(List<String> values) {
            addCriterion("superior_id not in", values, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdBetween(String value1, String value2) {
            addCriterion("superior_id between", value1, value2, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorIdNotBetween(String value1, String value2) {
            addCriterion("superior_id not between", value1, value2, "superiorId");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameIsNull() {
            addCriterion("superior_name is null");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameIsNotNull() {
            addCriterion("superior_name is not null");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameEqualTo(String value) {
            addCriterion("superior_name =", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameNotEqualTo(String value) {
            addCriterion("superior_name <>", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameGreaterThan(String value) {
            addCriterion("superior_name >", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameGreaterThanOrEqualTo(String value) {
            addCriterion("superior_name >=", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameLessThan(String value) {
            addCriterion("superior_name <", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameLessThanOrEqualTo(String value) {
            addCriterion("superior_name <=", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameLike(String value) {
            addCriterion("superior_name like", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameNotLike(String value) {
            addCriterion("superior_name not like", value, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameIn(List<String> values) {
            addCriterion("superior_name in", values, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameNotIn(List<String> values) {
            addCriterion("superior_name not in", values, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameBetween(String value1, String value2) {
            addCriterion("superior_name between", value1, value2, "superiorName");
            return (Criteria) this;
        }

        public Criteria andSuperiorNameNotBetween(String value1, String value2) {
            addCriterion("superior_name not between", value1, value2, "superiorName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNull() {
            addCriterion("task_name is null");
            return (Criteria) this;
        }

        public Criteria andTaskNameIsNotNull() {
            addCriterion("task_name is not null");
            return (Criteria) this;
        }

        public Criteria andTaskNameEqualTo(String value) {
            addCriterion("task_name =", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotEqualTo(String value) {
            addCriterion("task_name <>", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThan(String value) {
            addCriterion("task_name >", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameGreaterThanOrEqualTo(String value) {
            addCriterion("task_name >=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThan(String value) {
            addCriterion("task_name <", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLessThanOrEqualTo(String value) {
            addCriterion("task_name <=", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameLike(String value) {
            addCriterion("task_name like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotLike(String value) {
            addCriterion("task_name not like", value, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameIn(List<String> values) {
            addCriterion("task_name in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotIn(List<String> values) {
            addCriterion("task_name not in", values, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameBetween(String value1, String value2) {
            addCriterion("task_name between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTaskNameNotBetween(String value1, String value2) {
            addCriterion("task_name not between", value1, value2, "taskName");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(String value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(String value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(String value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(String value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(String value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(String value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLike(String value) {
            addCriterion("type_id like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotLike(String value) {
            addCriterion("type_id not like", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<String> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<String> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(String value1, String value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(String value1, String value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNull() {
            addCriterion("type_name is null");
            return (Criteria) this;
        }

        public Criteria andTypeNameIsNotNull() {
            addCriterion("type_name is not null");
            return (Criteria) this;
        }

        public Criteria andTypeNameEqualTo(String value) {
            addCriterion("type_name =", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotEqualTo(String value) {
            addCriterion("type_name <>", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThan(String value) {
            addCriterion("type_name >", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameGreaterThanOrEqualTo(String value) {
            addCriterion("type_name >=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThan(String value) {
            addCriterion("type_name <", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLessThanOrEqualTo(String value) {
            addCriterion("type_name <=", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameLike(String value) {
            addCriterion("type_name like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotLike(String value) {
            addCriterion("type_name not like", value, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameIn(List<String> values) {
            addCriterion("type_name in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotIn(List<String> values) {
            addCriterion("type_name not in", values, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameBetween(String value1, String value2) {
            addCriterion("type_name between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andTypeNameNotBetween(String value1, String value2) {
            addCriterion("type_name not between", value1, value2, "typeName");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeIsNull() {
            addCriterion("execution_time is null");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeIsNotNull() {
            addCriterion("execution_time is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeEqualTo(Date value) {
            addCriterion("execution_time =", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeNotEqualTo(Date value) {
            addCriterion("execution_time <>", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeGreaterThan(Date value) {
            addCriterion("execution_time >", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("execution_time >=", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeLessThan(Date value) {
            addCriterion("execution_time <", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeLessThanOrEqualTo(Date value) {
            addCriterion("execution_time <=", value, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeIn(List<Date> values) {
            addCriterion("execution_time in", values, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeNotIn(List<Date> values) {
            addCriterion("execution_time not in", values, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeBetween(Date value1, Date value2) {
            addCriterion("execution_time between", value1, value2, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionTimeNotBetween(Date value1, Date value2) {
            addCriterion("execution_time not between", value1, value2, "executionTime");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdIsNull() {
            addCriterion("execution_fun_id is null");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdIsNotNull() {
            addCriterion("execution_fun_id is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdEqualTo(String value) {
            addCriterion("execution_fun_id =", value, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdNotEqualTo(String value) {
            addCriterion("execution_fun_id <>", value, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdGreaterThan(String value) {
            addCriterion("execution_fun_id >", value, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdGreaterThanOrEqualTo(String value) {
            addCriterion("execution_fun_id >=", value, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdLessThan(String value) {
            addCriterion("execution_fun_id <", value, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdLessThanOrEqualTo(String value) {
            addCriterion("execution_fun_id <=", value, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdLike(String value) {
            addCriterion("execution_fun_id like", value, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdNotLike(String value) {
            addCriterion("execution_fun_id not like", value, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdIn(List<String> values) {
            addCriterion("execution_fun_id in", values, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdNotIn(List<String> values) {
            addCriterion("execution_fun_id not in", values, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdBetween(String value1, String value2) {
            addCriterion("execution_fun_id between", value1, value2, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunIdNotBetween(String value1, String value2) {
            addCriterion("execution_fun_id not between", value1, value2, "executionFunId");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameIsNull() {
            addCriterion("execution_fun_name is null");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameIsNotNull() {
            addCriterion("execution_fun_name is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameEqualTo(String value) {
            addCriterion("execution_fun_name =", value, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameNotEqualTo(String value) {
            addCriterion("execution_fun_name <>", value, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameGreaterThan(String value) {
            addCriterion("execution_fun_name >", value, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameGreaterThanOrEqualTo(String value) {
            addCriterion("execution_fun_name >=", value, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameLessThan(String value) {
            addCriterion("execution_fun_name <", value, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameLessThanOrEqualTo(String value) {
            addCriterion("execution_fun_name <=", value, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameLike(String value) {
            addCriterion("execution_fun_name like", value, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameNotLike(String value) {
            addCriterion("execution_fun_name not like", value, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameIn(List<String> values) {
            addCriterion("execution_fun_name in", values, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameNotIn(List<String> values) {
            addCriterion("execution_fun_name not in", values, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameBetween(String value1, String value2) {
            addCriterion("execution_fun_name between", value1, value2, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionFunNameNotBetween(String value1, String value2) {
            addCriterion("execution_fun_name not between", value1, value2, "executionFunName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdIsNull() {
            addCriterion("execution_state_id is null");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdIsNotNull() {
            addCriterion("execution_state_id is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdEqualTo(String value) {
            addCriterion("execution_state_id =", value, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdNotEqualTo(String value) {
            addCriterion("execution_state_id <>", value, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdGreaterThan(String value) {
            addCriterion("execution_state_id >", value, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdGreaterThanOrEqualTo(String value) {
            addCriterion("execution_state_id >=", value, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdLessThan(String value) {
            addCriterion("execution_state_id <", value, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdLessThanOrEqualTo(String value) {
            addCriterion("execution_state_id <=", value, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdLike(String value) {
            addCriterion("execution_state_id like", value, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdNotLike(String value) {
            addCriterion("execution_state_id not like", value, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdIn(List<String> values) {
            addCriterion("execution_state_id in", values, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdNotIn(List<String> values) {
            addCriterion("execution_state_id not in", values, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdBetween(String value1, String value2) {
            addCriterion("execution_state_id between", value1, value2, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateIdNotBetween(String value1, String value2) {
            addCriterion("execution_state_id not between", value1, value2, "executionStateId");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameIsNull() {
            addCriterion("execution_state_name is null");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameIsNotNull() {
            addCriterion("execution_state_name is not null");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameEqualTo(String value) {
            addCriterion("execution_state_name =", value, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameNotEqualTo(String value) {
            addCriterion("execution_state_name <>", value, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameGreaterThan(String value) {
            addCriterion("execution_state_name >", value, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameGreaterThanOrEqualTo(String value) {
            addCriterion("execution_state_name >=", value, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameLessThan(String value) {
            addCriterion("execution_state_name <", value, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameLessThanOrEqualTo(String value) {
            addCriterion("execution_state_name <=", value, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameLike(String value) {
            addCriterion("execution_state_name like", value, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameNotLike(String value) {
            addCriterion("execution_state_name not like", value, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameIn(List<String> values) {
            addCriterion("execution_state_name in", values, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameNotIn(List<String> values) {
            addCriterion("execution_state_name not in", values, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameBetween(String value1, String value2) {
            addCriterion("execution_state_name between", value1, value2, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andExecutionStateNameNotBetween(String value1, String value2) {
            addCriterion("execution_state_name not between", value1, value2, "executionStateName");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalIsNull() {
            addCriterion("is_abnormal is null");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalIsNotNull() {
            addCriterion("is_abnormal is not null");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalEqualTo(String value) {
            addCriterion("is_abnormal =", value, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalNotEqualTo(String value) {
            addCriterion("is_abnormal <>", value, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalGreaterThan(String value) {
            addCriterion("is_abnormal >", value, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalGreaterThanOrEqualTo(String value) {
            addCriterion("is_abnormal >=", value, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalLessThan(String value) {
            addCriterion("is_abnormal <", value, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalLessThanOrEqualTo(String value) {
            addCriterion("is_abnormal <=", value, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalLike(String value) {
            addCriterion("is_abnormal like", value, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalNotLike(String value) {
            addCriterion("is_abnormal not like", value, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalIn(List<String> values) {
            addCriterion("is_abnormal in", values, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalNotIn(List<String> values) {
            addCriterion("is_abnormal not in", values, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalBetween(String value1, String value2) {
            addCriterion("is_abnormal between", value1, value2, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andIsAbnormalNotBetween(String value1, String value2) {
            addCriterion("is_abnormal not between", value1, value2, "isAbnormal");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNull() {
            addCriterion("create_id is null");
            return (Criteria) this;
        }

        public Criteria andCreateIdIsNotNull() {
            addCriterion("create_id is not null");
            return (Criteria) this;
        }

        public Criteria andCreateIdEqualTo(String value) {
            addCriterion("create_id =", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotEqualTo(String value) {
            addCriterion("create_id <>", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThan(String value) {
            addCriterion("create_id >", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdGreaterThanOrEqualTo(String value) {
            addCriterion("create_id >=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThan(String value) {
            addCriterion("create_id <", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLessThanOrEqualTo(String value) {
            addCriterion("create_id <=", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdLike(String value) {
            addCriterion("create_id like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotLike(String value) {
            addCriterion("create_id not like", value, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdIn(List<String> values) {
            addCriterion("create_id in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotIn(List<String> values) {
            addCriterion("create_id not in", values, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdBetween(String value1, String value2) {
            addCriterion("create_id between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateIdNotBetween(String value1, String value2) {
            addCriterion("create_id not between", value1, value2, "createId");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNull() {
            addCriterion("create_name is null");
            return (Criteria) this;
        }

        public Criteria andCreateNameIsNotNull() {
            addCriterion("create_name is not null");
            return (Criteria) this;
        }

        public Criteria andCreateNameEqualTo(String value) {
            addCriterion("create_name =", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotEqualTo(String value) {
            addCriterion("create_name <>", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThan(String value) {
            addCriterion("create_name >", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameGreaterThanOrEqualTo(String value) {
            addCriterion("create_name >=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThan(String value) {
            addCriterion("create_name <", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLessThanOrEqualTo(String value) {
            addCriterion("create_name <=", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameLike(String value) {
            addCriterion("create_name like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotLike(String value) {
            addCriterion("create_name not like", value, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameIn(List<String> values) {
            addCriterion("create_name in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotIn(List<String> values) {
            addCriterion("create_name not in", values, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameBetween(String value1, String value2) {
            addCriterion("create_name between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateNameNotBetween(String value1, String value2) {
            addCriterion("create_name not between", value1, value2, "createName");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andModifyIdIsNull() {
            addCriterion("modify_id is null");
            return (Criteria) this;
        }

        public Criteria andModifyIdIsNotNull() {
            addCriterion("modify_id is not null");
            return (Criteria) this;
        }

        public Criteria andModifyIdEqualTo(String value) {
            addCriterion("modify_id =", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotEqualTo(String value) {
            addCriterion("modify_id <>", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdGreaterThan(String value) {
            addCriterion("modify_id >", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdGreaterThanOrEqualTo(String value) {
            addCriterion("modify_id >=", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdLessThan(String value) {
            addCriterion("modify_id <", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdLessThanOrEqualTo(String value) {
            addCriterion("modify_id <=", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdLike(String value) {
            addCriterion("modify_id like", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotLike(String value) {
            addCriterion("modify_id not like", value, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdIn(List<String> values) {
            addCriterion("modify_id in", values, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotIn(List<String> values) {
            addCriterion("modify_id not in", values, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdBetween(String value1, String value2) {
            addCriterion("modify_id between", value1, value2, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyIdNotBetween(String value1, String value2) {
            addCriterion("modify_id not between", value1, value2, "modifyId");
            return (Criteria) this;
        }

        public Criteria andModifyNameIsNull() {
            addCriterion("modify_name is null");
            return (Criteria) this;
        }

        public Criteria andModifyNameIsNotNull() {
            addCriterion("modify_name is not null");
            return (Criteria) this;
        }

        public Criteria andModifyNameEqualTo(String value) {
            addCriterion("modify_name =", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotEqualTo(String value) {
            addCriterion("modify_name <>", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameGreaterThan(String value) {
            addCriterion("modify_name >", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameGreaterThanOrEqualTo(String value) {
            addCriterion("modify_name >=", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLessThan(String value) {
            addCriterion("modify_name <", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLessThanOrEqualTo(String value) {
            addCriterion("modify_name <=", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameLike(String value) {
            addCriterion("modify_name like", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotLike(String value) {
            addCriterion("modify_name not like", value, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameIn(List<String> values) {
            addCriterion("modify_name in", values, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotIn(List<String> values) {
            addCriterion("modify_name not in", values, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameBetween(String value1, String value2) {
            addCriterion("modify_name between", value1, value2, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyNameNotBetween(String value1, String value2) {
            addCriterion("modify_name not between", value1, value2, "modifyName");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNull() {
            addCriterion("modify_time is null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIsNotNull() {
            addCriterion("modify_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifyTimeEqualTo(Date value) {
            addCriterion("modify_time =", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotEqualTo(Date value) {
            addCriterion("modify_time <>", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThan(Date value) {
            addCriterion("modify_time >", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_time >=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThan(Date value) {
            addCriterion("modify_time <", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeLessThanOrEqualTo(Date value) {
            addCriterion("modify_time <=", value, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeIn(List<Date> values) {
            addCriterion("modify_time in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotIn(List<Date> values) {
            addCriterion("modify_time not in", values, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeBetween(Date value1, Date value2) {
            addCriterion("modify_time between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andModifyTimeNotBetween(Date value1, Date value2) {
            addCriterion("modify_time not between", value1, value2, "modifyTime");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIsNull() {
            addCriterion("delete_state is null");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIsNotNull() {
            addCriterion("delete_state is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteStateEqualTo(String value) {
            addCriterion("delete_state =", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotEqualTo(String value) {
            addCriterion("delete_state <>", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateGreaterThan(String value) {
            addCriterion("delete_state >", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateGreaterThanOrEqualTo(String value) {
            addCriterion("delete_state >=", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLessThan(String value) {
            addCriterion("delete_state <", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLessThanOrEqualTo(String value) {
            addCriterion("delete_state <=", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateLike(String value) {
            addCriterion("delete_state like", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotLike(String value) {
            addCriterion("delete_state not like", value, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateIn(List<String> values) {
            addCriterion("delete_state in", values, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotIn(List<String> values) {
            addCriterion("delete_state not in", values, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateBetween(String value1, String value2) {
            addCriterion("delete_state between", value1, value2, "deleteState");
            return (Criteria) this;
        }

        public Criteria andDeleteStateNotBetween(String value1, String value2) {
            addCriterion("delete_state not between", value1, value2, "deleteState");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNull() {
            addCriterion("route_id is null");
            return (Criteria) this;
        }

        public Criteria andRouteIdIsNotNull() {
            addCriterion("route_id is not null");
            return (Criteria) this;
        }

        public Criteria andRouteIdEqualTo(String value) {
            addCriterion("route_id =", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotEqualTo(String value) {
            addCriterion("route_id <>", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThan(String value) {
            addCriterion("route_id >", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdGreaterThanOrEqualTo(String value) {
            addCriterion("route_id >=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThan(String value) {
            addCriterion("route_id <", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLessThanOrEqualTo(String value) {
            addCriterion("route_id <=", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdLike(String value) {
            addCriterion("route_id like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotLike(String value) {
            addCriterion("route_id not like", value, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdIn(List<String> values) {
            addCriterion("route_id in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotIn(List<String> values) {
            addCriterion("route_id not in", values, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdBetween(String value1, String value2) {
            addCriterion("route_id between", value1, value2, "routeId");
            return (Criteria) this;
        }

        public Criteria andRouteIdNotBetween(String value1, String value2) {
            addCriterion("route_id not between", value1, value2, "routeId");
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