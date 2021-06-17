
package App;
import java.awt.geom.RoundRectangle2D;
import java.sql.Connection;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class welcome extends javax.swing.JFrame implements Runnable {
Connection conn;
int s=0;
Thread th;
    
    public welcome() {
        initComponents();
        setLocationRelativeTo(null);
        th= new Thread((Runnable)this);
        setUpLoading();  
        
    }
    public void setUpLoading(){
    setVisible(false);
    th.start();
    }
    public void run(){
    try{
        for(int i=1;i<=200;i++){
            s=s+1;
            int m= hidden_progress_bar.getMaximum();
            int v= hidden_progress_bar.getValue();
            if(v<m){
                hidden_progress_bar.setValue(hidden_progress_bar.getValue()+1);
            }else{
                i=201;
                setVisible(false);
                ask_login H = new ask_login();
                H.setVisible(true);
            }Thread.sleep(35);
                    
        }
        
    }catch(Exception ex){
        JOptionPane.showMessageDialog(null,ex);
    }
}

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        welcome_topic = new javax.swing.JLabel();
        loading_spinner = new javax.swing.JLabel();
        version_no = new javax.swing.JLabel();
        background_img = new javax.swing.JLabel();
        hidden_progress_bar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(600, 400));
        setMinimumSize(new java.awt.Dimension(600, 400));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        welcome_topic.setFont(new java.awt.Font("Segoe UI", 0, 34)); // NOI18N
        welcome_topic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        welcome_topic.setText("Welcome to LMS");
        getContentPane().add(welcome_topic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 280, 50));

        loading_spinner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/126 (2).gif"))); // NOI18N
        getContentPane().add(loading_spinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        version_no.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        version_no.setForeground(new java.awt.Color(102, 102, 102));
        version_no.setText("Version 1.0");
        getContentPane().add(version_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        background_img.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imgs/Forest-Background.jpg"))); // NOI18N
        background_img.setPreferredSize(new java.awt.Dimension(600, 400));
        getContentPane().add(background_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 400));
        getContentPane().add(hidden_progress_bar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 260, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background_img;
    private javax.swing.JProgressBar hidden_progress_bar;
    private javax.swing.JLabel loading_spinner;
    private javax.swing.JLabel version_no;
    private javax.swing.JLabel welcome_topic;
    // End of variables declaration//GEN-END:variables
}
