package tictactoe;

import java.util.Random;

public class AIForm extends javax.swing.JFrame {

    public AIForm() {
        initComponents();
    }

    public int Rounds;
    public int X1;
    public int X2;
    public int X3;
    public int Y1;
    public int Y2;
    public int Y3;
    public int C1 = X1 + Y1;
    public int C2 = X2 + Y2;
    public int C3 = X3 + Y3;
    public int bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9;

    public Random rand = new Random();

    void AIMethod() {
        System.out.println(Rounds + "");
        if (Rounds < 10) {
            if (X1 == -2 || X2 == -2 || X3 == -2 || Y1 == -2 || Y2 == -2 || Y3 == -2) {
                if (X1 == -2 || X2 == -2 || X3 == -2) {
                    XWINMETHOD();
                    Rounds++;

                }
                if (Y1 == -2 || Y2 == -2 || Y3 == -2) {
                    YWINMETHOD();
                    Rounds++;
                }
            } else if (X1 == 2 || X2 == 2 || X3 == 2 || Y1 == 2 || Y2 == 2 || Y3 == 2) {
                if (X1 == 2 || X2 == 2 || X3 == 2) {
                    XMethod();
                    Rounds++;
                }
                if (Y1 == 2 || Y2 == 2 || Y3 == 2) {
                    YMethod();
                    Rounds++;
                }

            } else {
                Random();
            }
            ScoreMethod();
        } else {
            DRAW();
        }
    }

    void XWINMETHOD() {
        if (X1 == -2) {
            if (Field1.getText() != "O") {
                Field1.setText("O");
                X1--;
                Y1--;
            }
            if (Field2.getText() != "O") {
                Field2.setText("O");
                X1--;
                Y2--;
            }
            if (Field3.getText() != "O") {
                Field3.setText("O");
                X1--;
                Y3--;
            }

        }
        if (X2 == -2) {
            if (Field4.getText() != "O") {
                Field4.setText("O");
                X2--;
                Y1--;
            }
            if (Field5.getText() != "O") {
                Field5.setText("O");
                X2--;
                Y2--;
            }
            if (Field6.getText() != "O") {
                Field6.setText("O");
                X2--;
                Y3--;
            }

        }
        if (X3 == -2) {
            if (Field7.getText() != "O") {
                Field7.setText("O");
                X3--;
                Y1--;
            }
            if (Field8.getText() != "O") {
                Field8.setText("O");
                X3--;
                Y2--;
            }
            if (Field9.getText() != "O") {
                Field9.setText("O");
                X3--;
                Y3--;
            }

        }
    }

    void YWINMETHOD() {
        if (Rounds % 2 == 0) {
            if (Y1 == -2) {
                if (Field1.getText() != "O") {
                    Field1.setText("O");
                    X1--;
                    Y1--;
                }
                if (Field4.getText() != "O") {
                    Field4.setText("O");
                    X2--;
                    Y1--;
                }
                if (Field7.getText() != "O") {
                    Field7.setText("O");
                    X3--;
                    Y1--;
                }

            }
            if (Y2 == -2) {
                if (Field2.getText() != "O") {
                    Field2.setText("O");
                    X1--;
                    Y2--;
                }
                if (Field5.getText() != "O") {
                    Field5.setText("O");
                    X2--;
                    Y2--;
                }
                if (Field8.getText() != "O") {
                    Field8.setText("O");
                    X3--;
                    Y2--;
                }

            }
            if (Y3 == -2) {
                if (Field3.getText() != "O") {
                    Field3.setText("O");
                    X1--;
                    Y3--;
                }
                if (Field6.getText() != "O") {
                    Field6.setText("O");
                    X2--;
                    Y3--;
                }
                if (Field9.getText() != "O") {
                    Field9.setText("O");
                    X3--;
                    Y3--;
                }

            }
        }
    }

    public void DRAW() {
        if (jLabel1.getText() != "PLAYER 1 WIN!" && jLabel1.getText() != "PLAYER 2 WIN!") {
            jLabel1.setText("DRAW");
        }
    }

    void Random() {
        int r = rand.nextInt(9);

        if (r == 0) {
            if (Field1.getText() != "X" && Field1.getText() != "O") {
                Field1.setText("O");
                X1--;
                Y1--;
                Rounds++;
            } else {
                Random();
            }

        }
        if (r == 1) {
            if (Field2.getText() != "X" && Field2.getText() != "O") {
                Field2.setText("O");
                X1--;
                Y2--;
                Rounds++;
            } else {
                Random();
            }
        }
        if (r == 2) {
            if (Field3.getText() != "X" && Field3.getText() != "O") {
                Field3.setText("O");
                X1--;
                Y3--;
                Rounds++;
            } else {
                Random();
            }
        }
        if (r == 3) {
            if (Field4.getText() != "X" && Field4.getText() != "O") {
                Field4.setText("O");
                X2--;
                Y1--;
                Rounds++;
            } else {
                Random();
            }
        }
        if (r == 4) {
            if (Field5.getText() != "X" && Field5.getText() != "O") {
                Field5.setText("O");
                X2--;
                Y2--;
                Rounds++;
            } else {
                Random();
            }
        }
        if (r == 5) {
            if (Field6.getText() != "X" && Field6.getText() != "O") {
                Field6.setText("O");
                X2--;
                Y3--;
                Rounds++;
            } else {
                Random();
            }
        }
        if (r == 6) {
            if (Field7.getText() != "X" && Field7.getText() != "O") {
                Field7.setText("O");
                X3--;
                Y1--;
                Rounds++;
            } else {
                Random();
            }
        }
        if (r == 7) {
            if (Field8.getText() != "X" && Field8.getText() != "O") {
                Field8.setText("O");
                X3--;
                Y2--;
                Rounds++;
            } else {
                Random();
            }
        }
        if (r == 8) {
            if (Field9.getText() != "X" && Field9.getText() != "O") {
                Field9.setText("O");
                X3--;
                Y3--;
                Rounds++;
            } else {
                Random();
            }
        }

    }

    void XMethod() {

        if (X1 == 2) {
            if (Field1.getText() != "X") {
                Field1.setText("O");
                X1--;
                Y1--;
            }
            if (Field2.getText() != "X") {
                Field2.setText("O");
                X1--;
                Y2--;
            }
            if (Field3.getText() != "X") {
                Field3.setText("O");
                X1--;
                Y3--;
            }

        }
        if (X2 == 2) {
            if (Field4.getText() != "X") {
                Field4.setText("O");
                X2--;
                Y1--;
            }
            if (Field5.getText() != "X") {
                Field5.setText("O");
                X2--;
                Y2--;
            }
            if (Field6.getText() != "X") {
                Field6.setText("O");
                X2--;
                Y3--;
            }

        }
        if (X3 == 2) {
            if (Field7.getText() != "X") {
                Field7.setText("O");
                X3--;
                Y1--;
            }
            if (Field8.getText() != "X") {
                Field8.setText("O");
                X3--;
                Y2--;
            }
            if (Field9.getText() != "X") {
                Field9.setText("O");
                X3--;
                Y3--;
            }

        }

    }

    void YMethod() {
//        if (Rounds % 2 == 0) {
        if (Y1 == 2) {
            if (Field1.getText() != "X") {
                Field1.setText("O");
                X1--;
                Y1--;
            }
            if (Field4.getText() != "X") {
                Field4.setText("O");
                X2--;
                Y1--;
            }
            if (Field7.getText() != "X") {
                Field7.setText("O");
                X3--;
                Y1--;
            }

        }
        if (Y2 == 2) {
            if (Field2.getText() != "X") {
                Field2.setText("O");
                X1--;
                Y2--;
            }
            if (Field5.getText() != "X") {
                Field5.setText("O");
                X2--;
                Y2--;
            }
            if (Field8.getText() != "X") {
                Field8.setText("O");
                X3--;
                Y2--;
            }

        }
        if (Y3 == 2) {
            if (Field3.getText() != "X") {
                Field3.setText("O");
                X1--;
                Y3--;
            }
            if (Field6.getText() != "X") {
                Field6.setText("O");
                X2--;
                Y3--;
            }
            if (Field9.getText() != "X") {
                Field9.setText("O");
                X3--;
                Y3--;
            }

        }
//        }
    }

    void ScoreMethod() {

        if (Field1.getText() == "X" && Field4.getText() == "X" && Field7.getText() == "X") {
            jLabel1.setText("PLAYER 1 WIN!");
        }
        if (Field2.getText() == "X" && Field5.getText() == "X" && Field8.getText() == "X") {
            jLabel1.setText("PLAYER 1 WIN!");
        }
        if (Field3.getText() == "X" && Field6.getText() == "X" && Field9.getText() == "X") {
            jLabel1.setText("PLAYER 1 WIN!");
        }
        if (Field1.getText() == "O" && Field4.getText() == "O" && Field7.getText() == "O") {
            jLabel1.setText("PLAYER 2 WIN!");
        }
        if (Field2.getText() == "O" && Field5.getText() == "O" && Field8.getText() == "O") {
            jLabel1.setText("PLAYER 2 WIN!");
        }
        if (Field3.getText() == "O" && Field6.getText() == "O" && Field9.getText() == "O") {
            jLabel1.setText("PLAYER 2 WIN!");
        }
        if (Field1.getText() == "X" && Field5.getText() == "X" && Field9.getText() == "X") {
            jLabel1.setText("PLAYER 1 WIN!");
        }
        if (Field3.getText() == "X" && Field5.getText() == "X" && Field7.getText() == "X") {
            jLabel1.setText("PLAYER 1 WIN!");
        }
        if (Field1.getText() == "O" && Field5.getText() == "O" && Field9.getText() == "O") {
            jLabel1.setText("PLAYER 2 WIN!");
        }
        if (Field3.getText() == "O" && Field5.getText() == "O" && Field7.getText() == "O") {
            jLabel1.setText("PLAYER 2 WIN!");
        }
        if (Field1.getText() == "X" && Field2.getText() == "X" && Field3.getText() == "X") {
            jLabel1.setText("PLAYER 1 WIN!");
        }
        if (Field4.getText() == "X" && Field5.getText() == "X" && Field6.getText() == "X") {
            jLabel1.setText("PLAYER 1 WIN!");
        }
        if (Field7.getText() == "X" && Field8.getText() == "X" && Field9.getText() == "X") {
            jLabel1.setText("PLAYER 1 WIN!");
        }
        if (Field1.getText() == "O" && Field2.getText() == "O" && Field3.getText() == "O") {
            jLabel1.setText("PLAYER 2 WIN!");
        }
        if (Field4.getText() == "O" && Field5.getText() == "O" && Field6.getText() == "O") {
            jLabel1.setText("PLAYER 2 WIN!");
        }
        if (Field7.getText() == "O" && Field8.getText() == "O" && Field9.getText() == "O") {
            jLabel1.setText("PLAYER 2 WIN!");
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Field3 = new javax.swing.JButton();
        Field4 = new javax.swing.JButton();
        Field5 = new javax.swing.JButton();
        Field6 = new javax.swing.JButton();
        Field7 = new javax.swing.JButton();
        Field8 = new javax.swing.JButton();
        Field9 = new javax.swing.JButton();
        Field2 = new javax.swing.JButton();
        Field1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Field3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field3ActionPerformed(evt);
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

        Field7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field7ActionPerformed(evt);
            }
        });

        Field8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field8ActionPerformed(evt);
            }
        });

        Field9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field9ActionPerformed(evt);
            }
        });

        Field2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field2ActionPerformed(evt);
            }
        });

        Field1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Field1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Field8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Field5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(150, 150, 150)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(63, 63, 63)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Field7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(Field4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 182, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Field9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(Field6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(Field3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(64, 64, 64)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Field5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(Field8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(46, 46, 46)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Field3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(36, 36, 36)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Field4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Field6, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                    .addGap(32, 32, 32)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(Field7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Field9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                    .addContainerGap(46, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field3ActionPerformed
        if (Field3.getText() != "X" && Field3.getText() != "O") {
            Field3.setText("X");
            X1++;
            Y3++;
            AIMethod();
            Rounds++;
        } else {
            jLabel1.setText("You can't do this");
        }
    }//GEN-LAST:event_Field3ActionPerformed

    private void Field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field4ActionPerformed
        if (Field4.getText() != "X" && Field4.getText() != "O") {
            Field4.setText("X");
            X2++;
            Y1++;
            AIMethod();
            Rounds++;
        }
    }//GEN-LAST:event_Field4ActionPerformed

    private void Field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field5ActionPerformed
        if (Field5.getText() != "X" && Field5.getText() != "O") {
            Field5.setText("X");
            X2++;
            Y2++;
            Rounds++;
            AIMethod();

        }
    }//GEN-LAST:event_Field5ActionPerformed

    private void Field6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field6ActionPerformed
        if (Field6.getText() != "X" && Field6.getText() != "O") {
            Field6.setText("X");
            X2++;
            Y3++;
            AIMethod();
            Rounds++;
        }
    }//GEN-LAST:event_Field6ActionPerformed

    private void Field7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field7ActionPerformed
        if (Field7.getText() != "X" && Field7.getText() != "O") {
            Field7.setText("X");
            X3++;
            Y1++;
            Rounds++;
            AIMethod();
        }
    }//GEN-LAST:event_Field7ActionPerformed

    private void Field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field8ActionPerformed
        if (Field8.getText() != "X" && Field8.getText() != "O") {
            Field8.setText("X");
            X3++;
            Y2++;
            Rounds++;
            AIMethod();
        }
    }//GEN-LAST:event_Field8ActionPerformed

    private void Field9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field9ActionPerformed
        if (Field9.getText() != "X" && Field9.getText() != "O") {
            Field9.setText("X");
            X3++;
            Y3++;
            Rounds++;
            AIMethod();
        }
    }//GEN-LAST:event_Field9ActionPerformed

    private void Field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field2ActionPerformed
        if (Field2.getText() != "X" && Field2.getText() != "O") {
            Field2.setText("X");
            X1++;
            Y2++;
            Rounds++;
            AIMethod();
        }
    }//GEN-LAST:event_Field2ActionPerformed

    private void Field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field1ActionPerformed
        if (Field1.getText() != "X" && Field1.getText() != "O") {
            Field1.setText("X");
            X1++;
            Y1++;
            Rounds++;
            AIMethod();
        }
    }//GEN-LAST:event_Field1ActionPerformed

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
            java.util.logging.Logger.getLogger(AIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AIForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AIForm().setVisible(true);
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
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
