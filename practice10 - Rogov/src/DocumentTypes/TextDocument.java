package DocumentTypes;

import Abstract.*;

import javax.swing.*;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TextDocument extends AbstractWriter {

    @Override
    public void write(Object context, String text) {
        if (context != null) {
            FileWriter writer = null;
            try {
                writer = new FileWriter((File) context);
                writer.write(text);
                writer.flush();
            } catch (IOException ioException) {
                System.out.println("f");
                ioException.printStackTrace();
            }
        }
    }
}
