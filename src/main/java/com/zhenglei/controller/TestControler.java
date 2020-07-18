package com.zhenglei.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class TestControler {
    // logback
    private final static Logger logger = LoggerFactory.getLogger(TestControler.class);

    @RequestMapping("/index")
    public String index() {
//        logger.debug("记录debug日志");
//        logger.info("访问了index方法");
        logger.error("55.3.244.1 GET /index.html 15824 "+new Random().nextInt(100));
        return "index";
    }

}
