package ru.mirea.ikbo_01_19a.lab4.rogov;

import task1.*;

public class sloving_lab4 {
    public static void main(String[] args) {
        Dog haski = new Dog("Bob", "Haski");
        Planet earth = new Planet("Esrth", 1002545);

        System.out.println("Dog: " + haski.getName());
        System.out.println("Planet: " + earth.getName());
    }
}
