package ru.mirea.ikbo_01_19.practice5;

import java.util.Scanner;

public class task6 {
    public void task()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        boolean res = recur(2, n); //oтправляем делитель!
        System.out.println("Prostoye: " + res);
    }

    private boolean recur(int k, int m)
    {
        if (k < (m/2)) {
            if (m % k != 0) {
                return true&&recur(k+1, m);
            } else {
                return false ;
            }
        }

        return true;
    }
}
