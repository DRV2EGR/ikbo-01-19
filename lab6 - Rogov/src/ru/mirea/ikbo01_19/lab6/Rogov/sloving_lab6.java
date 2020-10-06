package ru.mirea.ikbo01_19.lab6.Rogov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sloving_lab6 extends JFrame {


    sloving_lab6()
    {

        super("Why footbal? I love hockey!");
        JLabel j1 = new JLabel(".");
        JLabel j2 = new JLabel(".");
        JLabel j3 = new JLabel(".");
        JLabel j4 = new JLabel(".");
        JLabel j5 = new JLabel(".");

        setLayout(new BorderLayout());
        add(j1, BorderLayout.CENTER);
        add(j2, BorderLayout.WEST);
        add(j3, BorderLayout.SOUTH);
        add(j4, BorderLayout.NORTH);
        add(j5, BorderLayout.EAST);

        j1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в ");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        j2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в Джидда");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        j3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать Абха");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        j4.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        j5.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,
                        "Добро пожаловать в Дахране");
            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        setSize(500,500);
        setVisible(true);

    }


    public static void main(String[] args) {
        sloving_lab6 p = new sloving_lab6();
    }

}
