/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LMS;
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author PC
 */
public class Remove_member extends javax.swing.JFrame {
Connection conn;
ResultSet rs;
PreparedStatement pst;
    /**
     * Creates new form Remove_member
     */
    public Remove_member() {
        super("Remove_book");
        initComponents();
        conn = DBconnection.getConnection();
        error1.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txt_close1 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txt_memberID = new javax.swing.JTextField();
        error1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_name = new javax.swing.JTextField();
        txt_Regno = new javax.swing.JTextField();
        txt_course = new javax.swing.JTextField();
        Year = new javax.swing.JTextField();
        txt_semester = new javax.swing.JTextField();
        searchMid_btn = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        delete = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel15.setBackground(new java.awt.Color(255, 255, 255));
        jPanel15.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel15MouseDragged(evt);
            }
        });
        jPanel15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel15MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel15MouseReleased(evt);
            }
        });

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Star_Filled_12px.png"))); // NOI18N

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Star_Filled_12px.png"))); // NOI18N

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Star_Filled_12px.png"))); // NOI18N

        txt_close1.setEditable(false);
        txt_close1.setBackground(new java.awt.Color(255, 255, 255));
        txt_close1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txt_close1.setForeground(new java.awt.Color(51, 51, 51));
        txt_close1.setText("  X");
        txt_close1.setBorder(null);
        txt_close1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_close1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_close1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_close1MouseExited(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(204, 204, 204));
        jLabel17.setText("LMS  Remove Member");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Star_Filled_12px.png"))); // NOI18N

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Star_Filled_12px.png"))); // NOI18N

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Star_Filled_12px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addGap(27, 27, 27)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel18))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel20))
                            .addComponent(jLabel19))
                        .addContainerGap())
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel21))
                            .addGroup(jPanel15Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel22))
                            .addComponent(jLabel23))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 801, Short.MAX_VALUE)
                        .addComponent(txt_close1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_close1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 1050, 30));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("From LMS");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 70, 120, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Remove Member");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 20, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/IBnnnn.png"))); // NOI18N
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/remove_Member.png"))); // NOI18N
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 180));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 1050, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(102, 102, 102));
        jLabel15.setText("Enter Member ID :");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        txt_memberID.setBackground(new java.awt.Color(240, 240, 240));
        txt_memberID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_memberID.setForeground(new java.awt.Color(102, 102, 102));
        txt_memberID.setBorder(null);
        jPanel1.add(txt_memberID, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 250, 30));

        error1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        error1.setForeground(new java.awt.Color(255, 0, 0));
        error1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Attention_24px_3.png"))); // NOI18N
        error1.setText("Please check your inputs !");
        jPanel1.add(error1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 310, 240, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Home_24px_3.png"))); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(213, 213, 213))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Search_24px_7.png"))); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(167, 167, 167))
        );

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 50, 50));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Settings_24px_4.png"))); // NOI18N

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(115, 115, 115))
        );

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 50, 49));

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_About_24px_1.png"))); // NOI18N

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(63, 63, 63))
        );

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, -1, 49));

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel11MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel11MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel11MouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Logout_Rounded_Left_24px.png"))); // NOI18N

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addContainerGap())
        );

        jPanel2.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 50, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 50, 580));

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Left_24px_2.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        txt_name.setEditable(false);
        txt_name.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_name.setForeground(new java.awt.Color(102, 102, 102));
        txt_name.setBorder(null);
        jPanel1.add(txt_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 290, 20));

        txt_Regno.setEditable(false);
        txt_Regno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_Regno.setForeground(new java.awt.Color(102, 102, 102));
        txt_Regno.setBorder(null);
        jPanel1.add(txt_Regno, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 290, 20));

        txt_course.setEditable(false);
        txt_course.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_course.setForeground(new java.awt.Color(102, 102, 102));
        txt_course.setBorder(null);
        jPanel1.add(txt_course, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 290, 20));

        Year.setEditable(false);
        Year.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Year.setForeground(new java.awt.Color(102, 102, 102));
        Year.setBorder(null);
        jPanel1.add(Year, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 290, 20));

        txt_semester.setEditable(false);
        txt_semester.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_semester.setForeground(new java.awt.Color(102, 102, 102));
        txt_semester.setBorder(null);
        jPanel1.add(txt_semester, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 480, 290, 20));

        searchMid_btn.setBackground(new java.awt.Color(102, 102, 102));
        searchMid_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMid_btnMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Search_24px_7.png"))); // NOI18N

        javax.swing.GroupLayout searchMid_btnLayout = new javax.swing.GroupLayout(searchMid_btn);
        searchMid_btn.setLayout(searchMid_btnLayout);
        searchMid_btnLayout.setHorizontalGroup(
            searchMid_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, searchMid_btnLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );
        searchMid_btnLayout.setVerticalGroup(
            searchMid_btnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(searchMid_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, -1, 30));

        delete.setBackground(new java.awt.Color(102, 102, 102));
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(204, 204, 204));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/LMS/images/icons8_Trash_Can_24px.png"))); // NOI18N
        jLabel12.setText("Delete");

        javax.swing.GroupLayout deleteLayout = new javax.swing.GroupLayout(delete);
        delete.setLayout(deleteLayout);
        deleteLayout.setHorizontalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jLabel12)
                .addContainerGap(111, Short.MAX_VALUE))
        );
        deleteLayout.setVerticalGroup(
            deleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 450, 290, 40));

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
    private void txt_close1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_close1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_txt_close1MouseClicked

    private void txt_close1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_close1MouseEntered
        // TODO add your handling code here:
        txt_close1.setBackground(new Color(255,0,0));
        txt_close1.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_txt_close1MouseEntered

    private void txt_close1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_close1MouseExited
        // TODO add your handling code here:
        txt_close1.setBackground(new Color(255,255,255));
        txt_close1.setForeground(new Color(51,51,51));
    }//GEN-LAST:event_txt_close1MouseExited

    private void jPanel15MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseDragged
        // TODO add your handling code here:
        int x =evt.getXOnScreen();
        int y =evt.getYOnScreen();
        this.setLocation(x-xx, y-xy);
    }//GEN-LAST:event_jPanel15MouseDragged

    private void jPanel15MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MousePressed
        // TODO add your handling code here:
        setOpacity((float)0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_jPanel15MousePressed

    private void jPanel15MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel15MouseReleased
        // TODO add your handling code here:
        setOpacity((float)1.0);
    }//GEN-LAST:event_jPanel15MouseReleased

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(51,51,51));   //51,51,51
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        // TODO add your handling code here:
        jPanel6.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        // TODO add your handling code here:
        dispose();
        Search SI = new Search ();
        SI.setVisible(true);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        // TODO add your handling code here:
        jPanel8.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked
        // TODO add your handling code here:
        dispose();
        Settings SI = new Settings ();
        SI.setVisible(true);
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        // TODO add your handling code here:
        jPanel9.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        // TODO add your handling code here:
        jPanel9.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        // TODO add your handling code here:
        dispose();
        About SI = new About ();
        SI.setVisible(true);
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        // TODO add your handling code here:
        jPanel10.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        // TODO add your handling code here:
        jPanel10.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel10MouseExited

    private void jPanel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jPanel11MouseClicked

    private void jPanel11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseEntered
        // TODO add your handling code here:
        jPanel11.setBackground(new Color(51,51,51));
    }//GEN-LAST:event_jPanel11MouseEntered

    private void jPanel11MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel11MouseExited
        // TODO add your handling code here:
        jPanel11.setBackground(new Color(102,102,102));
    }//GEN-LAST:event_jPanel11MouseExited

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        dispose();
        Sign_in SI = new Sign_in();
        SI.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        // TODO add your handling code here:
        dispose();
        Sign_in SI = new Sign_in();
        SI.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(255,153,153));
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        jPanel3.setBackground(new Color(240,240,240));
    }//GEN-LAST:event_jPanel3MouseExited

    private void searchMid_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMid_btnMouseClicked
        // TODO add your handling code here:
        String a1= txt_memberID.getText();
        String sql = "select * from students where studentid='"+a1+"'";
        try{
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            if (rs.next()){
                txt_name.setText(rs.getString(2));
                txt_Regno.setText(rs.getString(3));
                txt_course.setText(rs.getString(4));
                Year.setText(rs.getString(5));
                txt_semester.setText(rs.getString(6));
                error1.setVisible(false);
                rs.close();
                pst.close();
            }
            else{
                error1.setVisible(true); // txt_username.setText(null);
            }
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_searchMid_btnMouseClicked

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        String sql="delete from students where studentid=?";
        try {
            //(id,title,author,isbn,publisher,category,price)values(?,?,?,?,?,?,?)
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_memberID.getText());

            pst.execute();
            JOptionPane.showMessageDialog(null,"Member is Deleted");
            rs.close();
            pst.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,ex);
        }
    }//GEN-LAST:event_deleteMouseClicked

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
            java.util.logging.Logger.getLogger(Remove_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Remove_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Remove_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Remove_member.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Remove_member().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Year;
    private javax.swing.JPanel delete;
    private javax.swing.JLabel error1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel searchMid_btn;
    private javax.swing.JTextField txt_Regno;
    private javax.swing.JTextField txt_close1;
    private javax.swing.JTextField txt_course;
    private javax.swing.JTextField txt_memberID;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_semester;
    // End of variables declaration//GEN-END:variables
}
