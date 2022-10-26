package com.realtime.realtime.controller;

import com.realtime.realtime.entity.TTpSeatsColumnConfig;
import com.realtime.realtime.entity.TTpSeatsConfig;
import com.realtime.realtime.service.TTpSeatsConfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * 班组坐席实时状态设置表; 记录班组班组实时状态列表的指标项设置信息(TTpSeatsConfig)表控制层
 *
 * @author makejava
 * @since 2021-08-16 18:15:41
 */
@RestController
@RequestMapping("/tTpSeatsConfig")
public class TTpSeatsConfigController {
    /**
     * 服务对象
     */
    @Resource
    private TTpSeatsConfigService tTpSeatsConfigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("/selectOne")
    public TTpSeatsConfig selectOne(Long id) {
        return this.tTpSeatsConfigService.queryById(id);
    }

    /**
     * 改
     * @param tTpSeatsConfig
     * @return
     */
    @PostMapping("/update")
    public TTpSeatsConfig update(TTpSeatsConfig tTpSeatsConfig){
        TTpSeatsConfig update = tTpSeatsConfigService.update(tTpSeatsConfig);
        return update;
    }

    /**
     * 删
     * @param id
     * @return
     */
    @GetMapping("/deleteId")
    public boolean delete(Long id){
        return this.tTpSeatsConfigService.deleteById(id);
    }

    /**
     * 插入
     * @param tTpSeatsConfig
     * @return
     */
    @PostMapping("/insert" )
    public TTpSeatsConfig insert(TTpSeatsConfig tTpSeatsConfig){
        TTpSeatsConfig insert = tTpSeatsConfigService.insert(tTpSeatsConfig);
        return insert;
    }

    /**
     * 查询所有
     * @param offset
     * @param limit
     * @return
     */
    @PostMapping("/queryAllByLimit")
    public List<TTpSeatsConfig> queryAllByLimit(Integer offset, Integer limit){
        return this.tTpSeatsConfigService.queryAllByLimit(offset,limit);
    }
}
