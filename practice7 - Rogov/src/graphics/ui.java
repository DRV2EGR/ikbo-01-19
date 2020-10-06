package graphics;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.concurrent.TimeUnit;

public class ui extends JFrame {
    private boolean is_bot;
    public boolean cl;
    public boolean auto;
    public JButton go = new JButton("Put card!");
    JButton a = new JButton("auto");
    JLabel sht = new JLabel("No card");
    JLabel wnr = new JLabel("Winner: nope");

    public ui() {
        super("Pyanitsa");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        go.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                cl = true;
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

        a.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                auto = true;
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

        setLayout(new BorderLayout());
        add(go, BorderLayout.SOUTH);
        add(sht, BorderLayout.CENTER);
        add(wnr, BorderLayout.NORTH);
        add(a, BorderLayout.EAST);

        is_bot = true;
        cl = false;
        auto = false;


        setSize(250, 250);
        setVisible(true);
    }

    public void putCard(int cat) {
        if (is_bot) {
            sht.setText("ROBOT: " + cat + " " + "PLAYER: ");
            is_bot = false;
        } else {
            String tmp = sht.getText();
            sht.setText(tmp + cat);
            is_bot = true;
        }

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            //e.printStackTrace();
        }

    }

    public void setWnr(boolean b) {
        if (b) {
            wnr.setText("Winner: player");
        } else {
            wnr.setText("Winner: bot");
        }
    }
}