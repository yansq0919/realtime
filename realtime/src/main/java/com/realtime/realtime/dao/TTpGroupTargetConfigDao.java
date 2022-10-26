package com.realtime.realtime.dao;

import com.realtime.realtime.entity.TTpGroupTargetConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 班组考核指标设置表 ;记录班组考核指标的设置信息(TTpGroupTargetConfig)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
public interface TTpGroupTargetConfigDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpGroupTargetConfig queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpGroupTargetConfig> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTpGroupTargetConfig 实例对象
     * @return 对象列表
     */
    List<TTpGroupTargetConfig> queryAll(TTpGroupTargetConfig tTpGroupTargetConfig);

    /**
     * 新增数据
     *
     * @param tTpGroupTargetConfig 实例对象
     * @return 影响行数
     */
    int insert(TTpGroupTargetConfig tTpGroupTargetConfig);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpGroupTargetConfig> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TTpGroupTargetConfig> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpGroupTargetConfig> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TTpGroupTargetConfig> entities);

    /**
     * 修改数据
     *
     * @param tTpGroupTargetConfig 实例对象
     * @return 影响行数
     */
    int update(TTpGroupTargetConfig tTpGroupTargetConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

