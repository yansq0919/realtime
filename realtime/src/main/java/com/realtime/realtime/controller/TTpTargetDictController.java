package com.realtime.realtime.controller;

import com.realtime.realtime.entity.TTpTargetDict;
import com.realtime.realtime.service.TTpTargetDictService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 指标字典表; 记录各种类别班组的对应指标项信息(TTpTargetDict)表控制层
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
@RestController
@RequestMapping("tTpTargetDict")
public class TTpTargetDictController {
    /**
     * 服务对象
     */
    @Resource
    private TTpTargetDictService tTpTargetDictService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TTpTargetDict selectOne(Long id) {
        return this.tTpTargetDictService.queryById(id);
    }

}
