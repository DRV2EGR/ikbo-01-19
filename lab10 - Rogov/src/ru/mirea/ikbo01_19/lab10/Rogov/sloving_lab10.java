package ru.mirea.ikbo01_19.lab10.Rogov;

public class sloving_lab10 {
    // Sloving task 3 in task 2!!!!!!!!

    public static void main(String[] args) {
        task2<Integer> t2 = new task2<>(); // and task3

        // Task 1:

        Integer[] mass = new Integer[5];
        for (int i = 0; i < 5; ++i) {
            mass[i] = i;
        }

        for (int i = 0; i < 5; ++i) {
            t2.push(mass[i]);
        }

        System.out.println("Converted!");

        for (int i = 0; i < 5; ++i) {
            System.out.println(t2.get(i));
        }
    }
}
