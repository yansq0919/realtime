package com.realtime.realtime.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * 指标字典表; 记录各种类别班组的对应指标项信息(TTpTargetDict)实体类
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
public class TTpTargetDict implements Serializable {
    private static final long serialVersionUID = -72515256779478158L;
    /**
     * 自增序列号
     */
    private Long id;
    /**
     * 指标id
     */
    private Long targetId;
    /**
     * 指标编码
     */
    private String targetCode;
    /**
     * 指标名称
     */
    private String targetName;
    /**
     * 指标单位
     */
    private String targetUnit;
    /**
     * 指标类型;1.效能指标、2.服务指标、3.营销指标
     */
    private String targetType;
    /**
     * 数据维度;1.当日、2.当月、3.实时
     */
    private String dataDim;
    /**
     * 指标维度;10.班组、01.个人、11.班组/个人
     */
    private String targetDim;
    /**
     * 指标来源;1.本部、2.分中心
     */
    private String targetSource;
    /**
     * 指标口径（业务口径）
     */
    private String targetDesc;
    /**
     * 指标刷新时间，单位：秒
     */
    private Integer delayTime;
    /**
     * 归属视图类型;1.热线、2.互联网、3.外呼、4.投诉
     */
    private String viewType;
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

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }

    public String getTargetUnit() {
        return targetUnit;
    }

    public void setTargetUnit(String targetUnit) {
        this.targetUnit = targetUnit;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getDataDim() {
        return dataDim;
    }

    public void setDataDim(String dataDim) {
        this.dataDim = dataDim;
    }

    public String getTargetDim() {
        return targetDim;
    }

    public void setTargetDim(String targetDim) {
        this.targetDim = targetDim;
    }

    public String getTargetSource() {
        return targetSource;
    }

    public void setTargetSource(String targetSource) {
        this.targetSource = targetSource;
    }

    public String getTargetDesc() {
        return targetDesc;
    }

    public void setTargetDesc(String targetDesc) {
        this.targetDesc = targetDesc;
    }

    public Integer getDelayTime() {
        return delayTime;
    }

    public void setDelayTime(Integer delayTime) {
        this.delayTime = delayTime;
    }

    public String getViewType() {
        return viewType;
    }

    public void setViewType(String viewType) {
        this.viewType = viewType;
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
