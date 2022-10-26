package com.example.demo.service;

import com.example.demo.entity.Emps;

import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @author 闫思晴
 * @date 2022/10/21  14:50
 */
public interface EmpsService {
    List<Emps> findAll(Integer pagestart,Integer page);
    int add(List<Emps> empsList);
    int add2(Map<String,Object> map);
    int remove(int[] ids);
    int remove2(Map<String,Object> map);
    int update(Emps emps);
    int update2(Map<String,Object> map);
}
