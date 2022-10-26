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
    @RequestMapping( "/dd")
    @ResponseBody
    public ModelAndView test(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("demo.html");
        return modelAndView;
    }
}
