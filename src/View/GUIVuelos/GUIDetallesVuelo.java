/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View.GUIVuelos;

/**
 *
 * @author equipo aereostars
 */
public class GUIDetallesVuelo extends javax.swing.JFrame {

    /**
     * Creates new form GUIDetallesVuelo
     */
    public GUIDetallesVuelo() {
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

        jLabel1 = new javax.swing.JLabel();
        lbl_vueloDetNum = new javax.swing.JLabel();
        btn_vueloDetBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        lbl_vueloDetOrigen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbl_vueloDetDestino = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lbl_vueloDetHora = new javax.swing.JLabel();
        lbl_vueloDetFecha = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        lbl_vueloDetTipo = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("NÚMERO VUELO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 41, -1, -1));

        lbl_vueloDetNum.setText("numVuelo");
        getContentPane().add(lbl_vueloDetNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 61, -1, -1));

        btn_vueloDetBack.setText("Regresar");
        getContentPane().add(btn_vueloDetBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(296, 254, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("DETALLES VUELO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 93, -1, -1));

        lbl_vueloDetOrigen.setText("jLabel4");
        getContentPane().add(lbl_vueloDetOrigen, new org.netbeans.lib.awtextra.AbsoluteConstraints(85, 128, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Origen:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 128, -1, -1));

        lbl_vueloDetDestino.setText("jLabel4");
        getContentPane().add(lbl_vueloDetDestino, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 153, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Destino:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 153, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("Hora de salida:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 203, -1, -1));

        lbl_vueloDetHora.setText("jLabel4");
        getContentPane().add(lbl_vueloDetHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 203, -1, -1));

        lbl_vueloDetFecha.setText("jLabel4");
        getContentPane().add(lbl_vueloDetFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 178, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel11.setText("Fecha de salida:");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 178, -1, -1));

        lbl_vueloDetTipo.setText("jLabel4");
        getContentPane().add(lbl_vueloDetTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 228, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel13.setText("Tipo:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 228, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/Images/home_wallpaper_0.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 300));

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
            java.util.logging.Logger.getLogger(GUIDetallesVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIDetallesVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIDetallesVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIDetallesVuelo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIDetallesVuelo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_vueloDetBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public javax.swing.JLabel lbl_vueloDetDestino;
    public javax.swing.JLabel lbl_vueloDetFecha;
    public javax.swing.JLabel lbl_vueloDetHora;
    public javax.swing.JLabel lbl_vueloDetNum;
    public javax.swing.JLabel lbl_vueloDetOrigen;
    public javax.swing.JLabel lbl_vueloDetTipo;
    // End of variables declaration//GEN-END:variables
}
