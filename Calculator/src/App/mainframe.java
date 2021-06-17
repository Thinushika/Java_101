
package App;

import java.awt.Color;
import java.util.Stack;
import javax.swing.JOptionPane;


public class mainframe extends javax.swing.JFrame {

    private double TEMP;
    private double SolveTEMP;
    Boolean addbool = false;
    Boolean subbool = false;
    Boolean divbool = false;
    Boolean mulbool = false;
    Boolean pointbool = false;
    
    String display = "";
    
    public mainframe() {
        super("Calculator");
        initComponents();
        setLocationRelativeTo(null);
        
       
    }
int xy,xx;
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpnl = new javax.swing.JPanel();
        Traveller = new javax.swing.JPanel();
        btn_close = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        display_txt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_back = new javax.swing.JLabel();
        btn_C = new javax.swing.JLabel();
        btn_sroot = new javax.swing.JLabel();
        btn_pm = new javax.swing.JLabel();
        btn_seven = new javax.swing.JLabel();
        btn_eight = new javax.swing.JLabel();
        btn_nine = new javax.swing.JLabel();
        btn_div = new javax.swing.JLabel();
        btn_four = new javax.swing.JLabel();
        btn_five = new javax.swing.JLabel();
        btn_six = new javax.swing.JLabel();
        btn_mul = new javax.swing.JLabel();
        btn_one = new javax.swing.JLabel();
        btn_two = new javax.swing.JLabel();
        btn_three = new javax.swing.JLabel();
        btn_add = new javax.swing.JLabel();
        btn_point = new javax.swing.JLabel();
        btn_zero = new javax.swing.JLabel();
        btn_sub = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btn_BLeft = new javax.swing.JLabel();
        btn_BRight = new javax.swing.JLabel();
        btn_result = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainpnl.setBackground(new java.awt.Color(0, 0, 0));
        mainpnl.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Traveller.setBackground(new java.awt.Color(0, 0, 0));
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

        btn_close.setBackground(new java.awt.Color(0, 0, 0));
        btn_close.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_close.setForeground(new java.awt.Color(255, 255, 255));
        btn_close.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_close.setText("X");
        btn_close.setOpaque(true);
        btn_close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_closeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_closeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_closeMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Calculator_25px.png"))); // NOI18N
        jLabel1.setText("Calculator");

        javax.swing.GroupLayout TravellerLayout = new javax.swing.GroupLayout(Traveller);
        Traveller.setLayout(TravellerLayout);
        TravellerLayout.setHorizontalGroup(
            TravellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TravellerLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                .addComponent(btn_close, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TravellerLayout.setVerticalGroup(
            TravellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_close, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(TravellerLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainpnl.add(Traveller, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 380, -1));

        display_txt.setEditable(false);
        display_txt.setBackground(new java.awt.Color(255, 255, 255));
        display_txt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        display_txt.setForeground(new java.awt.Color(102, 102, 102));
        display_txt.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        display_txt.setBorder(null);
        display_txt.setMargin(new java.awt.Insets(2, 2, 2, 10));
        mainpnl.add(display_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 380, 90));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_back.setBackground(new java.awt.Color(30, 30, 30));
        btn_back.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_back.setForeground(new java.awt.Color(255, 255, 255));
        btn_back.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Clear_Symbol_25px_1.png"))); // NOI18N
        btn_back.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_back.setOpaque(true);
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_backMouseClicked(evt);
            }
        });
        jPanel2.add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 95, 70));

        btn_C.setBackground(new java.awt.Color(30, 30, 30));
        btn_C.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_C.setForeground(new java.awt.Color(255, 255, 255));
        btn_C.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_C.setText("C");
        btn_C.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_C.setOpaque(true);
        btn_C.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_CMouseClicked(evt);
            }
        });
        jPanel2.add(btn_C, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 0, 95, 70));

        btn_sroot.setBackground(new java.awt.Color(30, 30, 30));
        btn_sroot.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_sroot.setForeground(new java.awt.Color(255, 255, 255));
        btn_sroot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_sroot.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/icons8_Square_Root_25px.png"))); // NOI18N
        btn_sroot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_sroot.setOpaque(true);
        btn_sroot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_srootMouseClicked(evt);
            }
        });
        jPanel2.add(btn_sroot, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, 95, 70));

        btn_pm.setBackground(new java.awt.Color(30, 30, 30));
        btn_pm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_pm.setForeground(new java.awt.Color(255, 255, 255));
        btn_pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_pm.setText("+/-");
        btn_pm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_pm.setOpaque(true);
        btn_pm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pmMouseClicked(evt);
            }
        });
        jPanel2.add(btn_pm, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 0, 95, 70));

        btn_seven.setBackground(new java.awt.Color(51, 51, 51));
        btn_seven.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_seven.setForeground(new java.awt.Color(255, 255, 255));
        btn_seven.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_seven.setText("7");
        btn_seven.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_seven.setOpaque(true);
        btn_seven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sevenMouseClicked(evt);
            }
        });
        jPanel2.add(btn_seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 95, 70));

        btn_eight.setBackground(new java.awt.Color(51, 51, 51));
        btn_eight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_eight.setForeground(new java.awt.Color(255, 255, 255));
        btn_eight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_eight.setText("8");
        btn_eight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_eight.setOpaque(true);
        btn_eight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_eightMouseClicked(evt);
            }
        });
        jPanel2.add(btn_eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 70, 95, 70));

        btn_nine.setBackground(new java.awt.Color(51, 51, 51));
        btn_nine.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_nine.setForeground(new java.awt.Color(255, 255, 255));
        btn_nine.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_nine.setText("9");
        btn_nine.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_nine.setOpaque(true);
        btn_nine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_nineMouseClicked(evt);
            }
        });
        jPanel2.add(btn_nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 95, 70));

        btn_div.setBackground(new java.awt.Color(30, 30, 30));
        btn_div.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_div.setForeground(new java.awt.Color(255, 255, 255));
        btn_div.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_div.setText("/");
        btn_div.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_div.setOpaque(true);
        btn_div.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_divMouseClicked(evt);
            }
        });
        jPanel2.add(btn_div, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 70, 95, 70));

        btn_four.setBackground(new java.awt.Color(51, 51, 51));
        btn_four.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_four.setForeground(new java.awt.Color(255, 255, 255));
        btn_four.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_four.setText("4");
        btn_four.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_four.setOpaque(true);
        btn_four.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fourMouseClicked(evt);
            }
        });
        jPanel2.add(btn_four, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 95, 70));

        btn_five.setBackground(new java.awt.Color(51, 51, 51));
        btn_five.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_five.setForeground(new java.awt.Color(255, 255, 255));
        btn_five.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_five.setText("5");
        btn_five.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_five.setOpaque(true);
        btn_five.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_fiveMouseClicked(evt);
            }
        });
        jPanel2.add(btn_five, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 140, 95, 70));

        btn_six.setBackground(new java.awt.Color(51, 51, 51));
        btn_six.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_six.setForeground(new java.awt.Color(255, 255, 255));
        btn_six.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_six.setText("6");
        btn_six.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_six.setOpaque(true);
        btn_six.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_sixMouseClicked(evt);
            }
        });
        jPanel2.add(btn_six, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 95, 70));

        btn_mul.setBackground(new java.awt.Color(30, 30, 30));
        btn_mul.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_mul.setForeground(new java.awt.Color(255, 255, 255));
        btn_mul.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_mul.setText("*");
        btn_mul.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_mul.setOpaque(true);
        btn_mul.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_mulMouseClicked(evt);
            }
        });
        jPanel2.add(btn_mul, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 140, 95, 70));

        btn_one.setBackground(new java.awt.Color(51, 51, 51));
        btn_one.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_one.setForeground(new java.awt.Color(255, 255, 255));
        btn_one.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_one.setText("1");
        btn_one.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_one.setOpaque(true);
        btn_one.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_oneMouseClicked(evt);
            }
        });
        jPanel2.add(btn_one, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 95, 70));

        btn_two.setBackground(new java.awt.Color(51, 51, 51));
        btn_two.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_two.setForeground(new java.awt.Color(255, 255, 255));
        btn_two.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_two.setText("2");
        btn_two.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_two.setOpaque(true);
        btn_two.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_twoMouseClicked(evt);
            }
        });
        jPanel2.add(btn_two, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 210, 95, 70));

        btn_three.setBackground(new java.awt.Color(51, 51, 51));
        btn_three.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_three.setForeground(new java.awt.Color(255, 255, 255));
        btn_three.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_three.setText("3");
        btn_three.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_three.setOpaque(true);
        btn_three.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_threeMouseClicked(evt);
            }
        });
        jPanel2.add(btn_three, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 95, 70));

        btn_add.setBackground(new java.awt.Color(10, 10, 10));
        btn_add.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_add.setText("+");
        btn_add.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_add.setOpaque(true);
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });
        jPanel2.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 280, 95, 70));

        btn_point.setBackground(new java.awt.Color(51, 51, 51));
        btn_point.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_point.setForeground(new java.awt.Color(255, 255, 255));
        btn_point.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_point.setText(".");
        btn_point.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_point.setOpaque(true);
        btn_point.setPreferredSize(new java.awt.Dimension(12, 27));
        btn_point.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_pointMouseClicked(evt);
            }
        });
        jPanel2.add(btn_point, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 95, 70));

        btn_zero.setBackground(new java.awt.Color(51, 51, 51));
        btn_zero.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_zero.setForeground(new java.awt.Color(255, 255, 255));
        btn_zero.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_zero.setText("0");
        btn_zero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_zero.setOpaque(true);
        btn_zero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_zeroMouseClicked(evt);
            }
        });
        jPanel2.add(btn_zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(95, 280, 190, 70));

        btn_sub.setBackground(new java.awt.Color(30, 30, 30));
        btn_sub.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_sub.setForeground(new java.awt.Color(255, 255, 255));
        btn_sub.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_sub.setText("-");
        btn_sub.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_sub.setOpaque(true);
        btn_sub.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_subMouseClicked(evt);
            }
        });
        jPanel2.add(btn_sub, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 210, 95, 70));

        mainpnl.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 380, 350));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setLayout(new java.awt.GridLayout(1, 2));

        btn_BLeft.setBackground(new java.awt.Color(51, 51, 51));
        btn_BLeft.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_BLeft.setForeground(new java.awt.Color(255, 255, 255));
        btn_BLeft.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_BLeft.setText("(");
        btn_BLeft.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_BLeft.setOpaque(true);
        btn_BLeft.setPreferredSize(new java.awt.Dimension(12, 27));
        btn_BLeft.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BLeftMouseClicked(evt);
            }
        });
        jPanel3.add(btn_BLeft);

        btn_BRight.setBackground(new java.awt.Color(51, 51, 51));
        btn_BRight.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_BRight.setForeground(new java.awt.Color(255, 255, 255));
        btn_BRight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_BRight.setText(")");
        btn_BRight.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_BRight.setOpaque(true);
        btn_BRight.setPreferredSize(new java.awt.Dimension(12, 27));
        btn_BRight.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_BRightMouseClicked(evt);
            }
        });
        jPanel3.add(btn_BRight);

        btn_result.setBackground(new java.awt.Color(102, 0, 0));
        btn_result.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_result.setForeground(new java.awt.Color(255, 255, 255));
        btn_result.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_result.setText("=");
        btn_result.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btn_result.setOpaque(true);
        btn_result.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_resultMouseClicked(evt);
            }
        });
        jPanel3.add(btn_result);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainpnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TravellerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMousePressed
        setOpacity((float) 0.8);
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_TravellerMousePressed

    private void TravellerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_TravellerMouseDragged

    private void TravellerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMouseReleased
        setOpacity((float)1.0);
    }//GEN-LAST:event_TravellerMouseReleased

    private void btn_closeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btn_closeMouseClicked

    private void btn_closeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseEntered
        btn_close.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_btn_closeMouseEntered

    private void btn_closeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_closeMouseExited
        btn_close.setBackground(new Color(0,0,0));
    }//GEN-LAST:event_btn_closeMouseExited

    private void btn_CMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_CMouseClicked
        display_txt.setText("");
        
    }//GEN-LAST:event_btn_CMouseClicked

    private void btn_backMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseClicked
        String digitValueStr = display_txt.getText();
        String newValue = "";
        newValue = digitValueStr.replaceFirst(".$", "");
        if (!newValue.isEmpty()){
            display_txt.setText(newValue);
            SolveTEMP = Double.parseDouble(newValue);
        }else{
            display_txt.setText("");
            SolveTEMP = 0;
            JOptionPane.showMessageDialog(this, "No value return to remove");
            pointbool = false;
        }
    }//GEN-LAST:event_btn_backMouseClicked

    private void btn_oneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_oneMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'1');
    }//GEN-LAST:event_btn_oneMouseClicked

    private void btn_twoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_twoMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'2');
    }//GEN-LAST:event_btn_twoMouseClicked

    private void btn_threeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_threeMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'3');
    }//GEN-LAST:event_btn_threeMouseClicked

    private void btn_fourMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fourMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'4');
    }//GEN-LAST:event_btn_fourMouseClicked

    private void btn_fiveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_fiveMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'5');
    }//GEN-LAST:event_btn_fiveMouseClicked

    private void btn_sixMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sixMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'6');
    }//GEN-LAST:event_btn_sixMouseClicked

    private void btn_sevenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_sevenMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'7');
    }//GEN-LAST:event_btn_sevenMouseClicked

    private void btn_eightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_eightMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'8');
    }//GEN-LAST:event_btn_eightMouseClicked

    private void btn_nineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_nineMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'9');
    }//GEN-LAST:event_btn_nineMouseClicked

    private void btn_zeroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_zeroMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'0');
    }//GEN-LAST:event_btn_zeroMouseClicked

    private void btn_pointMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pointMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'.');
    }//GEN-LAST:event_btn_pointMouseClicked

    private void btn_divMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_divMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'/');
    }//GEN-LAST:event_btn_divMouseClicked

    private void btn_mulMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_mulMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'*');
    }//GEN-LAST:event_btn_mulMouseClicked

    private void btn_subMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_subMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'-');
    }//GEN-LAST:event_btn_subMouseClicked

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+'+');
    }//GEN-LAST:event_btn_addMouseClicked

    private void btn_resultMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_resultMouseClicked
       
        Cal C = new Cal();
        C.preToPost(display);
    }//GEN-LAST:event_btn_resultMouseClicked

    private void btn_srootMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_srootMouseClicked
        double ops = Double.parseDouble(String.valueOf(display_txt.getText()));
        ops = Math.sqrt(ops);
        display_txt.setText(String.valueOf(ops));
    }//GEN-LAST:event_btn_srootMouseClicked

    private void btn_pmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_pmMouseClicked
        double ops = Double.parseDouble(String.valueOf(display_txt.getText()));
        ops = ops*(-1);
        display_txt.setText(String.valueOf(ops));
    }//GEN-LAST:event_btn_pmMouseClicked

    private void btn_BLeftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BLeftMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+"(");
    }//GEN-LAST:event_btn_BLeftMouseClicked

    private void btn_BRightMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_BRightMouseClicked
        display = display_txt.getText();
        display_txt.setText(display+")");
    }//GEN-LAST:event_btn_BRightMouseClicked
   
    
    class Cal{
        public boolean isOperator(char x){
            switch(x){
                case '/':
                case '*':
                case '+':
                case '-':
            }
            return false;
            
        }
        public String preToPost(String pre_exp){
            Stack<String> s = new Stack<String>();
            pre_exp = display_txt.getText();
            
            int length = pre_exp.length();
            
            for (int i = length - 1; i>=0; i--){
                if(isOperator(pre_exp.charAt(i))){
                    String op1 = s.peek(); s.pop();
                    String op2 = s.peek(); s.pop();
                    
                    String temp = op1 + op2 + pre_exp.charAt(i);
                    
                    s.push(temp);
                }
                else{
                    s.push(pre_exp.charAt(i)+"");
                }
            }
            return s.peek();
            
        }
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
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Traveller;
    private javax.swing.JLabel btn_BLeft;
    private javax.swing.JLabel btn_BRight;
    private javax.swing.JLabel btn_C;
    private javax.swing.JLabel btn_add;
    private javax.swing.JLabel btn_back;
    private javax.swing.JLabel btn_close;
    private javax.swing.JLabel btn_div;
    private javax.swing.JLabel btn_eight;
    private javax.swing.JLabel btn_five;
    private javax.swing.JLabel btn_four;
    private javax.swing.JLabel btn_mul;
    private javax.swing.JLabel btn_nine;
    private javax.swing.JLabel btn_one;
    private javax.swing.JLabel btn_pm;
    private javax.swing.JLabel btn_point;
    private javax.swing.JLabel btn_result;
    private javax.swing.JLabel btn_seven;
    private javax.swing.JLabel btn_six;
    private javax.swing.JLabel btn_sroot;
    private javax.swing.JLabel btn_sub;
    private javax.swing.JLabel btn_three;
    private javax.swing.JLabel btn_two;
    private javax.swing.JLabel btn_zero;
    private javax.swing.JTextField display_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel mainpnl;
    // End of variables declaration//GEN-END:variables

   
}
