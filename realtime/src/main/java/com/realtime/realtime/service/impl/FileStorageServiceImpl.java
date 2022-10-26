package com.realtime.realtime.service.impl;

import com.realtime.realtime.entity.FileStorage;
import com.realtime.realtime.dao.FileStorageDao;
import com.realtime.realtime.entity.TTpWarningRecord;
import com.realtime.realtime.service.FileStorageService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 附件存储地址表 记录各业务表中上传附件的存储地址(FileStorage)表服务实现类
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
@Service("fileStorageService")
public class FileStorageServiceImpl implements FileStorageService {
    @Resource
    private FileStorageDao fileStorageDao;


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public FileStorage queryById(Long id) {
        return this.fileStorageDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<FileStorage> queryAllByLimit(int offset, int limit) {
        return this.fileStorageDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param fileStorage 实例对象
     * @return 实例对象
     */
    @Override
    public FileStorage insert(FileStorage fileStorage) {
        this.fileStorageDao.insert(fileStorage);
        return fileStorage;
    }

    /**
     * 修改数据
     *
     * @param fileStorage 实例对象
     * @return 实例对象
     */
    @Override
    public FileStorage update(FileStorage fileStorage) {
        this.fileStorageDao.update(fileStorage);
        return this.queryById(fileStorage.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.fileStorageDao.deleteById(id) > 0;
    }
}
