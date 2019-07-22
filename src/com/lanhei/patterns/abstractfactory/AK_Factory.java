package com.lanhei.patterns.abstractfactory;

public class AK_Factory implements Factory {
    /** @pdOid fc404bc8-35fe-4739-9374-dd8f47527184 */
    @Override
    public Gun produceGun() {
        return new AK();
    }

    /** @pdOid 5a20bd43-424c-42bd-930e-5393b205d1a9 */
    @Override
    public Bullet produceBullet() {
        return new AK_Bullet();
    }
}
