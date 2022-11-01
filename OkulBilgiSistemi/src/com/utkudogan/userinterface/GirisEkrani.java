/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.utkudogan.userinterface;

/**
 *
 * @author utku.dogan
 */
public class GirisEkrani extends javax.swing.JFrame {

    /**
     * Creates new form GirisEkrani
     */
    public GirisEkrani() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_AnaPanel = new javax.swing.JPanel();
        jPanel_GirisIkon = new javax.swing.JPanel();
        jPanel_GirisParaametreleri = new javax.swing.JPanel();
        jPanel_Navigasyon = new javax.swing.JPanel();
        jPanel_Kullanici_Ikon = new javax.swing.JPanel();
        jLabel_KurtarmaMesaji = new javax.swing.JLabel();
        jLabel_Sayac = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField_KullaniciAdi = new javax.swing.JTextField();
        jPasswordField_Sifre = new javax.swing.JPasswordField();
        jTextField_KurtarmaKodu = new javax.swing.JTextField();
        jLabel_SifremiUnuttum = new javax.swing.JLabel();
        jButton_GirisYap = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 500));

        jPanel_GirisIkon.setBackground(new java.awt.Color(255, 51, 102));

        javax.swing.GroupLayout jPanel_GirisIkonLayout = new javax.swing.GroupLayout(jPanel_GirisIkon);
        jPanel_GirisIkon.setLayout(jPanel_GirisIkonLayout);
        jPanel_GirisIkonLayout.setHorizontalGroup(
            jPanel_GirisIkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        jPanel_GirisIkonLayout.setVerticalGroup(
            jPanel_GirisIkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel_GirisParaametreleri.setBackground(new java.awt.Color(255, 255, 255));

        jPanel_Navigasyon.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel_NavigasyonLayout = new javax.swing.GroupLayout(jPanel_Navigasyon);
        jPanel_Navigasyon.setLayout(jPanel_NavigasyonLayout);
        jPanel_NavigasyonLayout.setHorizontalGroup(
            jPanel_NavigasyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_NavigasyonLayout.setVerticalGroup(
            jPanel_NavigasyonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 71, Short.MAX_VALUE)
        );

        jPanel_Kullanici_Ikon.setBackground(new java.awt.Color(255, 204, 204));

        javax.swing.GroupLayout jPanel_Kullanici_IkonLayout = new javax.swing.GroupLayout(jPanel_Kullanici_Ikon);
        jPanel_Kullanici_Ikon.setLayout(jPanel_Kullanici_IkonLayout);
        jPanel_Kullanici_IkonLayout.setHorizontalGroup(
            jPanel_Kullanici_IkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel_Kullanici_IkonLayout.setVerticalGroup(
            jPanel_Kullanici_IkonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        jLabel_KurtarmaMesaji.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_KurtarmaMesaji.setForeground(new java.awt.Color(102, 204, 255));
        jLabel_KurtarmaMesaji.setText("Kurtarma Kodunu Giriniz");

        jLabel_Sayac.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_Sayac.setForeground(new java.awt.Color(102, 204, 255));
        jLabel_Sayac.setText("120");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTextField_KullaniciAdi.setText("jTextField1");
        jTextField_KullaniciAdi.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kullanıcı Adı", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jPasswordField_Sifre.setText("jPasswordField1");
        jPasswordField_Sifre.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Şifre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jTextField_KurtarmaKodu.setText("jTextField2");
        jTextField_KurtarmaKodu.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Kurtarma Kodu", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 18))); // NOI18N

        jLabel_SifremiUnuttum.setForeground(new java.awt.Color(102, 102, 255));
        jLabel_SifremiUnuttum.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_SifremiUnuttum.setText("Şifremi Unuttum");

        jButton_GirisYap.setBackground(new java.awt.Color(0, 255, 255));
        jButton_GirisYap.setText("Giriş");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField_KurtarmaKodu)
                    .addComponent(jPasswordField_Sifre)
                    .addComponent(jTextField_KullaniciAdi))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jButton_GirisYap, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_SifremiUnuttum, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(111, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jTextField_KullaniciAdi, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPasswordField_Sifre, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField_KurtarmaKodu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_SifremiUnuttum)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton_GirisYap)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_GirisParaametreleriLayout = new javax.swing.GroupLayout(jPanel_GirisParaametreleri);
        jPanel_GirisParaametreleri.setLayout(jPanel_GirisParaametreleriLayout);
        jPanel_GirisParaametreleriLayout.setHorizontalGroup(
            jPanel_GirisParaametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Navigasyon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_Kullanici_Ikon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel_GirisParaametreleriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_KurtarmaMesaji, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_Sayac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_GirisParaametreleriLayout.setVerticalGroup(
            jPanel_GirisParaametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_GirisParaametreleriLayout.createSequentialGroup()
                .addComponent(jPanel_Navigasyon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_Kullanici_Ikon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jPanel_GirisParaametreleriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_KurtarmaMesaji)
                    .addComponent(jLabel_Sayac))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_AnaPanelLayout = new javax.swing.GroupLayout(jPanel_AnaPanel);
        jPanel_AnaPanel.setLayout(jPanel_AnaPanelLayout);
        jPanel_AnaPanelLayout.setHorizontalGroup(
            jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_AnaPanelLayout.createSequentialGroup()
                .addComponent(jPanel_GirisIkon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel_GirisParaametreleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel_AnaPanelLayout.setVerticalGroup(
            jPanel_AnaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_GirisIkon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_GirisParaametreleri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_AnaPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GirisEkrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GirisEkrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_GirisYap;
    private javax.swing.JLabel jLabel_KurtarmaMesaji;
    private javax.swing.JLabel jLabel_Sayac;
    private javax.swing.JLabel jLabel_SifremiUnuttum;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel_AnaPanel;
    private javax.swing.JPanel jPanel_GirisIkon;
    private javax.swing.JPanel jPanel_GirisParaametreleri;
    private javax.swing.JPanel jPanel_Kullanici_Ikon;
    private javax.swing.JPanel jPanel_Navigasyon;
    private javax.swing.JPasswordField jPasswordField_Sifre;
    private javax.swing.JTextField jTextField_KullaniciAdi;
    private javax.swing.JTextField jTextField_KurtarmaKodu;
    // End of variables declaration//GEN-END:variables
}
