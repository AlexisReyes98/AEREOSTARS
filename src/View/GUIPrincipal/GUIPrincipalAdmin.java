/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUIPrincipal;

import java.awt.Color;

/**
 *
 * @author equipo aereostars
 */
public class GUIPrincipalAdmin extends javax.swing.JFrame {

    /**
     * Creates new form GUIPrincipalAdmin
     */
    public GUIPrincipalAdmin() {
        initComponents();
        this.getContentPane().setBackground(new Color(204, 205, 253));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_adminModVuelo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_adminAddVuelo = new javax.swing.JButton();
        btn_adminDelVuelo = new javax.swing.JButton();
        btn_adminModHotel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btn_adminAddHotel = new javax.swing.JButton();
        btn_adminDelHotel = new javax.swing.JButton();
        btn_adminModEvento = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btn_adminAddEvento = new javax.swing.JButton();
        btn_adminDelEvento = new javax.swing.JButton();
        btn_adminAddPaquete = new javax.swing.JButton();
        btn_adminDelPaquete = new javax.swing.JButton();
        btn_adminModPaquete = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btn_adminAddPromo = new javax.swing.JButton();
        btn_adminDelPromo = new javax.swing.JButton();
        btn_adminModPromo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_adminModVuelo.setText("Modificar Vuelo");
        getContentPane().add(btn_adminModVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 41, 139, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Vuelos");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 20, -1, -1));

        btn_adminAddVuelo.setText("Agregar Vuelo");
        getContentPane().add(btn_adminAddVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 41, 135, -1));

        btn_adminDelVuelo.setText("Eliminar Vuelo");
        getContentPane().add(btn_adminDelVuelo, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 79, 135, -1));

        btn_adminModHotel.setText("Modificar Hotel");
        btn_adminModHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_adminModHotelActionPerformed(evt);
            }
        });
        getContentPane().add(btn_adminModHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 149, 139, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Hoteles");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 129, -1, -1));

        btn_adminAddHotel.setText("Agregar Hotel");
        getContentPane().add(btn_adminAddHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 149, 135, -1));

        btn_adminDelHotel.setText("Eliminar Hotel");
        getContentPane().add(btn_adminDelHotel, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 187, 135, -1));

        btn_adminModEvento.setText("Modificar Evento");
        getContentPane().add(btn_adminModEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(519, 259, 139, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Eventos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 239, -1, -1));

        btn_adminAddEvento.setText("Agregar Evento");
        getContentPane().add(btn_adminAddEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 259, 135, -1));

        btn_adminDelEvento.setText("Eliminar Evento");
        getContentPane().add(btn_adminDelEvento, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 297, 135, -1));

        btn_adminAddPaquete.setText("Agregar Paquete");
        getContentPane().add(btn_adminAddPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 361, 155, -1));

        btn_adminDelPaquete.setText("Eliminar Paquete");
        getContentPane().add(btn_adminDelPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 399, 155, -1));

        btn_adminModPaquete.setText("Modificar Paquete");
        getContentPane().add(btn_adminModPaquete, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 361, 139, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Paquetes");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 341, -1, -1));

        btn_adminAddPromo.setText("Agregar Promociones");
        getContentPane().add(btn_adminAddPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 469, -1, -1));

        btn_adminDelPromo.setText("Eliminar Promociones");
        getContentPane().add(btn_adminDelPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 507, -1, -1));

        btn_adminModPromo.setText("Modificar Promociones");
        getContentPane().add(btn_adminModPromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(539, 469, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Promociones");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(378, 449, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("SISTEMA AEREO-STARS");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 13, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/aereostars.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 230, 210));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_adminModHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_adminModHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_adminModHotelActionPerformed

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
            java.util.logging.Logger.getLogger(GUIPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIPrincipalAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIPrincipalAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_adminAddEvento;
    public javax.swing.JButton btn_adminAddHotel;
    public javax.swing.JButton btn_adminAddPaquete;
    public javax.swing.JButton btn_adminAddPromo;
    public javax.swing.JButton btn_adminAddVuelo;
    public javax.swing.JButton btn_adminDelEvento;
    public javax.swing.JButton btn_adminDelHotel;
    public javax.swing.JButton btn_adminDelPaquete;
    public javax.swing.JButton btn_adminDelPromo;
    public javax.swing.JButton btn_adminDelVuelo;
    public javax.swing.JButton btn_adminModEvento;
    public javax.swing.JButton btn_adminModHotel;
    public javax.swing.JButton btn_adminModPaquete;
    public javax.swing.JButton btn_adminModPromo;
    public javax.swing.JButton btn_adminModVuelo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
