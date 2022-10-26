package com.realtime.realtime.dao;

import com.realtime.realtime.entity.TTpSeatsConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 班组坐席实时状态设置表; 记录班组班组实时状态列表的指标项设置信息(TTpSeatsConfig)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */

public interface TTpSeatsConfigDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpSeatsConfig queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpSeatsConfig> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTpSeatsConfig 实例对象
     * @return 对象列表
     */
    List<TTpSeatsConfig> queryAll(TTpSeatsConfig tTpSeatsConfig);

    /**
     * 新增数据
     *
     * @param tTpSeatsConfig 实例对象
     * @return 影响行数
     */
    int insert(TTpSeatsConfig tTpSeatsConfig);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpSeatsConfig> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TTpSeatsConfig> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpSeatsConfig> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TTpSeatsConfig> entities);

    /**
     * 修改数据
     *
     * @param tTpSeatsConfig 实例对象
     * @return 影响行数
     */
    int update(TTpSeatsConfig tTpSeatsConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

