package com.realtime.realtime.service.impl;

import com.realtime.realtime.entity.TTpPushCaseRecord;
import com.realtime.realtime.dao.TTpPushCaseRecordDao;
import com.realtime.realtime.service.TTpPushCaseRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 案例推送记录表 ;记录坐席案例推送的相关记录信息(TTpPushCaseRecord)表服务实现类
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
@Service("tTpPushCaseRecordService")
public class TTpPushCaseRecordServiceImpl implements TTpPushCaseRecordService {
    @Resource
    private TTpPushCaseRecordDao tTpPushCaseRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTpPushCaseRecord queryById(Long id) {
        return this.tTpPushCaseRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TTpPushCaseRecord> queryAllByLimit(int offset, int limit) {
        return this.tTpPushCaseRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTpPushCaseRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TTpPushCaseRecord insert(TTpPushCaseRecord tTpPushCaseRecord) {
        this.tTpPushCaseRecordDao.insert(tTpPushCaseRecord);
        return tTpPushCaseRecord;
    }

    /**
     * 修改数据
     *
     * @param tTpPushCaseRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TTpPushCaseRecord update(TTpPushCaseRecord tTpPushCaseRecord) {
        this.tTpPushCaseRecordDao.update(tTpPushCaseRecord);
        return this.queryById(tTpPushCaseRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tTpPushCaseRecordDao.deleteById(id) > 0;
    }
}
