
package Vista;

import Controlador.*;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class F_Reportes3597 extends javax.swing.JFrame {

    AB_Artículo3597 ab_Articulo3597 = new AB_Artículo3597();
    AB_Empleado ab_Empleado = new AB_Empleado();
    AB_Cliente3597 ab_Cliente3597 = new AB_Cliente3597();
    AB_Factura3597 ab_Factura3597 = new AB_Factura3597();
    AB_Proveedor3597 ab_Proveedor3597 = new AB_Proveedor3597();
       
    public F_Reportes3597() {

        initComponents();
        
        try {
            ab_Articulo3597.SalvarA_Articulo();
            ab_Empleado.SalvarA_Empleado();
            ab_Cliente3597.SalvarA_Cliente();
            ab_Factura3597.SalvarA_Factura();
            ab_Proveedor3597.SalvarA_Proveedor();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(F_Reportes3597.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        bttArtículos = new javax.swing.JButton();
        bttProveedores2 = new javax.swing.JButton();
        bttClientes1 = new javax.swing.JButton();
        bttEmpleados1 = new javax.swing.JButton();
        bttFacturacion1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 0, 51));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        Background.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 40, -1));

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 432, Short.MAX_VALUE)
        );

        Background.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 0, 70, -1));

        lbTitle.setFont(new java.awt.Font("Ebrima", 1, 36)); // NOI18N
        lbTitle.setForeground(new java.awt.Color(51, 0, 51));
        lbTitle.setText("REPORTES HTML");
        Background.add(lbTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        bttArtículos.setBackground(new java.awt.Color(204, 204, 255));
        bttArtículos.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        bttArtículos.setForeground(new java.awt.Color(51, 0, 51));
        bttArtículos.setText("Artículo");
        bttArtículos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttArtículosActionPerformed(evt);
            }
        });
        Background.add(bttArtículos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 120, 50));

        bttProveedores2.setBackground(new java.awt.Color(204, 204, 255));
        bttProveedores2.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        bttProveedores2.setForeground(new java.awt.Color(51, 0, 51));
        bttProveedores2.setText("Proveedor");
        bttProveedores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttProveedores2ActionPerformed(evt);
            }
        });
        Background.add(bttProveedores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, 120, 50));

        bttClientes1.setBackground(new java.awt.Color(204, 204, 255));
        bttClientes1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        bttClientes1.setForeground(new java.awt.Color(51, 0, 51));
        bttClientes1.setText("Cliente");
        bttClientes1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttClientes1ActionPerformed(evt);
            }
        });
        Background.add(bttClientes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, 50));

        bttEmpleados1.setBackground(new java.awt.Color(204, 204, 255));
        bttEmpleados1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        bttEmpleados1.setForeground(new java.awt.Color(51, 0, 51));
        bttEmpleados1.setText("Empleado");
        bttEmpleados1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttEmpleados1ActionPerformed(evt);
            }
        });
        Background.add(bttEmpleados1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 120, 50));

        bttFacturacion1.setBackground(new java.awt.Color(204, 204, 255));
        bttFacturacion1.setFont(new java.awt.Font("Ebrima", 1, 14)); // NOI18N
        bttFacturacion1.setForeground(new java.awt.Color(51, 0, 51));
        bttFacturacion1.setText("Factura");
        bttFacturacion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttFacturacion1ActionPerformed(evt);
            }
        });
        Background.add(bttFacturacion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 290, 120, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttProveedores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttProveedores2ActionPerformed
        ab_Proveedor3597.AbrirURL(ab_Proveedor3597.Reporte());
    }//GEN-LAST:event_bttProveedores2ActionPerformed

    private void bttArtículosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttArtículosActionPerformed
        ab_Articulo3597.AbrirURL(ab_Articulo3597.Reporte());
    }//GEN-LAST:event_bttArtículosActionPerformed

    private void bttClientes1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttClientes1ActionPerformed
        ab_Cliente3597.AbrirURL(ab_Cliente3597.Reporte());
    }//GEN-LAST:event_bttClientes1ActionPerformed

    private void bttEmpleados1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttEmpleados1ActionPerformed
        ab_Empleado.AbrirURL(ab_Empleado.Reporte());
    }//GEN-LAST:event_bttEmpleados1ActionPerformed

    private void bttFacturacion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttFacturacion1ActionPerformed
        ab_Factura3597.AbrirURL(ab_Factura3597.Reporte());
    }//GEN-LAST:event_bttFacturacion1ActionPerformed
//
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(F_Reportes3597.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(F_Reportes3597.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(F_Reportes3597.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(F_Reportes3597.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new F_Reportes3597().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton bttArtículos;
    private javax.swing.JButton bttClientes1;
    private javax.swing.JButton bttEmpleados1;
    private javax.swing.JButton bttFacturacion1;
    private javax.swing.JButton bttProveedores2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbTitle;
    // End of variables declaration//GEN-END:variables
}
