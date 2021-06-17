/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import AppPackage.AnimationClass;
import java.awt.Color;
import javax.swing.JLabel;

/**
 *
 * @author PC
 */
public class new_order extends javax.swing.JFrame {

    /**
     * Creates new form new_order
     */
    public new_order() {
        initComponents();
    }
int xy,xx;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Traveller = new javax.swing.JPanel();
        close = new javax.swing.JLabel();
        lbl_back = new javax.swing.JLabel();
        btn6 = new javax.swing.JLabel();
        btn5 = new javax.swing.JLabel();
        btn4 = new javax.swing.JLabel();
        btn3 = new javax.swing.JLabel();
        btn2 = new javax.swing.JLabel();
        btn1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        bt2_1 = new javax.swing.JLabel();
        bt2_2 = new javax.swing.JLabel();
        bt2_3 = new javax.swing.JLabel();
        bt3_1 = new javax.swing.JLabel();
        bt3_2 = new javax.swing.JLabel();
        bt3_3 = new javax.swing.JLabel();
        bt4_1 = new javax.swing.JLabel();
        bt4_2 = new javax.swing.JLabel();
        bt4_3 = new javax.swing.JLabel();
        bt5_1 = new javax.swing.JLabel();
        bt5_2 = new javax.swing.JLabel();
        bt5_3 = new javax.swing.JLabel();
        bt6_1 = new javax.swing.JLabel();
        bt6_2 = new javax.swing.JLabel();
        bt6_3 = new javax.swing.JLabel();
        bt6_4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Dorderday = new datechooser.beans.DateChooserCombo();
        jLabel1 = new javax.swing.JLabel();
        Dreturndate = new datechooser.beans.DateChooserCombo();
        jLabel3 = new javax.swing.JLabel();
        bttonsave = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtOrderNum = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtItems = new javax.swing.JTextField();
        bttonclear = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Traveller.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        Traveller.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 0, 62, 30));

        lbl_back.setBackground(new java.awt.Color(250, 250, 250));
        lbl_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/icons8_Left_25px_2.png"))); // NOI18N
        lbl_back.setOpaque(true);
        Traveller.add(lbl_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 60, 30));

        btn6.setBackground(new java.awt.Color(255, 255, 255));
        btn6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn6.setForeground(new java.awt.Color(102, 102, 102));
        btn6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn6.setText("Reports");
        btn6.setOpaque(true);
        btn6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn6MouseClicked(evt);
                btn6MousereClicked(evt);
            }
        });
        Traveller.add(btn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 100, 30));

        btn5.setBackground(new java.awt.Color(255, 255, 255));
        btn5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn5.setForeground(new java.awt.Color(102, 102, 102));
        btn5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn5.setText("Bill & Payment");
        btn5.setOpaque(true);
        btn5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn5MouseClicked(evt);
                btn5MousereClicked(evt);
            }
        });
        Traveller.add(btn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 100, 30));

        btn4.setBackground(new java.awt.Color(255, 255, 255));
        btn4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn4.setForeground(new java.awt.Color(102, 102, 102));
        btn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn4.setText("WareHouse");
        btn4.setOpaque(true);
        btn4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn4MouseClicked(evt);
                btn4MousereClicked(evt);
            }
        });
        Traveller.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 0, 100, 30));

        btn3.setBackground(new java.awt.Color(255, 255, 255));
        btn3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn3.setForeground(new java.awt.Color(102, 102, 102));
        btn3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn3.setText("Orders");
        btn3.setOpaque(true);
        btn3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn3MouseClicked(evt);
                btn3MousereClicked(evt);
            }
        });
        Traveller.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 100, 30));

        btn2.setBackground(new java.awt.Color(255, 255, 255));
        btn2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn2.setForeground(new java.awt.Color(102, 102, 102));
        btn2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn2.setText("Production");
        btn2.setOpaque(true);
        btn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn2MouseClicked(evt);
                btn2MousereClicked(evt);
            }
        });
        Traveller.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 100, 30));

        btn1.setBackground(new java.awt.Color(255, 255, 255));
        btn1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btn1.setForeground(new java.awt.Color(255, 102, 0));
        btn1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn1.setText("Home");
        btn1.setOpaque(true);
        btn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn1MouseClicked(evt);
            }
        });
        Traveller.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 100, 30));

        jPanel1.add(Traveller, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bt2_1.setBackground(new java.awt.Color(255, 255, 255));
        bt2_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt2_1.setForeground(new java.awt.Color(102, 102, 102));
        bt2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt2_1.setText("Add new");
        bt2_1.setOpaque(true);
        bt2_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt2_1MouseEntered(evt);
            }
        });
        jPanel2.add(bt2_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -30, 100, 29));

        bt2_2.setBackground(new java.awt.Color(255, 255, 255));
        bt2_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt2_2.setForeground(new java.awt.Color(102, 102, 102));
        bt2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt2_2.setText("Remove");
        bt2_2.setOpaque(true);
        bt2_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt2_2MouseEntered(evt);
            }
        });
        jPanel2.add(bt2_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -30, 100, 29));

        bt2_3.setBackground(new java.awt.Color(255, 255, 255));
        bt2_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt2_3.setForeground(new java.awt.Color(102, 102, 102));
        bt2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt2_3.setText("Recepie");
        bt2_3.setOpaque(true);
        bt2_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt2_3MouseEntered(evt);
            }
        });
        jPanel2.add(bt2_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, -30, 100, 29));

        bt3_1.setBackground(new java.awt.Color(255, 255, 255));
        bt3_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt3_1.setForeground(new java.awt.Color(102, 102, 102));
        bt3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt3_1.setText("New");
        bt3_1.setOpaque(true);
        bt3_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt3_1MouseEntered(evt);
            }
        });
        jPanel2.add(bt3_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -30, 100, 29));

        bt3_2.setBackground(new java.awt.Color(255, 255, 255));
        bt3_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt3_2.setForeground(new java.awt.Color(102, 102, 102));
        bt3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt3_2.setText("Remove");
        bt3_2.setOpaque(true);
        bt3_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt3_2MouseEntered(evt);
            }
        });
        jPanel2.add(bt3_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -30, 100, 29));

        bt3_3.setBackground(new java.awt.Color(255, 255, 255));
        bt3_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt3_3.setForeground(new java.awt.Color(102, 102, 102));
        bt3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt3_3.setText("Recepie");
        bt3_3.setOpaque(true);
        bt3_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt3_3MouseEntered(evt);
            }
        });
        jPanel2.add(bt3_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, -30, 100, 29));

        bt4_1.setBackground(new java.awt.Color(255, 255, 255));
        bt4_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt4_1.setForeground(new java.awt.Color(102, 102, 102));
        bt4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt4_1.setText("Ingredings");
        bt4_1.setOpaque(true);
        bt4_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt4_1MouseEntered(evt);
            }
        });
        jPanel2.add(bt4_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, -30, 100, 29));

        bt4_2.setBackground(new java.awt.Color(255, 255, 255));
        bt4_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt4_2.setForeground(new java.awt.Color(102, 102, 102));
        bt4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt4_2.setText("Status");
        bt4_2.setOpaque(true);
        bt4_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt4_2MouseEntered(evt);
            }
        });
        jPanel2.add(bt4_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, -30, 100, 29));

        bt4_3.setBackground(new java.awt.Color(255, 255, 255));
        bt4_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt4_3.setForeground(new java.awt.Color(102, 102, 102));
        bt4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt4_3.setText("Recepie");
        bt4_3.setOpaque(true);
        bt4_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt4_3MouseEntered(evt);
            }
        });
        jPanel2.add(bt4_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, -30, 100, 29));

        bt5_1.setBackground(new java.awt.Color(255, 255, 255));
        bt5_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt5_1.setForeground(new java.awt.Color(102, 102, 102));
        bt5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt5_1.setText("Make bill");
        bt5_1.setOpaque(true);
        bt5_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt5_1MouseEntered(evt);
            }
        });
        jPanel2.add(bt5_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -30, 100, 29));

        bt5_2.setBackground(new java.awt.Color(255, 255, 255));
        bt5_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt5_2.setForeground(new java.awt.Color(102, 102, 102));
        bt5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt5_2.setText("Remove");
        bt5_2.setOpaque(true);
        bt5_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt5_2MouseEntered(evt);
            }
        });
        jPanel2.add(bt5_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -30, 100, 29));

        bt5_3.setBackground(new java.awt.Color(255, 255, 255));
        bt5_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt5_3.setForeground(new java.awt.Color(102, 102, 102));
        bt5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt5_3.setText("Recepie");
        bt5_3.setOpaque(true);
        bt5_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt5_3MouseEntered(evt);
            }
        });
        jPanel2.add(bt5_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -30, 100, 29));

        bt6_1.setBackground(new java.awt.Color(255, 255, 255));
        bt6_1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt6_1.setForeground(new java.awt.Color(102, 102, 102));
        bt6_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt6_1.setText("Production");
        bt6_1.setOpaque(true);
        bt6_1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt6_1MouseEntered(evt);
            }
        });
        jPanel2.add(bt6_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -30, 100, 29));

        bt6_2.setBackground(new java.awt.Color(255, 255, 255));
        bt6_2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt6_2.setForeground(new java.awt.Color(102, 102, 102));
        bt6_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt6_2.setText("Sales");
        bt6_2.setOpaque(true);
        bt6_2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt6_2MouseEntered(evt);
            }
        });
        jPanel2.add(bt6_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -30, 100, 29));

        bt6_3.setBackground(new java.awt.Color(255, 255, 255));
        bt6_3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt6_3.setForeground(new java.awt.Color(102, 102, 102));
        bt6_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt6_3.setText("Customers");
        bt6_3.setOpaque(true);
        bt6_3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt6_3MouseEntered(evt);
            }
        });
        jPanel2.add(bt6_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -30, 100, 29));

        bt6_4.setBackground(new java.awt.Color(255, 255, 255));
        bt6_4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bt6_4.setForeground(new java.awt.Color(102, 102, 102));
        bt6_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bt6_4.setText("Delivery");
        bt6_4.setOpaque(true);
        bt6_4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bt6_4MouseEntered(evt);
            }
        });
        jPanel2.add(bt6_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, -30, 100, 29));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        Dorderday.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    Dorderday.setFieldFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(102, 102, 102));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
    jLabel1.setText("Quantity :");

    Dreturndate.setCurrentView(new datechooser.view.appearance.AppearancesList("Swing",
        new datechooser.view.appearance.ViewAppearance("custom",
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                true,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 255),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.ButtonPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(128, 128, 128),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(0, 0, 255),
                false,
                true,
                new datechooser.view.appearance.swing.LabelPainter()),
            new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Tahoma", java.awt.Font.PLAIN, 11),
                new java.awt.Color(0, 0, 0),
                new java.awt.Color(255, 0, 0),
                false,
                false,
                new datechooser.view.appearance.swing.ButtonPainter()),
            (datechooser.view.BackRenderer)null,
            false,
            true)));
Dreturndate.setFieldFont(new java.awt.Font("Segoe UI", java.awt.Font.PLAIN, 13));

jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
jLabel3.setForeground(new java.awt.Color(102, 102, 102));
jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
jLabel3.setText("Items :");

bttonsave.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
bttonsave.setForeground(new java.awt.Color(102, 102, 102));
bttonsave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
bttonsave.setText("Save");
bttonsave.setOpaque(true);

jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
jLabel6.setForeground(new java.awt.Color(102, 102, 102));
jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
jLabel6.setText("Oder No :");

txtOrderNum.setBackground(new java.awt.Color(249, 249, 249));
txtOrderNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
txtOrderNum.setForeground(new java.awt.Color(102, 102, 102));
txtOrderNum.setBorder(null);

txtQuantity.setBackground(new java.awt.Color(249, 249, 249));
txtQuantity.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
txtQuantity.setForeground(new java.awt.Color(102, 102, 102));
txtQuantity.setBorder(null);

jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
jLabel4.setForeground(new java.awt.Color(102, 102, 102));
jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
jLabel4.setText(" Oder Date :");

jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
jLabel5.setForeground(new java.awt.Color(102, 102, 102));
jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
jLabel5.setText("Complete Date :");

txtItems.setBackground(new java.awt.Color(249, 249, 249));
txtItems.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
txtItems.setForeground(new java.awt.Color(102, 102, 102));
txtItems.setBorder(null);

bttonclear.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
bttonclear.setForeground(new java.awt.Color(102, 102, 102));
bttonclear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
bttonclear.setText("Clear");
bttonclear.setOpaque(true);

javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
jPanel3.setLayout(jPanel3Layout);
jPanel3Layout.setHorizontalGroup(
    jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
    .addGroup(jPanel3Layout.createSequentialGroup()
        .addContainerGap()
        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtOrderNum, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtItems, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Dorderday, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(Dreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(130, 130, 130)
                .addComponent(bttonsave, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(bttonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap())
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel6)
                .addComponent(txtOrderNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel3)
                .addComponent(txtItems, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel1)
                .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(10, 10, 10)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel4)
                .addComponent(Dorderday, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(20, 20, 20)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5)
                .addComponent(Dreturndate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(120, 120, 120)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bttonsave, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(bttonclear, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap())
    );

    jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

    jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/logoBMS.png"))); // NOI18N
    jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, 390, 180));

    jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1000, 550));

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

    private void btn6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MouseClicked
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelYDown(-30, 1, 1, 1, bt6_1);
        AC.jLabelYDown(-30, 31, 1, 1, bt6_2);
        AC.jLabelYDown(-30, 61, 1, 1, bt6_3);
        AC.jLabelYDown(-30, 91, 1, 1, bt6_4);

        AC.jLabelYUp(1, -30, 1, 1, bt2_1);
        AC.jLabelYUp(31, -30, 1, 1, bt2_2);
        AC.jLabelYUp(61, -30, 1, 1, bt2_3);
        AC.jLabelYUp(1, -30, 1, 1, bt3_1);
        AC.jLabelYUp(31, -30, 1, 1, bt3_2);
        AC.jLabelYUp(61, -30, 1, 1, bt3_3);
        AC.jLabelYUp(1, -30, 1, 1, bt4_1);
        AC.jLabelYUp(31, -30, 1, 1, bt4_2);
        AC.jLabelYUp(61, -30, 1, 1, bt4_3);
        AC.jLabelYUp(1, -30, 1, 1, bt5_1);
        AC.jLabelYUp(31, -30, 1, 1, bt5_2);
        AC.jLabelYUp(61, -30, 1, 1, bt5_3);
    }//GEN-LAST:event_btn6MouseClicked

    private void btn6MousereClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn6MousereClicked
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelYUp(1, -30, 1, 1, bt2_1);
        AC.jLabelYUp(31, -30, 1, 1, bt2_2);
        AC.jLabelYUp(61, -30, 1, 1, bt2_3);
        AC.jLabelYUp(1, -30, 1, 1, bt3_1);
        AC.jLabelYUp(31, -30, 1, 1, bt3_2);
        AC.jLabelYUp(61, -30, 1, 1, bt3_3);
        AC.jLabelYUp(1, -30, 1, 1, bt4_1);
        AC.jLabelYUp(31, -30, 1, 1, bt4_2);
        AC.jLabelYUp(61, -30, 1, 1, bt4_3);
        AC.jLabelYUp(1, -30, 1, 1, bt5_1);
        AC.jLabelYUp(31, -30, 1, 1, bt5_2);
        AC.jLabelYUp(61, -30, 1, 1, bt5_3);
        AC.jLabelYUp(1, -30, 1, 1, bt6_1);
        AC.jLabelYUp(31, -30, 1, 1, bt6_2);
        AC.jLabelYUp(61, -30, 1, 1, bt6_3);
        AC.jLabelYUp(91, -30, 1, 1, bt6_4);
    }//GEN-LAST:event_btn6MousereClicked

    private void btn5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MouseClicked

        AnimationClass AC = new AnimationClass();
        AC.jLabelYDown(-30, 1, 1, 1, bt5_1);
        AC.jLabelYDown(-30, 31, 1, 1, bt5_2);
        AC.jLabelYDown(-30, 61, 1, 1, bt5_3);

        AC.jLabelYUp(1, -30, 1, 1, bt2_1);
        AC.jLabelYUp(31, -30, 1, 1, bt2_2);
        AC.jLabelYUp(61, -30, 1, 1, bt2_3);
        AC.jLabelYUp(1, -30, 1, 1, bt3_1);
        AC.jLabelYUp(31, -30, 1, 1, bt3_2);
        AC.jLabelYUp(61, -30, 1, 1, bt3_3);
        AC.jLabelYUp(1, -30, 1, 1, bt4_1);
        AC.jLabelYUp(31, -30, 1, 1, bt4_2);
        AC.jLabelYUp(61, -30, 1, 1, bt4_3);
        AC.jLabelYUp(1, -30, 1, 1, bt6_1);
        AC.jLabelYUp(31, -30, 1, 1, bt6_2);
        AC.jLabelYUp(61, -30, 1, 1, bt6_3);
        AC.jLabelYUp(91, -30, 1, 1, bt6_4);
    }//GEN-LAST:event_btn5MouseClicked

    private void btn5MousereClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn5MousereClicked
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelYUp(1, -30, 1, 1, bt2_1);
        AC.jLabelYUp(31, -30, 1, 1, bt2_2);
        AC.jLabelYUp(61, -30, 1, 1, bt2_3);
        AC.jLabelYUp(1, -30, 1, 1, bt3_1);
        AC.jLabelYUp(31, -30, 1, 1, bt3_2);
        AC.jLabelYUp(61, -30, 1, 1, bt3_3);
        AC.jLabelYUp(1, -30, 1, 1, bt4_1);
        AC.jLabelYUp(31, -30, 1, 1, bt4_2);
        AC.jLabelYUp(61, -30, 1, 1, bt4_3);
        AC.jLabelYUp(1, -30, 1, 1, bt5_1);
        AC.jLabelYUp(31, -30, 1, 1, bt5_2);
        AC.jLabelYUp(61, -30, 1, 1, bt5_3);
        AC.jLabelYUp(1, -30, 1, 1, bt6_1);
        AC.jLabelYUp(31, -30, 1, 1, bt6_2);
        AC.jLabelYUp(61, -30, 1, 1, bt6_3);
        AC.jLabelYUp(91, -30, 1, 1, bt6_4);
    }//GEN-LAST:event_btn5MousereClicked

    private void btn4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MouseClicked

        AnimationClass AC = new AnimationClass();
        AC.jLabelYDown(-30, 1, 1, 1, bt4_1);
        AC.jLabelYDown(-30, 31, 1, 1, bt4_2);
        AC.jLabelYDown(-30, 61, 1, 1, bt4_3);

        AC.jLabelYUp(1, -30, 1, 1, bt2_1);
        AC.jLabelYUp(31, -30, 1, 1, bt2_2);
        AC.jLabelYUp(61, -30, 1, 1, bt2_3);
        AC.jLabelYUp(1, -30, 1, 1, bt3_1);
        AC.jLabelYUp(31, -30, 1, 1, bt3_2);
        AC.jLabelYUp(61, -30, 1, 1, bt3_3);
        AC.jLabelYUp(1, -30, 1, 1, bt5_1);
        AC.jLabelYUp(31, -30, 1, 1, bt5_2);
        AC.jLabelYUp(61, -30, 1, 1, bt5_3);
        AC.jLabelYUp(1, -30, 1, 1, bt6_1);
        AC.jLabelYUp(31, -30, 1, 1, bt6_2);
        AC.jLabelYUp(61, -30, 1, 1, bt6_3);
        AC.jLabelYUp(91, -30, 1, 1, bt6_4);
    }//GEN-LAST:event_btn4MouseClicked

    private void btn4MousereClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn4MousereClicked
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelYUp(1, -30, 1, 1, bt2_1);
        AC.jLabelYUp(31, -30, 1, 1, bt2_2);
        AC.jLabelYUp(61, -30, 1, 1, bt2_3);
        AC.jLabelYUp(1, -30, 1, 1, bt3_1);
        AC.jLabelYUp(31, -30, 1, 1, bt3_2);
        AC.jLabelYUp(61, -30, 1, 1, bt3_3);
        AC.jLabelYUp(1, -30, 1, 1, bt4_1);
        AC.jLabelYUp(31, -30, 1, 1, bt4_2);
        AC.jLabelYUp(61, -30, 1, 1, bt4_3);
        AC.jLabelYUp(1, -30, 1, 1, bt5_1);
        AC.jLabelYUp(31, -30, 1, 1, bt5_2);
        AC.jLabelYUp(61, -30, 1, 1, bt5_3);
        AC.jLabelYUp(1, -30, 1, 1, bt6_1);
        AC.jLabelYUp(31, -30, 1, 1, bt6_2);
        AC.jLabelYUp(61, -30, 1, 1, bt6_3);
        AC.jLabelYUp(91, -30, 1, 1, bt6_4);
    }//GEN-LAST:event_btn4MousereClicked

    private void btn3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MouseClicked

        AnimationClass AC = new AnimationClass();
        AC.jLabelYDown(-30, 1, 1, 1, bt3_1);
        AC.jLabelYDown(-30, 31, 1, 1, bt3_2);
        AC.jLabelYDown(-30, 61, 1, 1, bt3_3);

        AC.jLabelYUp(1, -30, 1, 1, bt2_1);
        AC.jLabelYUp(31, -30, 1, 1, bt2_2);
        AC.jLabelYUp(61, -30, 1, 1, bt2_3);
        AC.jLabelYUp(1, -30, 1, 1, bt4_1);
        AC.jLabelYUp(31, -30, 1, 1, bt4_2);
        AC.jLabelYUp(61, -30, 1, 1, bt4_3);
        AC.jLabelYUp(1, -30, 1, 1, bt5_1);
        AC.jLabelYUp(31, -30, 1, 1, bt5_2);
        AC.jLabelYUp(61, -30, 1, 1, bt5_3);
        AC.jLabelYUp(1, -30, 1, 1, bt6_1);
        AC.jLabelYUp(31, -30, 1, 1, bt6_2);
        AC.jLabelYUp(61, -30, 1, 1, bt6_3);
        AC.jLabelYUp(91, -30, 1, 1, bt6_4);
    }//GEN-LAST:event_btn3MouseClicked

    private void btn3MousereClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn3MousereClicked
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelYUp(1, -30, 1, 1, bt2_1);
        AC.jLabelYUp(31, -30, 1, 1, bt2_2);
        AC.jLabelYUp(61, -30, 1, 1, bt2_3);
        AC.jLabelYUp(1, -30, 1, 1, bt3_1);
        AC.jLabelYUp(31, -30, 1, 1, bt3_2);
        AC.jLabelYUp(61, -30, 1, 1, bt3_3);
        AC.jLabelYUp(1, -30, 1, 1, bt4_1);
        AC.jLabelYUp(31, -30, 1, 1, bt4_2);
        AC.jLabelYUp(61, -30, 1, 1, bt4_3);
        AC.jLabelYUp(1, -30, 1, 1, bt5_1);
        AC.jLabelYUp(31, -30, 1, 1, bt5_2);
        AC.jLabelYUp(61, -30, 1, 1, bt5_3);
        AC.jLabelYUp(1, -30, 1, 1, bt6_1);
        AC.jLabelYUp(31, -30, 1, 1, bt6_2);
        AC.jLabelYUp(61, -30, 1, 1, bt6_3);
        AC.jLabelYUp(91, -30, 1, 1, bt6_4);
    }//GEN-LAST:event_btn3MousereClicked

    private void btn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MouseClicked

        AnimationClass AC = new AnimationClass();
        AC.jLabelYDown(-30, 1, 1, 1, bt2_1);
        AC.jLabelYDown(-30, 31, 1, 1, bt2_2);
        AC.jLabelYDown(-30, 61, 1, 1, bt2_3);

        AC.jLabelYUp(1, -30, 1, 1, bt3_1);
        AC.jLabelYUp(31, -30, 1, 1, bt3_2);
        AC.jLabelYUp(61, -30, 1, 1, bt3_3);
        AC.jLabelYUp(1, -30, 1, 1, bt4_1);
        AC.jLabelYUp(31, -30, 1, 1, bt4_2);
        AC.jLabelYUp(61, -30, 1, 1, bt4_3);
        AC.jLabelYUp(1, -30, 1, 1, bt5_1);
        AC.jLabelYUp(31, -30, 1, 1, bt5_2);
        AC.jLabelYUp(61, -30, 1, 1, bt5_3);
        AC.jLabelYUp(1, -30, 1, 1, bt6_1);
        AC.jLabelYUp(31, -30, 1, 1, bt6_2);
        AC.jLabelYUp(61, -30, 1, 1, bt6_3);
        AC.jLabelYUp(91, -30, 1, 1, bt6_4);
    }//GEN-LAST:event_btn2MouseClicked

    private void btn2MousereClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn2MousereClicked
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelYUp(1, -30, 1, 1, bt2_1);
        AC.jLabelYUp(31, -30, 1, 1, bt2_2);
        AC.jLabelYUp(61, -30, 1, 1, bt2_3);
        AC.jLabelYUp(1, -30, 1, 1, bt3_1);
        AC.jLabelYUp(31, -30, 1, 1, bt3_2);
        AC.jLabelYUp(61, -30, 1, 1, bt3_3);
        AC.jLabelYUp(1, -30, 1, 1, bt4_1);
        AC.jLabelYUp(31, -30, 1, 1, bt4_2);
        AC.jLabelYUp(61, -30, 1, 1, bt4_3);
        AC.jLabelYUp(1, -30, 1, 1, bt5_1);
        AC.jLabelYUp(31, -30, 1, 1, bt5_2);
        AC.jLabelYUp(61, -30, 1, 1, bt5_3);
        AC.jLabelYUp(1, -30, 1, 1, bt6_1);
        AC.jLabelYUp(31, -30, 1, 1, bt6_2);
        AC.jLabelYUp(61, -30, 1, 1, bt6_3);
        AC.jLabelYUp(91, -30, 1, 1, bt6_4);
    }//GEN-LAST:event_btn2MousereClicked

    private void btn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn1MouseClicked
        // TODO add your handling code here:
        AnimationClass AC = new AnimationClass();
        AC.jLabelYUp(1, -30, 1, 1, bt2_1);
        AC.jLabelYUp(31, -30, 1, 1, bt2_2);
        AC.jLabelYUp(61, -30, 1, 1, bt2_3);
        AC.jLabelYUp(1, -30, 1, 1, bt3_1);
        AC.jLabelYUp(31, -30, 1, 1, bt3_2);
        AC.jLabelYUp(61, -30, 1, 1, bt3_3);
        AC.jLabelYUp(1, -30, 1, 1, bt4_1);
        AC.jLabelYUp(31, -30, 1, 1, bt4_2);
        AC.jLabelYUp(61, -30, 1, 1, bt4_3);
        AC.jLabelYUp(1, -30, 1, 1, bt5_1);
        AC.jLabelYUp(31, -30, 1, 1, bt5_2);
        AC.jLabelYUp(61, -30, 1, 1, bt5_3);
        AC.jLabelYUp(1, -30, 1, 1, bt6_1);
        AC.jLabelYUp(31, -30, 1, 1, bt6_2);
        AC.jLabelYUp(61, -30, 1, 1, bt6_3);
        AC.jLabelYUp(91, -30, 1, 1, bt6_4);
    }//GEN-LAST:event_btn1MouseClicked

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

    private void bt2_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2_1MouseEntered
        setColor(btn2);
        setColor1(bt2_1);
        resetColor(new JLabel[]{btn1,btn3,btn4,btn5,btn6},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt3_3,bt4_1,bt4_2,bt4_3,bt5_1,bt5_2,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt2_1MouseEntered

    private void bt2_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2_2MouseEntered
        setColor(btn2);
        setColor1(bt2_2);
        resetColor(new JLabel[]{btn1,btn3,btn4,btn5,btn6},new JLabel[]{bt2_1,bt2_3,bt3_1,bt3_2,bt3_3,bt4_1,bt4_2,bt4_3,bt5_1,bt5_2,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt2_2MouseEntered

    private void bt2_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt2_3MouseEntered
        setColor(btn2);
        setColor1(bt2_3);
        resetColor(new JLabel[]{btn1,btn3,btn4,btn5,btn6},new JLabel[]{bt2_2,bt2_1,bt3_1,bt3_2,bt3_3,bt4_1,bt4_2,bt4_3,bt5_1,bt5_2,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt2_3MouseEntered

    private void bt3_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3_1MouseEntered
        setColor(btn3);
        setColor1(bt3_1);
        resetColor(new JLabel[]{btn1,btn2,btn4,btn5,btn6},new JLabel[]{bt2_2,bt2_3,bt2_1,bt3_2,bt3_3,bt4_1,bt4_2,bt4_3,bt5_1,bt5_2,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt3_1MouseEntered

    private void bt3_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3_2MouseEntered
        setColor(btn2);
        setColor1(bt3_2);
        resetColor(new JLabel[]{btn1,btn2,btn4,btn5,btn6},new JLabel[]{bt2_2,bt2_3,bt3_1,bt2_1,bt3_3,bt4_1,bt4_2,bt4_3,bt5_1,bt5_2,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt3_2MouseEntered

    private void bt3_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt3_3MouseEntered
        setColor(btn3);
        setColor1(bt3_3);
        resetColor(new JLabel[]{btn1,btn2,btn4,btn5,btn6},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt4_1,bt4_2,bt4_3,bt5_1,bt5_2,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt3_3MouseEntered

    private void bt4_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4_1MouseEntered
        setColor(btn4);
        setColor1(bt4_1);
        resetColor(new JLabel[]{btn1,btn2,btn3,btn5,btn6},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt3_3,bt4_2,bt4_3,bt5_1,bt5_2,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt4_1MouseEntered

    private void bt4_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4_2MouseEntered
        setColor(btn4);
        setColor1(bt4_2);
        resetColor(new JLabel[]{btn1,btn2,btn3,btn5,btn6},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt3_3,bt4_1,bt4_3,bt5_1,bt5_2,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt4_2MouseEntered

    private void bt4_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt4_3MouseEntered
        setColor(btn4);
        setColor1(bt4_3);
        resetColor(new JLabel[]{btn1,btn2,btn3,btn5,btn6},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt3_3,bt4_2,bt4_1,bt5_1,bt5_2,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt4_3MouseEntered

    private void bt5_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5_1MouseEntered
        setColor(btn5);
        setColor1(bt5_1);
        resetColor(new JLabel[]{btn1,btn2,btn3,btn4,btn6},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt3_3,bt4_2,bt4_3,bt4_1,bt5_2,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt5_1MouseEntered

    private void bt5_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5_2MouseEntered
        setColor(btn5);
        setColor1(bt5_2);
        resetColor(new JLabel[]{btn1,btn2,btn3,btn4,btn6},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt3_3,bt4_2,bt4_3,bt4_1,bt5_1,bt5_3,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt5_2MouseEntered

    private void bt5_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt5_3MouseEntered
        setColor(btn5);
        setColor1(bt5_3);
        resetColor(new JLabel[]{btn1,btn2,btn3,btn4,btn6},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt3_3,bt4_2,bt4_3,bt4_1,bt5_2,bt5_1,bt6_1,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt5_3MouseEntered

    private void bt6_1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt6_1MouseEntered
        setColor(btn6);
        setColor1(bt6_1);
        resetColor(new JLabel[]{btn1,btn2,btn3,btn4,btn5},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt3_3,bt4_2,bt4_3,bt4_1,bt5_2,bt5_1,bt5_3,bt6_2,bt6_3,bt6_4});
    }//GEN-LAST:event_bt6_1MouseEntered

    private void bt6_2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt6_2MouseEntered
        setColor(btn6);
        setColor1(bt6_2);
        resetColor(new JLabel[]{btn1,btn2,btn3,btn4,btn5},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt3_3,bt4_2,bt4_3,bt4_1,bt5_2,bt5_1,bt5_3,bt6_1,bt6_3,bt6_4});
    }//GEN-LAST:event_bt6_2MouseEntered

    private void bt6_3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt6_3MouseEntered
        setColor(btn6);
        setColor1(bt6_3);
        resetColor(new JLabel[]{btn1,btn2,btn3,btn4,btn5},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt3_3,bt4_2,bt4_3,bt4_1,bt5_2,bt5_1,bt5_3,bt6_2,bt6_1,bt6_4});
    }//GEN-LAST:event_bt6_3MouseEntered

    private void bt6_4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bt6_4MouseEntered
        setColor(btn6);
        setColor1(bt6_4);
        resetColor(new JLabel[]{btn1,btn2,btn3,btn4,btn5},new JLabel[]{bt2_2,bt2_3,bt3_1,bt3_2,bt2_1,bt3_3,bt4_2,bt4_3,bt4_1,bt5_2,bt5_1,bt5_3,bt6_2,bt6_3,bt6_1});
    }//GEN-LAST:event_bt6_4MouseEntered
 private void setColor(JLabel btn){
        btn.setBackground(new Color(255,102,0));
        btn.setForeground(new Color(255,255,255));
    }
     private void setColor1(JLabel bt){
        bt.setBackground(new Color(255,102,0));
        bt.setForeground(new Color(255,255,255));
    }
    private void resetColor(JLabel []btn,JLabel [] bt){
        for(int i=0;i<btn.length;i++){
            btn[i].setBackground(new Color(255,255,255));
            bt[i].setForeground(new Color(102,102,102));
        }
        for(int i=0;i<bt.length;i++){
          bt[i].setBackground(new Color(255,255,255));
          bt[i].setForeground(new Color(102,102,102));
        }
        
    }
    private void setColor2(JLabel btn){
        btn.setBackground(new Color(255,102,0));
        btn.setForeground(new Color(255,255,255));
    }
     
    private void resetColor2(JLabel []btn){
        for(int i=0;i<btn.length;i++){
            btn[i].setBackground(new Color(255,255,255));
            btn[i].setForeground(new Color(102,102,102));
        } 
    }
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
            java.util.logging.Logger.getLogger(new_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_order().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private datechooser.beans.DateChooserCombo Dorderday;
    private datechooser.beans.DateChooserCombo Dreturndate;
    private javax.swing.JPanel Traveller;
    private javax.swing.JLabel bt2_1;
    private javax.swing.JLabel bt2_2;
    private javax.swing.JLabel bt2_3;
    private javax.swing.JLabel bt3_1;
    private javax.swing.JLabel bt3_2;
    private javax.swing.JLabel bt3_3;
    private javax.swing.JLabel bt4_1;
    private javax.swing.JLabel bt4_2;
    private javax.swing.JLabel bt4_3;
    private javax.swing.JLabel bt5_1;
    private javax.swing.JLabel bt5_2;
    private javax.swing.JLabel bt5_3;
    private javax.swing.JLabel bt6_1;
    private javax.swing.JLabel bt6_2;
    private javax.swing.JLabel bt6_3;
    private javax.swing.JLabel bt6_4;
    private javax.swing.JLabel btn1;
    private javax.swing.JLabel btn2;
    private javax.swing.JLabel btn3;
    private javax.swing.JLabel btn4;
    private javax.swing.JLabel btn5;
    private javax.swing.JLabel btn6;
    private javax.swing.JLabel bttonclear;
    private javax.swing.JLabel bttonsave;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JTextField txtItems;
    private javax.swing.JTextField txtOrderNum;
    private javax.swing.JTextField txtQuantity;
    // End of variables declaration//GEN-END:variables
}
