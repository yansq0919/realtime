package com.realtime.realtime.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 话务预警记录表 ;记录坐席的话务预警信息(TTpWarningRecord)实体类
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
public class TTpWarningRecord implements Serializable {
    private static final long serialVersionUID = 936816266434277526L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 预警信息唯一ID
     */
    private String warnId;
    /**
     * 预警规则ID
     */
    private String warnCfgId;
    /**
     * 预警名称
     */
    private String warnName;
    /**
     * 预警级别，1.一级、2.二级、3.三级、4.四级
     */
    private String warnLevel;
    /**
     * 预警类型，2 超长话务、3超短话务
     */
    private String warningType;
    /**
     * 预警内容，预警通知内容
     */
    private String warnContent;
    /**
     * 预警时间
     */
    private Date warnTime;
    /**
     * 班组ID，坐席归属班组ID
     */
    private String groupId;
    /**
     * 班组名称，坐席归属班组名称
     */
    private String groupName;
    /**
     * 班组长工号，即接收预警信息人工号
     */
    private String groupLeaderNo;
    /**
     * 坐席工号
     */
    private String seatsNo;
    /**
     * 坐席姓名
     */
    private String seatsName;
    /**
     * 组织机构
     */
    private String organ;
    /**
     * 通话时长（s）
     */
    private String converTime;
    /**
     * 流水号，接触流水号
     */
    private String callId;
    /**
     * 客户号码
     */
    private String custPhone;
    /**
     * 星级
     */
    private String starLevel;
    /**
     * 客户标签
     */
    private String custLabel;
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

    public String getWarnId() {
        return warnId;
    }

    public void setWarnId(String warnId) {
        this.warnId = warnId;
    }

    public String getWarnCfgId() {
        return warnCfgId;
    }

    public void setWarnCfgId(String warnCfgId) {
        this.warnCfgId = warnCfgId;
    }

    public String getWarnName() {
        return warnName;
    }

    public void setWarnName(String warnName) {
        this.warnName = warnName;
    }

    public String getWarnLevel() {
        return warnLevel;
    }

    public void setWarnLevel(String warnLevel) {
        this.warnLevel = warnLevel;
    }

    public String getWarningType() {
        return warningType;
    }

    public void setWarningType(String warningType) {
        this.warningType = warningType;
    }

    public String getWarnContent() {
        return warnContent;
    }

    public void setWarnContent(String warnContent) {
        this.warnContent = warnContent;
    }

    public Date getWarnTime() {
        return warnTime;
    }

    public void setWarnTime(Date warnTime) {
        this.warnTime = warnTime;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupLeaderNo() {
        return groupLeaderNo;
    }

    public void setGroupLeaderNo(String groupLeaderNo) {
        this.groupLeaderNo = groupLeaderNo;
    }

    public String getSeatsNo() {
        return seatsNo;
    }

    public void setSeatsNo(String seatsNo) {
        this.seatsNo = seatsNo;
    }

    public String getSeatsName() {
        return seatsName;
    }

    public void setSeatsName(String seatsName) {
        this.seatsName = seatsName;
    }

    public String getOrgan() {
        return organ;
    }

    public void setOrgan(String organ) {
        this.organ = organ;
    }

    public String getConverTime() {
        return converTime;
    }

    public void setConverTime(String converTime) {
        this.converTime = converTime;
    }

    public String getCallId() {
        return callId;
    }

    public void setCallId(String callId) {
        this.callId = callId;
    }

    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    public String getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel;
    }

    public String getCustLabel() {
        return custLabel;
    }

    public void setCustLabel(String custLabel) {
        this.custLabel = custLabel;
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
