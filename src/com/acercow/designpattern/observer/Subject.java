package com.acercow.designpattern.observer;


import java.util.ArrayList;
import java.util.List;

public class Subject {

    private String states;
    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void dettach(Observer observer) {
        observers.remove(observer);
    }

    public void setStates(String states) {
        this.states = states;
        notifyDataChanged();
    }

    public String getStates() {
        return states;
    }

    public void notifyDataChanged() {
        for (Observer obs : observers) {
            obs.update();
        }
    }

    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.attach(new FirstObserver(subject));
        subject.attach(new SecondObserver(subject));
        subject.setStates("Acercow");
    }
}
