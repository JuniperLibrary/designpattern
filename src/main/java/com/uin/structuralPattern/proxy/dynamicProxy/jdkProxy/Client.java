package com.uin.structuralPattern.proxy.dynamicProxy.jdkProxy;

import com.uin.structuralPattern.proxy.staticProxy.RealSubject;
import com.uin.structuralPattern.proxy.staticProxy.Subject;

public class Client {
    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();

        DynamicProxyJdk handler = new DynamicProxyJdk(realSubject);
        Subject subject = (Subject) handler.getProxyObject(handler);
        subject.request();
    }
}
