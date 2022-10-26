package com.realtime.realtime.controller;

import com.realtime.realtime.entity.TTpGroupTargetConfig;
import com.realtime.realtime.service.TTpGroupTargetConfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 班组考核指标设置表 ;记录班组考核指标的设置信息(TTpGroupTargetConfig)表控制层
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */
@RestController
@RequestMapping("tTpGroupTargetConfig")
public class TTpGroupTargetConfigController {
    /**
     * 服务对象
     */
    @Resource
    private TTpGroupTargetConfigService tTpGroupTargetConfigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTpGroupTargetConfig selectOne(Long id) {
        return this.tTpGroupTargetConfigService.queryById(id);
    }

}
