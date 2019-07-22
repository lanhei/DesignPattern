package com.lanhei.patterns.abstractfactory;

public class M4A1_Factory implements Factory {
    /** @pdOid c1cfb228-9964-486f-a700-f836057a64c0 */
    @Override
    public Gun produceGun() {
        return new M4A1();
    }

    /** @pdOid e13b6f4e-ab51-4c20-90cc-f2757a7f56c4 */
    @Override
    public Bullet produceBullet() {
        return new M4A1_Bullet();
    }
}
