package com.realtime.realtime.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 排行榜设置表; 记录组内或组间排行旁的设置信息(TTpRankingConfig)实体类
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
public class TTpRankingConfig implements Serializable {
    private static final long serialVersionUID = -67577350536879807L;
    /**
     * 主键id
     */
    private Long id;
    /**
     * 关联班组唯一标识
     */
    private String groupKey;
    /**
     * 排行维度，组内或组间
     */
    private String groupType;
    /**
     * 关联指标字典表id
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

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
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
