package com.cliffside.factory.abstractFactory;

/**
 * 为什么抽象类不用interface而要用抽象类？
 * 根据语义来区分，food是真实存在的，但是又不是具体所指
 *              moveable是各种可以移动的，可以各种实现
 * 形容词（功能性）用接口，名词（具体事物）用抽象类
 */
public abstract class AbstractFactory {

    abstract Food createFood();
    abstract Vehicle createVchicle();
    abstract Weapon createWeapon();




}
