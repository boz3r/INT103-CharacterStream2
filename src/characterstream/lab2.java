package characterstream;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dol
 */
public class lab2 {

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
            FileReader file = new FileReader("data.dat");
            BufferedReader input = new BufferedReader(file);
            String s;
            while ((s = input.readLine()) != null) {
                System.out.print(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(lab1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
