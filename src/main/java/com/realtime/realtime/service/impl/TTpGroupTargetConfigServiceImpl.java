package com.realtime.realtime.service.impl;

import com.realtime.realtime.entity.TTpGroupTargetConfig;
import com.realtime.realtime.dao.TTpGroupTargetConfigDao;
import com.realtime.realtime.service.TTpGroupTargetConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 班组考核指标设置表 ;记录班组考核指标的设置信息(TTpGroupTargetConfig)表服务实现类
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
@Service("tTpGroupTargetConfigService")
public class TTpGroupTargetConfigServiceImpl implements TTpGroupTargetConfigService {
    @Resource
    private TTpGroupTargetConfigDao tTpGroupTargetConfigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTpGroupTargetConfig queryById(Long id) {
        return this.tTpGroupTargetConfigDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TTpGroupTargetConfig> queryAllByLimit(int offset, int limit) {
        return this.tTpGroupTargetConfigDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTpGroupTargetConfig 实例对象
     * @return 实例对象
     */
    @Override
    public TTpGroupTargetConfig insert(TTpGroupTargetConfig tTpGroupTargetConfig) {
        this.tTpGroupTargetConfigDao.insert(tTpGroupTargetConfig);
        return tTpGroupTargetConfig;
    }

    /**
     * 修改数据
     *
     * @param tTpGroupTargetConfig 实例对象
     * @return 实例对象
     */
    @Override
    public TTpGroupTargetConfig update(TTpGroupTargetConfig tTpGroupTargetConfig) {
        this.tTpGroupTargetConfigDao.update(tTpGroupTargetConfig);
        return this.queryById(tTpGroupTargetConfig.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tTpGroupTargetConfigDao.deleteById(id) > 0;
    }
}
