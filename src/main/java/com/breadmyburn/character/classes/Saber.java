package com.breadmyburn.character.classes;

import com.breadmyburn.character.weapons.Sword;

public class Saber extends Jobless implements Sword {
    // Saber constructor requires name and age
    public Saber(String name, int age) {
        super(name, age);
    }

    // Saber class greeting phrase when using 'Greet' action
    @Override
    public void greeting() {
        System.out.println("I like to fight strong people!");
    }

    // Saber class 'Attack' action thanks to Sword interface
    @Override
    public void Slash() {
        System.out.println(name + " makes a slash attack!");
    }
}
