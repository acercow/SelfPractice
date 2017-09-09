package com.acercow.designpattern.adapter;

/**
 * Created by Jansen on 2017/9/9.
 */
public class ReizAdaptee {
    public void engineStart() {
        System.out.println(":::: Reiz engineStart ::::");
    }

    public void shift() {
        System.out.println(":::: Reiz shift ::::");
    }
}
