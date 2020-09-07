package ru.mirea.ikbo01_19.lab1.Rogov;

import java.util.Scanner;
import java.util.Random;

public class sloving_lab1 {
    public static void main (String []args) {
        task1();
        task2(args);
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.print("Input size ");
        int n; Scanner scan = new Scanner( System.in );
        n = scan.nextInt();

        int[] mass = new int[n];

        for (int i = 0; i < n; ++i) {
            System.out.print("Input next nomber ");
            mass[i] = scan.nextInt();
        }

        System.out.println("FOR:");
        for (int i = 0; i < n; ++i) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();

        System.out.println("WHILE:");
        int i = 0;
        while (i < n) {
            System.out.print(mass[i] + " ");
            ++i;
        }
        System.out.println();

        System.out.println("DO WHILE:");
        i = 0;
        do {
            System.out.print(mass[i] + " ");
            ++i;
        } while (i < n);
        System.out.println();

    }

    public static void task2(String[] args) {
        for (String arg: args) {
            System.out.println(arg);
        }
    }

    public static void task3() {
        System.out.println("Garmonicheskiy ryad: ");
        for (int i = 0; i < 10; ++i) {
            double r = 1.0 / (i + 1);
            System.out.println(r + " ");
        }
    }

    public static void task4() {
        Random rand = new Random();
        int n = rand.nextInt(1000);
        int[] mass = new int[n];

        System.out.println();
        for (int i = 0; i < n; ++i) {
            mass[i] = rand.nextInt();
            System.out.print(mass[i] + " ");
        }

        boolean b = true; int tn = n;
        while (b) {
            b = false;
            for (int i = 0; i + 1 < tn; ++i) {
                if (mass[i] > mass[i+1]) {
                    int tmp = mass[i];
                    mass[i] = mass[i+1];
                    mass[i+1] = tmp;

                    b = true;
                }
            }
            --tn;
        }

        System.out.println();
        for (int i = 0; i < n; ++i) {
            System.out.print(mass[i] + " ");
        }
    }

    public static void task5() {
        int n; Scanner scaner = new Scanner(System.in);
        System.out.print("Input factorial: ");
        n = scaner.nextInt();
        int res = 1;
        for (int i = 1; i < n; ++i) {
            res += res * (i);
        }

        System.out.println(n + "! = " + res);
    }

}
