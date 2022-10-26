package com.realtime.realtime.service;

import com.realtime.realtime.entity.TTpObjTargetConfig;

import java.util.List;

/**
 * 个人和班组目标值设置表 ;记录个人和班组的每一个指标的目标值数据(TTpObjTargetConfig)表服务接口
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
public interface TTpObjTargetConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpObjTargetConfig queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpObjTargetConfig> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTpObjTargetConfig 实例对象
     * @return 实例对象
     */
    TTpObjTargetConfig insert(TTpObjTargetConfig tTpObjTargetConfig);

    /**
     * 修改数据
     *
     * @param tTpObjTargetConfig 实例对象
     * @return 实例对象
     */
    TTpObjTargetConfig update(TTpObjTargetConfig tTpObjTargetConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
