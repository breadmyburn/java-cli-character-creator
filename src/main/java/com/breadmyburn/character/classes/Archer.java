package com.breadmyburn.character.classes;

import com.breadmyburn.character.weapons.Gun;

public class Archer extends Jobless implements Gun {
    // Archer constructor requires name and age
    public Archer(String name, int age) {
        super(name, age);
    }

    // Archer class greeting phrase when using 'Greet' action
    @Override
    public void greeting() {
        System.out.println(">> I prefer fighting from afar.\n");
    }

    // Archer class 'Attack' action thanks to Gun interface
    @Override
    public void Shoot() {
        System.out.println(">> " + name + " fires his gun.\n");
    }
}
