package com.nengchuan.inspection.abnormal.entity;

import java.io.Serializable;
import java.util.Date;

public class IiAbnormal implements Serializable {
    private String id;

    private String stationId;

    private String stationName;

    private String stationType;

    private String superiorId;

    private String superiorName;

    private String voltageGradeId;

    private String voltageGradeName;

    private String abnormalSituation;

    private Date findTime;

    private String dataSourceId;

    private String dataSourceName;

    private String isAbnormal;

    private String abnormalLevelId;

    private String abnormalLevelName;

    private Date confirmTime;

    private String confirmEfficiency;

    private String handleState;

    private String createId;

    private String createName;

    private Date createTime;

    private String modifyId;

    private String modifyName;

    private Date modifyTime;

    private String deleteState = "1";

    private String routeId;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId == null ? null : stationId.trim();
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName == null ? null : stationName.trim();
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType == null ? null : stationType.trim();
    }

    public String getSuperiorId() {
        return superiorId;
    }

    public void setSuperiorId(String superiorId) {
        this.superiorId = superiorId == null ? null : superiorId.trim();
    }

    public String getSuperiorName() {
        return superiorName;
    }

    public void setSuperiorName(String superiorName) {
        this.superiorName = superiorName == null ? null : superiorName.trim();
    }

    public String getVoltageGradeId() {
        return voltageGradeId;
    }

    public void setVoltageGradeId(String voltageGradeId) {
        this.voltageGradeId = voltageGradeId == null ? null : voltageGradeId.trim();
    }

    public String getVoltageGradeName() {
        return voltageGradeName;
    }

    public void setVoltageGradeName(String voltageGradeName) {
        this.voltageGradeName = voltageGradeName == null ? null : voltageGradeName.trim();
    }

    public String getAbnormalSituation() {
        return abnormalSituation;
    }

    public void setAbnormalSituation(String abnormalSituation) {
        this.abnormalSituation = abnormalSituation == null ? null : abnormalSituation.trim();
    }

    public Date getFindTime() {
        return findTime;
    }

    public void setFindTime(Date findTime) {
        this.findTime = findTime;
    }

    public String getDataSourceId() {
        return dataSourceId;
    }

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId == null ? null : dataSourceId.trim();
    }

    public String getDataSourceName() {
        return dataSourceName;
    }

    public void setDataSourceName(String dataSourceName) {
        this.dataSourceName = dataSourceName == null ? null : dataSourceName.trim();
    }

    public String getIsAbnormal() {
        return isAbnormal;
    }

    public void setIsAbnormal(String isAbnormal) {
        this.isAbnormal = isAbnormal == null ? null : isAbnormal.trim();
    }

    public String getAbnormalLevelId() {
        return abnormalLevelId;
    }

    public void setAbnormalLevelId(String abnormalLevelId) {
        this.abnormalLevelId = abnormalLevelId == null ? null : abnormalLevelId.trim();
    }

    public String getAbnormalLevelName() {
        return abnormalLevelName;
    }

    public void setAbnormalLevelName(String abnormalLevelName) {
        this.abnormalLevelName = abnormalLevelName == null ? null : abnormalLevelName.trim();
    }

    public Date getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Date confirmTime) {
        this.confirmTime = confirmTime;
    }

    public String getConfirmEfficiency() {
        return confirmEfficiency;
    }

    public void setConfirmEfficiency(String confirmEfficiency) {
        this.confirmEfficiency = confirmEfficiency == null ? null : confirmEfficiency.trim();
    }

    public String getHandleState() {
        return handleState;
    }

    public void setHandleState(String handleState) {
        this.handleState = handleState == null ? null : handleState.trim();
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId == null ? null : createId.trim();
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName == null ? null : createName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId == null ? null : modifyId.trim();
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName == null ? null : modifyName.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(String deleteState) {
        this.deleteState = deleteState == null ? null : deleteState.trim();
    }

    public String getRouteId() {
        return routeId;
    }

    public void setRouteId(String routeId) {
        this.routeId = routeId == null ? null : routeId.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        IiAbnormal other = (IiAbnormal) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStationId() == null ? other.getStationId() == null : this.getStationId().equals(other.getStationId()))
            && (this.getStationName() == null ? other.getStationName() == null : this.getStationName().equals(other.getStationName()))
            && (this.getStationType() == null ? other.getStationType() == null : this.getStationType().equals(other.getStationType()))
            && (this.getSuperiorId() == null ? other.getSuperiorId() == null : this.getSuperiorId().equals(other.getSuperiorId()))
            && (this.getSuperiorName() == null ? other.getSuperiorName() == null : this.getSuperiorName().equals(other.getSuperiorName()))
            && (this.getVoltageGradeId() == null ? other.getVoltageGradeId() == null : this.getVoltageGradeId().equals(other.getVoltageGradeId()))
            && (this.getVoltageGradeName() == null ? other.getVoltageGradeName() == null : this.getVoltageGradeName().equals(other.getVoltageGradeName()))
            && (this.getAbnormalSituation() == null ? other.getAbnormalSituation() == null : this.getAbnormalSituation().equals(other.getAbnormalSituation()))
            && (this.getFindTime() == null ? other.getFindTime() == null : this.getFindTime().equals(other.getFindTime()))
            && (this.getDataSourceId() == null ? other.getDataSourceId() == null : this.getDataSourceId().equals(other.getDataSourceId()))
            && (this.getDataSourceName() == null ? other.getDataSourceName() == null : this.getDataSourceName().equals(other.getDataSourceName()))
            && (this.getIsAbnormal() == null ? other.getIsAbnormal() == null : this.getIsAbnormal().equals(other.getIsAbnormal()))
            && (this.getAbnormalLevelId() == null ? other.getAbnormalLevelId() == null : this.getAbnormalLevelId().equals(other.getAbnormalLevelId()))
            && (this.getAbnormalLevelName() == null ? other.getAbnormalLevelName() == null : this.getAbnormalLevelName().equals(other.getAbnormalLevelName()))
            && (this.getConfirmTime() == null ? other.getConfirmTime() == null : this.getConfirmTime().equals(other.getConfirmTime()))
            && (this.getConfirmEfficiency() == null ? other.getConfirmEfficiency() == null : this.getConfirmEfficiency().equals(other.getConfirmEfficiency()))
            && (this.getHandleState() == null ? other.getHandleState() == null : this.getHandleState().equals(other.getHandleState()))
            && (this.getCreateId() == null ? other.getCreateId() == null : this.getCreateId().equals(other.getCreateId()))
            && (this.getCreateName() == null ? other.getCreateName() == null : this.getCreateName().equals(other.getCreateName()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getModifyId() == null ? other.getModifyId() == null : this.getModifyId().equals(other.getModifyId()))
            && (this.getModifyName() == null ? other.getModifyName() == null : this.getModifyName().equals(other.getModifyName()))
            && (this.getModifyTime() == null ? other.getModifyTime() == null : this.getModifyTime().equals(other.getModifyTime()))
            && (this.getDeleteState() == null ? other.getDeleteState() == null : this.getDeleteState().equals(other.getDeleteState()))
            && (this.getRouteId() == null ? other.getRouteId() == null : this.getRouteId().equals(other.getRouteId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStationId() == null) ? 0 : getStationId().hashCode());
        result = prime * result + ((getStationName() == null) ? 0 : getStationName().hashCode());
        result = prime * result + ((getStationType() == null) ? 0 : getStationType().hashCode());
        result = prime * result + ((getSuperiorId() == null) ? 0 : getSuperiorId().hashCode());
        result = prime * result + ((getSuperiorName() == null) ? 0 : getSuperiorName().hashCode());
        result = prime * result + ((getVoltageGradeId() == null) ? 0 : getVoltageGradeId().hashCode());
        result = prime * result + ((getVoltageGradeName() == null) ? 0 : getVoltageGradeName().hashCode());
        result = prime * result + ((getAbnormalSituation() == null) ? 0 : getAbnormalSituation().hashCode());
        result = prime * result + ((getFindTime() == null) ? 0 : getFindTime().hashCode());
        result = prime * result + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        result = prime * result + ((getDataSourceName() == null) ? 0 : getDataSourceName().hashCode());
        result = prime * result + ((getIsAbnormal() == null) ? 0 : getIsAbnormal().hashCode());
        result = prime * result + ((getAbnormalLevelId() == null) ? 0 : getAbnormalLevelId().hashCode());
        result = prime * result + ((getAbnormalLevelName() == null) ? 0 : getAbnormalLevelName().hashCode());
        result = prime * result + ((getConfirmTime() == null) ? 0 : getConfirmTime().hashCode());
        result = prime * result + ((getConfirmEfficiency() == null) ? 0 : getConfirmEfficiency().hashCode());
        result = prime * result + ((getHandleState() == null) ? 0 : getHandleState().hashCode());
        result = prime * result + ((getCreateId() == null) ? 0 : getCreateId().hashCode());
        result = prime * result + ((getCreateName() == null) ? 0 : getCreateName().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getModifyId() == null) ? 0 : getModifyId().hashCode());
        result = prime * result + ((getModifyName() == null) ? 0 : getModifyName().hashCode());
        result = prime * result + ((getModifyTime() == null) ? 0 : getModifyTime().hashCode());
        result = prime * result + ((getDeleteState() == null) ? 0 : getDeleteState().hashCode());
        result = prime * result + ((getRouteId() == null) ? 0 : getRouteId().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", stationId=").append(stationId);
        sb.append(", stationName=").append(stationName);
        sb.append(", stationType=").append(stationType);
        sb.append(", superiorId=").append(superiorId);
        sb.append(", superiorName=").append(superiorName);
        sb.append(", voltageGradeId=").append(voltageGradeId);
        sb.append(", voltageGradeName=").append(voltageGradeName);
        sb.append(", abnormalSituation=").append(abnormalSituation);
        sb.append(", findTime=").append(findTime);
        sb.append(", dataSourceId=").append(dataSourceId);
        sb.append(", dataSourceName=").append(dataSourceName);
        sb.append(", isAbnormal=").append(isAbnormal);
        sb.append(", abnormalLevelId=").append(abnormalLevelId);
        sb.append(", abnormalLevelName=").append(abnormalLevelName);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", confirmEfficiency=").append(confirmEfficiency);
        sb.append(", handleState=").append(handleState);
        sb.append(", createId=").append(createId);
        sb.append(", createName=").append(createName);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifyId=").append(modifyId);
        sb.append(", modifyName=").append(modifyName);
        sb.append(", modifyTime=").append(modifyTime);
        sb.append(", deleteState=").append(deleteState);
        sb.append(", routeId=").append(routeId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}