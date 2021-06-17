
package App;

import AppPackage.AnimationClass;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class admin_home extends javax.swing.JFrame {

   
    public admin_home() {
        super("Admin Home");
        initComponents();
        setLocationRelativeTo(null);
        //overpnl.setBackground(new Color(0,0,0,150));
    }

  
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
        img2 = new javax.swing.JLabel();
        price2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        img3 = new javax.swing.JLabel();
        price3 = new javax.swing.JLabel();
        name3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        price1 = new javax.swing.JLabel();
        img1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1060, 670));
        setMinimumSize(new java.awt.Dimension(1060, 670));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1060, 670));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1061, 750));
        jPanel1.setMinimumSize(new java.awt.Dimension(1061, 750));
        jPanel1.setPreferredSize(new java.awt.Dimension(1061, 750));
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
        Traveller.add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 0, 62, 30));

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

        jPanel1.add(Traveller, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1060, -1));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
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

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1060, 220));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));

        img2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/image03.png"))); // NOI18N

        price2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        price2.setForeground(new java.awt.Color(102, 102, 102));
        price2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price2.setText("Rs : 80/-");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 102, 102));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("aaaaaaaaaaa");

        name2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name2.setText("Donut");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(name2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img2)
                .addGap(20, 20, 20)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(price2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 270, -1, 350));

        jPanel4.setBackground(new java.awt.Color(250, 250, 250));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(102, 102, 102));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("aaaaaaa");

        img3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/image01.png"))); // NOI18N

        price3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        price3.setForeground(new java.awt.Color(102, 102, 102));
        price3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price3.setText("Rs : 50/-");

        name3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name3.setText("Cookie");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(price3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(name3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(name3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img3)
                .addGap(20, 20, 20)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(price3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(719, 272, -1, 350));

        jPanel5.setBackground(new java.awt.Color(250, 250, 250));

        price1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        price1.setForeground(new java.awt.Color(102, 102, 102));
        price1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        price1.setText("Rs : 250/-");

        img1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/App/images/image02.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("aaaaaaa");

        name1.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        name1.setText("Burger");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(price1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(name1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(name1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(img1)
                .addGap(20, 20, 20)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(price1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 272, -1, 350));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
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
/*private void onHover(JLabel label) {
    label.setBackground(new Color(255,102,0,50));
}
private void onLeaveHover(JPanel panel) {
    panel.setBackground(new Color(0,0,0));
}*/

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
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JLabel close;
    private javax.swing.JLabel img1;
    private javax.swing.JLabel img2;
    private javax.swing.JLabel img3;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lbl_back;
    private javax.swing.JLabel name1;
    private javax.swing.JLabel name2;
    private javax.swing.JLabel name3;
    private javax.swing.JLabel price1;
    private javax.swing.JLabel price2;
    private javax.swing.JLabel price3;
    // End of variables declaration//GEN-END:variables
}
