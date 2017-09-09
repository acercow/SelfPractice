package com.acercow.designpattern.proxy;


/**
 * Created by Jansen on 2017/9/9.
 */
public class ProxyVehicle implements InterfaceVehicle {
    InterfaceVehicle vehicle;

    public ProxyVehicle() {
        this.vehicle = new Reiz();
    }

    @Override
    public void engineStart() {
        System.out.println("==== ProxyVehicle ====");
        vehicle.engineStart();
    }

    @Override
    public void shift() {
        System.out.println("==== ProxyVehicle ====");
        vehicle.shift();
    }

    public static void main(String[] args) {
        InterfaceVehicle proxyVehicle = new ProxyVehicle();
        proxyVehicle.engineStart();
        proxyVehicle.shift();
    }
}
