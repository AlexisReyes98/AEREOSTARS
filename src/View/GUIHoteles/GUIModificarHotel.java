/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUIHoteles;

/**
 *
 * @author jovan
 */
public class GUIModificarHotel extends javax.swing.JFrame {

    /**
     * Creates new form GUIModificarHotel
     */
    public GUIModificarHotel() {
        initComponents();
        this.setTitle("MODIFICAR HOTEL");
        this.setLocation(400,220);
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
        btn_buscar = new javax.swing.JButton();
        btn_modificar = new javax.swing.JButton();
        txtnumref = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtdestino = new javax.swing.JTextField();
        txtestre = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 59, -1, -1));

        jLabel2.setText("Direccion");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 102, -1, -1));

        jLabel3.setText("Estrellas");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 158, -1, 10));

        jLabel4.setText("Costo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, -1, -1));

        jLabel5.setText("Numero de referencia");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        btn_modificar.setText("MODIFICAR");
        getContentPane().add(btn_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));

        txtnumref.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnumrefActionPerformed(evt);
            }
        });
        getContentPane().add(txtnumref, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 40, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 140, -1));
        getContentPane().add(txtdestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 140, -1));
        getContentPane().add(txtestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 50, -1));
        getContentPane().add(txtcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 197, 50, -1));

        jLabel6.setText("COLOQUE SOLO EL NUMERO DE REFERENCIA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, -1, -1));

        jLabel7.setText("PRESIONE BUSCAR Y DESPUES EDITE");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 50, -1, -1));

        jLabel8.setText("FINALMENTE PRESIONE MODIFICAR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/home_wallpaper_0.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_buscarActionPerformed

    private void txtnumrefActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnumrefActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnumrefActionPerformed

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
            java.util.logging.Logger.getLogger(GUIModificarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIModificarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIModificarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIModificarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIModificarHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_buscar;
    public javax.swing.JButton btn_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JTextField txtcosto;
    public javax.swing.JTextField txtdestino;
    public javax.swing.JTextField txtestre;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtnumref;
    // End of variables declaration//GEN-END:variables
}
