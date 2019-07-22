package com.lanhei.patterns.abstractfactory;

public class Test {
    public static void main(String[] args) {
        Factory factory;
        Gun gun;
        Bullet bullet;

        factory =new AK_Factory();
        bullet=factory.produceBullet();
        bullet.load();
        gun=factory.produceGun();
        gun.shooting();
    }
}
