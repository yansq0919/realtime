package com.realtime.realtime.service;

import com.realtime.realtime.entity.TTpTargetDict;

import java.util.List;

/**
 * 指标字典表; 记录各种类别班组的对应指标项信息(TTpTargetDict)表服务接口
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
public interface TTpTargetDictService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TTpTargetDict queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TTpTargetDict> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tTpTargetDict 实例对象
     * @return 实例对象
     */
    TTpTargetDict insert(TTpTargetDict tTpTargetDict);

    /**
     * 修改数据
     *
     * @param tTpTargetDict 实例对象
     * @return 实例对象
     */
    TTpTargetDict update(TTpTargetDict tTpTargetDict);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
