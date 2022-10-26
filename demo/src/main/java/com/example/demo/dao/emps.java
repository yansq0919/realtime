package com.example.demo.dao;

import com.example.demo.entity.Emps;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @author 闫思晴
 * @date 2022/10/21  14:42
 */
@Mapper
public interface emps {
    //分页查询
    List<Emps> findAll();
    int add(List<Emps> empsList);//批量新增
    int add2(Map<String,Object> map);
    int remove(int[] ids);
    int remove2(Map<String,Object> map);
    int update(Emps emps);//更新
    int update2(Map<String,Object> map);
}
