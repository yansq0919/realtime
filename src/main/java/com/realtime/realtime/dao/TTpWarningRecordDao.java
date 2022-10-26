package com.realtime.realtime.dao;

import com.realtime.realtime.entity.TTpWarningRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 话务预警记录表 ;记录坐席的话务预警信息(TTpWarningRecord)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
public interface TTpWarningRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpWarningRecord queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpWarningRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTpWarningRecord 实例对象
     * @return 对象列表
     */
    List<TTpWarningRecord> queryAll(TTpWarningRecord tTpWarningRecord);

    /**
     * 新增数据
     *
     * @param tTpWarningRecord 实例对象
     * @return 影响行数
     */
    int insert(TTpWarningRecord tTpWarningRecord);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpWarningRecord> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TTpWarningRecord> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpWarningRecord> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TTpWarningRecord> entities);

    /**
     * 修改数据
     *
     * @param tTpWarningRecord 实例对象
     * @return 影响行数
     */
    int update(TTpWarningRecord tTpWarningRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

