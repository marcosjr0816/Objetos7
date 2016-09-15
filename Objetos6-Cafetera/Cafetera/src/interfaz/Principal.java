/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Cafetera;
import javax.swing.JOptionPane;

/**
 *
 * @author Marcos Sarmientos
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Cafetera c;
    int cm, ca;
    
    public Principal() {
        initComponents();
        cmdCambiarValores.setEnabled(true);
        cmdLlenarCafetera.setEnabled(false);
        cmdServirTaza.setEnabled(false);
        cmdVaciarCafetera.setEnabled(false);
        cmdAgregarCafe.setEnabled(false);
        cmdLimpiar.setEnabled(true);
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
        lblDefecto = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtCantidadActual = new javax.swing.JTextField();
        txtCapacidadMaxima = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmdLlenarCafetera = new javax.swing.JButton();
        cmdAgregarCafe = new javax.swing.JButton();
        cmdServirTaza = new javax.swing.JButton();
        cmdVaciarCafetera = new javax.swing.JButton();
        cmdLimpiar = new javax.swing.JButton();
        cmdCambiarValores = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("Cafetera");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        lblDefecto.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblDefecto.setText("Debe cambiar estos valores: ");
        getContentPane().add(lblDefecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos de la cafetera ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(255, 51, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCantidadActual.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtCantidadActual.setText("0");
        txtCantidadActual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActualActionPerformed(evt);
            }
        });
        txtCantidadActual.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadActualKeyTyped(evt);
            }
        });
        jPanel1.add(txtCantidadActual, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 100, 30));

        txtCapacidadMaxima.setFont(new java.awt.Font("Cambria Math", 0, 14)); // NOI18N
        txtCapacidadMaxima.setText("1000");
        txtCapacidadMaxima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCapacidadMaximaActionPerformed(evt);
            }
        });
        txtCapacidadMaxima.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCapacidadMaximaKeyTyped(evt);
            }
        });
        jPanel1.add(txtCapacidadMaxima, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 100, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setText("Capacidad Actual:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, 20));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel2.setText("Capacidad Maxima:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 310, 200));

        cmdLlenarCafetera.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLlenarCafetera.setText("Llenar Cafetera");
        cmdLlenarCafetera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLlenarCafeteraActionPerformed(evt);
            }
        });
        getContentPane().add(cmdLlenarCafetera, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 110, -1));

        cmdAgregarCafe.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdAgregarCafe.setText("Agregar Café");
        cmdAgregarCafe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdAgregarCafeActionPerformed(evt);
            }
        });
        getContentPane().add(cmdAgregarCafe, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 110, -1));

        cmdServirTaza.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdServirTaza.setText("Servir taza");
        cmdServirTaza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdServirTazaActionPerformed(evt);
            }
        });
        getContentPane().add(cmdServirTaza, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 110, -1));

        cmdVaciarCafetera.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdVaciarCafetera.setText("Vaciar cafetera");
        cmdVaciarCafetera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdVaciarCafeteraActionPerformed(evt);
            }
        });
        getContentPane().add(cmdVaciarCafetera, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 110, -1));

        cmdLimpiar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdLimpiar.setText("Limpiar");
        cmdLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(cmdLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 110, -1));

        cmdCambiarValores.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmdCambiarValores.setText("Cambiar Valores");
        cmdCambiarValores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdCambiarValoresActionPerformed(evt);
            }
        });
        getContentPane().add(cmdCambiarValores, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, -1, -1));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Opciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 118, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 187, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 60, 130, 210));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtCapacidadMaximaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCapacidadMaximaKeyTyped
        char c = evt.getKeyChar();

        if ((!Character.isDigit(c)) && (evt.getKeyChar() != '.')) {
            getToolkit().beep();
            evt.consume();

        }
        if (evt.getKeyChar() == '.' && txtCapacidadMaxima.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtCapacidadMaximaKeyTyped

    private void txtCantidadActualKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadActualKeyTyped
        char c = evt.getKeyChar();

        if ((!Character.isDigit(c)) && (evt.getKeyChar() != '.')) {
            getToolkit().beep();
            evt.consume();

        }
        if (evt.getKeyChar() == '.' && txtCantidadActual.getText().contains(".")) {
            getToolkit().beep();
            evt.consume();

        }
    }//GEN-LAST:event_txtCantidadActualKeyTyped

    private void txtCapacidadMaximaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCapacidadMaximaActionPerformed
        
    }//GEN-LAST:event_txtCapacidadMaximaActionPerformed

    private void txtCantidadActualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActualActionPerformed
        
    }//GEN-LAST:event_txtCantidadActualActionPerformed

    private void cmdCambiarValoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdCambiarValoresActionPerformed
        if (txtCapacidadMaxima.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite Capacidad maxima", "error", JOptionPane.ERROR_MESSAGE);
            txtCapacidadMaxima.requestFocusInWindow();
        } else if (Integer.parseInt(txtCapacidadMaxima.getText().trim()) == 0) {
            JOptionPane.showMessageDialog(this, "El número de capacidad maxima no puede ser 0", "error", JOptionPane.ERROR_MESSAGE);
            txtCapacidadMaxima.requestFocusInWindow();
            txtCapacidadMaxima.selectAll();
        } else if (txtCantidadActual.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Digite cantidad actual", "error", JOptionPane.ERROR_MESSAGE);
            txtCantidadActual.requestFocusInWindow();
        } else {
            cm = Integer.parseInt(txtCapacidadMaxima.getText());
            ca = Integer.parseInt(txtCantidadActual.getText());
            if (ca > cm) {
                JOptionPane.showMessageDialog(this, "La cantidad actual no puede superar a la capacidad maxima", "Error", JOptionPane.ERROR_MESSAGE);
                txtCantidadActual.selectAll();
                txtCantidadActual.requestFocusInWindow();
            } else {
                c = new Cafetera(cm, ca);
                JOptionPane.showMessageDialog(this, "Valores Actualizados");
                cmdCambiarValores.setEnabled(false);
                txtCantidadActual.setEditable(false);
                txtCapacidadMaxima.setEditable(false);
                cmdAgregarCafe.setEnabled(true);
                cmdLimpiar.setEnabled(true);
                cmdLlenarCafetera.setEnabled(true);
                cmdServirTaza.setEnabled(true);
                cmdVaciarCafetera.setEnabled(true);
                lblDefecto.setText("");
            }
        }
    }//GEN-LAST:event_cmdCambiarValoresActionPerformed

    private void cmdLlenarCafeteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLlenarCafeteraActionPerformed
        c.llenarCafetera();
        ca = c.getCantidadActual();
        txtCantidadActual.setText(String.valueOf(ca));
        JOptionPane.showMessageDialog(this, "Cafetera llena");
    }//GEN-LAST:event_cmdLlenarCafeteraActionPerformed

    private void cmdAgregarCafeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdAgregarCafeActionPerformed
        int sw = 0;
        double cantidadcafe;
        do {
            try {
                cantidadcafe = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite Cantidad de cafe"));
                if (cantidadcafe <= 0) {
                    JOptionPane.showMessageDialog(this, "Cantidad no puede ser negativa o igual a 0", "Error", JOptionPane.ERROR_MESSAGE);
                    sw = 0;
                } else {
                    c.agregarCafe((int) cantidadcafe);
                    JOptionPane.showMessageDialog(this, "cafe agregado");
                    ca = c.getCantidadActual();
                    txtCantidadActual.setText(String.valueOf(ca));
                    sw = 1;
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "digite un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                sw = 0;
            } catch (NullPointerException e) {
                int res = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "Salir", JOptionPane.YES_NO_OPTION);
                if (res == 0) {
                    sw = 1;
                } else {
                    sw = 0;
                }
            }
        } while (sw == 0);
    }//GEN-LAST:event_cmdAgregarCafeActionPerformed

    private void cmdServirTazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdServirTazaActionPerformed
        int sw = 0;
        if (c.getCantidadActual() == 0) {
            JOptionPane.showMessageDialog(this, "La cantidad actual es 0 llene la cafetera \n"
                + "para poder servir la taza");
        } else {
            do {
                try {
                    double taza = Double.parseDouble(JOptionPane.showInputDialog(this, "Digite Cantidad de tazas"));
                    c.servirTaza((int) taza);
                    if (taza <= 0) {
                        JOptionPane.showMessageDialog(this, "Cantidad no puede ser negativa o igual a 0", "Error", JOptionPane.ERROR_MESSAGE);
                        sw = 0;
                    } else {
                        if (c.getCantidadActual() == 0) {
                            JOptionPane.showMessageDialog(this, "La cantidad actual no alcanza para \n"
                                + "llenar todas las tazas se servira lo que quede");
                            ca = c.getCantidadActual();
                            txtCantidadActual.setText(String.valueOf(ca));
                        } else {
                            JOptionPane.showMessageDialog(this, "Tazas llenadas");
                            ca = c.getCantidadActual();
                            txtCantidadActual.setText(String.valueOf(ca));
                        }
                        sw = 1;
                    }
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this, "digite un numero valido", "Error", JOptionPane.ERROR_MESSAGE);
                    sw = 0;
                } catch (NullPointerException e) {
                    int res = JOptionPane.showConfirmDialog(this, "¿Seguro que deseas salir?", "Salir", JOptionPane.YES_NO_OPTION);
                    if (res == 0) {
                        sw = 1;
                    } else {
                        sw = 0;
                    }
                }
            } while (sw == 0);
        }
    }//GEN-LAST:event_cmdServirTazaActionPerformed

    private void cmdVaciarCafeteraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdVaciarCafeteraActionPerformed
        c.vaciarCafetera();
        ca = c.getCantidadActual();
        txtCantidadActual.setText(String.valueOf(ca));
        JOptionPane.showMessageDialog(this, "Cafetera vaciada");
    }//GEN-LAST:event_cmdVaciarCafeteraActionPerformed

    private void cmdLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdLimpiarActionPerformed
        cmdCambiarValores.setEnabled(true);
        cmdLlenarCafetera.setEnabled(false);
        cmdServirTaza.setEnabled(false);
        cmdVaciarCafetera.setEnabled(false);
        cmdLimpiar.setEnabled(true);
        cmdAgregarCafe.setEnabled(false);
        lblDefecto.setText("Debe cambiar estos valores: ");
        txtCantidadActual.setText("0");
        txtCapacidadMaxima.setText("1000");
        txtCapacidadMaxima.setEditable(true);
        txtCantidadActual.setEditable(true);
        txtCapacidadMaxima.selectAll();
        txtCapacidadMaxima.requestFocusInWindow();
    }//GEN-LAST:event_cmdLimpiarActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cmdAgregarCafe;
    private javax.swing.JButton cmdCambiarValores;
    private javax.swing.JButton cmdLimpiar;
    private javax.swing.JButton cmdLlenarCafetera;
    private javax.swing.JButton cmdServirTaza;
    private javax.swing.JButton cmdVaciarCafetera;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblDefecto;
    private javax.swing.JTextField txtCantidadActual;
    private javax.swing.JTextField txtCapacidadMaxima;
    // End of variables declaration//GEN-END:variables
}