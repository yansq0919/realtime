package com.realtime.realtime.dao;

import com.realtime.realtime.entity.TTpRankingConfig;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 排行榜设置表; 记录组内或组间排行旁的设置信息(TTpRankingConfig)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
public interface TTpRankingConfigDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpRankingConfig queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpRankingConfig> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTpRankingConfig 实例对象
     * @return 对象列表
     */
    List<TTpRankingConfig> queryAll(TTpRankingConfig tTpRankingConfig);

    /**
     * 新增数据
     *
     * @param tTpRankingConfig 实例对象
     * @return 影响行数
     */
    int insert(TTpRankingConfig tTpRankingConfig);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpRankingConfig> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TTpRankingConfig> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpRankingConfig> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TTpRankingConfig> entities);

    /**
     * 修改数据
     *
     * @param tTpRankingConfig 实例对象
     * @return 影响行数
     */
    int update(TTpRankingConfig tTpRankingConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

