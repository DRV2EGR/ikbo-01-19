package DocumentTypes;

import Abstract.AbstractWriter;

import javax.swing.text.Document;
import java.io.File;

public class CreateTextDocument {

    // Factory!
    public AbstractWriter getWriter(Object object) {
        AbstractWriter writer = null;
        if (object instanceof File) {
            //writer = new ConcreteFileWriter();
            //System.out.println("File");

            writer = new TextDocument();
        }
        return writer;
    }

}