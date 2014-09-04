/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package accounting;

import java.awt.TextField;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Noah
 */
public class Accounting extends javax.swing.JFrame {

    WriteFile logWriter;
    ReadFile logFile;
    String logPath;
    String[] logFileText;
    BigDecimal balance;
    /**
     * Creates new form NewJFrame
     */
    public Accounting() throws IOException {
        logPath = "account.txt";
        
        try {
            logWriter = new WriteFile(logPath, true);
            logFile = new ReadFile(logPath);
            logFileText = logFile.OpenFile();
           
            if(logFile.readLastLine().isEmpty()){
                balance = BigDecimal.ZERO;
                balance = balance.setScale(2, RoundingMode.FLOOR);
                logWriter.writeToFile("The balance is:");
                logWriter.writeToFile(balance.toString());
            }
            else{
                balance = new BigDecimal(logFile.readLastLine());
                balance = balance.setScale(2, RoundingMode.FLOOR);
            }
            
        }
        catch (IOException | ArrayIndexOutOfBoundsException e){
           balance = BigDecimal.ZERO;
           balance = balance.setScale(2, RoundingMode.FLOOR);
           logWriter.writeToFile("The balance is:");
           logWriter.writeToFile(balance.toString());
        }
        initComponents();
        balanceField.setText("$"+balance.toString());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        addField = new java.awt.TextField();
        subtractField = new java.awt.TextField();
        addButton = new java.awt.Button();
        subtractButton = new java.awt.Button();
        balanceField = new javax.swing.JTextField();
        balanceLabel = new javax.swing.JLabel();
        addLabel = new javax.swing.JLabel();
        subtractLabel = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Accounting");
        setResizable(false);

        addField.setName("addField"); // NOI18N
        addField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addFieldActionPerformed(evt);
            }
        });

        subtractField.setName("subtractField"); // NOI18N
        subtractField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractFieldActionPerformed(evt);
            }
        });

        addButton.setActionCommand("addButton");
        addButton.setLabel("add");
        addButton.setName("addButton"); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        subtractButton.setActionCommand("subtractButton");
        subtractButton.setLabel("subtract");
        subtractButton.setName("subtractButton"); // NOI18N
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractButtonActionPerformed(evt);
            }
        });

        balanceField.setEditable(false);
        balanceField.setText("$");
        balanceField.setName("balanceField"); // NOI18N

        balanceLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        balanceLabel.setText("is your current balance");
        balanceLabel.setName("balanceLabel"); // NOI18N

        addLabel.setText("+$");
        addLabel.setName("addLabel"); // NOI18N

        subtractLabel.setText("-$");
        subtractLabel.setName("subtractLabel"); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(addLabel)
                    .addComponent(subtractLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(addField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subtractField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(balanceField, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(balanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                    .addComponent(subtractButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(addField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(addLabel))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(subtractLabel)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtractField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(subtractButton, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(balanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(balanceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addField.getAccessibleContext().setAccessibleName("addField");
        addButton.getAccessibleContext().setAccessibleName("addButton");
        subtractButton.getAccessibleContext().setAccessibleName("subtractButton");
        balanceField.getAccessibleContext().setAccessibleName("balanceField");
        balanceLabel.getAccessibleContext().setAccessibleName("balanceLabel");
        addLabel.getAccessibleContext().setAccessibleName("addLabel");
        subtractLabel.getAccessibleContext().setAccessibleName("subtractLabel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subtractFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subtractFieldActionPerformed

    private void addFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addFieldActionPerformed
        
    }//GEN-LAST:event_addFieldActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        try {
            BigDecimal value;
            try{
                value = new BigDecimal(addField.getText());
                value.setScale(2, RoundingMode.FLOOR);
            }catch(NumberFormatException e){
                value = BigDecimal.ZERO;
            }
            logWriter.writeToFile("added " + value );
            updateBalance(addField, value);
            } catch (IOException ex) {
            Logger.getLogger(Accounting.class.getName()).log(Level.SEVERE, null, ex);
        }
        addField.setText("");
    }//GEN-LAST:event_addButtonActionPerformed

    private void subtractButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractButtonActionPerformed
        try {
            BigDecimal value;
            try{
                value = new BigDecimal(subtractField.getText());
                value.setScale(2, RoundingMode.FLOOR);
            }catch(NumberFormatException e){
                value = BigDecimal.ZERO;
            }
            logWriter.writeToFile("subtracted " + value);
            updateBalance(subtractField, value);
            } catch (IOException ex) {
            Logger.getLogger(Accounting.class.getName()).log(Level.SEVERE, null, ex);
        }
        subtractField.setText("");
    }//GEN-LAST:event_subtractButtonActionPerformed

    private void updateBalance(TextField operation, BigDecimal value) throws IOException{
        if(operation.equals(addField)){
        balance = balance.add(value);    
        }
        else if(operation.equals(subtractField)){
        balance = balance.subtract(value);
        }
        
        balance = balance.setScale(2, RoundingMode.FLOOR);
        logWriter.writeToFile("The new balance is:");
        logWriter.writeToFile(balance.toString());
        balanceField.setText("$" + balance.toString());
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
            java.util.logging.Logger.getLogger(Accounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Accounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Accounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Accounting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Accounting().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(Accounting.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button addButton;
    private java.awt.TextField addField;
    private javax.swing.JLabel addLabel;
    private javax.swing.JTextField balanceField;
    private javax.swing.JLabel balanceLabel;
    private javax.swing.JLabel jLabel3;
    private java.awt.Button subtractButton;
    private java.awt.TextField subtractField;
    private javax.swing.JLabel subtractLabel;
    // End of variables declaration//GEN-END:variables
}
