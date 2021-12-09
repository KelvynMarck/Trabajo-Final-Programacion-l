package crud2;

import Conexion.conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Agregar extends javax.swing.JFrame {

    conexion con = new conexion();
    Connection cc;
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int ID;
    public Agregar() {
        initComponents();
        setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtcantidad = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtmarca = new javax.swing.JTextField();
        txtcategoria = new javax.swing.JTextField();
        txtprecio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtcantidad.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtcantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 200, 30));

        txtnombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 200, 30));

        txtmarca.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtmarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 200, 30));

        txtcategoria.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 200, 30));

        txtprecio.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 200, 30));

        jButton1.setFont(new java.awt.Font("Roboto Bk", 1, 18)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 430, 100, 30));

        jButton2.setFont(new java.awt.Font("Roboto Bk", 1, 18)); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 430, 90, 30));

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Cantidad disponible");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 30));

        jLabel3.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 150, 30));

        jLabel4.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Marca");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 150, 30));

        jLabel5.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Categoria");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 150, 30));

        jLabel6.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Precio");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        conexion objConexion= new conexion();
            
            String nombre = txtnombre.getText();
            String marca = txtmarca.getText();
            String categoria = txtcategoria.getText();
            String precio = txtprecio.getText();
            String cantidad = txtcantidad.getText();
            
            if(nombre.equals(""))
            {
                JOptionPane.showMessageDialog(null, "La casilla de nombre esta vacia");
            }
            
            else if(marca.equals(""))
            {
                JOptionPane.showMessageDialog(null, "La casilla de marca esta vacia");
            }
            else if(categoria.equals(""))
            {
                JOptionPane.showMessageDialog(null, "La casilla de categoria esta vacia");
            }
            else if(precio.equals(""))
            {
                JOptionPane.showMessageDialog(null, "La categoria de precio esta vacia");
            }
            else if(cantidad.equals(""))
            {
                JOptionPane.showMessageDialog(null, "La casilla de cantidad esta vacia");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"¡Producto agregado exitosamente!");
            
                String strSentenciaInsert= String.format("insert into productos (nombre,marca,categoria,precio,cantidad_disponible)"
                        + "values (\"%s\",\"%s\",\"%s\",\"%s\",\"%s\")",nombre,marca,categoria,precio,cantidad);
                //Ejecutando sentencia.
                objConexion.ejecutarSentenciaMYSQL(strSentenciaInsert);
                    
                //Mostrando la interfaz de administración de usuarios y cerrando el de registro.
                ProductosAlmacen productos = new ProductosAlmacen();
                
                productos.pack();
                productos.setLocationRelativeTo(null);
                productos.setVisible(true);
                this.setVisible(false); 
            }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
               ProductosAlmacen atras = new ProductosAlmacen();
               atras.setVisible(true);
               this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agregar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agregar().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtcantidad;
    private javax.swing.JTextField txtcategoria;
    private javax.swing.JTextField txtmarca;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
