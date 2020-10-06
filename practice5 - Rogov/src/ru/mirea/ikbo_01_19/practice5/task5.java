package ru.mirea.ikbo_01_19.practice5;

import java.util.Scanner;

public class task5 {
    public void task()
    {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int res = recur(n);
        System.out.println("Res: " + res);
    }

    private int recur(int k)
    {
        if (k > 0 && k < 10) {
            return k;
        } else if (k > 0) {
            return (k % 10) + recur(k / 10);
        }

        return 0;
    }
}
