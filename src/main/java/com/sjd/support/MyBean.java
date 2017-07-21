package com.sjd.support;

import org.springframework.stereotype.Component;

@Component
public class MyBean implements IBean {

    public String doSomething () {
        return "From the Bean!";
    }

}