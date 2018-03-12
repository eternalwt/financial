package com.hulk.financial.com.hulk.financial.test;

import io.swagger.annotations.ApiOperation;
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
    @ApiOperation(value="测试swagger2", notes="swagger2的第一段代码")
    @RequestMapping(value = "hello", method = RequestMethod.POST)
    @ResponseBody
    public String sayHello() {
        return "Hello, world!";
    }
}
