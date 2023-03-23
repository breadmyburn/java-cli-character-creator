# Character Creator on CLI using Java

# Overview
Create your own character on the CLI. Give your character a name, choose from the various character classes available, and do some actions!

This program is an example on some Java Fundamentals. This includes Basic Syntax, Variables, Data Types, Conditional Statements, Loops, Classes, Methods, and OOP Concepts.

# Character Job Classes
When creating your character, you can choose from three (3) different character classes:
* Saber
* Paladin
* Archer
* Hunter

# Job Classes Information
## `Jobless` Class
All character job classes are based off the `Jobless` class. However, you cannot assign a character the `Jobless` class. It simply serves as a template for its subclasses.

Each job class requires a name and an age for you character. Every character class comes with these methods:
* `introduce()`: Prints a short sentence stating their name.
* `greeting()`: Prints a short greeting depending on the character's class.
* `getName()`: Returns the `name` of the character.
* `getAge()`: Returns the `age` of the character.

## Weapon Interfaces
All subclasses of `Jobless` implements one or more of the three (3) available interfaces.

Each interface grants classes access to methods unique to each interface. Some classes implements more than one interface.
* `Sword`: Grants the class the `Slash()` method for its "Attack" action.
* `Shield`: Grants the class the `Block()` method for its "Guard" action. Classes that do not have a shield are unable to utilize the "Guard" action.
* `Gun`: Grants the class the `Shoot()` method for its "Attack" action.

Note: Current implementation only outputs a line stating the action done.

## The Different (Sub)Classes
There are four (4) job classes to choose from:
* `Saber`: Fights at close-range. Wield the `Sword` interface granting it access to the `Slash()` method.
* `Paladin`: The tank. Wields both the `Sword` and `Shield` interfaces, allowing it to both attack with the `Slash()` method, and guard with `Block()` method.
* `Archer`: A long-range unit. Unlike its name, this class wields the `Gun` interface allowing it to attack with the `Shoot()` method.
* `Hunter`: The one with the most offensive options. Wields both the `Sword` and `Gun` interfaces, giving it two (2) attack options: `Slash()` and `Shoot()`.

# The Actions
After character creation, you can make your character perform six (6) actions:
* `Introduce`: Your character introduces themselves, stating their `name`.
* `Greet`: Your character gives a short greeting. (Based on the class.)
* `Attack`: Your character does an attack! (Based on the class.)
* `Block`: Your character blocks an attack. (Only `Paladins` can do this.)
* `Info`: Your character's information. It shows their `name`, `age`, and `jobClass`
* `Leave`: End the program. 

# Requirements
To run the program, the following should be first installed:
* [Java 17 or Higher](https://www.oracle.com/java/technologies/downloads/)
* [Amazon Corretto 17](https://docs.aws.amazon.com/corretto/latest/corretto-17-ug/downloads-list.html)

# Tools
* [IntelliJ IDEA Community Edition or Ultimate](https://www.jetbrains.com/idea/download/#section=windows)

# How to Use the Program
1. Install the requirements specified above.
2. Clone or download this repository.
3. Open this project in IntelliJ IDEA Community Edition or Ultimate.
4. Run the program.
5. You will be asked in the beginning if you want to create a character. Typing "Yes" will make you go through with the character creation. Typing "No" or anything else ends the program.
6. You will be asked for your character's `name` and `age`. Input your character's `name` and `age`.
7. You will be asked to pick a job class for your character. Select from `Saber`, `Paladin`, `Archer`, and `Hunter`. Typing any other option results at the program ending and needing to be run again.
8. Your character creation is now finished! You can now select from six (6) actions.
9. Input the action you want your character to do. You will be able to do as many actions as you want.
10. If you want to end the program, choose the "Goodbye" option in the action list.

# References
* Core Java for the Impatient 3rd Edition by Cay S. Horstmann
* [Javatpoint Java Tutorial](https://www.javatpoint.com/java-tutorial)
* [W3schools Java Tutorial](https://www.w3schools.com/java/default.asp)
* [Abstract Classes and Methods in Java Explained in 7 Minutes](https://youtu.be/HvPlEJ3LHgE) by [Coding with John](https://www.youtube.com/@CodingWithJohn) 
* [Java interface 🦅](https://youtu.be/GhslBwrRsnw) by [Bro Code](https://www.youtube.com/watch?v=GhslBwrRsnw)