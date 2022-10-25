package com.uin.structuralPattern.proxy.dynamicProxy.cglib;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

@Slf4j
public class DynamicProxyCglib implements MethodInterceptor {
    private Object sub;


    public DynamicProxyCglib(Object sub) {
        this.sub = sub;
    }

    public Object getProxyObject(Object object) {
        // 创建目标增强对象
        Enhancer enhancer = new Enhancer();
        // 指定目标类，即父类
        enhancer.setSuperclass(object.getClass());
        // 设置回调接口对象
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        try {
            // 前置通知
            //。。。。

            // 真实角色所完成的事情
            method.invoke(sub, objects);

            // 后置通知
            // 。。。。
        }catch (Exception e){
            // 异常通知
        }finally {
            // 最终通知
        }


        this.beforeRequest();
        method.invoke(sub, objects);
        this.afterRequest();
        return null;
    }

    private void beforeRequest() {
        log.info("before request!");
    }

    private void afterRequest() {
        log.info("after request");
    }
}
