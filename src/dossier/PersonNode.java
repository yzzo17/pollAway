/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;

import java.util.ArrayList;

/**
 *
 * @author yzzo
 */
public class PersonNode extends Node{
    public ArrayList<Edge> connections;
    
    
    public PersonNode(int id){
        super(Integer.toString(id)); 
        connections = new ArrayList();
    }
}
