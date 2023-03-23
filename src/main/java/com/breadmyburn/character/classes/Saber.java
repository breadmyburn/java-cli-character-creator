package com.breadmyburn.character.classes;

import com.breadmyburn.character.weapons.Sword;

public class Saber extends Jobless implements Sword {
    public Saber(String name, int age) {
        super(name, age);
    }

    @Override
    public void greeting() {
        System.out.println("I like to fight strong people!");
    }

    @Override
    public void Slash() {
        System.out.println(name + " makes a slash attack!");
    }
}
