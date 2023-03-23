package com.breadmyburn.character.classes;

import com.breadmyburn.character.weapons.Shield;
import com.breadmyburn.character.weapons.Sword;

public class Paladin extends Jobless implements Sword, Shield {
    // Paladin constructor requires name and age
    public Paladin(String name, int age) {
        super(name, age);
    }

    // Paladin class greeting phrase when using 'Greet' action
    @Override
    public void greeting() {
        System.out.println("I have an oath to follow.");
    }

    // Paladin class 'Block' action thanks to Shield interface
    @Override
    public void Block() {
        System.out.println(name + " withstood the attack!");
    }

    // Paladin class 'Attack' action thanks to Sword interface
    @Override
    public void Slash() {
        System.out.println(name + " makes a swiping motion.");
    }
}
