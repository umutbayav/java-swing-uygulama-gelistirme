
import islem.ButtonAyarlar;
import islem.Duzenleyici;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class resimekle extends javax.swing.JFrame implements Duzenleyici{
     DefaultListModel model;
     String filename=null; //string deger olusturuldu.
     byte[] person_image=null; //dizi olusturmak içinolusturuldu.
    /**
     * Creates new form resimekle
     */
    public resimekle() {
        initComponents();
        getEdite();
        model=new DefaultListModel();
        lstresim.setModel(model);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstresim = new javax.swing.JList<>();
        btnekle = new javax.swing.JButton();
        btnsil = new javax.swing.JButton();
        lblmesaj = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resim Ekleme");

        lstresim.setBackground(new java.awt.Color(204, 255, 204));
        lstresim.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lstresim.setModel(new javax.swing.AbstractListModel() {
            ImageIcon[] strings = { new ImageIcon("C:\\Users\\umut_\\Desktop\\image\\a.png"),
                new ImageIcon("C:\\Users\\umut_\\Desktop\\image\\b.png"),
                new ImageIcon("C:\\Users\\umut_\\Desktop\\image\\c.png"),
                new ImageIcon("C:\\Users\\umut_\\Desktop\\image\\d.png")};
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        lstresim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(lstresim);

        btnekle.setBackground(new java.awt.Color(0, 102, 0));
        btnekle.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnekle.setText("Add Picture");
        btnekle.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnekle.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnekleMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnekleMouseExited(evt);
            }
        });
        btnekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnekleActionPerformed(evt);
            }
        });

        btnsil.setBackground(new java.awt.Color(255, 0, 0));
        btnsil.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsil.setText("Delete_Selected");
        btnsil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnsil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnsilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnsilMouseExited(evt);
            }
        });
        btnsil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsilActionPerformed(evt);
            }
        });

        lblmesaj.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblmesaj.setForeground(new java.awt.Color(0, 153, 153));

        jButton1.setBackground(new java.awt.Color(0, 204, 204));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Previous Application");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblmesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(153, 153, 153))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnekle)
                                .addGap(44, 44, 44)
                                .addComponent(btnsil)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(32, 32, 32))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnekle)
                    .addComponent(btnsil)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblmesaj, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     
    
    @Override
    public void getEdite() {
        this.setLocationRelativeTo(null);//pencere ortada acilsin
        lstresim.setFocusable(true);//text field yazı yazma imlecini yok ettik
    }
    
    
    private void setBgFg(Component c){
        ButtonAyarlar.setBgFg((JButton) c,Color.BLACK, Color.WHITE); //arkaplan renk,yazı rengi
    }
    private void btnekleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnekleActionPerformed
       JFileChooser chooser=new JFileChooser(); 
       chooser.setDialogTitle("Resim Seçme Ekrani"); //file title yazma
       //chooser.setMultiSelectionEnabled(true);
       chooser.showOpenDialog(null);//Bu kod parçacığı kullanıcının ön tanımlı dizinini gösteren bir dosya diyaloğu açar
       File f=chooser.getSelectedFile();  //Kullanıcı tarafından seçilen dosya referansına ulaşmak için getSelectedFile() metodunu kullanıyoruz
       filename=f.getAbsolutePath(); //seçim onaylandı
       if ((filename.endsWith(".png") == true)||(filename.endsWith(".jpg") == true)){ //dosya uzantı kontrol etme
           ImageIcon imageIcon=new ImageIcon(new ImageIcon(filename).getImage().getScaledInstance(460,390, Image.SCALE_SMOOTH)); //image boyutlandırma
           model.addElement(imageIcon); //list ekleme işlemi
           lblmesaj.setText("Kayit Eklendi  "); //mesaj verma
       }else{
           JOptionPane.showMessageDialog(this, "Hata.\n"+"Seçili Resim Değil?"); 
       }
    }//GEN-LAST:event_btnekleActionPerformed

    private void btnsilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsilActionPerformed
         int index=lstresim.getSelectedIndex();//secilen ad yok mu yoksa -1 dondurur
        if(index !=-1){
            model.removeElementAt(index);//secili elemanin index verilerek silme
            lblmesaj.setText("Seçili Eleman Silindi");
           
           
        }else if(index==-1){
             lblmesaj.setText("Seçili Bir Eleman Yok");
        }
    }//GEN-LAST:event_btnsilActionPerformed
    //button ustune gelindiğinde verilen arkaplan rengi ve yazı rengi degistirme
    private void btnekleMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnekleMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_btnekleMouseEntered
     //buttonun ustunde gidildiğinde eski arkaplan rengi ve yazı rengi verilmesi
    private void btnekleMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnekleMouseExited
        ButtonAyarlar.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_btnekleMouseExited

    private void btnsilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsilMouseEntered
        this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_btnsilMouseEntered

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ButtonAyarlar.setVisible(this,new ogrenciekle());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
         this.setBgFg(evt.getComponent());
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
         ButtonAyarlar.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_jButton1MouseExited

    private void btnsilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsilMouseExited
        ButtonAyarlar.setOriginalBgFg((JButton) evt.getComponent());
    }//GEN-LAST:event_btnsilMouseExited

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
            java.util.logging.Logger.getLogger(resimekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(resimekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(resimekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(resimekle.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new resimekle().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnekle;
    private javax.swing.JButton btnsil;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblmesaj;
    private javax.swing.JList<String> lstresim;
    // End of variables declaration//GEN-END:variables

}
