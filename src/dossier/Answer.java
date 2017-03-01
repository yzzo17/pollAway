/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;

import java.util.ArrayList;

/**
 *
 * @author javif89
 */
public class Answer {
    private String answerText;
    ArrayList<User> users = new ArrayList();
    ArrayList<Double> demo = new ArrayList();
    
    public void setAnswerText(String s){
        answerText = s;
    }
    public String getAnswerText(){
        return answerText;   
    }
    
    public void addUser(User u){
        users.add(u);
    }
    
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    /*
    TODO: get and set
    */
    
