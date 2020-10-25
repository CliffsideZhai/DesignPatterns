package com.cliffside.factory.abstractFactory;

public class ModernFactory extends AbstractFactory {
    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Vehicle createVchicle() {
        return new Car();
    }

    @Override
    Weapon createWeapon() {
        return new Gun() ;
    }
}
