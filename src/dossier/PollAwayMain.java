/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;

import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author Osmani Alegre
 */
public class PollAwayMain implements Serializable{

    /**
     * @throws java.io.FileNotFoundException
     */
    
    public static void main(String[] args){
        
       
    }
    /*
    public void Serialize(ArrayList<Voter> v, String path){
        try {
           FileOutputStream fileOut = new FileOutputStream(path+ "voters.ser");
           ObjectOutputStream out = new ObjectOutputStream(fileOut);
           out.writeObject(v);
           out.close();
           fileOut.close();
        }catch(IOException i) {
           i.printStackTrace();
        }
    }
    
    public ArrayList<Voter> deSerialize(String path){
        File f = new File(path);
        if (f.length() < 1) {
            return null;
        }
        else{
            try {
           FileInputStream fileIn = new FileInputStream(path+ "voters.ser");
           ObjectInputStream in = new ObjectInputStream(fileIn);
           v = (ArrayList<Voter>) in.readObject();
           in.close();
           fileIn.close();
           return v;
            }catch(FileNotFoundException n){
                n.printStackTrace();
                return null;
            }catch(IOException i) {
               i.printStackTrace();
               return null;
            }catch(ClassNotFoundException c) {
               c.printStackTrace();
               return null;
            }
        }   
    }
    
    */
    
}
