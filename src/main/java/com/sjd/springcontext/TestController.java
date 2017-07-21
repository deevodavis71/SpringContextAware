package com.sjd.springcontext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sjd.support.IBean;

@RestController
@RequestMapping ("/api")
public class TestController {

    @Autowired
    private IBean myBean;

    @GetMapping ("/sayHello")
    public String sayHello () {

        SecurityUtils.doIt();

        return "Hello World says - " + myBean.doSomething();
    }

}