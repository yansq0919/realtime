package com.realtime.realtime.service.impl;

import com.realtime.realtime.entity.TTpTargetDict;
import com.realtime.realtime.dao.TTpTargetDictDao;
import com.realtime.realtime.service.TTpTargetDictService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 指标字典表; 记录各种类别班组的对应指标项信息(TTpTargetDict)表服务实现类
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
@Service("tTpTargetDictService")
public class TTpTargetDictServiceImpl implements TTpTargetDictService {
    @Resource
    private TTpTargetDictDao tTpTargetDictDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTpTargetDict queryById(Long id) {
        return this.tTpTargetDictDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TTpTargetDict> queryAllByLimit(int offset, int limit) {
        return this.tTpTargetDictDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTpTargetDict 实例对象
     * @return 实例对象
     */
    @Override
    public TTpTargetDict insert(TTpTargetDict tTpTargetDict) {
        this.tTpTargetDictDao.insert(tTpTargetDict);
        return tTpTargetDict;
    }

    /**
     * 修改数据
     *
     * @param tTpTargetDict 实例对象
     * @return 实例对象
     */
    @Override
    public TTpTargetDict update(TTpTargetDict tTpTargetDict) {
        this.tTpTargetDictDao.update(tTpTargetDict);
        return this.queryById(tTpTargetDict.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tTpTargetDictDao.deleteById(id) > 0;
    }
}
