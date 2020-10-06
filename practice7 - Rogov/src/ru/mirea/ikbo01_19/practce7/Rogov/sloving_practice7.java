package ru.mirea.ikbo01_19.practce7.Rogov;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.concurrent.TimeUnit;

import graphics.*;

import javax.swing.*;

public class sloving_practice7 {
    private static Stack<Integer> player;
    private static Stack<Integer> bot;

    private static boolean cof(int d) {
        if (d > 106) {
            return true;
        } else if (player.isEmpty() || bot.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void work(ui gr){
        bot =  new Stack<Integer>();
        player =  new Stack<Integer>();

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; ++i) {
            if (i < 5) {
                bot.add(sc.nextInt());
            } else {
                player.add(sc.nextInt());
            }
        }

        //ui gr = new ui();

        boolean no = false;
        int ch = 0;
        boolean _go = false;
        while (!cof(ch)) {
            gr.putCard(bot.get(0));

            //JDialog dialog = new JDialog((Dialog) null);
            //dialog.setModal(true);

            while (!gr.cl) {
                if (!gr.auto) {
                    try {
                        TimeUnit.MILLISECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        //e.printStackTrace();
                    }
                } else {
                    break;
                }
            }

            gr.putCard(player.get(0));

            if ((bot.get(0) < player.get(0)) || (bot.get(0) == 9 && player.get(0)== 0)) {
                player.add(bot.get(0));
                player.add(player.get(0));
                player.remove(0);
                bot.remove(0);


                if (player.size() > bot.size()) {
                    gr.setWnr(true);
                } else {
                    gr.setWnr(false);
                }

                no = true;
            } else {
                bot.add(bot.get(0));
                bot.add(player.get(0));
                bot.remove(0);
                player.remove(0);

                if (player.size() > bot.size()) {
                    gr.setWnr(true);
                } else {
                    gr.setWnr(false);
                }

                no = false;
            }

            gr.cl = false;
            ch++;
        }


        if (ch >= 106) {
            System.out.println("botva");
            return;
        }

        if (no) {
            System.out.println("second " + ch);
        } else {
            System.out.println("first " + ch);
        }

    }

    public static void main(String[] args) {
        work(new ui());
    }
}