package com.miguelmf.study.weld.events;

import javax.enterprise.event.Observes;

public class PeekMessage {

    public void peek(@Observes @Message String message) {
        System.out.println("<PeekMessage> - Mensagem: [" + message + "]");
    }

}
