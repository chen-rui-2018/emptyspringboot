package com.nengchuan.inspection.task.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

/**
 * @author： chenr
 * @date： Created on 2021/1/7 15:48
 * @version： v1.0
 * @modified By:
 */
@ApiModel(value = "TaskModel",description = "任务管理实体类")
public class TaskModel implements Serializable {
    @ApiModelProperty(value = "任务id", example = "uuid", position = 1)
    private String id;
    @ApiModelProperty(value = "站类型（0:变电站; 1:直流）", example = "1", position = 2,required = true)
    @NotBlank(message = "站类型不能为空")
    private String stationType;
    @ApiModelProperty(value = "站id", example = "uuid", position = 3,required = true)
    private String stationId;
    @ApiModelProperty(value = "站名称", example = "宜都换流站", position = 4,required = true)
    private String stationName;
    @ApiModelProperty(value = "上级单位id", example = "uuid", position = 5,required = true)
    private String superiorId;
    @ApiModelProperty(value = "上级单位名称", example = "直流运检公司", position = 6,required = true)
    private String superiorName;
    @ApiModelProperty(value = "任务单名称", example = "宜都站例行巡检", position = 7,required = true)
    private String taskName;
    @ApiModelProperty(value = "任务类型id", example = "1", position = 8,required = true)
    private String typeId;
    @ApiModelProperty(value = "任务类型名称", example = "例行巡检", position = 9,required = true)
    private String typeName;
    @ApiModelProperty(value = "执行时间", example = "2021-01-01 12:00:00", position = 10,required = true)
    private String executionTime;
    @ApiModelProperty(value = "执行方式id", example = "1", position = 11,required = true)
    private String executionFunId;
    @ApiModelProperty(value = "执行方式名称", example = "立即执行", position = 12,required = true)
    private String executionFunName;
    @ApiModelProperty(value = "执行状态id", example = "1", position = 13,required = true)
    private String executionStateId;
    @ApiModelProperty(value = "执行状态名称", example = "未执行", position = 14,required = true)
    private String executionStateName;
    @ApiModelProperty(value = "是否发现异常(1:是,0否)", example = "1", position = 15,required = true)
    private String isAbnormal;
    @ApiModelProperty(value = "创建人id", example = "uuid", position = 16,required = true)
    private String createId;
    @ApiModelProperty(value = "创建人名称", example = "张三", position = 17,required = true)
    private String createName;
    @ApiModelProperty(value = "创建时间", example = "2021-01-01 12:00:00", position = 18,required = true)
    private String createTime;
    @ApiModelProperty(value = "更新人id", example = "uuid", position = 19)
    private String modifyId;
    @ApiModelProperty(value = "更新人名称", example = "李四", position = 20)
    private String modifyName;
    @ApiModelProperty(value = "更新时间", example = "2021-01-01 12:00:00", position = 21)
    private String modifyTime;
    @ApiModelProperty(value = "是否删除(0:已删除,1:正常)", example = "1", position = 22,required = true)
    private String deleteState;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStationType() {
        return stationType;
    }

    public void setStationType(String stationType) {
        this.stationType = stationType;
    }

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public String getSuperiorId() {
        return superiorId;
    }

    public void setSuperiorId(String superiorId) {
        this.superiorId = superiorId;
    }

    public String getSuperiorName() {
        return superiorName;
    }

    public void setSuperiorName(String superiorName) {
        this.superiorName = superiorName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getExecutionTime() {
        return executionTime;
    }

    public void setExecutionTime(String executionTime) {
        this.executionTime = executionTime;
    }

    public String getExecutionFunId() {
        return executionFunId;
    }

    public void setExecutionFunId(String executionFunId) {
        this.executionFunId = executionFunId;
    }

    public String getExecutionFunName() {
        return executionFunName;
    }

    public void setExecutionFunName(String executionFunName) {
        this.executionFunName = executionFunName;
    }

    public String getExecutionStateId() {
        return executionStateId;
    }

    public void setExecutionStateId(String executionStateId) {
        this.executionStateId = executionStateId;
    }

    public String getExecutionStateName() {
        return executionStateName;
    }

    public void setExecutionStateName(String executionStateName) {
        this.executionStateName = executionStateName;
    }

    public String getIsAbnormal() {
        return isAbnormal;
    }

    public void setIsAbnormal(String isAbnormal) {
        this.isAbnormal = isAbnormal;
    }

    public String getCreateId() {
        return createId;
    }

    public void setCreateId(String createId) {
        this.createId = createId;
    }

    public String getCreateName() {
        return createName;
    }

    public void setCreateName(String createName) {
        this.createName = createName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyId() {
        return modifyId;
    }

    public void setModifyId(String modifyId) {
        this.modifyId = modifyId;
    }

    public String getModifyName() {
        return modifyName;
    }

    public void setModifyName(String modifyName) {
        this.modifyName = modifyName;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getDeleteState() {
        return deleteState;
    }

    public void setDeleteState(String deleteState) {
        this.deleteState = deleteState;
    }
}
