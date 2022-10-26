package com.realtime.realtime.dao;

import com.realtime.realtime.entity.TTpTargetDict;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 指标字典表; 记录各种类别班组的对应指标项信息(TTpTargetDict)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
public interface TTpTargetDictDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpTargetDict queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpTargetDict> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTpTargetDict 实例对象
     * @return 对象列表
     */
    List<TTpTargetDict> queryAll(TTpTargetDict tTpTargetDict);

    /**
     * 新增数据
     *
     * @param tTpTargetDict 实例对象
     * @return 影响行数
     */
    int insert(TTpTargetDict tTpTargetDict);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpTargetDict> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TTpTargetDict> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpTargetDict> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TTpTargetDict> entities);

    /**
     * 修改数据
     *
     * @param tTpTargetDict 实例对象
     * @return 影响行数
     */
    int update(TTpTargetDict tTpTargetDict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

