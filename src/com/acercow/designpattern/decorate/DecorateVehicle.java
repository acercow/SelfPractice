package com.acercow.designpattern.decorate;

/**
 * Created by Jansen on 2017/9/9.
 */
public class DecorateVehicle implements InterfaceVehicle {

    private InterfaceVehicle vehicle;

    public DecorateVehicle(InterfaceVehicle car) {
        this.vehicle = car;
    }


    @Override
    public void engineStart() {
        System.out.println("==== DecorateVehicle ====");
        vehicle.engineStart();
        System.out.println("==== DecorateVehicle ====");

    }

    @Override
    public void shift() {
        System.out.println("==== DecorateVehicle ====");
        vehicle.shift();
        System.out.println("==== DecorateVehicle ====");

    }

    public static void main(String[] args) {
        InterfaceVehicle decorateVehicle = new DecorateVehicle(new Reiz());
        decorateVehicle.engineStart();
        decorateVehicle.shift();
    }
}
