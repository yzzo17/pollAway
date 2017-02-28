/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dossier;

import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JLabel;

/**
 *
 * @author yzzo
 */
public class Results extends javax.swing.JFrame {

    /**
     * Creates new form Results
     */
    public Results() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        printPoll();
        printCount();
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
        votePanel = new javax.swing.JPanel();
        demoPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout quesPanelLayout = new javax.swing.GroupLayout(quesPanel);
        quesPanel.setLayout(quesPanelLayout);
        quesPanelLayout.setHorizontalGroup(
            quesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        quesPanelLayout.setVerticalGroup(
            quesPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout votePanelLayout = new javax.swing.GroupLayout(votePanel);
        votePanel.setLayout(votePanelLayout);
        votePanelLayout.setHorizontalGroup(
            votePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 105, Short.MAX_VALUE)
        );
        votePanelLayout.setVerticalGroup(
            votePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout demoPanelLayout = new javax.swing.GroupLayout(demoPanel);
        demoPanel.setLayout(demoPanelLayout);
        demoPanelLayout.setHorizontalGroup(
            demoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        demoPanelLayout.setVerticalGroup(
            demoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 297, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Ubuntu", 0, 36)); // NOI18N
        jLabel1.setText("Results:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 229, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addComponent(quesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(votePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(demoPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(demoPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(votePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(quesPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void printPoll(){
        for (int i = 0; i < AdminUser.Ques.size(); i++) {
            JLabel q = new JLabel();
            q.setText(AdminUser.Ques.get(i).getQuestion());
            this.quesPanel.add(q);
            quesPanel.setLayout(new BoxLayout(quesPanel, BoxLayout.Y_AXIS));
            for (int j = 0; j < AdminUser.Ques.get(i).getAnswers().size(); j++) {
                JLabel a = new JLabel();
                a.setText("-"+AdminUser.Ques.get(i).getAnswers().get(j));
                this.quesPanel.add(a);
                quesPanel.setLayout(new BoxLayout(quesPanel, BoxLayout.Y_AXIS));
            }
        }
    }
    
    private void printCount(){
        for (int i = 0; i < AdminUser.results.size(); i++) {
            ArrayList<Answer> aArr = AdminUser.results.get(i);
            
            JLabel q = new JLabel();
            q.setText("*");
            this.votePanel.add(q);
            votePanel.setLayout(new BoxLayout(votePanel, BoxLayout.Y_AXIS));
            
            for (int j = 0; j < aArr.size(); j++) {
                ArrayList<User> uArr = aArr.get(j).users;
                
                JLabel a = new JLabel();
                a.setText(Integer.toString(uArr.size()));
                this.votePanel.add(a);
                votePanel.setLayout(new BoxLayout(votePanel, BoxLayout.Y_AXIS));
                
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
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Results.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Results().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel demoPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel quesPanel;
    private javax.swing.JPanel votePanel;
    // End of variables declaration//GEN-END:variables
}
