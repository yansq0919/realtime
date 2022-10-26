package com.realtime.realtime.service.impl;

import com.realtime.realtime.entity.TTpObjTargetConfig;
import com.realtime.realtime.dao.TTpObjTargetConfigDao;
import com.realtime.realtime.service.TTpObjTargetConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 个人和班组目标值设置表 ;记录个人和班组的每一个指标的目标值数据(TTpObjTargetConfig)表服务实现类
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
@Service("tTpObjTargetConfigService")
public class TTpObjTargetConfigServiceImpl implements TTpObjTargetConfigService {
    @Resource
    private TTpObjTargetConfigDao tTpObjTargetConfigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTpObjTargetConfig queryById(Long id) {
        return this.tTpObjTargetConfigDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TTpObjTargetConfig> queryAllByLimit(int offset, int limit) {
        return this.tTpObjTargetConfigDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTpObjTargetConfig 实例对象
     * @return 实例对象
     */
    @Override
    public TTpObjTargetConfig insert(TTpObjTargetConfig tTpObjTargetConfig) {
        this.tTpObjTargetConfigDao.insert(tTpObjTargetConfig);
        return tTpObjTargetConfig;
    }

    /**
     * 修改数据
     *
     * @param tTpObjTargetConfig 实例对象
     * @return 实例对象
     */
    @Override
    public TTpObjTargetConfig update(TTpObjTargetConfig tTpObjTargetConfig) {
        this.tTpObjTargetConfigDao.update(tTpObjTargetConfig);
        return this.queryById(tTpObjTargetConfig.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tTpObjTargetConfigDao.deleteById(id) > 0;
    }
}
