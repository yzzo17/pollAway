/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.Window;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Osmani Alegre
 */
public class AdminPoll extends javax.swing.JFrame {

    /**
     * Creates new form AddPolls
     */
    
    ArrayList<String> Ques = new ArrayList();
    public AdminPoll() {
        initComponents();
        this.setLocationRelativeTo(null);       //sets window in the middle
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        AddQuesButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        question = new javax.swing.JTextArea();
        queNum = new javax.swing.JLabel();
        FinishButton = new javax.swing.JButton();
        ans1 = new javax.swing.JTextField();
        labelA = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        ans2 = new javax.swing.JTextField();
        labelC = new javax.swing.JLabel();
        ans3 = new javax.swing.JTextField();
        labelD = new javax.swing.JLabel();
        ans4 = new javax.swing.JTextField();
        labelE = new javax.swing.JLabel();
        ans5 = new javax.swing.JTextField();
        questionNumberLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        AddQuesButton.setText("Add Question");
        AddQuesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddQuesButtonActionPerformed(evt);
            }
        });

        question.setColumns(20);
        question.setRows(5);
        jScrollPane1.setViewportView(question);

        queNum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        queNum.setText("1");

        FinishButton.setText("Finish");
        FinishButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FinishButtonActionPerformed(evt);
            }
        });

        ans1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans1ActionPerformed(evt);
            }
        });

        labelA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelA.setText("A");

        labelB.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelB.setText("B");

        ans2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans2ActionPerformed(evt);
            }
        });

        labelC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelC.setText("C");

        ans3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans3ActionPerformed(evt);
            }
        });

        labelD.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelD.setText("D");

        ans4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans4ActionPerformed(evt);
            }
        });

        labelE.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        labelE.setText("E");

        ans5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ans5ActionPerformed(evt);
            }
        });

        questionNumberLabel.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        questionNumberLabel.setText("Questions");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(queNum, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 529, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelA, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelB, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelC, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelE, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelD))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ans1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ans2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ans3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ans4, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ans5, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(AddQuesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(FinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(47, 47, 47))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(questionNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(191, 191, 191))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(questionNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(queNum, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelA)
                    .addComponent(ans1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelB)
                    .addComponent(ans2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelC, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ans3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelD, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ans4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelE)
                    .addComponent(ans5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AddQuesButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(FinishButton, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddQuesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddQuesButtonActionPerformed
        String qNum = this.queNum.getText();
        int q = Integer.parseInt(qNum);
        ArrayList<JTextField> arrA = new ArrayList();
        ArrayList<String> answers = new ArrayList();
        
        Ques.add(question.getText());
        arrA.add(ans1);
        arrA.add(ans2);
        arrA.add(ans3);
        arrA.add(ans4);
        arrA.add(ans5);
        
        for (int i = 0; i < arrA.size(); i++) {
            if(!"".equals(arrA.get(i).getText()))
            {
                answers.add(arrA.get(i).getText());
            }
        }
        Ques.add(String.valueOf(answers.size()));
        for (int i = 0; i < arrA.size(); i++) {
            String temp = Integer.toString(i);
            if ("".equals(arrA.get(i).getText())) {
                break;
            }
            else{
                
                Ques.add("a"+temp +" "+ arrA.get(i).getText());
            }
        }

        
        
        
        q = q + 1;
        qNum = Integer.toString(q);
        queNum.setText(qNum);
        questionNumberLabel.setText("Question" + " #"+qNum);
        question.setText("");
        ans1.setText("");
        ans2.setText("");
        ans3.setText("");
        ans4.setText("");
        ans5.setText("");
        
    }//GEN-LAST:event_AddQuesButtonActionPerformed

    private void ans1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans1ActionPerformed

    private void FinishButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FinishButtonActionPerformed
        try {
            // TODO add your handling code here:
            writePollToFile(Ques);
        } catch (IOException ex) {
            Logger.getLogger(AdminPoll.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        JOptionPane.showMessageDialog(this, "Demographics Have Been Recorded", "Recorder",JOptionPane.INFORMATION_MESSAGE);
        this.setVisible(false);
        AdminUser admin = new AdminUser();
        admin.setVisible(true);
        
        admin.setLocationRelativeTo(admin);
       
    }//GEN-LAST:event_FinishButtonActionPerformed

    private void ans2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans2ActionPerformed

    private void ans3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans3ActionPerformed

    private void ans4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans4ActionPerformed

    private void ans5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ans5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ans5ActionPerformed
 
    private void writePollToFile(ArrayList<String> ansArray) throws FileNotFoundException, IOException{
        String path = "files/polls";
        
        BufferedWriter out = new BufferedWriter(new FileWriter(path+"/poll.txt"));
        for (int i = 0; i < ansArray.size(); i++) {
            out.write(ansArray.get(i));
            out.newLine();
        }
        out.flush();
        out.close();
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
            java.util.logging.Logger.getLogger(AdminPoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminPoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminPoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminPoll.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddQuesButton;
    private javax.swing.JButton FinishButton;
    private javax.swing.JTextField ans1;
    private javax.swing.JTextField ans2;
    private javax.swing.JTextField ans3;
    private javax.swing.JTextField ans4;
    private javax.swing.JTextField ans5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelC;
    private javax.swing.JLabel labelD;
    private javax.swing.JLabel labelE;
    private javax.swing.JLabel queNum;
    private javax.swing.JTextArea question;
    private javax.swing.JLabel questionNumberLabel;
    // End of variables declaration//GEN-END:variables
}