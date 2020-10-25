package com.cliffside.factory.abstractFactory;

import com.cliffside.factory.factoryMethod.Car;
import com.cliffside.factory.factoryMethod.CarFactory;
import com.cliffside.factory.factoryMethod.Moveable;

/**
 * 工厂模式
 * 为了任意定制产品一族，例如抽象工厂可以生成武器、面包、车
 * @author  cliffside
 */
public class main {
    public static void main(String[] args) {

        AbstractFactory factory = new ModernFactory();
        Vehicle vehicle= factory.createVchicle();
        Food food = factory.createFood();
        Weapon weapon = factory.createWeapon();

        vehicle.go();food.printName();weapon.shoot();
    }
}
