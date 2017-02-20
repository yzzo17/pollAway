/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;
import java.io.*;
/**
 *
 * @author yzzo
 */
public class Edge implements Serializable{
    public Node start;
    public Node end;
    
    public Edge(Node a, Node b){
        start = a;
        end = b;
    }
}

