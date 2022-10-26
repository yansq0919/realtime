package com.realtime.realtime.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 个人和班组目标值设置表 ;记录个人和班组的每一个指标的目标值数据(TTpObjTargetConfig)实体类
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
public class TTpObjTargetConfig implements Serializable {
    private static final long serialVersionUID = 818012337845978129L;
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
     * 班组或个人的唯一标识;班组编码或员工工号
     */
    private String objKey;
    /**
     * 指标维度，1：班组，2：个人;，与obj_key联动，当obj_key作为查询条件为班组编码 时，target_type固定值为1；当obj_key作为查询条件为员工号时，target_type固定为2
     */
    private String targetType;
    /**
     * 关联指标字典表指标id
     */
    private String targetKey;
    /**
     * 指标的目标值
     */
    private String targetValue;
    /**
     * 归属视图类型;1.热线、2.互联网、3.外呼、4.投诉
     */
    private String viewCode;
    /**
     * 时间维度;1：当日，2：当月
     */
    private String timeDim;


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

    public String getObjKey() {
        return objKey;
    }

    public void setObjKey(String objKey) {
        this.objKey = objKey;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getTargetKey() {
        return targetKey;
    }

    public void setTargetKey(String targetKey) {
        this.targetKey = targetKey;
    }

    public String getTargetValue() {
        return targetValue;
    }

    public void setTargetValue(String targetValue) {
        this.targetValue = targetValue;
    }

    public String getViewCode() {
        return viewCode;
    }

    public void setViewCode(String viewCode) {
        this.viewCode = viewCode;
    }

    public String getTimeDim() {
        return timeDim;
    }

    public void setTimeDim(String timeDim) {
        this.timeDim = timeDim;
    }

}
