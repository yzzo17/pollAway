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
public class Question {
    private String question;
    private ArrayList<String> answers = new ArrayList();
    
    public Question(){
        
    }
    
    public void setQuestion(String str){
        question = str;
    }
    
    public String getQuestion(){
        return question;
    }
    
    public ArrayList<String> getAnswers(){
        return answers;
    }
    
    public void addAnswer(String ans){
        answers.add(ans);
    }
    
    public void setAnswers(ArrayList<String> ans)
    {
        answers = ans;
    }
    
}
