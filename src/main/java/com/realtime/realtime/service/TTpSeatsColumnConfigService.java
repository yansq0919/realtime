package com.realtime.realtime.service;

import com.realtime.realtime.entity.TTpSeatsColumnConfig;

import java.util.List;

/**
 * 坐席实时状态列表自定义展示列设置表; 记录班组坐席实时状态列表中展示的指标列及顺序的设置信息(TTpSeatsColumnConfig)表服务接口
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
public interface TTpSeatsColumnConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpSeatsColumnConfig queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpSeatsColumnConfig> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTpSeatsColumnConfig 实例对象
     * @return 实例对象
     */
    TTpSeatsColumnConfig insert(TTpSeatsColumnConfig tTpSeatsColumnConfig);

    /**
     * 修改数据
     *
     * @param tTpSeatsColumnConfig 实例对象
     * @return 实例对象
     */
    TTpSeatsColumnConfig update(TTpSeatsColumnConfig tTpSeatsColumnConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);


}
