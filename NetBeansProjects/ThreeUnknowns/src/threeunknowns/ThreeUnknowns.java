/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threeunknowns;

import javax.swing.JTextField;

/**
 *
 * @author Noah
 */
public class ThreeUnknowns extends javax.swing.JFrame {

    /**
     * Creates new form ThreeUnknowns
     */
    public ThreeUnknowns() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        a1 = new javax.swing.JTextField();
        a2 = new javax.swing.JTextField();
        a3 = new javax.swing.JTextField();
        b1 = new javax.swing.JTextField();
        b2 = new javax.swing.JTextField();
        b3 = new javax.swing.JTextField();
        c1 = new javax.swing.JTextField();
        c2 = new javax.swing.JTextField();
        c3 = new javax.swing.JTextField();
        d1 = new javax.swing.JTextField();
        d2 = new javax.swing.JTextField();
        d3 = new javax.swing.JTextField();
        x = new javax.swing.JTextField();
        y = new javax.swing.JTextField();
        z = new javax.swing.JTextField();
        solveButton = new java.awt.Button();
        xPlus = new javax.swing.JLabel();
        xPlus1 = new javax.swing.JLabel();
        xPlus2 = new javax.swing.JLabel();
        yPlus = new javax.swing.JLabel();
        yPlus1 = new javax.swing.JLabel();
        yPlus2 = new javax.swing.JLabel();
        zEquals = new javax.swing.JLabel();
        zEquals1 = new javax.swing.JLabel();
        zEquals2 = new javax.swing.JLabel();
        zEquals3 = new javax.swing.JLabel();
        xEquals = new javax.swing.JLabel();
        yEquals = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        clearButton = new java.awt.Button();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Three Unknown Solver");
        setResizable(false);

        a1.setName("a1"); // NOI18N

        a2.setName("a2"); // NOI18N

        a3.setName("a3"); // NOI18N

        b1.setName("b1"); // NOI18N

        b2.setName("b2"); // NOI18N

        b3.setName("b3"); // NOI18N

        c1.setName("c1"); // NOI18N

        c2.setName("c2"); // NOI18N

        c3.setName("c3"); // NOI18N

        d1.setName("d1"); // NOI18N

        d2.setName("d2"); // NOI18N

        d3.setName("d3"); // NOI18N

        x.setEditable(false);
        x.setName("x"); // NOI18N

        y.setEditable(false);
        y.setName("y"); // NOI18N

        z.setEditable(false);
        z.setName("z"); // NOI18N

        solveButton.setActionCommand("solveButton");
        solveButton.setLabel("solve");
        solveButton.setName("solveButton"); // NOI18N
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });

        xPlus.setText("x+");
        xPlus.setName("xPlus"); // NOI18N

        xPlus1.setText("x+");
        xPlus1.setName("xPlus"); // NOI18N

        xPlus2.setText("x+");
        xPlus2.setName("xPlus"); // NOI18N

        yPlus.setText("y+");
        yPlus.setName("yPlus"); // NOI18N

        yPlus1.setText("y+");
        yPlus1.setName("yPlus"); // NOI18N

        yPlus2.setText("y+");
        yPlus2.setName("yPlus"); // NOI18N

        zEquals.setText("z=");
        zEquals.setName("zEquals"); // NOI18N

        zEquals1.setText("z=");
        zEquals1.setName("zEquals"); // NOI18N

        zEquals2.setText("z=");
        zEquals2.setName("zEquals"); // NOI18N

        zEquals3.setText("z=");
        zEquals3.setName("zEquals"); // NOI18N

        xEquals.setText("x=");
        xEquals.setName("xEquals"); // NOI18N

        yEquals.setText("y=");
        yEquals.setName("yEquals"); // NOI18N

        label1.setName("label1"); // NOI18N
        label1.setText("1. Type the values in the fields");

        label2.setName("label2"); // NOI18N
        label2.setText("2. Press solve to solve the system");

        clearButton.setActionCommand("clearButton");
        clearButton.setLabel("clear all");
        clearButton.setName("clearButton"); // NOI18N
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(a3, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(a2)
                            .addComponent(a1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(xPlus)
                            .addComponent(xPlus1)
                            .addComponent(xPlus2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(b2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(b1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(b3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(yPlus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yPlus2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(yPlus1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(c1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(c2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(c3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(zEquals)
                            .addComponent(zEquals1)
                            .addComponent(zEquals2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(d2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                            .addComponent(d1)
                            .addComponent(d3)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(xEquals)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(yEquals)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(zEquals3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(z))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(xPlus1)
                                .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yPlus1)
                                .addComponent(zEquals1)
                                .addComponent(d2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                            .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xPlus2)
                            .addComponent(b3)
                            .addComponent(yPlus2)
                            .addComponent(c3)
                            .addComponent(zEquals2)
                            .addComponent(d3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(xPlus)
                        .addComponent(yPlus)
                        .addComponent(zEquals)
                        .addComponent(d1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(z, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(zEquals3)
                    .addComponent(xEquals)
                    .addComponent(yEquals))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(solveButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        a1.getAccessibleContext().setAccessibleName("a1");
        a2.getAccessibleContext().setAccessibleName("a2");
        a3.getAccessibleContext().setAccessibleName("a3");
        b1.getAccessibleContext().setAccessibleName("b1");
        b2.getAccessibleContext().setAccessibleName("b2");
        b3.getAccessibleContext().setAccessibleName("b3");
        c1.getAccessibleContext().setAccessibleName("c1");
        c2.getAccessibleContext().setAccessibleName("c2");
        c3.getAccessibleContext().setAccessibleName("c3");
        d1.getAccessibleContext().setAccessibleName("d1");
        d2.getAccessibleContext().setAccessibleName("d2");
        d3.getAccessibleContext().setAccessibleName("d3");
        x.getAccessibleContext().setAccessibleName("x");
        y.getAccessibleContext().setAccessibleName("y");
        z.getAccessibleContext().setAccessibleName("z");
        solveButton.getAccessibleContext().setAccessibleName("solveButton");
        xPlus.getAccessibleContext().setAccessibleName("xPlus");
        yPlus.getAccessibleContext().setAccessibleName("yPlus");
        zEquals.getAccessibleContext().setAccessibleName("zEquals");
        xEquals.getAccessibleContext().setAccessibleName("xEquals");
        yEquals.getAccessibleContext().setAccessibleName("yEquals");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButtonActionPerformed
        double a1val = extract(a1), a2val = extract(a2), a3val = extract(a3), 
               b1val = extract(b1), b2val = extract(b2), b3val = extract(b3), 
               c1val = extract(c1), c2val = extract(c2), c3val = extract(c3), 
               d1val = extract(d1), d2val = extract(d2), d3val = extract(d3), 
               xval, yval, zval;
        ThreeUnknownSolver solver = new ThreeUnknownSolver(a1val,b1val,c1val,d1val,
                                                           a2val,b2val,c2val,d2val,
                                                           a3val,b3val,c3val,d3val);
        try{
            solver.solve();
            xval = solver.x;
            yval = solver.y;
            zval = solver.z;
        
            x.setText(Double.toString(xval));
            y.setText(Double.toString(yval));
            z.setText(Double.toString(zval));
        }
        catch(RuntimeException e){
            x.setText("Undefined");
            y.setText("Undefined");
            z.setText("Undefined");
        }
       
        
    }//GEN-LAST:event_solveButtonActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
            JTextField[] fieldArray = new JTextField[]{a1,b1,c1,d1,x,
                                                       a2,b2,c2,d2,y,
                                                       a3,b3,c3,d3,z};
        for (JTextField field : fieldArray) {
            field.setText("");
        }
    }//GEN-LAST:event_clearButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ThreeUnknowns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThreeUnknowns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThreeUnknowns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThreeUnknowns.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThreeUnknowns().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a1;
    private javax.swing.JTextField a2;
    private javax.swing.JTextField a3;
    private javax.swing.JTextField b1;
    private javax.swing.JTextField b2;
    private javax.swing.JTextField b3;
    private javax.swing.JTextField c1;
    private javax.swing.JTextField c2;
    private javax.swing.JTextField c3;
    private java.awt.Button clearButton;
    private javax.swing.JTextField d1;
    private javax.swing.JTextField d2;
    private javax.swing.JTextField d3;
    private javax.swing.JLabel jLabel2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Button solveButton;
    private javax.swing.JTextField x;
    private javax.swing.JLabel xEquals;
    private javax.swing.JLabel xPlus;
    private javax.swing.JLabel xPlus1;
    private javax.swing.JLabel xPlus2;
    private javax.swing.JTextField y;
    private javax.swing.JLabel yEquals;
    private javax.swing.JLabel yPlus;
    private javax.swing.JLabel yPlus1;
    private javax.swing.JLabel yPlus2;
    private javax.swing.JTextField z;
    private javax.swing.JLabel zEquals;
    private javax.swing.JLabel zEquals1;
    private javax.swing.JLabel zEquals2;
    private javax.swing.JLabel zEquals3;
    // End of variables declaration//GEN-END:variables
}
