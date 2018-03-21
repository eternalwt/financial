package com.hulk.financial.com.hulk.financial.test;

import com.hulk.financial.com.hulk.financial.entity.Globalmacro;
import com.hulk.financial.com.hulk.financial.entity.GlobalmacroMapper;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    GlobalmacroMapper globalmacroMapper;

    @ApiOperation(value="测试swagger2", notes="swagger2的第一个例子")
    @RequestMapping(value = "hello", method = RequestMethod.GET)
    @ResponseBody
    public String sayHello() {
        logger.error("log output");
        return "Hello, world!";
    }

    @RequestMapping("getmacro")
    @ResponseBody
    public String getGlobalmacro() {
        Globalmacro globalmacro = globalmacroMapper.findUserByValue("(JSON");
        if (globalmacro != null) {
            return globalmacro.getName();
        }

        return "";
    }

}
