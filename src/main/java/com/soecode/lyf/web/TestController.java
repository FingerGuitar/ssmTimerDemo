package com.soecode.lyf.web;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: admin
 * Date: 2021/7/22
 * Time: 14:37
 * auther: lixh
 * Description: No Description
 */
@Controller

@RequestMapping(value = "/swagger/test")

@Api(description = "测试接口")
public class TestController {

    @RequestMapping(value = "/swaggerTest",method = RequestMethod.GET)
    @ApiOperation("接口文档测试")
    public Object SwaggerTest(Integer id){
        if(id == 1){
            return "OK";
        }
        return "null";
    }
}
