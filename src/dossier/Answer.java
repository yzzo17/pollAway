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
    private String answerText;           //holds answer text
    ArrayList<User> users = new ArrayList();    //holds list of users that answered question
    ArrayList<Double> demo = new ArrayList();  //list percentage for each demographic
    
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
    
