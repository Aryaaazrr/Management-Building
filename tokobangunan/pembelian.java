/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tokobangunan;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static tokobangunan.barang.lbl_status;
import static tokobangunan.barang.lbl_username;
//import static tokobangunan.dashboard.btn_laporan;
import static tokobangunan.dashboard.lbl_username;

/**
 *
 * @author Aryaaazr_
 */
public class pembelian extends javax.swing.JFrame {
    
    private DefaultTableModel model;
    
    public void totalBiaya() {
        int jumlahBaris = tabel_barangPencarian.getRowCount();
        int totalBiaya = 0;
        int jumlahBarang, hargaBarang;
        for (int i = 0; i < jumlahBaris; i++) {
            jumlahBarang = Integer.parseInt(tabel_barangPencarian.getValueAt(i, 3).toString());
            hargaBarang = Integer.parseInt(tabel_barangPencarian.getValueAt(i, 2).toString());
            totalBiaya = totalBiaya + (jumlahBarang * hargaBarang);
        }
        txt_total.setText(String.valueOf(totalBiaya));
    }
    
    public void autoIDTransaksi() {
        try {
            String sql = "SELECT * FROM pembelian ORDER BY id_pembelian DESC";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String idTransaksi = rs.getString("id_pembelian").substring(3);
                String id = "" + (Integer.parseInt(idTransaksi)+1);
                String angka = "";
                
                if (id.length()==1) {
                    angka = "0000";
                } else if (id.length()==2) {
                    angka = "000";
                } else if (id.length()==3){
                    angka = "00";
                } else if (id.length()==4) {
                    angka = "0";
                } else {
                    angka = "";
                }
                txt_IDTransaksi.disable();
                txt_IDTransaksi.setText("TRB" + angka + id);
            } else {
                txt_IDTransaksi.setText("TRB00001");
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            System.out.println("autonumber");
        }
    }
    
    public void autoIDSuplier() {
        try {
            String sql = "SELECT * FROM suplier ORDER BY id_suplier DESC";
            java.sql.Connection conn = (Connection)config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String idPembeli = rs.getString("id_suplier").substring(3);
                String id = "" + (Integer.parseInt(idPembeli)+1);
                String angka = "";
                
                if (id.length()==1) {
                    angka = "0000";
                } else if (id.length()==2) {
                    angka = "000";
                } else if (id.length()==3){
                    angka = "00";
                } else if (id.length()==4) {
                    angka = "0";
                } else {
                    angka = "";
                }
                txt_IDsuplier.disable();
                txt_IDsuplier.setText("SPL" + angka + id);
            } else {
                txt_IDsuplier.setText("SPL00001");
            }
            rs.close();
            pst.close();
        } catch (Exception e) {
            System.out.println("autonumber");
        }
    }
    
    public void loadData() {
        DefaultTableModel model = (DefaultTableModel) tabel_barangPencarian.getModel();
        // menambahkan baris data dari text field
            model.addRow(new Object[]{
            txt_IDTransaksi.getText(),
            txt_IDbarang.getText(),
            txt_harga.getText(),
            txt_jumlah.getText(),
            txt_total.getText()
            });
    }
    
    public void kosongTable() {
        DefaultTableModel model = (DefaultTableModel) tabel_barangPencarian.getModel();
        // membuat penghapusan data table
            while (model.getRowCount()>0) {
                model.removeRow(0);
            }
    }
    
    public void utama() {
        txt_IDTransaksi.setText("");
        txt_IDbarang.setText("");
        txt_harga.setText("0");
        txt_jumlah.setText("0");
        autoIDTransaksi();
        autoIDSuplier();
    }
    
    public void clear() {
        txt_IDsuplier.setText("");
        txt_namaSuplier.setText("");
        txt_total.setText("0");
        txt_bayar.setText("0");
        txt_kembalian.setText("0");
    }
    
    public void clear2() {
        txt_IDbarang.setText("");
        txt_jumlah.setText("0");
        txt_harga.setText("0");
    }
    
    public void tambahTransaksi() {
        int jumlah, harga, total;
        
        jumlah = Integer.valueOf(txt_jumlah.getText());
        harga = Integer.valueOf(txt_harga.getText());
        total = jumlah * harga;
        
        txt_total.setText(String.valueOf(total));
        
        loadData();
        totalBiaya();
        clear2();
        txt_IDbarang.requestFocus();
    }
    /**
     * Creates new form pembelian
     */
    public pembelian() {
        initComponents();
        setLocationRelativeTo(this);
        tanggal();
        jam();
        TanggalT();
        JamT();
        comboBoxDatabase();
        userSeasion();
        setIcon();
        utama();
        txt_total.setText("0");
        txt_bayar.setText("0");
        txt_kembalian.setText("0");
        txt_IDsuplier.requestFocus();
        
        // create table
        model = new DefaultTableModel();
        tabel_barangPencarian.setModel(model);
        model.addColumn("Id Transaksi");
        model.addColumn("Id Barang");
        model.addColumn("Harga");
        model.addColumn("Jumlah");
        model.addColumn("Total");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_keterangan = new javax.swing.JLabel();
        lbl_jam = new javax.swing.JLabel();
        btn_transaksi = new javax.swing.JButton();
        txt_profile = new javax.swing.JLabel();
        lbl_tanggal = new javax.swing.JLabel();
        btn_pengaturan = new javax.swing.JButton();
        btn_master = new javax.swing.JButton();
        btn_dashboard = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        txt_menu = new javax.swing.JLabel();
        btn_laporan = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cb_pilihIDPegawai = new javax.swing.JComboBox<>();
        btn_batal = new javax.swing.JButton();
        btn_checkOut = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        txt_kembalian = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_bayar = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        lbl_tanggalTransaksi = new javax.swing.JLabel();
        txt_jumlah = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txt_harga = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_jamT = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_IDbarang = new javax.swing.JTextField();
        lbl_barang = new javax.swing.JLabel();
        lbl_pembeli = new javax.swing.JLabel();
        txt_IDsuplier = new javax.swing.JTextField();
        txt_IDTransaksi = new javax.swing.JTextField();
        lbl_namaPembeli = new javax.swing.JLabel();
        txt_namaSuplier = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btn_tambah = new javax.swing.JButton();
        btn_cariBarang = new javax.swing.JButton();
        table = new javax.swing.JScrollPane();
        tabel_barangPencarian = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Management Building");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_keterangan.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        txt_keterangan.setText("Transaksi > Pembelian");
        getContentPane().add(txt_keterangan, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, -1, 20));

        lbl_jam.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbl_jam.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_jam, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 50, 80, 20));

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

        txt_profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/account (2).png"))); // NOI18N
        txt_profile.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        getContentPane().add(txt_profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        lbl_tanggal.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lbl_tanggal.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_tanggal, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, 150, 20));

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

        lbl_username.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_username.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 24, 250, 20));

        txt_menu.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        txt_menu.setForeground(new java.awt.Color(255, 255, 255));
        txt_menu.setText("Menu");
        getContentPane().add(txt_menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 50, -1));

        lbl_status.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lbl_status.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lbl_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 50, 20));

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

        jPanel5.setBackground(new java.awt.Color(196, 196, 196));

        jPanel6.setBackground(new java.awt.Color(63, 57, 57));

        jLabel11.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/shopping-cart (1).png"))); // NOI18N
        jLabel11.setText("Kasir");

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ID Pegawai");

        cb_pilihIDPegawai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cb_pilihIDPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_pilihIDPegawaiActionPerformed(evt);
            }
        });

        btn_batal.setBackground(new java.awt.Color(255, 0, 51));
        btn_batal.setText("Batal");
        btn_batal.setBorderPainted(false);
        btn_batal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalActionPerformed(evt);
            }
        });

        btn_checkOut.setBackground(new java.awt.Color(102, 255, 0));
        btn_checkOut.setText("CheckOut");
        btn_checkOut.setBorderPainted(false);
        btn_checkOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_checkOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_checkOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(btn_batal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_checkOut, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cb_pilihIDPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(378, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(cb_pilihIDPegawai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_batal)
                    .addComponent(btn_checkOut))
                .addGap(2, 2, 2))
        );

        jLabel12.setBackground(new java.awt.Color(132, 132, 132));
        jLabel12.setFont(new java.awt.Font("Arial Black", 1, 11)); // NOI18N
        jLabel12.setText("Total");

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel2.setText("Kembalian");

        txt_total.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_total.setEnabled(false);
        txt_total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_totalActionPerformed(evt);
            }
        });

        txt_kembalian.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_kembalian.setEnabled(false);
        txt_kembalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_kembalianActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel3.setText("Bayar");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        txt_bayar.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txt_bayar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_bayarActionPerformed(evt);
            }
        });
        txt_bayar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_bayarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_bayarKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(72, 90, 248));
        jButton1.setText("Print Struk");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel4.setText("Tanggal Transaksi  :");

        lbl_tanggalTransaksi.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lbl_tanggalTransaksi.setEnabled(false);

        txt_jumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_jumlahActionPerformed(evt);
            }
        });

        jLabel5.setText("Jumlah :");

        jLabel7.setText("Harga :");

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        jLabel8.setText("Waktu Transaksi :");

        lbl_jamT.setFont(new java.awt.Font("Arial Black", 0, 11)); // NOI18N
        lbl_jamT.setEnabled(false);

        jLabel9.setText("ID Transaksi");

        txt_IDbarang.setEnabled(false);

        lbl_barang.setText("ID Barang");

        lbl_pembeli.setText("ID Suplier");

        txt_IDsuplier.setEnabled(false);

        txt_IDTransaksi.setEnabled(false);

        lbl_namaPembeli.setText("Nama Suplier");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lbl_tanggalTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbl_jamT, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_barang, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_bayar, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(txt_total))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_pembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_namaPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_IDbarang)
                                    .addComponent(txt_IDsuplier)
                                    .addComponent(txt_IDTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE))
                                .addComponent(txt_namaSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(388, 388, 388))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbl_tanggalTransaksi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(9, 9, 9))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_IDTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(lbl_jamT, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_barang, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(txt_IDbarang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_IDsuplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_pembeli)))
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txt_bayar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_namaPembeli)
                                    .addComponent(txt_namaSuplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_kembalian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(txt_harga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5)
                                .addComponent(txt_jumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 530, 210));

        jPanel3.setBackground(new java.awt.Color(196, 196, 196));

        jPanel4.setBackground(new java.awt.Color(63, 57, 57));

        jLabel10.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/multiple (1).png"))); // NOI18N
        jLabel10.setText("List Barang");

        btn_tambah.setBackground(new java.awt.Color(255, 255, 0));
        btn_tambah.setText("Tambah");
        btn_tambah.setBorderPainted(false);
        btn_tambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tambahActionPerformed(evt);
            }
        });

        btn_cariBarang.setBackground(new java.awt.Color(72, 90, 248));
        btn_cariBarang.setForeground(new java.awt.Color(255, 255, 255));
        btn_cariBarang.setText("Cari Barang");
        btn_cariBarang.setBorderPainted(false);
        btn_cariBarang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cariBarang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cariBarangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(175, 175, 175)
                .addComponent(btn_tambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_cariBarang)
                .addContainerGap(268, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cariBarang)
                    .addComponent(btn_tambah))
                .addContainerGap())
        );

        tabel_barangPencarian.setBackground(new java.awt.Color(226, 216, 216));
        tabel_barangPencarian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Transaksi", "ID Barang", "Harga", "Jumlah", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabel_barangPencarian.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tabel_barangPencarian.setSelectionForeground(new java.awt.Color(63, 57, 57));
        tabel_barangPencarian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_barangPencarianMouseClicked(evt);
            }
        });
        table.setViewportView(tabel_barangPencarian);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(table, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 530, 150));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/background menu.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 510));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_transaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_transaksiActionPerformed
        this.setVisible(false);
        new transaksi().setVisible(true);
    }//GEN-LAST:event_btn_transaksiActionPerformed

    private void btn_pengaturanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_pengaturanActionPerformed
        this.setVisible(false);
        new pengaturan().setVisible(true);
    }//GEN-LAST:event_btn_pengaturanActionPerformed

    private void btn_masterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_masterActionPerformed
        this.setVisible(false);
        new master().setVisible(true);
    }//GEN-LAST:event_btn_masterActionPerformed

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        this.setVisible(false);
        new dashboard().setVisible(true);
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        int logout = JOptionPane.showOptionDialog(this,
            "Anda yakin ingin logout?", "Logout",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);
        if (logout == JOptionPane.YES_OPTION) {
            JOptionPane.showMessageDialog(this, "Anda sudah logout, Silahkan login kembali.");
            System.exit(logout);
        }
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_laporanActionPerformed
        if (login.cb_status.getSelectedIndex()==0) {
            this.setVisible(false);
            new laporan().setVisible(true);
        } else {
            btn_laporan.setEnabled(false);
        }
    }//GEN-LAST:event_btn_laporanActionPerformed

    private void cb_pilihIDPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_pilihIDPegawaiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_pilihIDPegawaiActionPerformed

    private void btn_batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalActionPerformed
        DefaultTableModel model = (DefaultTableModel) tabel_barangPencarian.getModel();

        int row = tabel_barangPencarian.getSelectedRow();
        model.removeRow(row);
        totalBiaya();
        txt_bayar.setText("0");
        txt_kembalian.setText("0");
    }//GEN-LAST:event_btn_batalActionPerformed

    private void btn_checkOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_checkOutActionPerformed
        // memanggil model table di public class
        DefaultTableModel model = (DefaultTableModel) tabel_barangPencarian.getModel();

        try {
            java.sql.Connection conn = (Connection)config.configDB();
            String sql = "INSERT INTO suplier VALUES ('"+txt_IDsuplier.getText()+"', '"+txt_namaSuplier.getText()+"', '"+""+"', '"+""+"')";
            String sqll = "INSERT INTO pembelian VALUES ('"+txt_IDTransaksi.getText()+"', '"+cb_pilihIDPegawai.getSelectedItem()+"', '"+txt_IDsuplier.getText()+"', '"+lbl_jamT.getText()+"','"+lbl_tanggalTransaksi.getText()+"')";
            java.sql.PreparedStatement pst=conn.prepareStatement(sql);
            java.sql.PreparedStatement pstt=conn.prepareStatement(sqll);
            pst.execute();
            pstt.execute();
            // deklarasi penjumlahan baris pada list table barang
            int baris = tabel_barangPencarian.getRowCount();
            // perulangan baris
            for (int i = 0; i < baris; i++) {
                String sqlll = "INSERT INTO detail_pembelian VALUES ('"+txt_IDTransaksi.getText()+"', '"+tabel_barangPencarian.getValueAt(i, 1)+"', '"+tabel_barangPencarian.getValueAt(i, 2)+"', '"+tabel_barangPencarian.getValueAt(i, 3)+"', '"+tabel_barangPencarian.getValueAt(i, 4)+"')";
                // pernyataan
                java.sql.PreparedStatement psttt = conn.prepareStatement(sqlll);
                psttt.execute();
            }
            JOptionPane.showMessageDialog(this, "Data Berhasil Disimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Data gagal tersimpan");
        }
        clear();
        utama();
        autoIDTransaksi();
        autoIDSuplier();
        kosongTable();
    }//GEN-LAST:event_btn_checkOutActionPerformed

    private void txt_totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_totalActionPerformed
        //        total();
    }//GEN-LAST:event_txt_totalActionPerformed

    private void txt_kembalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_kembalianActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_kembalianActionPerformed

    private void txt_bayarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_bayarActionPerformed
        int totalbayar,uangbayar,kembalian;

        totalbayar = Integer.parseInt(txt_total.getText());
        uangbayar = Integer.parseInt(txt_bayar.getText());

        if (uangbayar > totalbayar){
            kembalian = uangbayar - totalbayar;
            txt_kembalian.setText(String.valueOf(kembalian));
        }else if (uangbayar < totalbayar) {
            kembalian = uangbayar - totalbayar;
            txt_kembalian.setText(String.valueOf(kembalian));
            JOptionPane.showMessageDialog(this, "Jumlah Uang kurang");
        }
    }//GEN-LAST:event_txt_bayarActionPerformed

    private void txt_bayarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bayarKeyTyped
        
    }//GEN-LAST:event_txt_bayarKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txt_jumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_jumlahActionPerformed
        tambahTransaksi();
    }//GEN-LAST:event_txt_jumlahActionPerformed

    private void btn_tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tambahActionPerformed
        tambahTransaksi();
    }//GEN-LAST:event_btn_tambahActionPerformed

    private void tabel_barangPencarianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_barangPencarianMouseClicked
        //        int row;
        //        row = tabel_barangPencarian.getSelectedRow();
        //        txt_harga.setText(tabel_barangPencarian.getValueAt(row, 2).toString());
    }//GEN-LAST:event_tabel_barangPencarianMouseClicked

    private void btn_cariBarangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cariBarangActionPerformed
        tambahBarang a = new tambahBarang();
        a.setVisible(true);
    }//GEN-LAST:event_btn_cariBarangActionPerformed

    private void txt_bayarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_bayarKeyReleased
        // TODO add your handling code here:
        int totalbayar,uangbayar,kembalian;

        totalbayar = Integer.parseInt(txt_total.getText());
        uangbayar = Integer.parseInt(txt_bayar.getText());

        if (uangbayar > totalbayar){
            kembalian = uangbayar - totalbayar;
            txt_kembalian.setText(String.valueOf(kembalian));
        }else {
        }
    }//GEN-LAST:event_txt_bayarKeyReleased

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
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pembelian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pembelian().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batal;
    public static javax.swing.JButton btn_cariBarang;
    private javax.swing.JButton btn_checkOut;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_laporan;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_master;
    private javax.swing.JButton btn_pengaturan;
    public static javax.swing.JButton btn_tambah;
    private javax.swing.JButton btn_transaksi;
    private javax.swing.JComboBox<String> cb_pilihIDPegawai;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lbl_barang;
    private javax.swing.JLabel lbl_jam;
    public static javax.swing.JLabel lbl_jamT;
    private javax.swing.JLabel lbl_namaPembeli;
    private javax.swing.JLabel lbl_pembeli;
    public static final javax.swing.JLabel lbl_status = new javax.swing.JLabel();
    private javax.swing.JLabel lbl_tanggal;
    public static javax.swing.JLabel lbl_tanggalTransaksi;
    public static final javax.swing.JLabel lbl_username = new javax.swing.JLabel();
    public static javax.swing.JTable tabel_barangPencarian;
    private javax.swing.JScrollPane table;
    private javax.swing.JTextField txt_IDTransaksi;
    public static javax.swing.JTextField txt_IDbarang;
    private javax.swing.JTextField txt_IDsuplier;
    private javax.swing.JTextField txt_bayar;
    public static javax.swing.JTextField txt_harga;
    private javax.swing.JTextField txt_jumlah;
    private javax.swing.JTextField txt_kembalian;
    private javax.swing.JLabel txt_keterangan;
    private javax.swing.JLabel txt_menu;
    private javax.swing.JTextField txt_namaSuplier;
    private javax.swing.JLabel txt_profile;
    private javax.swing.JTextField txt_total;
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

    public void JamT() {
        java.util.Date jam = new java.util.Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");
        String jamm = dateFormat.format(jam);
        lbl_jamT.setText(jamm);
    }

    public void TanggalT() {
        java.util.Date tanggal = new java.util.Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String tanggall = dateFormat.format(tanggal);
        lbl_tanggalTransaksi.setText(tanggall);
    }
    
    private void comboBoxDatabase() {
        try {
            String sql = "SELECT * FROM pegawai";
            java.sql.Connection conn = (Connection) config.configDB();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            java.sql.ResultSet rs = pst.executeQuery();
            while(rs.next()) {
                cb_pilihIDPegawai.addItem(rs.getString("id_pegawai"));
            }
        } catch (Exception e) {
        }
    }
    private void userSeasion() {
        lbl_username.setText(login.txt_user.getText());
        lbl_status.setText((String) login.cb_status.getSelectedItem());
    }
    
    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("icon.jpeg")));
    }
    
}
