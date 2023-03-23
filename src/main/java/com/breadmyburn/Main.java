package com.breadmyburn;

import com.breadmyburn.character.classes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variable declarations
        Scanner scanner = new Scanner(System.in);
        String decision;
        String name;
        int age;
        String jobClass;
        Jobless character = null;
        String action;
        String weapon;

        // Decide if you want to create a character or not
        System.out.println("Hello! Do you want to create a character? (Yes/No)");
        decision = scanner.nextLine();

        // "Yes": Go through with the character creation
        if ("yes".equalsIgnoreCase(decision)) {
            try {
                System.out.println("What is the name of your character?");
                name = scanner.nextLine();
                System.out.println("What is the age of your character?");
                age = Integer.parseInt(scanner.nextLine());
                System.out.println("Is your character's class a Saber, Paladin, Archer, or Hunter?");
                jobClass = scanner.nextLine();

                // Character job class selection
                switch (jobClass.toLowerCase()) {
                    case "saber" -> character = new Saber(name, age);
                    case "paladin" -> character = new Paladin(name, age);
                    case "archer" -> character = new Archer(name, age);
                    case "hunter" -> character = new Hunter(name, age);
                    default -> throw new IllegalArgumentException();
                }

                System.out.println("Congratulations! You have created a new character.\n");

                actionLoop: while (true) {
                    System.out.println("""
                    What action do you want your character to do?
                    - Introduce
                    - Greet
                    - Attack
                    - Block (only for Paladins)
                    - Info
                    - Goodbye""");
                    action = scanner.nextLine();

                    // Character Action Selection
                    switch (action.toLowerCase()) {
                        // Character introduces themselves
                        case "introduce" -> character.introduce();
                        // Character gives a greeting (depends on character job class)
                        case "greeting" -> character.greeting();
                        // Character attacks!
                        case "attack" -> {
                            // Saber class attack
                            if (character instanceof Saber saber) {
                                saber.Slash();
                            }
                            // Paladin class attack
                            else if (character instanceof Paladin paladin) {
                                paladin.Slash();
                            }
                            // Archer class attack
                            else if (character instanceof Archer archer) {
                                archer.Shoot();
                            }
                            // Hunter class attack
                            else if (character instanceof Hunter hunter) {
                                System.out.println("Do you want to use your [SWORD] or [GUN]?");
                                weapon = scanner.nextLine();
                                switch (weapon.toLowerCase()) {
                                    case "sword" -> hunter.Slash();
                                    case "gun" -> hunter.Shoot();
                                    default -> System.out.println("That's not an option!");
                                }
                            }
                        }
                        // Character does a "block" action (Paladin only).
                        case "block" -> {
                            if (character instanceof Paladin paladin) {
                                paladin.Block();
                            } else {
                                System.out.println("Your character can't do that!");
                            }
                        }
                        // Character information is shown
                        case "info" -> {
                            System.out.println("""
                            Name: %s
                            Age: %d
                            Class: %s
                            """.formatted(character.getName(), character.getAge(), character.getClass().getSimpleName()));
                        }
                        // Exit program
                        case "goodbye" -> {
                            break actionLoop;
                        }
                        default -> throw new IllegalArgumentException();
                    }
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please restart the program and try again.");
            } finally {
                System.out.println("Goodbye.");
            }
        } else {
            System.out.println("Ok.");
        }
    }
}