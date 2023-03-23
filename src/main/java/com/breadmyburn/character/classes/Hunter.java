package com.breadmyburn.character.classes;

import com.breadmyburn.character.weapons.Gun;
import com.breadmyburn.character.weapons.Sword;

public class Hunter extends Jobless implements Sword, Gun {
    public Hunter(String name, int age) {
        super(name, age);
    }

    @Override
    public void greeting() {
        System.out.println("Do you have a job for me?");
    }

    @Override
    public void Shoot() {
        System.out.println(name + " aims at his target.");
    }

    @Override
    public void Slash() {
        System.out.println(name + " swiftly strikes his opponent!");
    }
}
