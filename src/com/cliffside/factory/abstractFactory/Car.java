package com.cliffside.factory.abstractFactory;

import com.cliffside.factory.factoryMethod.Moveable;

/**
 *
 * @author windo
 */
public class Car extends Vehicle{

    @Override
    public void go(){
        System.out.println("滴滴开走了");
    }
}
