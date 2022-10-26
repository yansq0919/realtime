package com.realtime.realtime.service;

import com.realtime.realtime.entity.TTpHelpAndSupportRecord;

import java.util.List;

/**
 * 坐席求助支撑记录表 ;记录坐席求助与被支撑的记录表(TTpHelpAndSupportRecord)表服务接口
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
public interface TTpHelpAndSupportRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpHelpAndSupportRecord queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpHelpAndSupportRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTpHelpAndSupportRecord 实例对象
     * @return 实例对象
     */
    TTpHelpAndSupportRecord insert(TTpHelpAndSupportRecord tTpHelpAndSupportRecord);

    /**
     * 修改数据
     *
     * @param tTpHelpAndSupportRecord 实例对象
     * @return 实例对象
     */
    TTpHelpAndSupportRecord update(TTpHelpAndSupportRecord tTpHelpAndSupportRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
