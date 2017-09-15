package com.miguelmf.study.weld.app;

import com.miguelmf.study.weld.events.Message;
import com.miguelmf.study.weld.interceptors.Normalized;

import javax.enterprise.event.Event;
import javax.inject.Inject;

@Normalized
public class Dao implements DaoI {

    @Inject @Message
    Event<String> events;

    public String hello() {
        String message = "Hello World";
        events.fire(message);
        return message;
    }
}
