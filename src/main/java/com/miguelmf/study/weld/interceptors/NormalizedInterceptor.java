package com.miguelmf.study.weld.interceptors;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Transactional @Interceptor
public class NormalizedInterceptor {

    @AroundInvoke
    public Object normalize(InvocationContext ctx) throws Exception {

        System.out.println("<NormalizedInterceptor> - Iniciando a execução do método [" + ctx.getMethod().getName() + "]");

        Object result = ctx.proceed();

        System.out.println("<NormalizedInterceptor> - Execução do método [" + ctx.getMethod().getName() +
                "] finalizada, com valor [" + result + "]" );

        return result.toString().toUpperCase();
    }

    @PostConstruct
    public void alertConstruct(InvocationContext ctx) {
        System.out.println("POST CONSTRUCT");
    }

    @PreDestroy
    public void alertDestroy(InvocationContext ctx) {
        System.out.println("POST DESTROY");
    }

}
