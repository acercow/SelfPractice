package com.acercow.designpattern.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        Handler successor1 = new ConcreteHandler();
        Handler successor2 = new ConcreteHandler();

        successor1.setSuccessor(successor2);

        successor1.handleRequest();
    }
}
