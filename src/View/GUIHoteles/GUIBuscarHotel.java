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
public class GUIBuscarHotel extends javax.swing.JFrame {

    /**
     * Creates new form GUIBuscarHotel
     */
    public GUIBuscarHotel() {
        initComponents();
        this.setTitle("BUSCAR HOTEL");
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
        btn_buscar2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtnumref = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtorigen = new javax.swing.JTextField();
        txtestrellas = new javax.swing.JTextField();
        txtcosto = new javax.swing.JTextField();
        btnlimpiar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("BUSCAR INFORMACIÓN DE HOTEL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        btn_buscar2.setText("BUSCAR");
        getContentPane().add(btn_buscar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 181, -1, -1));

        jLabel2.setText("NÚmero de referencia");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 56, -1, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 120, -1, -1));

        jLabel4.setText("Dirección");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 154, -1, -1));

        jLabel5.setText("Estrellas");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 213, -1, -1));

        jLabel6.setText("Costo");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 259, -1, -1));

        jLabel7.setText("DIGITE SOLO EL NUMERO DE REFERENCIA ");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 50, -1, -1));

        jLabel8.setText("Y PRESIONE EL BOTON BUSCAR");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));
        getContentPane().add(txtnumref, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 30, -1));
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 117, 150, -1));
        getContentPane().add(txtorigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 151, 140, -1));
        getContentPane().add(txtestrellas, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 210, 40, -1));

        txtcosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcostoActionPerformed(evt);
            }
        });
        getContentPane().add(txtcosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 50, -1));

        btnlimpiar.setText("LIMPIAR");
        btnlimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnlimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(348, 236, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vista/images/home_wallpaper_0.png"))); // NOI18N
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-7, -4, 590, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcostoActionPerformed

    private void btnlimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnlimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(GUIBuscarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIBuscarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIBuscarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIBuscarHotel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIBuscarHotel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_buscar2;
    public javax.swing.JButton btnlimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JTextField txtcosto;
    public javax.swing.JTextField txtestrellas;
    public javax.swing.JTextField txtnombre;
    public javax.swing.JTextField txtnumref;
    public javax.swing.JTextField txtorigen;
    // End of variables declaration//GEN-END:variables
}