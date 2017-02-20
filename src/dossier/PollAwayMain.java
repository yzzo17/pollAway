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
        
        ArrayList<PersonNode> DeVoters = null;
        
        Random n = new Random();
        PollAnswerNode pA = new PollAnswerNode("hillary");
        PollAnswerNode pB = new PollAnswerNode("trump");
        
        DemoNode dA = new DemoNode("hispanic");
        DemoNode dB = new DemoNode("black");
        
        
        
        
        PersonNode a = new PersonNode(n.nextInt(1000) + 100);
        PersonNode b = new PersonNode(n.nextInt(1000) + 100);
        
        Edge e1 = new Edge(a, pA);
        Edge e2 = new Edge(a, dA);
        
        Edge e3 = new Edge(b, pB);
        Edge e4 = new Edge(b, dB);
        
        a.connections.add(e1);
        a.connections.add(e2);
        
        b.connections.add(e3);
        b.connections.add(e4);
        
        
        String username = System.getProperty("user.name");
        String path = "C:/Users/"+username+"/Documents/PollAway/votes/";
        
        File f = new File(path);
        f.mkdirs();
        
        /*                                               --in
        
        */
        
        /*                                               --out
        
        */
    }
    
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
        ArrayList<Voter> v = null;
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
    
    
    
}
