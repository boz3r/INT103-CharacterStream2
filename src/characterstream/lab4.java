package characterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dol
 */
public class lab4 {

    public static void main(String[] args) {
        try {
            InputStreamReader key = new InputStreamReader(System.in);
            BufferedReader input = new BufferedReader(key);
            System.out.print("Enter your name: ");
            String name = input.readLine();
            System.out.println("My name is " + name);
            System.out.print("Enter your weight: ");
            String w = input.readLine();
            System.out.print("Enter your height: ");
            String h = input.readLine();
            System.out.println(Double.parseDouble(h)*Double.parseDouble(w));
        } catch (IOException ex) {
            Logger.getLogger(lab4.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
