package com.acercow.designpattern.proxy;

/**
 * Created by Jansen on 2017/9/9.
 */
class Reiz implements InterfaceVehicle {
    @Override
    public void engineStart() {
        System.out.println(":::: Reiz engineStart ::::");
    }

    @Override
    public void shift() {
        System.out.println(":::: Reiz shift ::::");
    }
}
