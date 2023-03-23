package com.breadmyburn;

import com.breadmyburn.character.classes.*;

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

            character.greeting();
        } else {
            System.out.println("Ok.");
        }
    }
}