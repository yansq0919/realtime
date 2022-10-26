package com.realtime.realtime.controller;

import com.realtime.realtime.entity.TTpObjTargetConfig;
import com.realtime.realtime.service.TTpObjTargetConfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 个人和班组目标值设置表 ;记录个人和班组的每一个指标的目标值数据(TTpObjTargetConfig)表控制层
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
@RestController
@RequestMapping("tTpObjTargetConfig")
public class TTpObjTargetConfigController {
    /**
     * 服务对象
     */
    @Resource
    private TTpObjTargetConfigService tTpObjTargetConfigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTpObjTargetConfig selectOne(Long id) {
        return this.tTpObjTargetConfigService.queryById(id);
    }

}
