package com.realtime.realtime.controller;

import com.realtime.realtime.entity.TTpHelpAndSupportRecord;
import com.realtime.realtime.service.TTpHelpAndSupportRecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 坐席求助支撑记录表 ;记录坐席求助与被支撑的记录表(TTpHelpAndSupportRecord)表控制层
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
@RestController
@RequestMapping("tTpHelpAndSupportRecord")
public class TTpHelpAndSupportRecordController {
    /**
     * 服务对象
     */
    @Resource
    private TTpHelpAndSupportRecordService tTpHelpAndSupportRecordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTpHelpAndSupportRecord selectOne(Long id) {
        return this.tTpHelpAndSupportRecordService.queryById(id);
    }

}
