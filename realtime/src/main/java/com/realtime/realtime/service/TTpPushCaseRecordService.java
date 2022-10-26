package com.realtime.realtime.service;

import com.realtime.realtime.entity.TTpPushCaseRecord;

import java.util.List;

/**
 * 案例推送记录表 ;记录坐席案例推送的相关记录信息(TTpPushCaseRecord)表服务接口
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
public interface TTpPushCaseRecordService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpPushCaseRecord queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpPushCaseRecord> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTpPushCaseRecord 实例对象
     * @return 实例对象
     */
    TTpPushCaseRecord insert(TTpPushCaseRecord tTpPushCaseRecord);

    /**
     * 修改数据
     *
     * @param tTpPushCaseRecord 实例对象
     * @return 实例对象
     */
    TTpPushCaseRecord update(TTpPushCaseRecord tTpPushCaseRecord);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
