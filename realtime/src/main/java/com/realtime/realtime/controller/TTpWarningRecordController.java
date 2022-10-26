package com.realtime.realtime.controller;

import com.realtime.realtime.entity.TTpWarningRecord;
import com.realtime.realtime.service.TTpWarningRecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 话务预警记录表 ;记录坐席的话务预警信息(TTpWarningRecord)表控制层
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
@RestController
@RequestMapping("tTpWarningRecord")
public class TTpWarningRecordController {
    /**
     * 服务对象
     */
    @Resource
    private TTpWarningRecordService tTpWarningRecordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTpWarningRecord selectOne(Long id) {
        return this.tTpWarningRecordService.queryById(id);
    }

}
