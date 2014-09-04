/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package projectilesolver;

/**
 *
 * @author Noah
 */
public class ProjectileSolver extends javax.swing.JFrame {

    ConstantAcceleration solver;
    /**
     * Creates new form ProjectileSolver
     */
    public ProjectileSolver() {
        initComponents();
        solver = new ConstantAcceleration();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jLabel5 = new javax.swing.JLabel();
        viField = new javax.swing.JTextField();
        vfField = new javax.swing.JTextField();
        ΔxField = new javax.swing.JTextField();
        aField = new javax.swing.JTextField();
        tField = new javax.swing.JTextField();
        solveButton = new java.awt.Button();
        tLabel = new java.awt.Label();
        instructLabel = new java.awt.Label();
        clearButton = new java.awt.Button();
        viLabel = new javax.swing.JLabel();
        vfLabel = new javax.swing.JLabel();
        ΔxLabel = new javax.swing.JLabel();
        aLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Projectile Solver");
        setResizable(false);

        viField.setName("viField"); // NOI18N

        vfField.setName("vfField"); // NOI18N

        ΔxField.setName("ΔxField"); // NOI18N

        aField.setToolTipText("");

        tField.setText(" ");
        tField.setName("tField"); // NOI18N
        tField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tFieldActionPerformed(evt);
            }
        });

        solveButton.setActionCommand("solve");
        solveButton.setLabel("Solve");
        solveButton.setName("solveButton"); // NOI18N
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });

        tLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tLabel.setName("tLabel"); // NOI18N
        tLabel.setText("t = ");

        instructLabel.setName("instructLabel"); // NOI18N
        instructLabel.setText("Fill in three variables, then press Solve to find the other two.");

        clearButton.setActionCommand("clear");
        clearButton.setLabel("Clear All");
        clearButton.setName("clearButton"); // NOI18N
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        viLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        viLabel.setText("<html>v<sub>i</sub> =");
        viLabel.setName("viLabel"); // NOI18N

        vfLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        vfLabel.setText("<html>v<sub>f</sub> =");
        vfLabel.setName("vfLabel"); // NOI18N

        ΔxLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ΔxLabel.setText("Δx =");
        ΔxLabel.setName("ΔxLabel"); // NOI18N

        aLabel.setText("a =");
        aLabel.setName("aLabel"); // NOI18N

        jLabel1.setText("<html><sup>m</sup>/<sub>s</sub>");

        jLabel2.setText("<html><sup>m</sup>/<sub>s</sub>");

        jLabel3.setText("m");

        jLabel4.setText("s");

        jLabel6.setText("<html><sup>m</sup>/<sub>s</sub>2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(viLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(viField, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(vfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(vfField, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(ΔxLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ΔxField, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(aLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(aField, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(tLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(tField, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(instructLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(instructLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(viField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vfLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ΔxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ΔxLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(aField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(vfField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        viField.getAccessibleContext().setAccessibleName("viField");
        vfField.getAccessibleContext().setAccessibleName("vfField");
        ΔxField.getAccessibleContext().setAccessibleName("ΔxField");
        tField.getAccessibleContext().setAccessibleName("tField");
        solveButton.getAccessibleContext().setAccessibleName("solveButton");
        tLabel.getAccessibleContext().setAccessibleName("tLabel");
        instructLabel.getAccessibleContext().setAccessibleName("instructLabel");
        clearButton.getAccessibleContext().setAccessibleName("clearButton");
        viLabel.getAccessibleContext().setAccessibleName("viLabel");
        vfLabel.getAccessibleContext().setAccessibleName("vfLabel");
        ΔxLabel.getAccessibleContext().setAccessibleName("ΔxLabel");
        aLabel.getAccessibleContext().setAccessibleName("aLabel");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButtonActionPerformed
        if(hasDouble(viField) && hasDouble(aField) && hasDouble(tField)){
            solver.noVfNoΔx(extract(viField), extract(aField), extract(tField));
            set(vfField,solver.vf);
            set(ΔxField,solver.Δx);
        }
        else if(hasDouble(vfField) && hasDouble(aField) && hasDouble(tField)){
            solver.noViNoΔx(extract(vfField), extract(aField), extract(tField));
            set(viField,solver.vi);
            set(ΔxField,solver.Δx);
        }
        else if(hasDouble(viField) && hasDouble(vfField) && hasDouble(tField)){
            solver.noANoΔx(extract(viField), extract(vfField), extract(tField));
            set(aField,solver.a);
            set(ΔxField,solver.Δx);
        }
        else if(hasDouble(viField) && hasDouble(vfField) && hasDouble(aField)){
            solver.noTNoΔx(extract(viField), extract(vfField), extract(aField));
            set(tField,solver.t);
            set(ΔxField,solver.Δx);
        }
        else if(hasDouble(vfField) && hasDouble(ΔxField) && hasDouble(tField)){
            solver.noViNoA(extract(vfField), extract(ΔxField), extract(tField));
            set(viField,solver.vi);
            set(aField,solver.a);
        }
        else if(hasDouble(viField) && hasDouble(ΔxField) && hasDouble(tField)){
            solver.noVfNoA(extract(viField), extract(ΔxField), extract(tField));
            set(vfField,solver.vf);
            set(aField,solver.a);
        }
        else if(hasDouble(viField) && hasDouble(vfField) && hasDouble(ΔxField)){
            solver.noTNoA(extract(viField), extract(vfField), extract(ΔxField));
            set(tField,solver.t);
            set(aField,solver.a);
        }
        else if(hasDouble(vfField) && hasDouble(ΔxField) && hasDouble(aField)){
            solver.noViNoT(extract(vfField), extract(ΔxField), extract(aField));
            set(viField,solver.vi);
            set(tField,solver.t);
        }
        else if(hasDouble(viField) && hasDouble(ΔxField) && hasDouble(aField)){
            solver.noVfNoT(extract(viField), extract(ΔxField), extract(aField));
            set(vfField,solver.vf);
            set(tField,solver.t);
        }
        else if(hasDouble(ΔxField) && hasDouble(aField) && hasDouble(tField)){
            solver.noViNoVf(extract(ΔxField), extract(aField), extract(tField));
            set(viField,solver.vi);
            set(vfField,solver.vf);
        }
    }//GEN-LAST:event_solveButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        ΔxField.setText("");
        aField.setText("");
        tField.setText("");
        viField.setText("");
        vfField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void tFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tFieldActionPerformed

    
    public double extract(javax.swing.JTextField field){
        double fieldValue;
        
        try{
            fieldValue = Double.parseDouble(field.getText());
        }
        catch(NumberFormatException | NullPointerException e){
            fieldValue = 0;
        }
        
        return fieldValue;
    }
    
    public boolean hasDouble(javax.swing.JTextField field) {
        
        boolean isDouble = true; 
        
        try{
           Double.parseDouble(field.getText());
        }
        catch(NumberFormatException | NullPointerException e){
            isDouble = false;
        }
        
        return isDouble;
    }
    
    public void set(javax.swing.JTextField field, double value){
        field.setText(Double.toString(value));
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
            java.util.logging.Logger.getLogger(ProjectileSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProjectileSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProjectileSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProjectileSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProjectileSolver().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField aField;
    private javax.swing.JLabel aLabel;
    private java.awt.Button clearButton;
    private java.awt.Label instructLabel;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private java.awt.Button solveButton;
    private javax.swing.JTextField tField;
    private java.awt.Label tLabel;
    private javax.swing.JTextField vfField;
    private javax.swing.JLabel vfLabel;
    private javax.swing.JTextField viField;
    private javax.swing.JLabel viLabel;
    private javax.swing.JTextField ΔxField;
    private javax.swing.JLabel ΔxLabel;
    // End of variables declaration//GEN-END:variables
}
