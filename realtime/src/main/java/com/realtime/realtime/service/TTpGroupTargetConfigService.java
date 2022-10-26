package com.realtime.realtime.service;

import com.realtime.realtime.entity.TTpGroupTargetConfig;

import java.util.List;

/**
 * 班组考核指标设置表 ;记录班组考核指标的设置信息(TTpGroupTargetConfig)表服务接口
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
public interface TTpGroupTargetConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpGroupTargetConfig queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpGroupTargetConfig> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTpGroupTargetConfig 实例对象
     * @return 实例对象
     */
    TTpGroupTargetConfig insert(TTpGroupTargetConfig tTpGroupTargetConfig);

    /**
     * 修改数据
     *
     * @param tTpGroupTargetConfig 实例对象
     * @return 实例对象
     */
    TTpGroupTargetConfig update(TTpGroupTargetConfig tTpGroupTargetConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
