package com.acercow.designpattern.observer;

public class FirstObserver extends Observer {

    public FirstObserver(Subject subject) {
        super.subject = subject;
    }

    @Override
    public void update() {
        System.out.println("==== FirstObserver :: " + subject.getStates() + " ====");
    }
}
