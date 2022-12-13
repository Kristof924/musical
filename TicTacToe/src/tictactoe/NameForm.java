/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tictactoe;

public final class NameForm extends javax.swing.JFrame {

    public NameForm() {
        initComponents();
        Action();

    }

    void Action() {
        Field1.setText(fid1);
        Field2.setText(fid2);
        Field3.setText(fid3);
        Field4.setText(fid4);
        Field5.setText(fid5);
        Field6.setText(fid6);
        Field7.setText(fid7);
        Field8.setText(fid8);
        Field9.setText(fid9);
        
        

    }
    public String fid1;
    public String fid2;
    public String fid3;
    public String fid4;
    public String fid5;
    public String fid6;
    public String fid7;
    public String fid8;
    public String fid9;

    public String P1;
    public String P2;


    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        Field1 = new javax.swing.JButton();
        Field3 = new javax.swing.JButton();
        Field2 = new javax.swing.JButton();
        Field4 = new javax.swing.JButton();
        Field5 = new javax.swing.JButton();
        Field6 = new javax.swing.JButton();
        Field9 = new javax.swing.JButton();
        Field8 = new javax.swing.JButton();
        Field7 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field1ActionPerformed(evt);
            }
        });

        Field3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field3ActionPerformed(evt);
            }
        });

        Field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field2ActionPerformed(evt);
            }
        });

        Field4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field4ActionPerformed(evt);
            }
        });

        Field5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field5ActionPerformed(evt);
            }
        });

        Field6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field6ActionPerformed(evt);
            }
        });

        Field9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field9ActionPerformed(evt);
            }
        });

        Field8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field8ActionPerformed(evt);
            }
        });

        Field7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field7ActionPerformed(evt);
            }
        });

        jButton1.setText("rewatch");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Field4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                            .addComponent(Field7, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Field8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Field5, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addComponent(Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jButton2)
                        .addGap(68, 68, 68)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Field6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                    .addComponent(Field9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field3, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Field9, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field8, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field7, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field1ActionPerformed
        
    }//GEN-LAST:event_Field1ActionPerformed

    private void Field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field2ActionPerformed
        
    }//GEN-LAST:event_Field2ActionPerformed

    private void Field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field3ActionPerformed
        
    }//GEN-LAST:event_Field3ActionPerformed

    private void Field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field4ActionPerformed
       
    }//GEN-LAST:event_Field4ActionPerformed

    private void Field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field5ActionPerformed
        
    }//GEN-LAST:event_Field5ActionPerformed

    private void Field6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field6ActionPerformed
        
    }//GEN-LAST:event_Field6ActionPerformed

    private void Field7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field7ActionPerformed
       
    }//GEN-LAST:event_Field7ActionPerformed

    private void Field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field8ActionPerformed
        
    }//GEN-LAST:event_Field8ActionPerformed

    private void Field9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field9ActionPerformed
       
    }//GEN-LAST:event_Field9ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Action();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new NameForm().setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                new NameForm().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Field1;
    private javax.swing.JButton Field2;
    private javax.swing.JButton Field3;
    private javax.swing.JButton Field4;
    private javax.swing.JButton Field5;
    private javax.swing.JButton Field6;
    private javax.swing.JButton Field7;
    private javax.swing.JButton Field8;
    private javax.swing.JButton Field9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    // End of variables declaration//GEN-END:variables
}
