package com.example.demo.app;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private static final Logger logger = LogManager.getLogger(DemoController.class);

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String search(@RequestBody String keyWord) {
        logger.info("requestParam:{}", keyWord);
        return "返回成功";
    }
}
