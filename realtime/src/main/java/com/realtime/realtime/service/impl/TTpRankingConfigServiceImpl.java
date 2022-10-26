package com.realtime.realtime.service.impl;

import com.realtime.realtime.entity.TTpRankingConfig;
import com.realtime.realtime.dao.TTpRankingConfigDao;
import com.realtime.realtime.service.TTpRankingConfigService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 排行榜设置表; 记录组内或组间排行旁的设置信息(TTpRankingConfig)表服务实现类
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
@Service("tTpRankingConfigService")
public class TTpRankingConfigServiceImpl implements TTpRankingConfigService {
    @Resource
    private TTpRankingConfigDao tTpRankingConfigDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTpRankingConfig queryById(Long id) {
        return this.tTpRankingConfigDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TTpRankingConfig> queryAllByLimit(int offset, int limit) {
        return this.tTpRankingConfigDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTpRankingConfig 实例对象
     * @return 实例对象
     */
    @Override
    public TTpRankingConfig insert(TTpRankingConfig tTpRankingConfig) {
        this.tTpRankingConfigDao.insert(tTpRankingConfig);
        return tTpRankingConfig;
    }

    /**
     * 修改数据
     *
     * @param tTpRankingConfig 实例对象
     * @return 实例对象
     */
    @Override
    public TTpRankingConfig update(TTpRankingConfig tTpRankingConfig) {
        this.tTpRankingConfigDao.update(tTpRankingConfig);
        return this.queryById(tTpRankingConfig.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tTpRankingConfigDao.deleteById(id) > 0;
    }
}
