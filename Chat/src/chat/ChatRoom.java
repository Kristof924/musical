package chat;

import chat.Menu;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;

public class ChatRoom extends javax.swing.JFrame {

    private Menu menu;
    Connection con;
    PreparedStatement pst;
    private String usname;
    private String Chat;
    private int slo;
    private int n;
    private int online = 0;

    public ChatRoom(Menu menu) {
        initComponents();
        this.menu = menu;
        setResizable(false);
        setLocationRelativeTo(null);
        Connect();
        SloNum();
        Load();
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true) {
                    try {
                        String sql = "SELECT * FROM room";
                        PreparedStatement pst = con.prepareCall(sql);
                        ResultSet rs = pst.executeQuery();
                        while (rs.next()) {
                            slo = rs.getInt("sno");
                            if (slo == n) {
                                n++;
                                Load();
                                Online();
                            }
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(ChatRoom.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        new Thread(r).start();
        addWindowListener(new java.awt.event.WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {

                try {
                    pst = con.prepareStatement("Update users set online=? WHERE username=?");
                    pst.setInt(1, online);
                    pst.setString(2, usname);
                    pst.executeUpdate();

                } catch (SQLException ex) {
                    Logger.getLogger(ChatRoom.class.getName()).log(Level.SEVERE, null, ex);
                }

            }

        });
    }

    private void Online() {
        try {
            DefaultListModel dlm = new DefaultListModel();
            int on = 1;
            String sql = "SELECT * FROM users WHERE online=?";
            PreparedStatement pst = con.prepareCall(sql);
            pst.setInt(1, on);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String un = rs.getString("username");
                dlm.addElement(un);

                OnList.setModel(dlm);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChatRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void SloNum() {
        try {
            String sql = "SELECT * FROM room";
            PreparedStatement pst = con.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                n = rs.getInt("sno");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ChatRoom.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private void Load() {
        try {
            DefaultListModel dlm = new DefaultListModel();
            String sql = "SELECT * FROM room";
            PreparedStatement pst = con.prepareCall(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                usname = rs.getString("username");
                Chat = rs.getString("chat");
                dlm.addElement(usname + ": " + Chat);

                txtList.setModel(dlm);

            }
        } catch (SQLException ex) {
            Logger.getLogger(ChatRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/chat", "root", "");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Menu.class
                    .getName()).log(Level.SEVERE, null, ex);

        } catch (SQLException ex) {
            Logger.getLogger(Menu.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        txtChat = new javax.swing.JTextField();
        txtSend = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtList = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        OnList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtSend.setText("SEND");
        txtSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSendActionPerformed(evt);
            }
        });

        txtList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        txtList.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(txtList);

        OnList.setDoubleBuffered(true);
        jScrollPane1.setViewportView(OnList);

        jLabel1.setText("ONLINE");

        jLabel2.setText("CHAT");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSend)
                        .addGap(189, 189, 189))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtChat, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSend))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSendActionPerformed
        try {
            String username, chat;
            username = menu.username;
            chat = txtChat.getText();

            pst = con.prepareStatement("insert into room (username,chat)values(?,?)");
            pst.setString(1, username);
            pst.setString(2, chat);
            pst.executeUpdate();
            Load();
            txtChat.setText("");

        } catch (SQLException ex) {
            Logger.getLogger(ChatRoom.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtSendActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> OnList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtChat;
    private javax.swing.JList<String> txtList;
    private javax.swing.JButton txtSend;
    // End of variables declaration//GEN-END:variables

}
