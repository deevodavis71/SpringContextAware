package com.sjd.support;

import org.springframework.stereotype.Component;

@Component
public class MyOther implements IOther {

    public String doOther () {
        return "Doing the Other!";
    }

}