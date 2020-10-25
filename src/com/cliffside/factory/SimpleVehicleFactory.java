package com.cliffside.factory;

/**
 * 简单工厂
 */
public class SimpleVehicleFactory {

    //before processing可以进行前置通知
    public Car createCar(){
        return new Car();
    }

    public Plane createPlane(){
        return new Plane();
    }
}
