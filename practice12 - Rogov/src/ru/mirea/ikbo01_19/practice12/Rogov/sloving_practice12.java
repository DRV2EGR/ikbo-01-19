package ru.mirea.ikbo01_19.practice12.Rogov;

import java.util.Scanner;

public class sloving_practice12 {
    public static void main(String[] args) {
        String tmp;
        String res = "+7";
        Scanner s = new Scanner(System.in);

        tmp = s.nextLine();

        if (tmp.charAt(0) == '+') {
            int i = -1;
            for (int j = 2; j < tmp.length(); ++j) {
                if (i < 2) {
                    res += tmp.charAt(j);
                    ++i;
                } else if (i == 2) {
                    res+='-';
                    ++i;
                    res += tmp.charAt(j);
                } else if (i > 2 && i < 5) {
                    res += tmp.charAt(j);
                    ++i;
                } else if (i == 5) {
                    res+='-';
                    ++i;
                    res += tmp.charAt(j);
                } else {
                    ++i;
                    res += tmp.charAt(j);
                }
            }
        } else {
            int i = -1;
            for (int j = 1; j < tmp.length(); ++j) {
                if (i < 2) {
                    res += tmp.charAt(j);
                    ++i;
                } else if (i == 2) {
                    res+='-';
                    ++i;
                    res += tmp.charAt(j);
                } else if (i > 2 && i < 5) {
                    res += tmp.charAt(j);
                    ++i;
                } else if (i == 5) {
                    res+='-';
                    ++i;
                    res += tmp.charAt(j);
                } else {
                    ++i;
                    res += tmp.charAt(j);
                }
            }
        }

        System.out.println(res);
    }
}
