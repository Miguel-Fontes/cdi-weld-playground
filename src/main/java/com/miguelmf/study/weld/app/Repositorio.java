package com.miguelmf.study.weld.app;

import javax.inject.Inject;

public class Repositorio {

    @Inject
    private Dao dao;

    public String hello() {
        return dao.hello();
    }

}
