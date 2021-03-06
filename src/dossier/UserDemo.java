/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

/**
 *
 * @author Osmani Alegre
 */
public class UserDemo extends javax.swing.JFrame {

    /**
     * Creates new form UserDemo
     */
    ArrayList<JCheckBox> bArray = new ArrayList(); //ArrayList of checkboxes of demographics
    ArrayList<String> dArray = new ArrayList(); //list of string demographics
    String selected;  //demographic selected
    User user = new User();  //user created to give demographic to
    

    String path = "files/demo/demo.txt"; 
    File file = new File(path);
    
    public UserDemo() {
        initComponents();
        this.setLocationRelativeTo(null);
        readDemoFile();
        displayBox();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DemoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        next_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Choose your demographics below: ");

        javax.swing.GroupLayout DemoPanelLayout = new javax.swing.GroupLayout(DemoPanel);
        DemoPanel.setLayout(DemoPanelLayout);
        DemoPanelLayout.setHorizontalGroup(
            DemoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DemoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(168, Short.MAX_VALUE))
        );
        DemoPanelLayout.setVerticalGroup(
            DemoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DemoPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(175, Short.MAX_VALUE))
        );

        next_Button.setText("Next");
        next_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                next_ButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DemoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(next_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DemoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(next_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void next_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_next_ButtonActionPerformed
        addSelected();
        
    }//GEN-LAST:event_next_ButtonActionPerformed

    /**
     * @param args the command line arguments
     */
        
    private void readDemoFile(){      //reads demo.txt and adds each line to dArray
        
        try {
            File file = new File(path);
            Scanner s = new Scanner(new BufferedReader(new FileReader(path)));

            while (s.hasNextLine()) {
                String line = s.nextLine();
                dArray.add(line);
                JCheckBox e = new JCheckBox();
                e.setText(line);
                bArray.add(e);
            }
            AdminUser.demoArray = dArray;
            s.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
    private void addSelected(){       //finds the demographic selected
        for (int i = 0; i < bArray.size(); i++) {
            if (bArray.get(i).isSelected()) {
                selected = bArray.get(i).getText();
            }
        }
        user.demographic = selected;  //after the demographic is selected a new UserPoll object is made for the voter to vote
                                                            //the user being 'worked' on is also passed
                                                            
        UserPoll up = new UserPoll(user);
        this.setVisible(false);
        up.setVisible(true);
        
    }
    
    
    private void displayBox(){  //displays all the demographics 
        DemoPanel.removeAll();
        for (int i = 0; i < bArray.size(); i++) {
            if (bArray.get(i).getText().charAt(0) == '*') {
                JLabel j = new JLabel();
                j.setText(bArray.get(i).getText().substring(1));
                DemoPanel.add(j);
            }
            else{
                DemoPanel.add(bArray.get(i));
                DemoPanel.setLayout(new BoxLayout(DemoPanel, BoxLayout.Y_AXIS));
            }
            
        }
    }
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
            java.util.logging.Logger.getLogger(UserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DemoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton next_Button;
    // End of variables declaration//GEN-END:variables
}
