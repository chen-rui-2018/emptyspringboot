package com.nengchuan.inspection.abnormal.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class IiAbnormalCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public IiAbnormalCriteria() {
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

        public Criteria andVoltageGradeIdIsNull() {
            addCriterion("voltage_grade_id is null");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdIsNotNull() {
            addCriterion("voltage_grade_id is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdEqualTo(String value) {
            addCriterion("voltage_grade_id =", value, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdNotEqualTo(String value) {
            addCriterion("voltage_grade_id <>", value, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdGreaterThan(String value) {
            addCriterion("voltage_grade_id >", value, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdGreaterThanOrEqualTo(String value) {
            addCriterion("voltage_grade_id >=", value, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdLessThan(String value) {
            addCriterion("voltage_grade_id <", value, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdLessThanOrEqualTo(String value) {
            addCriterion("voltage_grade_id <=", value, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdLike(String value) {
            addCriterion("voltage_grade_id like", value, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdNotLike(String value) {
            addCriterion("voltage_grade_id not like", value, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdIn(List<String> values) {
            addCriterion("voltage_grade_id in", values, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdNotIn(List<String> values) {
            addCriterion("voltage_grade_id not in", values, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdBetween(String value1, String value2) {
            addCriterion("voltage_grade_id between", value1, value2, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeIdNotBetween(String value1, String value2) {
            addCriterion("voltage_grade_id not between", value1, value2, "voltageGradeId");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameIsNull() {
            addCriterion("voltage_grade_name is null");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameIsNotNull() {
            addCriterion("voltage_grade_name is not null");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameEqualTo(String value) {
            addCriterion("voltage_grade_name =", value, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameNotEqualTo(String value) {
            addCriterion("voltage_grade_name <>", value, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameGreaterThan(String value) {
            addCriterion("voltage_grade_name >", value, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameGreaterThanOrEqualTo(String value) {
            addCriterion("voltage_grade_name >=", value, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameLessThan(String value) {
            addCriterion("voltage_grade_name <", value, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameLessThanOrEqualTo(String value) {
            addCriterion("voltage_grade_name <=", value, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameLike(String value) {
            addCriterion("voltage_grade_name like", value, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameNotLike(String value) {
            addCriterion("voltage_grade_name not like", value, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameIn(List<String> values) {
            addCriterion("voltage_grade_name in", values, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameNotIn(List<String> values) {
            addCriterion("voltage_grade_name not in", values, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameBetween(String value1, String value2) {
            addCriterion("voltage_grade_name between", value1, value2, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andVoltageGradeNameNotBetween(String value1, String value2) {
            addCriterion("voltage_grade_name not between", value1, value2, "voltageGradeName");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationIsNull() {
            addCriterion("abnormal_situation is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationIsNotNull() {
            addCriterion("abnormal_situation is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationEqualTo(String value) {
            addCriterion("abnormal_situation =", value, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationNotEqualTo(String value) {
            addCriterion("abnormal_situation <>", value, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationGreaterThan(String value) {
            addCriterion("abnormal_situation >", value, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationGreaterThanOrEqualTo(String value) {
            addCriterion("abnormal_situation >=", value, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationLessThan(String value) {
            addCriterion("abnormal_situation <", value, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationLessThanOrEqualTo(String value) {
            addCriterion("abnormal_situation <=", value, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationLike(String value) {
            addCriterion("abnormal_situation like", value, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationNotLike(String value) {
            addCriterion("abnormal_situation not like", value, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationIn(List<String> values) {
            addCriterion("abnormal_situation in", values, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationNotIn(List<String> values) {
            addCriterion("abnormal_situation not in", values, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationBetween(String value1, String value2) {
            addCriterion("abnormal_situation between", value1, value2, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andAbnormalSituationNotBetween(String value1, String value2) {
            addCriterion("abnormal_situation not between", value1, value2, "abnormalSituation");
            return (Criteria) this;
        }

        public Criteria andFindTimeIsNull() {
            addCriterion("find_time is null");
            return (Criteria) this;
        }

        public Criteria andFindTimeIsNotNull() {
            addCriterion("find_time is not null");
            return (Criteria) this;
        }

        public Criteria andFindTimeEqualTo(Date value) {
            addCriterion("find_time =", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeNotEqualTo(Date value) {
            addCriterion("find_time <>", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeGreaterThan(Date value) {
            addCriterion("find_time >", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("find_time >=", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeLessThan(Date value) {
            addCriterion("find_time <", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeLessThanOrEqualTo(Date value) {
            addCriterion("find_time <=", value, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeIn(List<Date> values) {
            addCriterion("find_time in", values, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeNotIn(List<Date> values) {
            addCriterion("find_time not in", values, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeBetween(Date value1, Date value2) {
            addCriterion("find_time between", value1, value2, "findTime");
            return (Criteria) this;
        }

        public Criteria andFindTimeNotBetween(Date value1, Date value2) {
            addCriterion("find_time not between", value1, value2, "findTime");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdIsNull() {
            addCriterion("data_source_id is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdIsNotNull() {
            addCriterion("data_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdEqualTo(String value) {
            addCriterion("data_source_id =", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotEqualTo(String value) {
            addCriterion("data_source_id <>", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdGreaterThan(String value) {
            addCriterion("data_source_id >", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdGreaterThanOrEqualTo(String value) {
            addCriterion("data_source_id >=", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLessThan(String value) {
            addCriterion("data_source_id <", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLessThanOrEqualTo(String value) {
            addCriterion("data_source_id <=", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdLike(String value) {
            addCriterion("data_source_id like", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotLike(String value) {
            addCriterion("data_source_id not like", value, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdIn(List<String> values) {
            addCriterion("data_source_id in", values, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotIn(List<String> values) {
            addCriterion("data_source_id not in", values, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdBetween(String value1, String value2) {
            addCriterion("data_source_id between", value1, value2, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceIdNotBetween(String value1, String value2) {
            addCriterion("data_source_id not between", value1, value2, "dataSourceId");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameIsNull() {
            addCriterion("data_source_name is null");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameIsNotNull() {
            addCriterion("data_source_name is not null");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameEqualTo(String value) {
            addCriterion("data_source_name =", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotEqualTo(String value) {
            addCriterion("data_source_name <>", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameGreaterThan(String value) {
            addCriterion("data_source_name >", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameGreaterThanOrEqualTo(String value) {
            addCriterion("data_source_name >=", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameLessThan(String value) {
            addCriterion("data_source_name <", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameLessThanOrEqualTo(String value) {
            addCriterion("data_source_name <=", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameLike(String value) {
            addCriterion("data_source_name like", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotLike(String value) {
            addCriterion("data_source_name not like", value, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameIn(List<String> values) {
            addCriterion("data_source_name in", values, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotIn(List<String> values) {
            addCriterion("data_source_name not in", values, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameBetween(String value1, String value2) {
            addCriterion("data_source_name between", value1, value2, "dataSourceName");
            return (Criteria) this;
        }

        public Criteria andDataSourceNameNotBetween(String value1, String value2) {
            addCriterion("data_source_name not between", value1, value2, "dataSourceName");
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

        public Criteria andAbnormalLevelIdIsNull() {
            addCriterion("abnormal_level_id is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdIsNotNull() {
            addCriterion("abnormal_level_id is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdEqualTo(String value) {
            addCriterion("abnormal_level_id =", value, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdNotEqualTo(String value) {
            addCriterion("abnormal_level_id <>", value, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdGreaterThan(String value) {
            addCriterion("abnormal_level_id >", value, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdGreaterThanOrEqualTo(String value) {
            addCriterion("abnormal_level_id >=", value, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdLessThan(String value) {
            addCriterion("abnormal_level_id <", value, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdLessThanOrEqualTo(String value) {
            addCriterion("abnormal_level_id <=", value, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdLike(String value) {
            addCriterion("abnormal_level_id like", value, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdNotLike(String value) {
            addCriterion("abnormal_level_id not like", value, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdIn(List<String> values) {
            addCriterion("abnormal_level_id in", values, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdNotIn(List<String> values) {
            addCriterion("abnormal_level_id not in", values, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdBetween(String value1, String value2) {
            addCriterion("abnormal_level_id between", value1, value2, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelIdNotBetween(String value1, String value2) {
            addCriterion("abnormal_level_id not between", value1, value2, "abnormalLevelId");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameIsNull() {
            addCriterion("abnormal_level_name is null");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameIsNotNull() {
            addCriterion("abnormal_level_name is not null");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameEqualTo(String value) {
            addCriterion("abnormal_level_name =", value, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameNotEqualTo(String value) {
            addCriterion("abnormal_level_name <>", value, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameGreaterThan(String value) {
            addCriterion("abnormal_level_name >", value, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameGreaterThanOrEqualTo(String value) {
            addCriterion("abnormal_level_name >=", value, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameLessThan(String value) {
            addCriterion("abnormal_level_name <", value, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameLessThanOrEqualTo(String value) {
            addCriterion("abnormal_level_name <=", value, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameLike(String value) {
            addCriterion("abnormal_level_name like", value, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameNotLike(String value) {
            addCriterion("abnormal_level_name not like", value, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameIn(List<String> values) {
            addCriterion("abnormal_level_name in", values, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameNotIn(List<String> values) {
            addCriterion("abnormal_level_name not in", values, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameBetween(String value1, String value2) {
            addCriterion("abnormal_level_name between", value1, value2, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andAbnormalLevelNameNotBetween(String value1, String value2) {
            addCriterion("abnormal_level_name not between", value1, value2, "abnormalLevelName");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Date value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Date value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Date value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Date value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Date> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Date> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyIsNull() {
            addCriterion("confirm_efficiency is null");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyIsNotNull() {
            addCriterion("confirm_efficiency is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyEqualTo(String value) {
            addCriterion("confirm_efficiency =", value, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyNotEqualTo(String value) {
            addCriterion("confirm_efficiency <>", value, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyGreaterThan(String value) {
            addCriterion("confirm_efficiency >", value, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyGreaterThanOrEqualTo(String value) {
            addCriterion("confirm_efficiency >=", value, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyLessThan(String value) {
            addCriterion("confirm_efficiency <", value, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyLessThanOrEqualTo(String value) {
            addCriterion("confirm_efficiency <=", value, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyLike(String value) {
            addCriterion("confirm_efficiency like", value, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyNotLike(String value) {
            addCriterion("confirm_efficiency not like", value, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyIn(List<String> values) {
            addCriterion("confirm_efficiency in", values, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyNotIn(List<String> values) {
            addCriterion("confirm_efficiency not in", values, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyBetween(String value1, String value2) {
            addCriterion("confirm_efficiency between", value1, value2, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andConfirmEfficiencyNotBetween(String value1, String value2) {
            addCriterion("confirm_efficiency not between", value1, value2, "confirmEfficiency");
            return (Criteria) this;
        }

        public Criteria andHandleStateIsNull() {
            addCriterion("handle_state is null");
            return (Criteria) this;
        }

        public Criteria andHandleStateIsNotNull() {
            addCriterion("handle_state is not null");
            return (Criteria) this;
        }

        public Criteria andHandleStateEqualTo(String value) {
            addCriterion("handle_state =", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotEqualTo(String value) {
            addCriterion("handle_state <>", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateGreaterThan(String value) {
            addCriterion("handle_state >", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateGreaterThanOrEqualTo(String value) {
            addCriterion("handle_state >=", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLessThan(String value) {
            addCriterion("handle_state <", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLessThanOrEqualTo(String value) {
            addCriterion("handle_state <=", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateLike(String value) {
            addCriterion("handle_state like", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotLike(String value) {
            addCriterion("handle_state not like", value, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateIn(List<String> values) {
            addCriterion("handle_state in", values, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotIn(List<String> values) {
            addCriterion("handle_state not in", values, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateBetween(String value1, String value2) {
            addCriterion("handle_state between", value1, value2, "handleState");
            return (Criteria) this;
        }

        public Criteria andHandleStateNotBetween(String value1, String value2) {
            addCriterion("handle_state not between", value1, value2, "handleState");
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