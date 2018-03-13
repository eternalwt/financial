package com.hulk.financial.com.hulk.financial.test;

import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;

/**
 * Created by HulkGao on 2018/3/12 0012.
 */
@Controller
@RequestMapping("/")
public class TestController {
    public static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @ApiOperation(value="测试swagger2", notes="swagger2的第一段代码")
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        logger.error("log output");
        return "Hello, world!";
    }
}
