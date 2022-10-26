package com.realtime.realtime.controller;

import com.realtime.realtime.entity.TTpRankingConfig;
import com.realtime.realtime.service.TTpRankingConfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 排行榜设置表; 记录组内或组间排行旁的设置信息(TTpRankingConfig)表控制层
 *
 * @author makejava
 * @since 2021-08-16 18:15:40
 */
@RestController
@RequestMapping("tTpRankingConfig")
public class TTpRankingConfigController {
    /**
     * 服务对象
     */
    @Resource
    private TTpRankingConfigService tTpRankingConfigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTpRankingConfig selectOne(Long id) {
        return this.tTpRankingConfigService.queryById(id);
    }

}
