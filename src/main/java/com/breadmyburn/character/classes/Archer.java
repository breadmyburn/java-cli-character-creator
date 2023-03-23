package com.breadmyburn.character.classes;

import com.breadmyburn.character.weapons.Gun;

public class Archer extends Jobless implements Gun {
    public Archer(String name, int age) {
        super(name, age);
    }

    @Override
    public void greeting() {
        System.out.println("I prefer fighting from afar.");
    }

    @Override
    public void Shoot() {
        System.out.println(name + " fires his weapon.");
    }
}
