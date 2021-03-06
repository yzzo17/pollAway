/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dossier;
import java.awt.Dimension;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Osmani Alegre
 */
public class AdminDemo extends javax.swing.JFrame {

    /** Creates new form Demo */
    ArrayList<JCheckBox> bArray = new ArrayList();
    
    String path = "files/demo/demo.txt";
    File file = new File(path);
    
    public AdminDemo() {
        initComponents();
        this.setLocationRelativeTo(null);   //centers jframe
        this.revalidate();
        readDemoFile();
        displayBox();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DemoName = new javax.swing.JDialog();
        jLabel2 = new javax.swing.JLabel();
        dName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        currentDem = new javax.swing.JLabel();
        DemoPanel = new javax.swing.JPanel();
        DeleteButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        contButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        DemoName.setResizable(false);

        jLabel2.setText("Name of Demographic:");

        dName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dNameActionPerformed(evt);
            }
        });

        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DemoNameLayout = new javax.swing.GroupLayout(DemoName.getContentPane());
        DemoName.getContentPane().setLayout(DemoNameLayout);
        DemoNameLayout.setHorizontalGroup(
            DemoNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DemoNameLayout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(jButton1)
                .addContainerGap(190, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DemoNameLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DemoNameLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dName, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(83, 83, 83))
        );
        DemoNameLayout.setVerticalGroup(
            DemoNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DemoNameLayout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(dName, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        currentDem.setText("Current Demographics:");

        DemoPanel.setMaximumSize(new java.awt.Dimension(364, 215));
        DemoPanel.setMinimumSize(new java.awt.Dimension(364, 215));

        javax.swing.GroupLayout DemoPanelLayout = new javax.swing.GroupLayout(DemoPanel);
        DemoPanel.setLayout(DemoPanelLayout);
        DemoPanelLayout.setHorizontalGroup(
            DemoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DemoPanelLayout.setVerticalGroup(
            DemoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        contButton.setText("Continue");
        contButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contButtonActionPerformed(evt);
            }
        });

        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(160, 160, 160)
                        .addComponent(contButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DemoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                            .addComponent(DeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(currentDem)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(currentDem)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DeleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton)
                        .addGap(155, 155, 155))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(DemoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void contButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contButtonActionPerformed
        AdminPoll a = new AdminPoll();      
        this.setVisible(false);
        a.setVisible(true);            //basically goes to the AdminPoll Jframe
    }//GEN-LAST:event_contButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        ArrayList<JCheckBox> temp = new ArrayList();
                                    
        for (int i = 0; i < bArray.size(); i++) {
            if (bArray.get(i).isSelected()) {             //Deletes checkboxes from the checkboxes array
                    bArray.remove(i);
            }
        }
        
        
        
        try {
            writeDemoFile();   
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayBox();
        this.revalidate();
        
        
    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        Dimension n = new Dimension(400, 300);
        DemoName.setSize(n);
        DemoName.setLocationRelativeTo(null);
        DemoName.setVisible(true);        //creates JDialog for new demographic input
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void dNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dNameActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JCheckBox e = new JCheckBox();
        e.setText(dName.getText());
        bArray.add(e);
        DemoName.setVisible(false);
        dName.setText("");
        try {                                     //adds to the CheckBox Array while also re-writing to the txt file the new demo entry
            writeDemoFile();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
        displayBox();
        this.revalidate();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        AdminUser x = new AdminUser();
        this.setVisible(false);
        x.setVisible(true);             //goes back to the main menu
    }//GEN-LAST:event_backButtonActionPerformed
    private void writeDemoFile() throws FileNotFoundException{
        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();                   //writes the text from the text boxes to txt file
        
        PrintWriter w = new PrintWriter(file);
        for (int i = 0; i < bArray.size(); i++) {
            w.println(bArray.get(i).getText());
        }
        w.close();
        
    }
    
    private void readDemoFile(){
        
        try {
            File file = new File(path);
            Scanner sc = new Scanner(new BufferedReader(new FileReader(path)));

            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                JCheckBox e = new JCheckBox();
                e.setText(line);                        //reads from txt file
                bArray.add(e);
            }
            sc.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
    
    
    
    private void displayBox(){       //Displays the CheckBoxes on the JPanel
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
            java.util.logging.Logger.getLogger(AdminDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDemo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JDialog DemoName;
    private javax.swing.JPanel DemoPanel;
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton contButton;
    private javax.swing.JLabel currentDem;
    private javax.swing.JTextField dName;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables

}
