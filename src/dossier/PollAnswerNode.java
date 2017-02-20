/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;

import java.util.ArrayList;
import java.io.*;
/**
 *
 * @author yzzo
 */
public class PollAnswerNode extends Node implements Serializable{
    public ArrayList<Edge> connections;
    
    public PollAnswerNode(String n){
        super(n); 
        connections = new ArrayList();
    }
}
