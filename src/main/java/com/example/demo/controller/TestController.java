package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuwl
 * @date 2018/8/24 16:22
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String Test(){
        return "test_demo";
    }
}
