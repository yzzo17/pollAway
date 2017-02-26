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
public class Poll {
    private ArrayList<Question> questions;
    private ArrayList<ArrayList<Answer>> results = new ArrayList();
    
    public Poll(){
        startPoll();
    }
    
    public void setQuestions(ArrayList<Question> q){
        questions = q;
    }
    private void popResNull(){
        
    }
    
    private void popResults(){
        for (int i = 0; i < questions.size(); i++) {
            ArrayList<Answer> ansA = new ArrayList();
            results.add(ansA);
            ArrayList<String> ansTemp = questions.get(i).getAnswers();
            for (int j = 0; j < ansTemp.size(); j++) {
                String ans = ansTemp.get(i);
                Answer a = new Answer();
                a.setAnswerText(ans);
                results.get(i).add(a);
            }
        }
    }
    
    private void startPoll(){
        User currentUser = new User();
        
        UserDemo ud = new UserDemo(currentUser);
        ud.setVisible(true);
        for(String x : currentUser.demographics)
        {
            System.out.println(x);
        }
        UserPoll up = new UserPoll();
        up.setVisible(true);
        setQuestions(up.quez);        
        popResults();
        System.out.println(results.get(0).get(0).getAnswerText());
        
        
        /*
        if (up.fin = true) {
            for (int i = 0; i < results.size(); i++) {
                ArrayList<Answer> aArray = results.get(i);
                for (int j = 0; j < aArray.size(); j++) {
                    if (aArray.get(j).getAnswerText().equals(up.ansz.get(i))) {
                        aArray.get(j).addUser(currentUser);
                    }
                }
            }
            
            for (int i = 0; i < results.size(); i++) {
                System.out.println("q" + i);
                ArrayList<Answer> a = results.get(i);
                for (int j = 0; j < a.size(); j++) {
                    System.out.println(a.get(i).users.size()+ ", ");
                }
            }
        }
        */
        
    
    }
}