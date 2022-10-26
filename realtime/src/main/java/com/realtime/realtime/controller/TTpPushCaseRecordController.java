package com.realtime.realtime.controller;

import com.realtime.realtime.entity.TTpPushCaseRecord;
import com.realtime.realtime.service.TTpPushCaseRecordService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 案例推送记录表 ;记录坐席案例推送的相关记录信息(TTpPushCaseRecord)表控制层
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
@RestController
@RequestMapping("tTpPushCaseRecord")
public class TTpPushCaseRecordController {
    /**
     * 服务对象
     */
    @Resource
    private TTpPushCaseRecordService tTpPushCaseRecordService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTpPushCaseRecord selectOne(Long id) {
        return this.tTpPushCaseRecordService.queryById(id);
    }

}
