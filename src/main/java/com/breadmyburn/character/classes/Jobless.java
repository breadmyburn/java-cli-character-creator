package com.breadmyburn.character.classes;

public abstract class Jobless {
    String name;
    int age;

    // For anonymous classes
    public Jobless() {};

    // Constructor requires name and age
    public Jobless(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Character gives an introduction
    public void introduce() {
        System.out.println(">> My name is " + name);
    };

    // Character's greeting function
    public abstract void greeting();

    // Retrieves the character's name
    public String getName() {
        return name;
    }

    // Retrieves the character's age
    public int getAge() {
        return age;
    }
}
