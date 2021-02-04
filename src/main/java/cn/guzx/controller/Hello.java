package cn.guzx.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "测试接口")
public class Hello {

    @ApiOperation(value = "说明方法的作用",notes = "方法的备注说明")
    @ApiImplicitParam(name = "name",value = "用户名",required = true,paramType = "String",defaultValue = "谷志雄")
    @GetMapping("/hello/{name}")
    public String test(@PathVariable String name){
        return "Hello word "+name;
    }
}
