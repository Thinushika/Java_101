package app;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mainUI extends javax.swing.JFrame {

    
    public mainUI() {
        initComponents();
        setLocationRelativeTo(null);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg_pnl = new javax.swing.JPanel();
        Traveller = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        DName_lbl = new javax.swing.JLabel();
        TSpace_lbl = new javax.swing.JLabel();
        FSpace_lbl = new javax.swing.JLabel();
        Tspace_txt = new javax.swing.JTextField();
        Fspace_txt = new javax.swing.JTextField();
        SelectD = new javax.swing.JComboBox<>();
        Btn_create = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(500, 350));
        setMinimumSize(new java.awt.Dimension(500, 350));
        setUndecorated(true);

        bg_pnl.setBackground(new java.awt.Color(255, 255, 255));

        Traveller.setBackground(new java.awt.Color(250, 250, 250));
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dummy File Creater");

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
            .addGroup(TravellerLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        TravellerLayout.setVerticalGroup(
            TravellerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
        );

        DName_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DName_lbl.setForeground(new java.awt.Color(51, 51, 51));
        DName_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        DName_lbl.setText("Drive Name : ");

        TSpace_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TSpace_lbl.setForeground(new java.awt.Color(51, 51, 51));
        TSpace_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        TSpace_lbl.setText("Total Space : ");

        FSpace_lbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FSpace_lbl.setForeground(new java.awt.Color(51, 51, 51));
        FSpace_lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        FSpace_lbl.setText("Free Space : ");

        Tspace_txt.setBackground(new java.awt.Color(250, 250, 250));
        Tspace_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Tspace_txt.setForeground(new java.awt.Color(102, 102, 102));
        Tspace_txt.setBorder(null);

        Fspace_txt.setBackground(new java.awt.Color(250, 250, 250));
        Fspace_txt.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Fspace_txt.setForeground(new java.awt.Color(102, 102, 102));
        Fspace_txt.setBorder(null);

        SelectD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "C:", "D:", "E:", "F:", "G:" }));
        SelectD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectDActionPerformed(evt);
            }
        });

        Btn_create.setBackground(new java.awt.Color(51, 51, 51));
        Btn_create.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Btn_create.setForeground(new java.awt.Color(204, 204, 204));
        Btn_create.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Btn_create.setText("Create ");
        Btn_create.setOpaque(true);
        Btn_create.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Btn_createMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout bg_pnlLayout = new javax.swing.GroupLayout(bg_pnl);
        bg_pnl.setLayout(bg_pnlLayout);
        bg_pnlLayout.setHorizontalGroup(
            bg_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Traveller, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bg_pnlLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(bg_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bg_pnlLayout.createSequentialGroup()
                        .addComponent(FSpace_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(bg_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_create, javax.swing.GroupLayout.DEFAULT_SIZE, 211, Short.MAX_VALUE)
                            .addComponent(Fspace_txt)))
                    .addGroup(bg_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(bg_pnlLayout.createSequentialGroup()
                            .addComponent(TSpace_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(Tspace_txt))
                        .addGroup(bg_pnlLayout.createSequentialGroup()
                            .addComponent(DName_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(SelectD, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        bg_pnlLayout.setVerticalGroup(
            bg_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bg_pnlLayout.createSequentialGroup()
                .addComponent(Traveller, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(bg_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DName_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectD, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bg_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TSpace_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tspace_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bg_pnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FSpace_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Fspace_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(Btn_create, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(132, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_pnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private String location = "C:";
    private boolean execute = true;

    private void TravellerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMouseDragged
      
    }//GEN-LAST:event_TravellerMouseDragged

    private void TravellerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMousePressed
       
    }//GEN-LAST:event_TravellerMousePressed

    private void TravellerMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TravellerMouseReleased

    }//GEN-LAST:event_TravellerMouseReleased

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

    private void Btn_createMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Btn_createMouseClicked
        int i=0;
        while(true){
            DummyFile(this.location,"dummy "+i);
            i++;
        }
    }//GEN-LAST:event_Btn_createMouseClicked

    private void SelectDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectDActionPerformed
        this.location = SelectD.getSelectedItem().toString();
        
        File file = new File(SelectD.getSelectedItem().toString());
        
        //display total space
    	double totalSpace = file.getTotalSpace()/ (1024.0 * 1024 * 1024);
        BigDecimal bd = new BigDecimal(totalSpace).setScale(2, RoundingMode.HALF_UP);//to round the result
        Double total = bd.doubleValue();
        String totalAsString = Double.toString(total);//convert double to string
        Tspace_txt.setText(totalAsString+" GB");
       
        //display free space
        double freeSpace = file.getFreeSpace() / (1024.0 * 1024 * 1024);
        BigDecimal fs = new BigDecimal(freeSpace).setScale(2, RoundingMode.HALF_UP);
        Double free = fs.doubleValue();
        String freeAsString = Double.toString(free);//convert double to string
        Fspace_txt.setText(freeAsString+" GB");
    }//GEN-LAST:event_SelectDActionPerformed
    
    private void DummyFile(String location,String fileName){
        
      String FixfileName = location+"\\"+fileName;
               try{             
                        RandomAccessFile stream = new RandomAccessFile(FixfileName, "rw");
                        stream.setLength(1024*1024*10);     // set file size is 1kB
                        FileChannel channel = stream.getChannel();
                        String value = "Writting dummy...";
                        byte[] strBytes = value.getBytes();
                        ByteBuffer buffer = ByteBuffer.allocate(strBytes.length);
                        buffer.put(strBytes);
                        buffer.flip();
                        channel.write(buffer);
                        stream.close();
                        channel.close();
               
                }catch(Exception ex){}
    
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
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Btn_create;
    private javax.swing.JLabel DName_lbl;
    private javax.swing.JLabel FSpace_lbl;
    private javax.swing.JTextField Fspace_txt;
    private javax.swing.JComboBox<String> SelectD;
    private javax.swing.JLabel TSpace_lbl;
    private javax.swing.JPanel Traveller;
    private javax.swing.JTextField Tspace_txt;
    private javax.swing.JPanel bg_pnl;
    private javax.swing.JLabel close;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
