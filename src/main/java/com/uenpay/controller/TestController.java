package com.uenpay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @program: study_springcloud
 * @description: 测试controller
 * @author: jyc
 * * @create: 2020-09-03 17:24
 **/
@Controller
@RequestMapping(value = "test")
public class TestController {

    @RequestMapping(value = "gettest")
    @ResponseBody
    public String getTest(String data){
        System.out.println(data);
        return  data;
    }
}
