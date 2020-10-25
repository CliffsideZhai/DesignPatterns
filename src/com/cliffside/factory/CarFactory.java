package com.cliffside.factory;

//这个工厂应该是单例的
public class CarFactory {

    private CarFactory(){

    }

    private static class NewCarFactory{
        private static final CarFactory INSTANCE = new CarFactory();
    }

    public static CarFactory getInstance(){
        return NewCarFactory.INSTANCE;
    }

    public Moveable createCar(){
        //car工厂里new car
        System.out.println("我在工厂里被创建");
        return new Car();
    }

}
