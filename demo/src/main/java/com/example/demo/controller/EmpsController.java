package com.example.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.entity.Emps;
import com.example.demo.service.EmpsService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @author 闫思晴
 * @date 2022/10/21  14:56
 */
@RestController
@Slf4j
@RequestMapping("/emps")
public class EmpsController {
    @Autowired
    private EmpsService empsService;
    @PostMapping("/page")
    public List<Emps> findAll(@RequestBody Map<String,Object> map){
        String pagestart = (String)map.get("pagestart");
        int i = Integer.parseInt(pagestart);
        String page = (String)map.get("page");
        int i1 = Integer.parseInt(page);
        return  empsService.findAll(i, i1);

    }
    @PostMapping("/page2")
    public List<Emps> findAll(@RequestBody String s){
        System.out.println(s+"----");
        JSONObject jsonObject = JSONObject.parseObject(s);
        String a = jsonObject.getString("a");
        String b = jsonObject.getString("b");

        int i = Integer.parseInt(a);
        int i1 = Integer.parseInt(b);
        return  empsService.findAll(i,i1);

    }
    @PostMapping("/add")
    public int add(@RequestBody Map<String,Object> map){
        List<Emps> list = (List<Emps>)map.get("list");

        for (Emps e:list){
            System.out.println(e);

        }
        return empsService.add(list);
    }
    @PostMapping("add2")
    public int add2(@RequestBody Map<String,Object> map){
        return empsService.add2(map);
    }
    @PostMapping("/remove")
    public int remove(@RequestBody Map<String,Object> map){
        String ids = (String)map.get("ids");
        String[] split = ids.split(",");
        int[] idss=new int[split.length];
        for (int i=0;i<split.length;i++){
            idss[i]=Integer.parseInt(split[i]);

        }

        return empsService.remove(idss);
    }


    @PostMapping("remove2")
    public int remove2(@RequestBody Map<String ,Object> map){
        log.info(map.toString());
        return empsService.remove2(map);
    }


    @PostMapping("/update")
    public int update(@RequestBody Map<String,Object> map){
        String id = (String)map.get("id");
        int i1 = Integer.parseInt(id);
        String age = (String)map.get("age");
        int i = Integer.parseInt(age);
        String name = (String)map.get("name");
        String salary = (String)map.get("salary");

        Emps e=new Emps();
        e.setId(i1);
        e.setAge(i);
        e.setName(name);
        e.setSalary(salary);
        return empsService.update(e);
    }
    @PostMapping("/update2")
    public int update2(@RequestBody Map<String,Object> map){
        return empsService.update2(map);
    }
}
