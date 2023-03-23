package com.breadmyburn.character.classes;

public abstract class Jobless {
    String name;
    int age;

    public Jobless(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("My name is " + name);
    };

    public abstract void greeting();
}
