package com.cliffside.factory.abstractFactory;

public class Gun extends Weapon {
    @Override
    void shoot() {
        System.out.println("滴滴装着武器");
    }
}
