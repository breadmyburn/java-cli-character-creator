package com.breadmyburn;

import com.breadmyburn.character.classes.*;
import com.breadmyburn.character.weapons.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String decision;
        String name;
        int age;
        String jobClass;
        Jobless character = null;
        String action;
        String weapon;

        System.out.println("Hello! Do you want to create a character?");
        decision = scanner.nextLine();

        if ("yes".equalsIgnoreCase(decision)) {
            System.out.println("What is the name of your character?");
            name = scanner.nextLine();
            System.out.println("What is the age of your character?");
            age = Integer.parseInt(scanner.nextLine());
            System.out.println("Is your character's class a Saber, Paladin, Archer, or Hunter?");
            jobClass = scanner.nextLine();

            switch (jobClass.toLowerCase()) {
                case "saber" -> character = new Saber(name, age);
                case "paladin" -> character = new Paladin(name, age);
                case "archer" -> character = new Archer(name, age);
                case "hunter" -> character = new Hunter(name, age);
                default -> throw new IllegalArgumentException();
            }

            System.out.println("Congratulations! You have created a new character.\n");
            System.out.println("""
                    What action do you want your character to do?
                    - Introduce
                    - Greeting
                    - Attack
                    - Block (only for Paladins)
                    - Info
                    - Goodbye""");
            action = scanner.nextLine();

            switch (action.toLowerCase()) {
                case "introduce" -> character.introduce();
                case "greeting" -> character.greeting();
                case "attack" -> {
                    if (character instanceof Saber saber) {
                        saber.Slash();
                    } else if (character instanceof Paladin paladin) {
                        paladin.Slash();
                    } else if (character instanceof Archer archer) {
                        archer.Shoot();
                    } else if (character instanceof Hunter hunter) {
                        System.out.println("Do you want to use your [SWORD] or [GUN]?");
                        weapon = scanner.nextLine();
                        switch (weapon.toLowerCase()) {
                            case "sword" -> hunter.Slash();
                            case "gun" -> hunter.Shoot();
                        }
                    }
                }
                case "block" -> {
                    if (character instanceof Paladin paladin) {
                        paladin.Block();
                    } else {
                        System.out.println("Your character can't do that!");
                    }
                }
                case "info" -> System.out.println("Info!");
                case "goodbye" -> {
                    System.out.println("Goodbye.");
                }
                default -> throw new IllegalArgumentException();
            }

        } else {
            System.out.println("Ok.");
        }
    }
}