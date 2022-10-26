package com.realtime.realtime.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 班组坐席实时状态设置表; 记录班组班组实时状态列表的指标项设置信息(TTpSeatsConfig)实体类
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
public class TTpSeatsConfig implements Serializable {
    private static final long serialVersionUID = 779013529766041521L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 关联指标字典表指标id
     */
    private String targetDictId;
    /**
     * 预警阀值逻辑符
     */
    private String operatorStr;
    /**
     * 预警阀值
     */
    private Double warningValue;
    /**
     * 班组内指标排序
     */
    private Integer sortOrder;
    /**
     * 关联班组唯一标识
     */
    private String groupKey;
    /**
     * 创建时间
     */
    private Date crtTime;
    /**
     * 修改时间
     */
    private Date modfTime;
    /**
     * 操作人
     */
    private String opPrenId;
    /**
     * 双中心时间
     */
    private Date cmosModifyTime;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTargetDictId() {
        return targetDictId;
    }

    public void setTargetDictId(String targetDictId) {
        this.targetDictId = targetDictId;
    }

    public String getOperatorStr() {
        return operatorStr;
    }

    public void setOperatorStr(String operatorStr) {
        this.operatorStr = operatorStr;
    }

    public Double getWarningValue() {
        return warningValue;
    }

    public void setWarningValue(Double warningValue) {
        this.warningValue = warningValue;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    public Date getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(Date crtTime) {
        this.crtTime = crtTime;
    }

    public Date getModfTime() {
        return modfTime;
    }

    public void setModfTime(Date modfTime) {
        this.modfTime = modfTime;
    }

    public String getOpPrenId() {
        return opPrenId;
    }

    public void setOpPrenId(String opPrenId) {
        this.opPrenId = opPrenId;
    }

    public Date getCmosModifyTime() {
        return cmosModifyTime;
    }

    public void setCmosModifyTime(Date cmosModifyTime) {
        this.cmosModifyTime = cmosModifyTime;
    }

}
