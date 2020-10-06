package ru.mirea.ikbo_01_19.practice5;

import java.util.Scanner;

public class task7 {
    public void task()
    {
        String n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();

        boolean res = recur(n, 1);
        System.out.println("Polindrom: " + res);
    }

    private boolean recur(String k, int m)
    {
        if (m <= (k.length() / 2)) {
            if ( k.charAt(m-1) == k.charAt(k.length() - m)) {
                return true && recur(k, m+1);
            } else {
                return false;
            }
        }


        return true;
    }
}
