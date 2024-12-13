
import java.awt.event.KeyEvent;



public class ventanaNuevo extends javax.swing.JFrame
{
   
    
    private ventanaPrincipal v;
    
   
    public ventanaNuevo() 
    {
        initComponents();
    }

   
    public ventanaNuevo(ventanaPrincipal ventana) 
    {
        initComponents();
        v = ventana;
    }
    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pFuncionalidad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tPartido = new javax.swing.JTextField();
        bAgregarPartido = new javax.swing.JButton();
        pInformacion = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pFuncionalidad.setBackground(java.awt.Color.white);
        pFuncionalidad.setLayout(new java.awt.BorderLayout());

        jLabel1.setText("Partido:");
        pFuncionalidad.add(jLabel1, java.awt.BorderLayout.WEST);

        tPartido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tPartidoKeyPressed(evt);
            }
        });
        pFuncionalidad.add(tPartido, java.awt.BorderLayout.CENTER);

        bAgregarPartido.setText("Aceptar");
        bAgregarPartido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarPartidoActionPerformed(evt);
            }
        });
        pFuncionalidad.add(bAgregarPartido, java.awt.BorderLayout.LINE_END);

        getContentPane().add(pFuncionalidad, java.awt.BorderLayout.NORTH);

        pInformacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pInformacion.setLayout(new java.awt.BorderLayout());

        jLabel2.setText("Advertencia: ventana de subprograma");
        pInformacion.add(jLabel2, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(pInformacion, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void agregarPartido(String p)
    {
        v.agregarPartido(p);
        tPartido.setText("");
        tPartido.requestFocus();
    }
    
    private void bAgregarPartidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarPartidoActionPerformed
        agregarPartido(tPartido.getText());
    }//GEN-LAST:event_bAgregarPartidoActionPerformed

    private void tPartidoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tPartidoKeyPressed
        if( evt.getKeyCode() == KeyEvent.VK_ENTER )
        {
            agregarPartido(tPartido.getText());
        }
    }//GEN-LAST:event_tPartidoKeyPressed

    
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
            java.util.logging.Logger.getLogger(ventanaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarPartido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel pFuncionalidad;
    private javax.swing.JPanel pInformacion;
    private javax.swing.JTextField tPartido;
    // End of variables declaration//GEN-END:variables
}
