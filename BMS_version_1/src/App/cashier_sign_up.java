
package App;

import java.awt.Color;
import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;

public class cashier_sign_up extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;

    public cashier_sign_up() {
        super("Cashier Sign Up");
        initComponents();
        conn = DBconnection.getConnection();
        setLocationRelativeTo(null);
    }

static ImageIcon ii;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Traveller = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lbl_username = new javax.swing.JLabel();
        lbl_password = new javax.swing.JLabel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        showp = new javax.swing.JLabel();
        btn_signup = new javax.swing.JLabel();
        lbl_secq = new javax.swing.JLabel();
        txt_secq = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        lbl_answer = new javax.swing.JLabel();
        txt_answer = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 556));
        setMinimumSize(new java.awt.Dimension(850, 556));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/logoBMS.png"))); // NOI18N

        Traveller.setBackground(new java.awt.Color(255, 255, 255));
        Traveller.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TravellerMouseDragged(evt);
            }
        });
        Traveller.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TravellerMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                TravellerMouseReleased(evt);
            }
        });

        close.setBackground(new java.awt.Color(250, 250, 250));
        close.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        close.setText("X");
        close.setOpaque(true);
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closeMouseExited(evt);
            }
        });

        javax.swing.GroupLayout TravellerLayout = new javax.swing.GroupLayout(Traveller);
        Traveller.setLayout(TravellerLayout);
        TravellerLayout.setHorizontalGroup(
            TravellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TravellerLayout.createSequentialGroup()
                .addGap(0, 801, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TravellerLayout.setVerticalGroup(
            TravellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lbl_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(153, 153, 153));
        lbl_username.setText("User Name :");
        lbl_username.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_usernameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_usernameMouseExited(evt);
            }
        });

        lbl_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_password.setForeground(new java.awt.Color(153, 153, 153));
        lbl_password.setText("Password :");
        lbl_password.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_passwordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_passwordMouseExited(evt);
            }
        });

        txt_username.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_username.setForeground(new java.awt.Color(153, 153, 153));
        txt_username.setBorder(null);
        txt_username.setMaximumSize(new java.awt.Dimension(59, 20));
        txt_username.setMinimumSize(new java.awt.Dimension(59, 20));

        txt_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_password.setForeground(new java.awt.Color(153, 153, 153));
        txt_password.setBorder(null);
        txt_password.setMaximumSize(new java.awt.Dimension(59, 20));
        txt_password.setMinimumSize(new java.awt.Dimension(59, 20));
        txt_password.setPreferredSize(new java.awt.Dimension(59, 20));

        showp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/icons8_Invisible_20px.png"))); // NOI18N
        showp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                showpMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                showpMouseReleased(evt);
            }
        });

        btn_signup.setBackground(new java.awt.Color(255, 102, 0));
        btn_signup.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_signup.setForeground(new java.awt.Color(255, 255, 255));
        btn_signup.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_signup.setText("Sign Up");
        btn_signup.setOpaque(true);
        btn_signup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_signupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_signupMouseExited(evt);
            }
        });

        lbl_secq.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_secq.setForeground(new java.awt.Color(153, 153, 153));
        lbl_secq.setText("Security Question :");
        lbl_secq.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_secqMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_secqMouseExited(evt);
            }
        });

        txt_secq.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_secq.setForeground(new java.awt.Color(153, 153, 153));
        txt_secq.setBorder(null);
        txt_secq.setMaximumSize(new java.awt.Dimension(59, 20));
        txt_secq.setMinimumSize(new java.awt.Dimension(59, 20));

        lbl_answer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_answer.setForeground(new java.awt.Color(153, 153, 153));
        lbl_answer.setText("Answer :");
        lbl_answer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_answerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_answerMouseExited(evt);
            }
        });

        txt_answer.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_answer.setForeground(new java.awt.Color(153, 153, 153));
        txt_answer.setBorder(null);
        txt_answer.setMaximumSize(new java.awt.Dimension(59, 20));
        txt_answer.setMinimumSize(new java.awt.Dimension(59, 20));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Traveller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showp))
                            .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(24, 24, 24))
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(txt_secq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(24, 24, 24))
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbl_secq, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lbl_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txt_answer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(24, 24, 24))
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Traveller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbl_secq, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_secq, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_answer, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_signup, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int xy,xx;
    private void closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_closeMouseClicked

    private void closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseEntered
        close.setBackground(new Color(255,0,0));
        close.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_closeMouseEntered

    private void closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseExited
        close.setBackground(new Color(250,250,250));
        close.setForeground(new Color(0,0,0));
    }//GEN-LAST:event_closeMouseExited

    private void TravellerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_TravellerMouseDragged

    private void TravellerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_TravellerMousePressed

    private void TravellerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_TravellerMouseReleased

    private void lbl_usernameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_usernameMouseEntered
        lbl_username.setForeground(new Color(255,102,0));
    }//GEN-LAST:event_lbl_usernameMouseEntered

    private void lbl_usernameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_usernameMouseExited
        lbl_username.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_lbl_usernameMouseExited

    private void lbl_passwordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_passwordMouseEntered
        lbl_password.setForeground(new Color(255,102,0));
    }//GEN-LAST:event_lbl_passwordMouseEntered

    private void lbl_passwordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_passwordMouseExited
        lbl_password.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_lbl_passwordMouseExited

    private void showpMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpMousePressed
        ii = new ImageIcon(getClass().getResource("/App/images/icons8_Eye_20px.png"));
        showp.setIcon(ii);
        txt_password.setEchoChar((char)0);
    }//GEN-LAST:event_showpMousePressed

    private void showpMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_showpMouseReleased
        ii = new ImageIcon(getClass().getResource("/App/images/icons8_Invisible_20px.png"));
        showp.setIcon(ii);
        txt_password.setEchoChar(('*'));
    }//GEN-LAST:event_showpMouseReleased

    private void lbl_secqMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_secqMouseEntered
        lbl_secq.setForeground(new Color(255,102,0));
    }//GEN-LAST:event_lbl_secqMouseEntered

    private void lbl_secqMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_secqMouseExited
        lbl_secq.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_lbl_secqMouseExited

    private void lbl_answerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_answerMouseEntered
        lbl_answer.setForeground(new Color(255,102,0));
    }//GEN-LAST:event_lbl_answerMouseEntered

    private void lbl_answerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_answerMouseExited
        lbl_answer.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_lbl_answerMouseExited

    private void btn_signupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signupMouseEntered
        btn_signup.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_btn_signupMouseEntered

    private void btn_signupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signupMouseExited
        btn_signup.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_btn_signupMouseExited

    private void btn_signupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signupMouseClicked
         String sql="Insert into cashieracc(username,secq,answer,password)values(?,?,?,?)";
        try {

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_username.getText());
            pst.setString(2,txt_secq.getText());
            pst.setString(3,txt_answer.getText());
            pst.setString(4,txt_password.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null,"New Account Created");
            rs.close();
            pst.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_btn_signupMouseClicked

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
            java.util.logging.Logger.getLogger(cashier_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cashier_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cashier_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cashier_sign_up.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cashier_sign_up().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Traveller;
    private javax.swing.JLabel btn_signup;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JLabel lbl_answer;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_secq;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel showp;
    private javax.swing.JTextField txt_answer;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_secq;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
