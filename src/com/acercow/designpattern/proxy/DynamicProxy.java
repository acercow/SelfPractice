package com.acercow.designpattern.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;

public class DynamicProxy {

    public static void main(String[] args) {

        ISubject subject = new Subject();
        DProxy handler = new DProxy(subject);

        ISubject proxySubject = (ISubject) Proxy.newProxyInstance(Subject.class.getClassLoader(),
                subject.getClass().getInterfaces(), handler);

        proxySubject.show();
    }

}


class DProxy implements InvocationHandler {

    private Object subject;

    public DProxy(Object subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("+++++++++++");
        method.invoke(subject, args);
        System.out.println("+++++++++++");
        return null;
    }
}

class Subject implements ISubject {

    @Override
    public void show() {
        System.out.println("Subject");
    }
}

interface ISubject {
    void show();
}