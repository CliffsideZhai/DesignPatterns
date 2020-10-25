package com.cliffside.factory.factoryMethod;

/**
 * 工厂模式
 *
 * 任何可以产生对象的方法或者类，都可以称之为工厂，
 * 单例也是一种工厂
 *
 * 除了new的方式，有了工厂可以更加灵活的控制生产过程
 * 权限、修饰、日志
 *
 * @author windo
 * 工厂方法在产品维度容易扩展，例如我想要car就由carfactory，想要plane就有planefactory
 * 抽象工厂，在产品一组进行扩展较容易，比如我modernfactory工厂，可以直接生成现代的三种物品
 *
 * 任意定制交通工具：继承moveable接口即可
 * 任意定义生产过程，实现各种VchicleFactory既可
 */
public class main {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();

        Moveable moveable = new Car();
        moveable.go();

        Moveable m = CarFactory.getInstance().createCar();
        m.go();
    }
}
