/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;

import java.io.File;
import java.util.*;
import javax.swing.AbstractButton;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

/**
 *
 * @author yzzo
 */
public class UserPoll extends javax.swing.JFrame {

    /**
     * Creates new form UserPoll
     */
    ArrayList<Question> quez = new ArrayList();
    ArrayList<String> ansz = new ArrayList();
    boolean fin = false;
    
    ButtonGroup group = new ButtonGroup();
    int currentQuestion = 0;
    
    
    String username = System.getProperty("user.name");
    String path = "../pollAway/files/polls/poll.txt";
    File file = new File(path);
    
    PollAwayMain pam = new PollAwayMain();
    
    User user = new User();
    

    public UserPoll(User u) {
        initComponents();
        this.setLocationRelativeTo(null);
        user = u;
        getQues();
        nextQues();
        currentQuestion = currentQuestion - 1;
        quesPanel.revalidate();
        answerPanel.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        quesPanel = new javax.swing.JPanel();
        qNum = new javax.swing.JLabel();
        questionUser = new javax.swing.JLabel();
        answerPanel = new javax.swing.JPanel();
        nextQ_button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        qNum.setText("jLabel1");

        questionUser.setText("jLabel2");

        javax.swing.GroupLayout answerPanelLayout = new javax.swing.GroupLayout(answerPanel);
        answerPanel.setLayout(answerPanelLayout);
        answerPanelLayout.setHorizontalGroup(
            answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        answerPanelLayout.setVerticalGroup(
            answerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 229, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout quesPanelLayout = new javax.swing.GroupLayout(quesPanel);
        quesPanel.setLayout(quesPanelLayout);
        quesPanelLayout.setHorizontalGroup(
            quesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quesPanelLayout.createSequentialGroup()
                .addComponent(qNum)
                .addGap(18, 18, 18)
                .addComponent(questionUser, javax.swing.GroupLayout.DEFAULT_SIZE, 308, Short.MAX_VALUE))
            .addComponent(answerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        quesPanelLayout.setVerticalGroup(
            quesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(quesPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(quesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(qNum, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                    .addComponent(questionUser))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(answerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        nextQ_button.setText("Next Q");
        nextQ_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextQ_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(nextQ_button))
                    .addComponent(quesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(quesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nextQ_button))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextQ_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextQ_buttonActionPerformed
        String selectedAns = getSelected(group);
        
        if (!(currentQuestion > quez.size()-1)) {
            for (int i = 0; i < AdminUser.results.get(currentQuestion).size(); i++) {
                if (AdminUser.results.get(currentQuestion).get(i).getAnswerText().equals(selectedAns)) {
                    AdminUser.results.get(currentQuestion).get(i).users.add(user);
                }
                
            }
            
        }
        nextQues();
        
        
    }//GEN-LAST:event_nextQ_buttonActionPerformed
    
    
    private void nextQues() {

        if (currentQuestion > quez.size() - 1) {
            JOptionPane.showMessageDialog(this, "ALERT","POll OVER",JOptionPane.INFORMATION_MESSAGE);
            AdminUser u = new AdminUser();
            this.setVisible(false);
            u.setVisible(true);
            
        } else {
            Question x = quez.get(currentQuestion);
            String que = x.getQuestion();
            questionUser.setText(que);
            qNum.setText(String.valueOf(currentQuestion + 1));

            ArrayList<String> tempA = x.getAnswers();
            
            answerPanel.removeAll();
            for (int i = 0; i < tempA.size(); i++) {
                JRadioButton b = new JRadioButton();
                b.setText(tempA.get(i));
                group.add(b);
                answerPanel.add(b);
                answerPanel.setLayout(new BoxLayout(answerPanel, BoxLayout.Y_AXIS));
            }
            
            quesPanel.revalidate();
            answerPanel.revalidate();

            currentQuestion = currentQuestion + 1;
        }

    }
    
    private void getQues() {
        try {
            Scanner in = new Scanner(file);
            int currentQuestion = 1;

            while (in.hasNextLine()) {
                String question = in.nextLine();
                int answers = Integer.parseInt(in.nextLine());
                ArrayList<String> ans = new ArrayList();
                for (int i = 0; i < answers; i++) {
                    ans.add(in.nextLine().substring(2));
                }
                Question q = new Question();
                q.setQuestion(question);
                q.setAnswers(ans);
                quez.add(q);
            }
            
            for (int i = 0; i < quez.size(); i++) {
                ArrayList<String> S = quez.get(i).getAnswers();
                ArrayList<Answer> aA = new ArrayList();
                for (int j = 0; j < S.size(); j++) {
                    Answer a = new Answer();
                    a.setAnswerText(S.get(j));
                    aA.add(a);
                    
                }
                AdminUser.results.add(aA);
            }
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

   private  String getSelected(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }

        return null;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserPoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserPoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserPoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserPoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel answerPanel;
    private javax.swing.JButton nextQ_button;
    private javax.swing.JLabel qNum;
    private javax.swing.JPanel quesPanel;
    private javax.swing.JLabel questionUser;
    // End of variables declaration//GEN-END:variables
}
