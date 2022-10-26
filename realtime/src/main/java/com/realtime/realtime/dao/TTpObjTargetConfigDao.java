package com.realtime.realtime.dao;

import com.realtime.realtime.entity.TTpObjTargetConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 个人和班组目标值设置表 ;记录个人和班组的每一个指标的目标值数据(TTpObjTargetConfig)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
public interface TTpObjTargetConfigDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpObjTargetConfig queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpObjTargetConfig> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTpObjTargetConfig 实例对象
     * @return 对象列表
     */
    List<TTpObjTargetConfig> queryAll(TTpObjTargetConfig tTpObjTargetConfig);

    /**
     * 新增数据
     *
     * @param tTpObjTargetConfig 实例对象
     * @return 影响行数
     */
    int insert(TTpObjTargetConfig tTpObjTargetConfig);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpObjTargetConfig> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TTpObjTargetConfig> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpObjTargetConfig> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TTpObjTargetConfig> entities);

    /**
     * 修改数据
     *
     * @param tTpObjTargetConfig 实例对象
     * @return 影响行数
     */
    int update(TTpObjTargetConfig tTpObjTargetConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

