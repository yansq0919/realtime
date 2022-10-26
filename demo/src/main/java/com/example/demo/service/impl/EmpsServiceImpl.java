package com.example.demo.service.impl;

import com.example.demo.dao.emps;
import com.example.demo.entity.Emps;
import com.example.demo.service.EmpsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 功能描述
 *
 * @author 闫思晴
 * @date 2022/10/21  14:51
 */
@Service
public class EmpsServiceImpl implements EmpsService {
    @Autowired
    private emps emp;

    /**
     * 分页查询
     * @param pagestart
     * @param page
     * @return
     */
    @Override
    public List<Emps> findAll(Integer pagestart, Integer page) {
        PageHelper.startPage(pagestart,page);
        List<Emps> all = emp.findAll();
        PageInfo<Emps> empsPageInfo = new PageInfo<>(all);
        return empsPageInfo.getList();
    }

    @Override
    public int add(List<Emps> empsList) {
        int add = emp.add(empsList);
        return add;
    }

    @Override
    public int add2(Map<String, Object> map) {
        return emp.add2(map);
    }

    @Override
    public int remove(int[] ids) {
        return  emp.remove(ids);

    }

    @Override
    public int remove2(Map<String, Object> map) {
        return emp.remove2(map);
    }

    @Override
    public int update(Emps emps) {

        return emp.update(emps);
    }

    @Override
    public int update2(Map<String, Object> map) {
        return emp.update2(map);
    }


}
