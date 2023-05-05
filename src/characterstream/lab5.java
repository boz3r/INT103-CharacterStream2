package characterstream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dol
 */
public class lab5 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = s.nextLine();
        System.out.println("Hello, " + name);

        System.out.print("Enter your weight: ");
        double w = s.nextDouble();
        System.out.print("Enter your height: ");
        double h = s.nextDouble();
        
        System.out.println(w*h);

    }
}
