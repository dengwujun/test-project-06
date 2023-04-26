package com.donggua.test.testproject06.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {


    @RequestMapping("test")
    public Map<String, String> test(String value) {

        System.out.println("打印一下");
        Map<String, String> result = new HashMap<>();
        result.put("333", value);

        return result;
    }

    @RequestMapping("test2")
    public Map<String, String> test2(String value) {

        Map<String, String> result = new HashMap<>();
        result.put("333", value);

        return result;
    }



}
