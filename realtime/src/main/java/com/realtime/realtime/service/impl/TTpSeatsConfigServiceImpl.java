package com.realtime.realtime.service.impl;

import com.realtime.realtime.entity.TTpSeatsConfig;
import com.realtime.realtime.dao.TTpSeatsConfigDao;
import com.realtime.realtime.service.TTpSeatsConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 班组坐席实时状态设置表; 记录班组班组实时状态列表的指标项设置信息(TTpSeatsConfig)表服务实现类
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
@Service("tTpSeatsConfigService")
public class TTpSeatsConfigServiceImpl implements TTpSeatsConfigService {
    @Resource
    private TTpSeatsConfigDao tTpSeatsConfigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTpSeatsConfig queryById(Long id) {
        return this.tTpSeatsConfigDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TTpSeatsConfig> queryAllByLimit(int offset, int limit) {
        return this.tTpSeatsConfigDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTpSeatsConfig 实例对象
     * @return 实例对象
     */
    @Override
    public TTpSeatsConfig insert(TTpSeatsConfig tTpSeatsConfig) {
        this.tTpSeatsConfigDao.insert(tTpSeatsConfig);
        return tTpSeatsConfig;
    }

    /**
     * 修改数据
     *
     * @param tTpSeatsConfig 实例对象
     * @return 实例对象
     */
    @Override
    public TTpSeatsConfig update(TTpSeatsConfig tTpSeatsConfig) {
        this.tTpSeatsConfigDao.update(tTpSeatsConfig);
        return this.queryById(tTpSeatsConfig.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tTpSeatsConfigDao.deleteById(id) > 0;
    }
}
