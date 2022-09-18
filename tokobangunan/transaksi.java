/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobangunan;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import static tokobangunan.barang.lbl_status;
//import static tokobangunan.dashboard.btn_laporan;
import static tokobangunan.dashboard.lbl_username;

/**
 *
 * @author Aryaaazr_
 */
public class transaksi extends javax.swing.JFrame {

    /**
     * Creates new form transaksi
     */
    public transaksi() {
        initComponents();
        setIcon();
        tanggal();
        jam();
        userSeasion();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        photo_profile = new javax.swing.JLabel();
        lbl_menu = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JButton();
        btn_master = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        btn_pengaturan = new javax.swing.JButton();
        lbl_tanggal = new javax.swing.JLabel();
        lbl_jam = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_pembelian = new javax.swing.JButton();
        thumbnails_barangkeluar = new javax.swing.JLabel();
        grid_barangmasuk = new javax.swing.JLabel();
        btn_penjualan = new javax.swing.JButton();
        grid_barangkeluar = new javax.swing.JLabel();
        btn_riwayat = new javax.swing.JButton();
        thumbnails_stockbarang = new javax.swing.JLabel();
        grid_stockbarang2 = new javax.swing.JLabel();
        thumbnails_pembelian = new javax.swing.JLabel();
        btn_laporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management Building");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photo_profile.setBackground(new java.awt.Color(255, 255, 255));
        photo_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account (2).png"))); // NOI18N
        photo_profile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(photo_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lbl_status.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_status.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 60, 20));

        lbl_menu.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbl_menu.setForeground(new java.awt.Color(255, 255, 255));
        lbl_menu.setText("Menu");
        getContentPane().add(lbl_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 20));

        btn_dashboard.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_dashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home (1)_1.png"))); // NOI18N
        btn_dashboard.setText("Dashboard");
        btn_dashboard.setBorderPainted(false);
        btn_dashboard.setContentAreaFilled(false);
        btn_dashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });
        getContentPane().add(btn_dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, -1, -1));

        btn_master.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_master.setForeground(new java.awt.Color(255, 255, 255));
        btn_master.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/monitor-removebg-preview (1).png"))); // NOI18N
        btn_master.setText("Master");
        btn_master.setBorderPainted(false);
        btn_master.setContentAreaFilled(false);
        btn_master.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_master.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_masterActionPerformed(evt);
            }
        });
        getContentPane().add(btn_master, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, -1, -1));

        btn_transaksi.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_transaksi.setForeground(new java.awt.Color(255, 255, 255));
        btn_transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/purse-removebg-preview (1).png"))); // NOI18N
        btn_transaksi.setText("Transaksi");
        btn_transaksi.setBorderPainted(false);
        btn_transaksi.setContentAreaFilled(false);
        btn_transaksi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_transaksiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_transaksi, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        btn_pengaturan.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_pengaturan.setForeground(new java.awt.Color(255, 255, 255));
        btn_pengaturan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/setting__1_-removebg-preview (1).png"))); // NOI18N
        btn_pengaturan.setText("Pengaturan");
        btn_pengaturan.setBorderPainted(false);
        btn_pengaturan.setContentAreaFilled(false);
        btn_pengaturan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pengaturan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pengaturanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pengaturan, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, -1));

        lbl_tanggal.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbl_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 150, 20));

        lbl_jam.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbl_jam.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 80, 20));

        btn_logout.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/sign-out-option__1_-removebg-preview (1).png"))); // NOI18N
        btn_logout.setText("Logout");
        btn_logout.setBorderPainted(false);
        btn_logout.setContentAreaFilled(false);
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        getContentPane().add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 130, 40));

        btn_pembelian.setBackground(new java.awt.Color(196, 196, 196));
        btn_pembelian.setText("Pembelian");
        btn_pembelian.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_pembelian.setBorderPainted(false);
        btn_pembelian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pembelian.setFocusPainted(false);
        btn_pembelian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pembelianActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 110, 30));

        thumbnails_barangkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/acquisition (1).png"))); // NOI18N
        getContentPane().add(thumbnails_barangkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, 90));

        grid_barangmasuk.setBackground(new java.awt.Color(196, 196, 196));
        grid_barangmasuk.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        grid_barangmasuk.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(grid_barangmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 130, 100));

        btn_penjualan.setBackground(new java.awt.Color(196, 196, 196));
        btn_penjualan.setText("Penjualan");
        btn_penjualan.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_penjualan.setBorderPainted(false);
        btn_penjualan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_penjualan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_penjualanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_penjualan, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 110, 30));

        grid_barangkeluar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        grid_barangkeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(grid_barangkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 130, 100));

        btn_riwayat.setBackground(new java.awt.Color(196, 196, 196));
        btn_riwayat.setText("Riwayat");
        btn_riwayat.setBorderPainted(false);
        btn_riwayat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_riwayat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_riwayatActionPerformed(evt);
            }
        });
        getContentPane().add(btn_riwayat, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 180, 110, 30));

        thumbnails_stockbarang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/history (1).png"))); // NOI18N
        getContentPane().add(thumbnails_stockbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 210, 110, 90));

        grid_stockbarang2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(grid_stockbarang2, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 200, 130, 100));

        thumbnails_pembelian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/grocery-cart (1).png"))); // NOI18N
        thumbnails_pembelian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        thumbnails_pembelian.setMaximumSize(new java.awt.Dimension(150, 120));
        thumbnails_pembelian.setMinimumSize(new java.awt.Dimension(150, 120));
        thumbnails_pembelian.setPreferredSize(new java.awt.Dimension(150, 120));
        getContentPane().add(thumbnails_pembelian, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 110, 80));

        lbl_username.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 24, 250, 20));

        btn_laporan.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        btn_laporan.setForeground(new java.awt.Color(255, 255, 255));
        btn_laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/folder-removebg-preview (1).png"))); // NOI18N
        btn_laporan.setText("Laporan");
        btn_laporan.setBorderPainted(false);
        btn_laporan.setContentAreaFilled(false);
        btn_laporan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_laporanActionPerformed(evt);
            }
        });
        getContentPane().add(btn_laporan, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 260, 150, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Background.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        this.setVisible(false);
        new dashboard().setVisible(true);
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masterActionPerformed
        this.setVisible(false);
        new master().setVisible(true);
    }//GEN-LAST:event_btn_masterActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        int logout = JOptionPane.showOptionDialog(this,
            "Anda yakin ingin Logout?", "Logout",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (logout == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Anda sudah logout, Silahkan login kembali.");
            this.setVisible(false);
            new login().setVisible(true);
        } else {
            this.setVisible(false);
            new dashboard().setVisible(true);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_pembelianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pembelianActionPerformed
        this.setVisible(false);
        new pembelian().setVisible(true);
    }//GEN-LAST:event_btn_pembelianActionPerformed

    private void btn_penjualanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_penjualanActionPerformed
        this.setVisible(false);
        new penjualan().setVisible(true);
    }//GEN-LAST:event_btn_penjualanActionPerformed

    private void btn_riwayatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_riwayatActionPerformed
        this.setVisible(false);
        new riwayat().setVisible(true);
    }//GEN-LAST:event_btn_riwayatActionPerformed

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        this.setVisible(false);
        new transaksi().setVisible(true);
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_pengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pengaturanActionPerformed
        this.setVisible(false);
        new pengaturan().setVisible(true);
    }//GEN-LAST:event_btn_pengaturanActionPerformed

    private void btn_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laporanActionPerformed
        if (login.cb_status.getSelectedIndex()==0) {
            this.setVisible(false);
            new laporan().setVisible(true);
        } else {
            btn_laporan.setEnabled(false);
        }
    }//GEN-LAST:event_btn_laporanActionPerformed

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
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(transaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new transaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_laporan;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_master;
    private javax.swing.JButton btn_pembelian;
    private javax.swing.JButton btn_pengaturan;
    private javax.swing.JButton btn_penjualan;
    private javax.swing.JButton btn_riwayat;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JLabel grid_barangkeluar;
    private javax.swing.JLabel grid_barangmasuk;
    private javax.swing.JLabel grid_stockbarang2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_jam;
    private javax.swing.JLabel lbl_menu;
    public static final javax.swing.JLabel lbl_status = new javax.swing.JLabel();
    private javax.swing.JLabel lbl_tanggal;
    public static final javax.swing.JLabel lbl_username = new javax.swing.JLabel();
    private javax.swing.JLabel photo_profile;
    private javax.swing.JLabel thumbnails_barangkeluar;
    private javax.swing.JLabel thumbnails_pembelian;
    private javax.swing.JLabel thumbnails_stockbarang;
    // End of variables declaration//GEN-END:variables

    private void tanggal() {
        java.util.Date tanggal = new java.util.Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        String tanggall = dateFormat.format(tanggal);
        lbl_tanggal.setText(tanggall);
    }

    private void jam() {
        java.util.Date jam = new java.util.Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh.mm a");
        String jamm = dateFormat.format(jam);
        lbl_jam.setText(jamm);
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.jpeg")));
    }

    private void userSeasion() {
        lbl_username.setText(login.txt_user.getText());
        lbl_status.setText((String) login.cb_status.getSelectedItem());
    }
}