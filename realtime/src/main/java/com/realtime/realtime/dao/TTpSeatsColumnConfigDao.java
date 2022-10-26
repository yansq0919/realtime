package com.realtime.realtime.dao;

import com.realtime.realtime.entity.TTpSeatsColumnConfig;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 坐席实时状态列表自定义展示列设置表; 记录班组坐席实时状态列表中展示的指标列及顺序的设置信息(TTpSeatsColumnConfig)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
public interface TTpSeatsColumnConfigDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpSeatsColumnConfig queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpSeatsColumnConfig> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTpSeatsColumnConfig 实例对象
     * @return 对象列表
     */
    List<TTpSeatsColumnConfig> queryAll(TTpSeatsColumnConfig tTpSeatsColumnConfig);

    /**
     * 新增数据
     *
     * @param tTpSeatsColumnConfig 实例对象
     * @return 影响行数
     */
    int insert(TTpSeatsColumnConfig tTpSeatsColumnConfig);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpSeatsColumnConfig> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TTpSeatsColumnConfig> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpSeatsColumnConfig> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TTpSeatsColumnConfig> entities);

    /**
     * 修改数据
     *
     * @param tTpSeatsColumnConfig 实例对象
     * @return 影响行数
     */
    int update(TTpSeatsColumnConfig tTpSeatsColumnConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

