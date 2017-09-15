package com.miguelmf.study.weld.interceptors;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

@Transactional @Interceptor
public class TransactionalInterceptor {

    @AroundInvoke
    public Object log(InvocationContext ctx) throws Exception {

        System.out.println("<TransactionalInterceptor> - Iniciando a execução do método [" + ctx.getMethod().getName() + "]");

        Object result = ctx.proceed();

        System.out.println("<TransactionalInterceptor> - Execução do método [" + ctx.getMethod().getName() +
                "] finalizada, com valor [" + result + "]" );

        return result;
    }

}
