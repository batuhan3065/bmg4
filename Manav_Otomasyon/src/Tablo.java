
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author batuh
 */
public class Tablo extends javax.swing.JFrame {

    DefaultTableModel tablo =new DefaultTableModel ();
    public Tablo() {
        initComponents();
        gösterge_tablosu.setModel(tablo);
        tablo.setColumnIdentifiers(new String[] {"Ad","Tür","Giris","SKT","Adet");
         
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sys_ad = new javax.swing.JTextField();
        sys_tür = new javax.swing.JTextField();
        sys_giris_tarihi = new javax.swing.JTextField();
        sys_son_tüketim_tarihi = new javax.swing.JTextField();
        sys_adet = new javax.swing.JTextField();
        btn_kaydet = new javax.swing.JButton();
        btn_iptal = new javax.swing.JButton();
        btn_cikis = new javax.swing.JButton();
        btn_kapat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        gösterge_tablosu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("KAYIT ALANI");
        setLocation(new java.awt.Point(450, 150));

        jLabel1.setText("ÜRÜN ADI");

        jLabel2.setText("ÜRÜN TÜRÜ");

        jLabel3.setText("GİRİŞ TARİHİ");

        jLabel4.setText("SON TÜKETİM TARİHİ");

        jLabel5.setText("ADET(KG)");

        sys_ad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sys_adActionPerformed(evt);
            }
        });

        btn_kaydet.setBackground(new java.awt.Color(51, 255, 255));
        btn_kaydet.setText("KAYDET");
        btn_kaydet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        btn_iptal.setBackground(new java.awt.Color(255, 0, 0));
        btn_iptal.setText("İPTAL");
        btn_iptal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_iptal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iptalActionPerformed(evt);
            }
        });

        btn_cikis.setBackground(new java.awt.Color(51, 255, 0));
        btn_cikis.setText("ÇIKIŞ YAP");
        btn_cikis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cikis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cikisActionPerformed(evt);
            }
        });

        btn_kapat.setBackground(new java.awt.Color(255, 0, 51));
        btn_kapat.setText("SİSTEMİ KAPAT");
        btn_kapat.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kapat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kapatActionPerformed(evt);
            }
        });

        gösterge_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gösterge_tablosu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_ad)
                            .addComponent(sys_tür)
                            .addComponent(sys_giris_tarihi)
                            .addComponent(sys_son_tüketim_tarihi)
                            .addComponent(sys_adet, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_kaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_iptal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_cikis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_kapat, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 549, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_ad, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_tür, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_giris_tarihi, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_son_tüketim_tarihi, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sys_adet, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addGap(42, 42, 42)
                        .addComponent(btn_kaydet)
                        .addGap(18, 18, 18)
                        .addComponent(btn_iptal)
                        .addGap(18, 18, 18)
                        .addComponent(btn_cikis)
                        .addGap(18, 18, 18)
                        .addComponent(btn_kapat)))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void sys_adActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sys_adActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sys_adActionPerformed

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        String Ad=sys_ad.getText();
        String Tür=sys_tür.getText();
        String Giris=sys_giris_tarihi.getText();
        String SKT=sys_son_tüketim_tarihi.getText();
        String Adet=sys_adet.getText();
        sys_ad.setText("");
        sys_tür.setText("");
        sys_giris_tarihi.setText("");
        sys_son_tüketim_tarihi.setText("");
        sys_adet.setText("");
        String save_message = "Kayıt Tamamlandı";
        JOptionPane.showMessageDialog(rootPane, save_message);
        tablo.addRow(new String[] {Ad,Tür,Giris,SKT,Adet});
        

        
    }//GEN-LAST:event_btn_kaydetActionPerformed

    private void btn_iptalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iptalActionPerformed
        sys_ad.setText("");
        sys_tür.setText("");
        sys_giris_tarihi.setText("");
        sys_son_tüketim_tarihi.setText("");
        sys_adet.setText("");
    }//GEN-LAST:event_btn_iptalActionPerformed

    private void btn_cikisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cikisActionPerformed
       Double hesap;
       String  giris_adet =JOptionPane.showInputDialog("Gİriş Adet(KG)");
       String  cikis_adet = JOptionPane.showInputDialog("Çıkış adet(KG)");
       Double grs_adt = Double.parseDouble(giris_adet);
       Double cks_adt = Double.parseDouble(cikis_adet);
       Double zarar = (grs_adt - cks_adt);
       hesap = zarar;
       JOptionPane.showMessageDialog(rootPane,"Zarar : "+String.valueOf(hesap) + " KG ");
       tablo.removeRow(gösterge_tablosu.getSelectedRow());
    }//GEN-LAST:event_btn_cikisActionPerformed

    private void btn_kapatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kapatActionPerformed
        dispose();
    }//GEN-LAST:event_btn_kapatActionPerformed

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
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cikis;
    private javax.swing.JButton btn_iptal;
    private javax.swing.JButton btn_kapat;
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JTable gösterge_tablosu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sys_ad;
    private javax.swing.JTextField sys_adet;
    private javax.swing.JTextField sys_giris_tarihi;
    private javax.swing.JTextField sys_son_tüketim_tarihi;
    private javax.swing.JTextField sys_tür;
    // End of variables declaration//GEN-END:variables
}
