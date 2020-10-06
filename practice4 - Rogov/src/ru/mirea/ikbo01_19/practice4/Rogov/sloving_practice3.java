package ru.mirea.ikbo01_19.practice4.Rogov;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class sloving_practice3 extends JFrame {
    private int mi;
    private int ma;

    JButton btn_milan = new JButton("AC Milan");
    JButton btn_madrid = new JButton("Real Madrid");

    JLabel lbl_rslt = new JLabel("Result: 0 X 0");
    JLabel lbl_lst_score = new JLabel("Last Scorer: N/A");
    JLabel lbl_wnr = new JLabel("Winner: DRAW");

    sloving_practice3()
    {
        super("Why footbal? I love hockey!");

        mi = 0;
        ma = 0;
        setLayout(new BorderLayout());
        add(btn_milan, BorderLayout.WEST);
        add(btn_madrid, BorderLayout.EAST);

        add(lbl_rslt, BorderLayout.CENTER);
        add(lbl_lst_score, BorderLayout.SOUTH);
        add(lbl_wnr, BorderLayout.NORTH);

        setSize(500,500);
        setVisible(true);

        btn_milan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ++mi;
                lbl_rslt.setText("Result: " + mi + " X " + ma);
                lbl_lst_score.setText("Last Scorer: AC Milan");
                if (mi > ma) {
                    lbl_wnr.setText("Winner: AC Milan");
                } else if (mi < ma) {
                    lbl_wnr.setText("Winner: Real Madrid");
                } else {
                    lbl_wnr.setText("Winner: DRAW");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) { }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }
        });

        btn_madrid.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ++ma;
                lbl_rslt.setText("Result: " + mi + " X " + ma);
                lbl_lst_score.setText("Last Scorer: Real Madrid");
                if (mi > ma) {
                    lbl_wnr.setText("Winner: AC Milan");
                } else if (mi < ma) {
                    lbl_wnr.setText("Winner: Real Madrid");
                } else {
                    lbl_wnr.setText("Winner: DRAW");
                }
            }

            @Override
            public void mousePressed(MouseEvent e) { }

            @Override
            public void mouseReleased(MouseEvent e) { }

            @Override
            public void mouseEntered(MouseEvent e) { }

            @Override
            public void mouseExited(MouseEvent e) { }
        });


    }


    public static void main(String[] args) {
        sloving_practice3 p = new sloving_practice3();
    }

}
