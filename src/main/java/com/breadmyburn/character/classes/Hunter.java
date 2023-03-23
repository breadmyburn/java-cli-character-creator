package com.breadmyburn.character.classes;

import com.breadmyburn.character.weapons.Gun;
import com.breadmyburn.character.weapons.Sword;

public class Hunter extends Jobless implements Sword, Gun {
    // Hunter class constructor requires name and age
    public Hunter(String name, int age) {
        super(name, age);
    }

    // Hunter class greeting phrase when using 'Greet' action
    @Override
    public void greeting() {
        System.out.println("Do you have a job for me?");
    }

    // Hunter class 'Attack' action option 1 thanks to Gun interface
    @Override
    public void Shoot() {
        System.out.println(name + " aims at his target.");
    }

    // Hunter class 'Attack' action option 2 thanks to Sword interface
    @Override
    public void Slash() {
        System.out.println(name + " swiftly strikes his opponent!");
    }
}
