package com.sjd.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyBean implements IBean {

    @Autowired
    private IOther other;

    public String doSomething () {
        return "From the Bean! (" + other.doOther() + ")";
    }

}