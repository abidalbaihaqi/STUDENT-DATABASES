/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kruwell.program;

import java.awt.HeadlessException;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class siswa extends javax.swing.JFrame {
    
private void kosongkan_form(){
txtNisn.setEditable(true);
txtNisn.setText(null);
txtNama.setText(null);
cbKelas.setSelectedItem(this);
txtAlamat.setText(null);
txtEmail.setText(null);
txtTelp.setText(null);
}

private void tampilkan_data(){
DefaultTableModel model = new DefaultTableModel();
model.addColumn("No.");
model.addColumn("Nisn");
model.addColumn("Nama");
model.addColumn("Kelas");
model.addColumn("Alamat");
model.addColumn("Email");
model.addColumn("No.Telepon");


try{
int no = 1;
String sql = "SELECT * FROM siswa";
java.sql.Connection conn=(Connection)konfig.configDB();
java.sql.Statement stm = conn.createStatement();
java.sql.ResultSet res = stm.executeQuery(sql);

while(res.next()){
model.addRow(new Object[]{no++,res.getString(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6)});
}
tabelsiswa.setModel(model);

}catch(SQLException e){
System.out.println("Error :"+ e.getMessage());
}

}
    /**
     * Creates new form siswa
     */
    public siswa() {
        initComponents();
        tampilkan_data();
        kosongkan_form();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNisn = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        cbKelas = new javax.swing.JComboBox<>();
        txtAlamat = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtTelp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelsiswa = new javax.swing.JTable();
        tbTambah = new javax.swing.JButton();
        tbSimpan = new javax.swing.JButton();
        tbEdit = new javax.swing.JButton();
        tbHapus = new javax.swing.JButton();
        tbBatal = new javax.swing.JButton();
        tbKeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 0));

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("DATA SISWA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("NISN");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nama Siswa");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Kelas");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Email");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("No.Telp");

        txtNisn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNisnActionPerformed(evt);
            }
        });

        cbKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "10", "11", "12" }));

        tabelsiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelsiswa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelsiswaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelsiswa);

        tbTambah.setBackground(new java.awt.Color(0, 153, 0));
        tbTambah.setForeground(new java.awt.Color(255, 255, 255));
        tbTambah.setText("Tambah");
        tbTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTambahActionPerformed(evt);
            }
        });

        tbSimpan.setBackground(new java.awt.Color(51, 51, 255));
        tbSimpan.setForeground(new java.awt.Color(255, 255, 255));
        tbSimpan.setText("Simpan");
        tbSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbSimpanActionPerformed(evt);
            }
        });

        tbEdit.setBackground(new java.awt.Color(0, 0, 0));
        tbEdit.setForeground(new java.awt.Color(255, 255, 255));
        tbEdit.setText("Edit");
        tbEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbEditActionPerformed(evt);
            }
        });

        tbHapus.setBackground(new java.awt.Color(255, 0, 0));
        tbHapus.setForeground(new java.awt.Color(255, 255, 255));
        tbHapus.setText("Hapus");
        tbHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbHapusActionPerformed(evt);
            }
        });

        tbBatal.setBackground(new java.awt.Color(0, 0, 0));
        tbBatal.setForeground(new java.awt.Color(255, 255, 255));
        tbBatal.setText("Batal");
        tbBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbBatalActionPerformed(evt);
            }
        });

        tbKeluar.setBackground(new java.awt.Color(0, 0, 0));
        tbKeluar.setForeground(new java.awt.Color(255, 255, 255));
        tbKeluar.setText("Keluar");
        tbKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbKeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(209, 209, 209))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNisn)
                                    .addComponent(txtNama)
                                    .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAlamat)
                                    .addComponent(txtEmail)
                                    .addComponent(txtTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tbTambah)
                                .addGap(18, 18, 18)
                                .addComponent(tbSimpan)
                                .addGap(18, 18, 18)
                                .addComponent(tbEdit)
                                .addGap(18, 18, 18)
                                .addComponent(tbHapus)
                                .addGap(18, 18, 18)
                                .addComponent(tbBatal)
                                .addGap(18, 18, 18)
                                .addComponent(tbKeluar)))
                        .addGap(0, 101, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNisn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtAlamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtTelp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tbTambah)
                    .addComponent(tbSimpan)
                    .addComponent(tbEdit)
                    .addComponent(tbHapus)
                    .addComponent(tbBatal)
                    .addComponent(tbKeluar))
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(195, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTambahActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
        
    }//GEN-LAST:event_tbTambahActionPerformed

    private void txtNisnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNisnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNisnActionPerformed

    private void tbKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbKeluarActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_tbKeluarActionPerformed

    private void tbSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbSimpanActionPerformed
        // TODO add your handling code here:
        try{
       String sql = "INSERT INTO siswa VALUES ('"+txtNisn.getText()+"','"+txtNama.getText()+"','"+cbKelas.getSelectedItem()+"','"+txtAlamat.getText()+"','"+txtEmail.getText()+"','"+txtTelp.getText()+"')";
       java.sql.Connection conn = (Connection)konfig.configDB();
       java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
       pstm.execute();
       JOptionPane.showMessageDialog(null, "Klik Oke Untuk Menambah Data");
       tampilkan_data();
       kosongkan_form();
        }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tbSimpanActionPerformed

    private void tabelsiswaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelsiswaMouseClicked
        // TODO add your handling code here:
        int baris = tabelsiswa.rowAtPoint(evt.getPoint());
        
        String nisn = tabelsiswa.getValueAt(baris, 1).toString();
        txtNisn.setText(nisn);
        
        String nama = tabelsiswa.getValueAt(baris, 2).toString();
        txtNama.setText(nama);
        
        String kelas = tabelsiswa.getValueAt(baris, 3).toString();
        cbKelas.setSelectedItem(kelas);
        
        String alamat = tabelsiswa.getValueAt(baris, 4).toString();
        txtAlamat.setText(alamat);
        
        String email = tabelsiswa.getValueAt(baris, 5).toString();
        txtEmail.setText(email);
        
        String telp = tabelsiswa.getValueAt(baris, 6).toString();
        txtTelp.setText(telp);
    }//GEN-LAST:event_tabelsiswaMouseClicked

    private void tbEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbEditActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "UPDATE siswa SET nisn ='"+txtNisn.getText()+"',nama='"+txtNama.getText()+"',kelas='"+cbKelas.getSelectedItem()+"',alamat='"+txtAlamat.getText()+"',email='"+txtEmail.getText()+"',no_telp='"+txtTelp.getText()+"' WHERE nisn = '"+txtNisn.getText()+"'";
        java.sql.Connection conn = (Connection)konfig.configDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Data Telah Di EDIT");
        }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        }
        tampilkan_data();
        kosongkan_form();
    }//GEN-LAST:event_tbEditActionPerformed

    private void tbHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbHapusActionPerformed
        // TODO add your handling code here:
        try{
        String sql = "DELETE FROM siswa WHERE nisn='"+txtNisn.getText()+"'";
        java.sql.Connection conn = (Connection)konfig.configDB();
        java.sql.PreparedStatement pstm = conn.prepareStatement(sql);
        pstm.execute();
        JOptionPane.showMessageDialog(null, "Klik Oke Untuk Menghapus Data Ini");
       tampilkan_data();
       kosongkan_form();
        }catch(HeadlessException | SQLException e){
        JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_tbHapusActionPerformed

    private void tbBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbBatalActionPerformed
        // TODO add your handling code here:
        kosongkan_form();
    }//GEN-LAST:event_tbBatalActionPerformed

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
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(siswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new siswa().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbKelas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelsiswa;
    private javax.swing.JButton tbBatal;
    private javax.swing.JButton tbEdit;
    private javax.swing.JButton tbHapus;
    private javax.swing.JButton tbKeluar;
    private javax.swing.JButton tbSimpan;
    private javax.swing.JButton tbTambah;
    private javax.swing.JTextField txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtNisn;
    private javax.swing.JTextField txtTelp;
    // End of variables declaration//GEN-END:variables
}
