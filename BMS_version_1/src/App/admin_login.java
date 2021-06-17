
package App;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.sql.*;

public class admin_login extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
   
    public admin_login() {
        super("Admin Login");
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
        btn_signin = new javax.swing.JLabel();
        btn_forgotpassword = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(843, 556));
        setMinimumSize(new java.awt.Dimension(843, 556));
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
        lbl_username.setText("User Name");
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
        lbl_password.setText("Password");
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

        btn_signin.setBackground(new java.awt.Color(255, 102, 0));
        btn_signin.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_signin.setForeground(new java.awt.Color(255, 255, 255));
        btn_signin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_signin.setText("Sign in");
        btn_signin.setOpaque(true);
        btn_signin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_signinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_signinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_signinMouseExited(evt);
            }
        });

        btn_forgotpassword.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn_forgotpassword.setForeground(new java.awt.Color(153, 153, 153));
        btn_forgotpassword.setText("Forgot Password ?");
        btn_forgotpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_forgotpasswordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_forgotpasswordMouseExited(evt);
            }
        });

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
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_username, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                            .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showp))
                    .addComponent(jSeparator3)
                    .addComponent(btn_signin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator2)
                    .addComponent(btn_forgotpassword, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(Traveller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(lbl_username, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_username, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_password, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(showp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_password, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addGap(1, 1, 1)
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_signin, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_forgotpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void btn_forgotpasswordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_forgotpasswordMouseEntered
        btn_forgotpassword.setForeground(new Color(255,102,0));
    }//GEN-LAST:event_btn_forgotpasswordMouseEntered

    private void btn_forgotpasswordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_forgotpasswordMouseExited
        btn_forgotpassword.setForeground(new Color(153,153,153));
    }//GEN-LAST:event_btn_forgotpasswordMouseExited

    private void btn_signinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseEntered
        btn_signin.setBackground(new Color(255,153,0));
    }//GEN-LAST:event_btn_signinMouseEntered

    private void btn_signinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseExited
        btn_signin.setBackground(new Color(255,102,0));
    }//GEN-LAST:event_btn_signinMouseExited

    private void btn_signinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_signinMouseClicked
        String sql = "select username,password from adminacc where username=?and password=?";
        if (txt_username.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields.");
            
        } else if (txt_password.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields.");
        } else {
            try {
                pst = conn.prepareStatement(sql);
                pst.setString(1, txt_username.getText());
                pst.setString(2, txt_password.getText());
                rs = pst.executeQuery();
                if (rs.next()) {
                    rs.close();
                    pst.close();
                   

                    this.dispose();
                    admin_home L = new admin_home();
                    L.setVisible(true);
                } else {
                     JOptionPane.showMessageDialog(null, "Incorrect Login inputs ! Please try again.");

                }

            } catch (Exception ex) {
                 JOptionPane.showMessageDialog(null,ex); 
            } finally {
                try {
                    rs.close();
                    pst.close();
                } catch (Exception ex) {

                }
            }
        }
    }//GEN-LAST:event_btn_signinMouseClicked

    
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
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Traveller;
    private javax.swing.JLabel btn_forgotpassword;
    private javax.swing.JLabel btn_signin;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lbl_password;
    private javax.swing.JLabel lbl_username;
    private javax.swing.JLabel showp;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
