package tictactoe;

public class TicTacFrame extends javax.swing.JFrame {

    public MenuFrame fr = new MenuFrame();
    public NameForm name = new NameForm();
    public int Rounds;
    public String p1;
    public String p2;
    public int P1POINT;
    public int P2POINT;

    public String p1n;
    public int AIPoint;

    //Resee
    public boolean fd1;
    public boolean fd2;
    public boolean fd3;
    public boolean fd4;
    public boolean fd5;
    public boolean fd6;
    public boolean fd7;
    public boolean fd8;
    public boolean fd9;

    void RoundMethod() {
        jLabel2.setText(p1);
        jLabel4.setText(p2);
        Rounds++;
        ScoreMethod();

        if (Rounds % 2 == 0) {

            player.setText(p1);
        } else {

            player.setText(p2);
        }

    }

    void ScoreMethod() {
        jLabel1.setText("");

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

        if (jLabel1.getText() == "PLAYER 1 WIN!") {
            ++P1POINT;

            EndGameMethod();
        }
        if (jLabel1.getText() == "PLAYER 2 WIN!") {
            ++P2POINT;

            EndGameMethod();
        }

    }

    void EndGameMethod() {
        p1point.setText(P1POINT + "");
        p2point.setText(P2POINT + "");
        player.setText("GAMEOVER");
        Field1.setAction(null);
        Field2.setAction(null);
        Field3.setAction(null);
        Field4.setAction(null);
        Field5.setAction(null);
        Field6.setAction(null);
        Field7.setAction(null);
        Field8.setAction(null);
        Field9.setAction(null);
    }

    void DRAW() {
        player.setText("GAMEOVER");
        Field1.setAction(null);
        Field2.setAction(null);
        Field3.setAction(null);
        Field4.setAction(null);
        Field5.setAction(null);
        Field6.setAction(null);
        Field7.setAction(null);
        Field8.setAction(null);
        Field9.setAction(null);
    }

    public TicTacFrame() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Field2 = new javax.swing.JButton();
        Field1 = new javax.swing.JButton();
        player = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Field3 = new javax.swing.JButton();
        Field4 = new javax.swing.JButton();
        Field5 = new javax.swing.JButton();
        Field6 = new javax.swing.JButton();
        Field7 = new javax.swing.JButton();
        Field8 = new javax.swing.JButton();
        Field9 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        p1point = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p2point = new javax.swing.JLabel();
        rewatch = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        rewatch.setText("rewatch");
        rewatch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rewatchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(p1point, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2point, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Field7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Field4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Field5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Field8, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Field6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(Field3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Field9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(rewatch)
                        .addGap(50, 50, 50))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(player, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(p2point)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(p1point))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Field2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Field3, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Field4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field6, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Field7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Field9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rewatch)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Field1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field1ActionPerformed
        if (Rounds == 0) {
            player.setText(p1);
        }
        if (Field1.getText() != "X" && Field1.getText() != "O") {
            if (player.getText() == p1) {

                Field1.setText("X");
                name.fid1 = Field1.getText();
                RoundMethod();

            } else {
                Field1.setText("O");
                name.fid1 = Field1.getText();
                RoundMethod();
            }
        } else {
            jLabel1.setText("You can't do that!");
        }

    }//GEN-LAST:event_Field1ActionPerformed

    private void Field2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field2ActionPerformed
        if (Rounds == 0) {
            player.setText(p1);
        }
        if (Field2.getText() != "X" && Field2.getText() != "O") {
            if (player.getText() == p1) {

                Field2.setText("X");
                fd2 = true;
                RoundMethod();
                name.fid2 = Field2.getText();
            } else {

                Field2.setText("O");
                fd3 = false;
                RoundMethod();
                name.fid2 = Field2.getText();
            }
        } else {
            jLabel1.setText("You can't do that!");
        }

    }//GEN-LAST:event_Field2ActionPerformed

    private void Field3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field3ActionPerformed
        if (Rounds == 0) {
            player.setText(p1);
        }
        if (Field3.getText() != "X" && Field3.getText() != "O") {
            if (player.getText() == p1) {

                Field3.setText("X");
                fd3 = true;
                RoundMethod();
                name.fid3 = Field3.getText();
            } else {

                Field3.setText("O");
                RoundMethod();
                name.fid3 = Field3.getText();
            }
        } else {
            jLabel1.setText("You can't do that!");
        }
    }//GEN-LAST:event_Field3ActionPerformed

    private void Field4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field4ActionPerformed
        if (Rounds == 0) {
            player.setText(p1);
        }
        if (Field4.getText() != "X" && Field4.getText() != "O") {
            if (player.getText() == p1) {

                Field4.setText("X");
                fd4 = true;
                RoundMethod();
                name.fid4 = Field4.getText();
            } else {

                Field4.setText("O");
                RoundMethod();
                name.fid4 = Field4.getText();
            }
        } else {
            jLabel1.setText("You can't do that!");
        }
    }//GEN-LAST:event_Field4ActionPerformed

    private void Field5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field5ActionPerformed
        if (Rounds == 0) {
            player.setText(p1);
        }
        if (Field5.getText() != "X" && Field5.getText() != "O") {
            if (player.getText() == p1) {

                Field5.setText("X");
                fd5 = true;
                RoundMethod();
                name.fid5 = Field5.getText();
            } else {

                Field5.setText("O");
                RoundMethod();
                name.fid5 = Field5.getText();
            }
        } else {
            jLabel1.setText("You can't do that!");
        }
    }//GEN-LAST:event_Field5ActionPerformed

    private void Field6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field6ActionPerformed
        if (Rounds == 0) {
            player.setText(p1);
        }
        if (Field6.getText() != "X" && Field6.getText() != "O") {
            if (player.getText() == p1) {

                Field6.setText("X");
                fd6 = true;
                name.fid6 = Field6.getText();
                RoundMethod();
            } else {

                Field6.setText("O");
                RoundMethod();
                name.fid6 = Field6.getText();
            }
        } else {
            jLabel1.setText("You can't do that!");
        }
    }//GEN-LAST:event_Field6ActionPerformed

    private void Field7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field7ActionPerformed
        if (Rounds == 0) {
            player.setText(p1);
        }
        if (Field7.getText() != "X" && Field7.getText() != "O") {
            if (player.getText() == p1) {

                Field7.setText("X");
                fd7 = true;
                name.fid7 = Field7.getText();
                RoundMethod();
            } else {

                Field7.setText("O");
                name.fid7 = Field7.getText();
                RoundMethod();
            }
        } else {
            jLabel1.setText("You can't do that!");
        }
    }//GEN-LAST:event_Field7ActionPerformed

    private void Field8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field8ActionPerformed
        if (Rounds == 0) {
            player.setText(p1);
        }
        if (Field8.getText() != "X" && Field8.getText() != "O") {
            if (player.getText() == p1) {

                Field8.setText("X");
                fd8 = true;
                name.fid8 = Field8.getText();
                RoundMethod();
            } else {

                Field8.setText("O");
                RoundMethod();
                name.fid8 = Field8.getText();
            }
        } else {
            jLabel1.setText("You can't do that!");
        }
    }//GEN-LAST:event_Field8ActionPerformed

    private void Field9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Field9ActionPerformed
        if (Rounds == 0) {
            player.setText(p1);
        }
        if (Field9.getText() != "X" && Field9.getText() != "O") {
            if (player.getText() == p1) {

                Field9.setText("X");
                name.fid9 = Field9.getText();
                fd9 = true;
                RoundMethod();
            } else {

                Field9.setText("O");
                name.fid9 = Field9.getText();
                RoundMethod();
            }
        } else {
            jLabel1.setText("You can't do that!");
        }
    }//GEN-LAST:event_Field9ActionPerformed

    private void rewatchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rewatchActionPerformed
        rewatch.setText(p1n);
        name.setVisible(true);


    }//GEN-LAST:event_rewatchActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TicTacFrame().setVisible(true);
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel p1point;
    private javax.swing.JLabel p2point;
    private javax.swing.JLabel player;
    private javax.swing.JButton rewatch;
    // End of variables declaration//GEN-END:variables
}
