package com.realtime.realtime.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.xml.ws.RequestWrapper;

/**
 * 功能描述
 *
 * @author 闫思晴
 * @date 2022/06/29  16:58
 */
@Controller
public class testcontroller {
    //注解类时标注请求的路径，标注方法时表示将特定的URL映射到指定的方法。
    @RequestMapping( "/dd")
    //该方法的返回值会被解析成json
    @ResponseBody
    public ModelAndView test(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("demo.html");
        return modelAndView;
    }
    @RequestMapping("/ee")
    @ResponseBody
    public String  tets1(){
        return "hello,world!";
    }
}
