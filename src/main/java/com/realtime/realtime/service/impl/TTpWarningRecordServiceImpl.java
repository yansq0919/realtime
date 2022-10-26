package com.realtime.realtime.service.impl;

import com.realtime.realtime.entity.TTpWarningRecord;
import com.realtime.realtime.dao.TTpWarningRecordDao;
import com.realtime.realtime.service.TTpWarningRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 话务预警记录表 ;记录坐席的话务预警信息(TTpWarningRecord)表服务实现类
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
@Service("tTpWarningRecordService")
public class TTpWarningRecordServiceImpl implements TTpWarningRecordService {
    @Resource
    private TTpWarningRecordDao tTpWarningRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTpWarningRecord queryById(Long id) {
        return this.tTpWarningRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TTpWarningRecord> queryAllByLimit(int offset, int limit) {
        return this.tTpWarningRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTpWarningRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TTpWarningRecord insert(TTpWarningRecord tTpWarningRecord) {
        this.tTpWarningRecordDao.insert(tTpWarningRecord);
        return tTpWarningRecord;
    }

    /**
     * 修改数据
     *
     * @param tTpWarningRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TTpWarningRecord update(TTpWarningRecord tTpWarningRecord) {
        this.tTpWarningRecordDao.update(tTpWarningRecord);
        return this.queryById(tTpWarningRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tTpWarningRecordDao.deleteById(id) > 0;
    }
}
