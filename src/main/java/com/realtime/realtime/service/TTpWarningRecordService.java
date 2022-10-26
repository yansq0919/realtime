package com.realtime.realtime.service;

import com.realtime.realtime.entity.TTpWarningRecord;

import java.util.List;

/**
 * 话务预警记录表 ;记录坐席的话务预警信息(TTpWarningRecord)表服务接口
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
public interface TTpWarningRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpWarningRecord queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpWarningRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTpWarningRecord 实例对象
     * @return 实例对象
     */
    TTpWarningRecord insert(TTpWarningRecord tTpWarningRecord);

    /**
     * 修改数据
     *
     * @param tTpWarningRecord 实例对象
     * @return 实例对象
     */
    TTpWarningRecord update(TTpWarningRecord tTpWarningRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
