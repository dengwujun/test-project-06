package com.donggua.test.testproject06.controller;

import org.springframework.web.bind.annotation.RequestBody;
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
    public Map<String, Object> test2(@RequestBody Map<String, Object> map) {

        // Map<String, String> result = new HashMap<>();
        map.put("333", "666");

        map.put("444", "master");

        return map;
    }



}
