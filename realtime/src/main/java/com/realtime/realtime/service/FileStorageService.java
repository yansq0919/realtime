package com.realtime.realtime.service;

import com.realtime.realtime.entity.FileStorage;

import java.util.List;

/**
 * 附件存储地址表 记录各业务表中上传附件的存储地址(FileStorage)表服务接口
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
public interface FileStorageService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    FileStorage queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<FileStorage> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param fileStorage 实例对象
     * @return 实例对象
     */
    FileStorage insert(FileStorage fileStorage);

    /**
     * 修改数据
     *
     * @param fileStorage 实例对象
     * @return 实例对象
     */
    FileStorage update(FileStorage fileStorage);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
