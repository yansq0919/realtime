package com.realtime.realtime.entity;

import lombok.Data;

import java.util.Date;
import java.io.Serializable;

/**
 * 坐席实时状态列表自定义展示列设置表; 记录班组坐席实时状态列表中展示的指标列及顺序的设置信息(TTpSeatsColumnConfig)实体类
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
@Data
public class TTpSeatsColumnConfig implements Serializable {
    private static final long serialVersionUID = -85836924849093046L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 班组编码
     */
    private String groupKey;
    /**
     * 关联指标字典表指标id
     */
    private String targetDictId;
    /**
     * 排列顺序
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
     * 双中心时间
     */
    private Date cmosModifyTime;
    /**
     * 操作人
     */
    private String opPrenId;


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

    public String getTargetDictId() {
        return targetDictId;
    }

    public void setTargetDictId(String targetDictId) {
        this.targetDictId = targetDictId;
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

}
