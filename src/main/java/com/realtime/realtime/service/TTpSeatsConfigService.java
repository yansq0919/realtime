package com.realtime.realtime.service;

import com.realtime.realtime.entity.TTpSeatsConfig;

import java.util.List;

/**
 * 班组坐席实时状态设置表; 记录班组班组实时状态列表的指标项设置信息(TTpSeatsConfig)表服务接口
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
public interface TTpSeatsConfigService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpSeatsConfig queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpSeatsConfig> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTpSeatsConfig 实例对象
     * @return 实例对象
     */
    TTpSeatsConfig insert(TTpSeatsConfig tTpSeatsConfig);

    /**
     * 修改数据
     *
     * @param tTpSeatsConfig 实例对象
     * @return 实例对象
     */
    TTpSeatsConfig update(TTpSeatsConfig tTpSeatsConfig);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
