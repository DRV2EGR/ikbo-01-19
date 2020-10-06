package UI;

import Abstract.AbstractWriter;
import DocumentTypes.CreateTextDocument;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

public class ui extends JFrame {
    public String name;
    public String path;
    private JTextArea bigField;

    public ui() {
        super("Системное меню");
        setDefaultCloseOperation( EXIT_ON_CLOSE );
        JMenuBar menuBar = new JMenuBar();

        menuBar.add(createFileMenu());

        name = "";
        path = "";

        setJMenuBar(menuBar);
        setLayout(new BorderLayout());

        bigField = new JTextArea();
        add(bigField, BorderLayout.CENTER);

        setSize(500, 300);
        setVisible(true);
    }

    private JMenu createFileMenu()
    {
        // Создание выпадающего меню
        JMenu menu = new JMenu("Файл");

        // Пункт меню "Открыть" с изображением
        JMenuItem new_ = new JMenuItem("New");
        // Пункт меню "Открыть" с изображением
        JMenuItem open = new JMenuItem("Open");
        // Пункт меню "Открыть" с изображением
        JMenuItem save = new JMenuItem("Save");

        // Пункт меню из команды с выходом из программы
        JMenuItem exit = new JMenuItem(new ExitAction());

        // Добавим в меню
        menu.add(new_);
        menu.add(open);
        menu.add(save);
        menu.addSeparator();
        menu.add(exit);

        open.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                JFileChooser fileopen = new JFileChooser();
                int ret = fileopen.showDialog(null, "Открыть файл");
                File file = null;
                if (ret == JFileChooser.APPROVE_OPTION) {
                    file = fileopen.getSelectedFile();
                }

                String buf = "";

                try {
                    FileReader reader = new FileReader(file);
                    int c;
                    while((c=reader.read())!=-1){
                        buf += (char) c;
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

                name = file.getName();
                path = file.getAbsolutePath();

                System.out.println(name + " " + path);

                bigField.setText(buf);

                CreateTextDocument ctd = new CreateTextDocument();
                ctd.getWriter(file);


            }
        });

        new_.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                name = JOptionPane.showInputDialog("<html><h2>Навание файла");
                path = JOptionPane.showInputDialog("<html><h2>Директорию файла</h2> " +
                        "<br><h4>По умолчанию - директория проекта");

                if (path.equals("")) {
                    final String dir = System.getProperty("user.dir");
                    path = dir;
                }

                File file = new File(path, name);

                FileWriter writer = null;
                try {
                    writer = new FileWriter(file);
                    writer.write("");
                    writer.flush();
                } catch (IOException ioException) {
                    System.out.println("f");
                    ioException.printStackTrace();
                }

                System.out.println("Created " + file.getAbsolutePath());

                CreateTextDocument ctd = new CreateTextDocument();
                ctd.getWriter(file);





            }
        });

        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CreateTextDocument ctd = new CreateTextDocument();

                if (name.equals("")) {
                    String name = JOptionPane.showInputDialog("<html><h2>Навание файла");
                    String path = JOptionPane.showInputDialog("<html><h2>Директорию файла</h2> " +
                            "<br><h4>По умолчанию - директория проекта");

                    if (path.equals("")) {
                        final String dir = System.getProperty("user.dir");
                        path = dir;
                    }

                    File file = new File(path, name);
                    AbstractWriter wr = ctd.getWriter(file);

                    wr.write(file, bigField.getText());
                    System.out.println("Created " + file.getAbsolutePath());
                } else {
                    int re = JOptionPane.showConfirmDialog(null, "Обновить текущий файл?");
                    if (re == 0) {

                        File file = new File(path);

                        AbstractWriter wr = ctd.getWriter(file);
                        wr.write(file, bigField.getText());

                        System.out.println("Updated " + file.getAbsolutePath());
                    } else if (re == 1) {
                        String name = JOptionPane.showInputDialog("<html><h2>Навание файла");
                        String path = JOptionPane.showInputDialog("<html><h2>Директорию файла</h2> " +
                                "<br><h4>По умолчанию - директория проекта");

                        if (path.equals("")) {
                            final String dir = System.getProperty("user.dir");
                            path = dir;
                        }

                        File file = new File(path, name);
                        AbstractWriter wr = ctd.getWriter(file);

                        wr.write(file, bigField.getText());
                        System.out.println("Created " + file.getAbsolutePath());
                    }
                }
            }
        });

        return menu;
    }

    class ExitAction extends AbstractAction
    {
        private static final long serialVersionUID = 1L;
        ExitAction() {
            putValue(NAME, "Выход");
        }
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

}

