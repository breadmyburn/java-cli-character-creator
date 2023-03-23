package com.breadmyburn.character.classes;

import com.breadmyburn.character.weapons.Shield;
import com.breadmyburn.character.weapons.Sword;

public class Paladin extends Jobless implements Sword, Shield {
    public Paladin(String name, int age) {
        super(name, age);
    }

    @Override
    public void greeting() {
        System.out.println("I have an oath to follow.");
    }

    @Override
    public void Block() {
        System.out.println(name + " withstood the attack!");
    }

    @Override
    public void Slash() {
        System.out.println(name + " makes a swiping motion.");
    }
}
