package com.realtime.realtime.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 班组考核指标设置表 ;记录班组考核指标的设置信息(TTpGroupTargetConfig)实体类
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
public class TTpGroupTargetConfig implements Serializable {
    private static final long serialVersionUID = 655351296588781731L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 班组编码
     */
    private String groupKey;
    /**
     * 时间维度;1：当日；2：当月
     */
    private String timeDim;
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
     * 目标阀值
     */
    private Double targetValue;
    /**
     * 是否首页展示，1：是，0：否
     */
    private Integer showInHome;
    /**
     * 班组内指标排序
     */
    private Integer sortOrder;
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

    public String getGroupKey() {
        return groupKey;
    }

    public void setGroupKey(String groupKey) {
        this.groupKey = groupKey;
    }

    public String getTimeDim() {
        return timeDim;
    }

    public void setTimeDim(String timeDim) {
        this.timeDim = timeDim;
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

    public Double getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(Double targetValue) {
        this.targetValue = targetValue;
    }

    public Integer getShowInHome() {
        return showInHome;
    }

    public void setShowInHome(Integer showInHome) {
        this.showInHome = showInHome;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
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
