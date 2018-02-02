
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bd591388
 */
public class LireTexte {
    
    public static void afficher() {
        File file = new File ("C:\\Users\\bd591388\\Documents\\NetBeansProjects\\HelloWorld\\biblio.txt");

        Scanner sc;
        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                String s = sc.nextLine();
                System.out.println(s);
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(LireTexte.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    

