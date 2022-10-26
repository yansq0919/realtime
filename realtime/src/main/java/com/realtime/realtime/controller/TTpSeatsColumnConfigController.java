package com.realtime.realtime.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.Constant;
import com.realtime.realtime.entity.TTpSeatsColumnConfig;
import com.realtime.realtime.service.TTpSeatsColumnConfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.xml.transform.Result;
import java.util.List;

/**
 * 坐席实时状态列表自定义展示列设置表; 记录班组坐席实时状态列表中展示的指标列及顺序的设置信息(TTpSeatsColumnConfig)表控制层
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
@RestController
@RequestMapping("tTpSeatsColumnConfig")
public class TTpSeatsColumnConfigController {
    /**
     * 服务对象
     */
    @Resource
    private TTpSeatsColumnConfigService tTpSeatsColumnConfigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTpSeatsColumnConfig selectOne(Long id) {
        return this.tTpSeatsColumnConfigService.queryById(id);
    }

    @RequestMapping("/saveColumnConfig")
    public TTpSeatsColumnConfig saveTTpSeatsColumnConfig(TTpSeatsColumnConfig tTpSeatsColumnConfig) {
        TTpSeatsColumnConfig insert = tTpSeatsColumnConfigService.insert(tTpSeatsColumnConfig);
        return insert;
    }
}
