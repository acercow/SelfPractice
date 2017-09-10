package com.acercow.designpattern.chainofresponsibility;

public class ConcreteHandler extends Handler {

    @Override
    public void handleRequest() {
        if(getSuccessor() != null) {
            System.out.println("==== abandon ====");
            getSuccessor().handleRequest();
        } else {
            System.out.println("==== handleRequest ====");
        }
    }
}
