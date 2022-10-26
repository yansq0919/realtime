package com.realtime.realtime.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 附件存储地址表 记录各业务表中上传附件的存储地址(FileStorage)实体类
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
public class FileStorage implements Serializable {
    private static final long serialVersionUID = -76293837333718786L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 创建时间
     */
    private Date crtTime;
    /**
     * 修改时间
     */
    private Date modfTime;
    /**
     * 双中心时间
     */
    private Date cmosModifyTime;
    /**
     * 操作人
     */
    private String opPrenId;
    /**
     * 附件名称
     */
    private String fileName;
    /**
     * 附件oss地址
     */
    private String fileUrl;
    /**
     * 附件类型;,1:案例推送，
     */
    private String fileType;
    /**
     * 关联附件涉及业务的主键id
     */
    private Long busId;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Date getCmosModifyTime() {
        return cmosModifyTime;
    }

    public void setCmosModifyTime(Date cmosModifyTime) {
        this.cmosModifyTime = cmosModifyTime;
    }

    public String getOpPrenId() {
        return opPrenId;
    }

    public void setOpPrenId(String opPrenId) {
        this.opPrenId = opPrenId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getBusId() {
        return busId;
    }

    public void setBusId(Long busId) {
        this.busId = busId;
    }

}
