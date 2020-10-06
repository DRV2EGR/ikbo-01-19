package task1;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Random;
public class dor extends JFrame {

    public void dora() {
        JFrame frame = new JFrame();
        //frame.add();
        //frame.setDefaultCloseOperation(JFrame.EXIT__ON__CLOSE);

        //frame.setLocationRelativeTo(null);
        //frame.setVisible(true);

        Random rand = new Random();
        Figure[] figure = new Figure[20];

        int[] array = new int[20];
        for (int i = 0; i < 20; ++i) {
            array[i] = rand.nextInt(2);
        }

        for (int i = 0; i < 20; ++i) {
            figure[i] = new Figure(rand.nextInt(200),
                    rand.nextInt(200), rand.nextInt(1));

            frame.add(figure[i]);

        }

        frame.setSize(280, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        frame.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        frame.setVisible(true);


        //repaint();
    }
}
