/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobangunan;

import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
//import static tokobangunan.dashboard.btn_laporan;

/**
 *
 * @author Aryaaazr_
 */
public class master extends javax.swing.JFrame {
    /**
     * Creates new form master
     */
    public master() {
        initComponents();
        setLocationRelativeTo(this);
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
        lbl_status = new javax.swing.JLabel();
        txt_menu = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JButton();
        btn_master = new javax.swing.JButton();
        btn_transaksi = new javax.swing.JButton();
        btn_pengaturan = new javax.swing.JButton();
        lbl_tanggal = new javax.swing.JLabel();
        lbl_jam = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_pembeli = new javax.swing.JButton();
        thumbnails_barangmasuk = new javax.swing.JLabel();
        grid_barangmasuk = new javax.swing.JLabel();
        btn_barang = new javax.swing.JButton();
        btn_suplier = new javax.swing.JButton();
        thumbnails_barangkeluar1 = new javax.swing.JLabel();
        thumbnails_barangkeluar2 = new javax.swing.JLabel();
        thumbnails_barangkeluar3 = new javax.swing.JLabel();
        btn_pegawai = new javax.swing.JButton();
        grid_barangkeluar = new javax.swing.JLabel();
        grid_stockbarang = new javax.swing.JLabel();
        grid_stockbarang1 = new javax.swing.JLabel();
        lbl_username = new javax.swing.JLabel();
        btn_laporan = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management Building");
        setMinimumSize(new java.awt.Dimension(2147483647, 2147483647));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        photo_profile.setBackground(new java.awt.Color(255, 255, 255));
        photo_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account (2).png"))); // NOI18N
        photo_profile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(photo_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lbl_status.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_status.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 50, 20));

        txt_menu.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txt_menu.setForeground(new java.awt.Color(255, 255, 255));
        txt_menu.setText("Menu");
        getContentPane().add(txt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, 20));

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

        btn_pembeli.setBackground(new java.awt.Color(196, 196, 196));
        btn_pembeli.setText("Pembeli");
        btn_pembeli.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_pembeli.setBorderPainted(false);
        btn_pembeli.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pembeli.setFocusPainted(false);
        btn_pembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pembeliActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pembeli, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 110, 30));

        thumbnails_barangmasuk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/buyer (1).png"))); // NOI18N
        thumbnails_barangmasuk.setMaximumSize(new java.awt.Dimension(150, 120));
        thumbnails_barangmasuk.setMinimumSize(new java.awt.Dimension(150, 120));
        thumbnails_barangmasuk.setPreferredSize(new java.awt.Dimension(150, 120));
        getContentPane().add(thumbnails_barangmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 110, 80));

        grid_barangmasuk.setBackground(new java.awt.Color(196, 196, 196));
        grid_barangmasuk.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(grid_barangmasuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, 130, 100));

        btn_barang.setBackground(new java.awt.Color(196, 196, 196));
        btn_barang.setText("Barang");
        btn_barang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        btn_barang.setBorderPainted(false);
        btn_barang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_barang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_barangActionPerformed(evt);
            }
        });
        getContentPane().add(btn_barang, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 110, 30));

        btn_suplier.setBackground(new java.awt.Color(196, 196, 196));
        btn_suplier.setText("Suplier");
        btn_suplier.setBorderPainted(false);
        btn_suplier.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_suplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_suplierActionPerformed(evt);
            }
        });
        getContentPane().add(btn_suplier, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 110, 30));

        thumbnails_barangkeluar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/employee (1).png"))); // NOI18N
        getContentPane().add(thumbnails_barangkeluar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, -1, 90));

        thumbnails_barangkeluar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/inventory (1).png"))); // NOI18N
        getContentPane().add(thumbnails_barangkeluar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, -1, 90));

        thumbnails_barangkeluar3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/product (1).png"))); // NOI18N
        thumbnails_barangkeluar3.setToolTipText("");
        getContentPane().add(thumbnails_barangkeluar3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, 90));

        btn_pegawai.setBackground(new java.awt.Color(196, 196, 196));
        btn_pegawai.setText("Pegawai");
        btn_pegawai.setBorderPainted(false);
        btn_pegawai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_pegawaiActionPerformed(evt);
            }
        });
        getContentPane().add(btn_pegawai, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 110, 30));

        grid_barangkeluar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        grid_barangkeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(grid_barangkeluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, 130, 100));

        grid_stockbarang.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(grid_stockbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, 130, 100));

        grid_stockbarang1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        getContentPane().add(grid_stockbarang1, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, 130, 100));

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

    private void btn_pembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pembeliActionPerformed
        this.setVisible(false);
        new pembeli().setVisible(true);
    }//GEN-LAST:event_btn_pembeliActionPerformed

    private void btn_barangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_barangActionPerformed
        this.setVisible(false);
        new barang().setVisible(true);
    }//GEN-LAST:event_btn_barangActionPerformed

    private void btn_suplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_suplierActionPerformed
        this.setVisible(false);
        new suplier().setVisible(true);
    }//GEN-LAST:event_btn_suplierActionPerformed

    private void btn_pegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pegawaiActionPerformed
        this.setVisible(false);
        new pegawai().setVisible(true);
    }//GEN-LAST:event_btn_pegawaiActionPerformed

    private void btn_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masterActionPerformed
        this.setVisible(false);
        new master().setVisible(true);
    }//GEN-LAST:event_btn_masterActionPerformed

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
            java.util.logging.Logger.getLogger(master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new master().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton btn_barang;
    public static javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_laporan;
    public static javax.swing.JButton btn_logout;
    public static javax.swing.JButton btn_master;
    public static javax.swing.JButton btn_pegawai;
    public static javax.swing.JButton btn_pembeli;
    public static javax.swing.JButton btn_pengaturan;
    public static javax.swing.JButton btn_suplier;
    public static javax.swing.JButton btn_transaksi;
    public static javax.swing.JLabel grid_barangkeluar;
    public static javax.swing.JLabel grid_barangmasuk;
    public static javax.swing.JLabel grid_stockbarang;
    public static javax.swing.JLabel grid_stockbarang1;
    public static javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel lbl_jam;
    public static javax.swing.JLabel lbl_status;
    public static javax.swing.JLabel lbl_tanggal;
    public static javax.swing.JLabel lbl_username;
    public static javax.swing.JLabel photo_profile;
    public static javax.swing.JLabel thumbnails_barangkeluar1;
    public static javax.swing.JLabel thumbnails_barangkeluar2;
    public static javax.swing.JLabel thumbnails_barangkeluar3;
    public static javax.swing.JLabel thumbnails_barangmasuk;
    public static javax.swing.JLabel txt_menu;
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

    public void userSeasion() {
        lbl_username.setText(login.txt_user.getText());
        lbl_status.setText((String) login.cb_status.getSelectedItem());
    }
}
