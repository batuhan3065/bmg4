
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Veresiye extends javax.swing.JFrame {

    
    DefaultTableModel Veresiye = new DefaultTableModel();
    public Veresiye() {
        initComponents();
        veresiye_tablosu.setModel(Veresiye);
        Veresiye.setColumnIdentifiers(new String[]{"AD","SOYAD","TELEFON","TARIH","BORC");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        sys_isim = new javax.swing.JTextField();
        sys_soyisim = new javax.swing.JTextField();
        sys_telefon_no = new javax.swing.JTextField();
        sys_son_odeme_tarihi = new javax.swing.JTextField();
        sys_borc = new javax.swing.JTextField();
        btn_sil = new javax.swing.JButton();
        btn_ana_ekrana_don = new javax.swing.JButton();
        btn_sistemi_sonlandir = new javax.swing.JButton();
        btn_kaydet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        veresiye_tablosu = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Veresiye Defteri");
        setLocation(new java.awt.Point(250, 100));

        jLabel1.setText("İSİM");

        jLabel2.setText("SOYİSİM");

        jLabel3.setText("TELEFON_NO");

        jLabel4.setText("SON_ODEME_TARIHI");

        jLabel5.setText("BORC");

        btn_sil.setBackground(new java.awt.Color(255, 0, 0));
        btn_sil.setText("Sil");
        btn_sil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_silActionPerformed(evt);
            }
        });

        btn_ana_ekrana_don.setBackground(new java.awt.Color(0, 204, 204));
        btn_ana_ekrana_don.setText("Ana ekrana dön");
        btn_ana_ekrana_don.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_ana_ekrana_don.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ana_ekrana_donActionPerformed(evt);
            }
        });

        btn_sistemi_sonlandir.setBackground(new java.awt.Color(255, 102, 204));
        btn_sistemi_sonlandir.setText("Sistemi sonlandır");

        btn_kaydet.setBackground(new java.awt.Color(51, 255, 51));
        btn_kaydet.setText("Kaydet");
        btn_kaydet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_kaydet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_kaydetActionPerformed(evt);
            }
        });

        veresiye_tablosu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(veresiye_tablosu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_isim)
                            .addComponent(sys_soyisim)
                            .addComponent(sys_telefon_no)
                            .addComponent(sys_son_odeme_tarihi)
                            .addComponent(sys_borc, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_ana_ekrana_don, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn_sistemi_sonlandir, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(btn_kaydet, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_isim, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_soyisim, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_telefon_no, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sys_son_odeme_tarihi, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sys_borc, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addComponent(btn_kaydet, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sil, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_ana_ekrana_don, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_sistemi_sonlandir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_kaydetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_kaydetActionPerformed
        String AD = sys_isim.getText();
        String SOYAD = sys_soyisim.getText();
        String TELEFON = sys_telefon_no.getText();
        String TARIH = sys_son_odeme_tarihi.getText();
        String BORC = sys_borc.getText();
        sys_isim.setText("");
        sys_soyisim.setText("");
        sys_telefon_no.setText("");
        sys_son_odeme_tarihi.setText("");
        sys_borc.setText("");
        String save_message = "KAYIT TAMAMLANDI";
        JOptionPane.showMessageDialog(rootPane, save_message);
        Veresiye.addRow(new String[] {AD,SOYAD,TELEFON,TARIH,BORC);
    }//GEN-LAST:event_btn_kaydetActionPerformed

    private void btn_silActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_silActionPerformed
        sys_isim.setText("");
        sys_soyisim.setText("");
        sys_telefon_no.setText("");
        sys_son_odeme_tarihi.setText("");
        sys_borc.setText("");
        String save_message = "KAYIT SİLİNDİ";
        JOptionPane.showMessageDialog(rootPane,save_message);
        Veresiye.removeRow(veresiye_tablosu.getSelectedRow());
    }//GEN-LAST:event_btn_silActionPerformed

    private void btn_ana_ekrana_donActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ana_ekrana_donActionPerformed
        Tablo tablo_2 =new Tablo();
           tablo_2.setVisible(true);
           dispose();
    }//GEN-LAST:event_btn_ana_ekrana_donActionPerformed

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
            java.util.logging.Logger.getLogger(Veresiye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Veresiye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Veresiye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Veresiye.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Veresiye().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_ana_ekrana_don;
    private javax.swing.JButton btn_kaydet;
    private javax.swing.JButton btn_sil;
    private javax.swing.JButton btn_sistemi_sonlandir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField sys_borc;
    private javax.swing.JTextField sys_isim;
    private javax.swing.JTextField sys_son_odeme_tarihi;
    private javax.swing.JTextField sys_soyisim;
    private javax.swing.JTextField sys_telefon_no;
    private javax.swing.JTable veresiye_tablosu;
    // End of variables declaration//GEN-END:variables
}
