package com.acercow.designpattern.observer;

public class SecondObserver extends Observer {
    public SecondObserver(Subject subject) {
        super.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("==== SecondObserver :: " + subject.getStates() + " ====");
    }
}
