package com.realtime.realtime.service.impl;

import com.realtime.realtime.entity.TTpSeatsColumnConfig;
import com.realtime.realtime.dao.TTpSeatsColumnConfigDao;
import com.realtime.realtime.service.TTpSeatsColumnConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 坐席实时状态列表自定义展示列设置表; 记录班组坐席实时状态列表中展示的指标列及顺序的设置信息(TTpSeatsColumnConfig)表服务实现类
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
@Service("tTpSeatsColumnConfigService")
public class TTpSeatsColumnConfigServiceImpl implements TTpSeatsColumnConfigService {
    @Resource
    private TTpSeatsColumnConfigDao tTpSeatsColumnConfigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTpSeatsColumnConfig queryById(Long id) {
        return this.tTpSeatsColumnConfigDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TTpSeatsColumnConfig> queryAllByLimit(int offset, int limit) {
        return this.tTpSeatsColumnConfigDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTpSeatsColumnConfig 实例对象
     * @return 实例对象
     */
    @Override
    public TTpSeatsColumnConfig insert(TTpSeatsColumnConfig tTpSeatsColumnConfig) {
        this.tTpSeatsColumnConfigDao.insert(tTpSeatsColumnConfig);
        return tTpSeatsColumnConfig;
    }

    /**
     * 修改数据
     *
     * @param tTpSeatsColumnConfig 实例对象
     * @return 实例对象
     */
    @Override
    public TTpSeatsColumnConfig update(TTpSeatsColumnConfig tTpSeatsColumnConfig) {
        this.tTpSeatsColumnConfigDao.update(tTpSeatsColumnConfig);
        return this.queryById(tTpSeatsColumnConfig.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tTpSeatsColumnConfigDao.deleteById(id) > 0;
    }
}
