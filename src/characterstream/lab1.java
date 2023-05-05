package characterstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dol
 */
public class lab1 {

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("data.dat");
            file.write("Hello World!!!\n");
            file.write("Welcome to Java!!!");
            file.close();
        } catch (IOException ex) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader input = new FileReader("data.dat");
            int ch;
            while ((ch = input.read()) != -1) {
                System.out.print((char) ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
