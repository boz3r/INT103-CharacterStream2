package characterstream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dol
 */
public class lab3 {

    public static void main(String[] args) {
        try {
            PrintWriter pw = new PrintWriter("data.txt");
            pw.println("Harry Potter!!!");
            pw.println(19);
            pw.println(60.5);
            pw.println(175.0);

            pw.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader input = new FileReader("data.txt");
            Scanner scan = new Scanner(input);
            System.out.println(scan.nextLine());
            System.out.println(scan.nextInt());
            System.out.println(scan.nextDouble());
            System.out.println(scan.nextDouble());
        } catch (FileNotFoundException ex) {
            Logger.getLogger(lab3.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
