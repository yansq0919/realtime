package com.realtime.realtime.controller;

import com.realtime.realtime.entity.FileStorage;
import com.realtime.realtime.service.FileStorageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 附件存储地址表 记录各业务表中上传附件的存储地址(FileStorage)表控制层
 *
 * @author makejava
 * @since 2021-08-16 18:15:39
 */

@RestController
@RequestMapping("/fileStorage")
public class FileStorageController {
    /**
     * 服务对象
     */
    @Resource
    private FileStorageService fileStorageService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public FileStorage selectOne(Long id) {
        System.out.println("hello,world!");
        return this.fileStorageService.queryById(id);
    }
    @RequestMapping("/test")
    public String test() {

        return "success"+"hello world!";
    }


    @GetMapping("queryAllByLimit")

    public List<FileStorage> selectall(int a,int b){

        List<FileStorage> s=new ArrayList<>();
        s=fileStorageService.queryAllByLimit(a,b);
        return s;
    }
}
