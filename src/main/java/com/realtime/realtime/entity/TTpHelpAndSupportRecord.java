package com.realtime.realtime.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 坐席求助支撑记录表 ;记录坐席求助与被支撑的记录表(TTpHelpAndSupportRecord)实体类
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
public class TTpHelpAndSupportRecord implements Serializable {
    private static final long serialVersionUID = -73211029892800501L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 求助坐席工号
     */
    private String seatNo;
    /**
     * 求助坐席姓名
     */
    private String seatName;
    /**
     * 主叫号码
     */
    private String mainCallNumber;
    /**
     * 受理号码
     */
    private String acceptNumber;
    /**
     * 地市
     */
    private String cityName;
    /**
     * 星级
     */
    private String starLevel;
    /**
     * 支撑类型
     */
    private String supportType;
    /**
     * 支撑状态
     */
    private String supportState;
    /**
     * 求助时间
     */
    private Date sendHelpTime;
    /**
     * 支撑时间
     */
    private Date supportTime;
    /**
     * 班组长工号
     */
    private String groupLeader;
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

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatName() {
        return seatName;
    }

    public void setSeatName(String seatName) {
        this.seatName = seatName;
    }

    public String getMainCallNumber() {
        return mainCallNumber;
    }

    public void setMainCallNumber(String mainCallNumber) {
        this.mainCallNumber = mainCallNumber;
    }

    public String getAcceptNumber() {
        return acceptNumber;
    }

    public void setAcceptNumber(String acceptNumber) {
        this.acceptNumber = acceptNumber;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getStarLevel() {
        return starLevel;
    }

    public void setStarLevel(String starLevel) {
        this.starLevel = starLevel;
    }

    public String getSupportType() {
        return supportType;
    }

    public void setSupportType(String supportType) {
        this.supportType = supportType;
    }

    public String getSupportState() {
        return supportState;
    }

    public void setSupportState(String supportState) {
        this.supportState = supportState;
    }

    public Date getSendHelpTime() {
        return sendHelpTime;
    }

    public void setSendHelpTime(Date sendHelpTime) {
        this.sendHelpTime = sendHelpTime;
    }

    public Date getSupportTime() {
        return supportTime;
    }

    public void setSupportTime(Date supportTime) {
        this.supportTime = supportTime;
    }

    public String getGroupLeader() {
        return groupLeader;
    }

    public void setGroupLeader(String groupLeader) {
        this.groupLeader = groupLeader;
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
