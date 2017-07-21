package com.sjd.springcontext;

import org.springframework.context.ApplicationContext;

import com.sjd.support.IBean;

public class SecurityUtils {

    static public void doIt () {

        ApplicationContext context = ApplicationContextProvider.getApplicationContext();
        IBean bean = context.getBean (IBean.class);

        System.out.println ("Context is : " + context + ", bean = " + bean + ", doSomething = " + bean.doSomething());

    }

}