package com.realtime.realtime.service.impl;

import com.realtime.realtime.entity.TTpHelpAndSupportRecord;
import com.realtime.realtime.dao.TTpHelpAndSupportRecordDao;
import com.realtime.realtime.service.TTpHelpAndSupportRecordService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 坐席求助支撑记录表 ;记录坐席求助与被支撑的记录表(TTpHelpAndSupportRecord)表服务实现类
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
@Service("tTpHelpAndSupportRecordService")
public class TTpHelpAndSupportRecordServiceImpl implements TTpHelpAndSupportRecordService {
    @Resource
    private TTpHelpAndSupportRecordDao tTpHelpAndSupportRecordDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TTpHelpAndSupportRecord queryById(Long id) {
        return this.tTpHelpAndSupportRecordDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TTpHelpAndSupportRecord> queryAllByLimit(int offset, int limit) {
        return this.tTpHelpAndSupportRecordDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tTpHelpAndSupportRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TTpHelpAndSupportRecord insert(TTpHelpAndSupportRecord tTpHelpAndSupportRecord) {
        this.tTpHelpAndSupportRecordDao.insert(tTpHelpAndSupportRecord);
        return tTpHelpAndSupportRecord;
    }

    /**
     * 修改数据
     *
     * @param tTpHelpAndSupportRecord 实例对象
     * @return 实例对象
     */
    @Override
    public TTpHelpAndSupportRecord update(TTpHelpAndSupportRecord tTpHelpAndSupportRecord) {
        this.tTpHelpAndSupportRecordDao.update(tTpHelpAndSupportRecord);
        return this.queryById(tTpHelpAndSupportRecord.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.tTpHelpAndSupportRecordDao.deleteById(id) > 0;
    }
}
