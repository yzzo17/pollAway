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
public class DemoNode extends Node{
    public ArrayList<Edge> connections;
    
    public DemoNode(String n){
        super(n); 
        connections = new ArrayList();
    }
    
    
}
