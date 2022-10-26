package com.realtime.realtime.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 案例推送记录表 ;记录坐席案例推送的相关记录信息(TTpPushCaseRecord)实体类
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
public class TTpPushCaseRecord implements Serializable {
    private static final long serialVersionUID = 452976385917850784L;
    /**
     * id
     */
    private Long id;
    /**
     * 发送方式
     */
    private String sendType;
    /**
     * 案例标题
     */
    private String caseTitle;
    /**
     * 案例正文
     */
    private String caseContent;
    /**
     * 附件
     */
    private String caseFile;
    /**
     * 发送班组长工号
     */
    private String sendCode;
    /**
     * 发送人班组长姓名
     */
    private String sendName;
    /**
     * 接收坐席工号
     */
    private String receiveCode;
    /**
     * 接收坐席姓名
     */
    private String receiveName;
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

    public String getSendType() {
        return sendType;
    }

    public void setSendType(String sendType) {
        this.sendType = sendType;
    }

    public String getCaseTitle() {
        return caseTitle;
    }

    public void setCaseTitle(String caseTitle) {
        this.caseTitle = caseTitle;
    }

    public String getCaseContent() {
        return caseContent;
    }

    public void setCaseContent(String caseContent) {
        this.caseContent = caseContent;
    }

    public String getCaseFile() {
        return caseFile;
    }

    public void setCaseFile(String caseFile) {
        this.caseFile = caseFile;
    }

    public String getSendCode() {
        return sendCode;
    }

    public void setSendCode(String sendCode) {
        this.sendCode = sendCode;
    }

    public String getSendName() {
        return sendName;
    }

    public void setSendName(String sendName) {
        this.sendName = sendName;
    }

    public String getReceiveCode() {
        return receiveCode;
    }

    public void setReceiveCode(String receiveCode) {
        this.receiveCode = receiveCode;
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName;
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
