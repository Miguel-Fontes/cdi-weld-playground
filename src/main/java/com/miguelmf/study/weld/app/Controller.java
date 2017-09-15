package com.miguelmf.study.weld.app;

import javax.inject.Inject;

public class Controller {

    @Inject
    private Repositorio repositorio;

    public void greet() {
        System.out.println(repositorio.hello());
    }

}
