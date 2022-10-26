package com.realtime.realtime.dao;

import com.realtime.realtime.entity.TTpHelpAndSupportRecord;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 坐席求助支撑记录表 ;记录坐席求助与被支撑的记录表(TTpHelpAndSupportRecord)表数据库访问层
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
public interface TTpHelpAndSupportRecordDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpHelpAndSupportRecord queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpHelpAndSupportRecord> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tTpHelpAndSupportRecord 实例对象
     * @return 对象列表
     */
    List<TTpHelpAndSupportRecord> queryAll(TTpHelpAndSupportRecord tTpHelpAndSupportRecord);

    /**
     * 新增数据
     *
     * @param tTpHelpAndSupportRecord 实例对象
     * @return 影响行数
     */
    int insert(TTpHelpAndSupportRecord tTpHelpAndSupportRecord);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpHelpAndSupportRecord> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TTpHelpAndSupportRecord> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TTpHelpAndSupportRecord> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TTpHelpAndSupportRecord> entities);

    /**
     * 修改数据
     *
     * @param tTpHelpAndSupportRecord 实例对象
     * @return 影响行数
     */
    int update(TTpHelpAndSupportRecord tTpHelpAndSupportRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}

