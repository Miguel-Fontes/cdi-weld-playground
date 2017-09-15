package com.miguelmf.study.weld.decorators;

import com.miguelmf.study.weld.app.DaoI;

import javax.annotation.Priority;
import javax.decorator.Decorator;
import javax.decorator.Delegate;
import javax.enterprise.inject.Any;
import javax.inject.Inject;

@Priority(value = 10)
@Decorator
public class LoggingDecorator implements DaoI {
    @Inject @Delegate @Any DaoI dao;

    @Override
    public String hello() {
        System.out.println("<Logging Decorator>.......");
        return dao.hello();
    }
}
