/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author Osmani Alegre
 */
public class Dossier {

    /**
     */
    public static void readDemoFile() throws FileNotFoundException{
        String username = System.getProperty("user.name");
        String path = "C:/Users/"+username+"/Documents/PollAway/demo/demo.txt";
        
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader(path)));

            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        
    }
    
}
