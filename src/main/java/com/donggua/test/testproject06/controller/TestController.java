package com.donggua.test.testproject06.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        map.put("333", "b1");
        map.put("333", "这是一次错误的提交");
        map.put("333", "这是一次错误的提交2");

        map.put("444", "master");
        map.put("444", "master2");
        map.put("444", "master4");
        map.put("444", "master555");

        return map;
    }

    private Logger logger = LogManager.getLogger(TestController.class);

    @RequestMapping(value = "/log4j2", method = RequestMethod.GET)
    public String testLog(){
        try {
            logger.info("Hello 这是 info message. 信息");
            logger.error("Hello 这是 error message. 报警");
            logger.warn("Hello 这是 warn message. 警告");
            logger.debug("Hello 这是 debug message. 调试");
            logger.fatal("Hello 这是 fatal message. 严重");
        } catch (Exception e) {
            logger.error("testLog", e);
        }
        return "log success";
    }

}
