package com.cliffside.factory;

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
 */
public class mian {
    public static void main(String[] args) {
        Car car = new Car();
        car.go();
    }
}
