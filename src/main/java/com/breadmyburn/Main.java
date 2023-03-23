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
                case "attack" -> System.out.println("Attack!");
                case "block" -> System.out.println("Block!");
                case "info" -> System.out.println("Info!");
                case "goodbye" -> {
                    System.out.println("Goodbye.");
                }
            }

        } else {
            System.out.println("Ok.");
        }
    }
}