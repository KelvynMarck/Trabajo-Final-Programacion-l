package crud2;

import Conexion.conexion;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Crud extends javax.swing.JFrame {

    DefaultTableModel modelo;

    public Crud() {
        initComponents();   
        this.setLocationRelativeTo(null);
        
        String[] titulos = {"id","nombre","apellido","telefono","correo","contrasena","usuario"};
    	modelo = new DefaultTableModel(null,titulos);
    	datos.setModel(modelo);
    	//Cargando los datos en mi tabla para que puedan ser mostrados al usuario.
    	this.consultar();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        datoss = new javax.swing.JScrollPane();
        datos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Actualizar = new javax.swing.JButton();
        Eliminar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        txttelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtusuario = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcontrasena = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\kelvy\\OneDrive\\Escritorio\\Mis programas\\city.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(697, 0, 180, 490));

        jLabel2.setFont(new java.awt.Font("Roboto Bk", 0, 24)); // NOI18N
        jLabel2.setText("CLIENTES REGISTRADO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel3.setText("Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 160, -1));

        jLabel4.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel4.setText("Apellido");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, -1, -1));

        datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre de usuario", "Nombre", "Apellido", "Numero de telefono", "Correo electronico", "Contraseña"
            }
        ));
        datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                datosMouseClicked(evt);
            }
        });
        datoss.setViewportView(datos);

        jPanel1.add(datoss, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 690, 190));

        jButton1.setText("Nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 460, -1, -1));

        Actualizar.setText("Actualizar");
        Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(Actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, -1, -1));

        Eliminar.setText("Eliminar");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });
        jPanel1.add(Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, -1, -1));

        jButton4.setText("Cerrar sesion");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, -1, -1));
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 160, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel5.setText("Nombre de usuario");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 160, -1));

        jLabel6.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel6.setText("Numero de telefono");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));
        jPanel1.add(txtusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 160, -1));

        jLabel7.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel7.setText("Correo electronico");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));
        jPanel1.add(txtCorreoElectronico, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 160, -1));

        jLabel9.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        jLabel9.setText("Contraseña");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 200, -1, -1));
        jPanel1.add(txtcontrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 220, 160, -1));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        exit.setFont(new java.awt.Font("Roboto Bk", 1, 14)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 30));

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 460, 90, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked


    }//GEN-LAST:event_jButton4MouseClicked

      
    
    private void ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActualizarActionPerformed
        modificar();
        
    }//GEN-LAST:event_ActualizarActionPerformed

    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
        eliminar();
                
    }//GEN-LAST:event_EliminarActionPerformed

    private void datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_datosMouseClicked
    int fila = datos.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(null,"Usuario no seleccionado");

        }else{
            String Usuario = (String)datos.getValueAt(fila,6);
            String Nombre = (String)datos.getValueAt(fila,1);
            String Apellido = (String)datos.getValueAt(fila,2);
            String Correo = (String)datos.getValueAt(fila,4);
            String Numero = (String)datos.getValueAt(fila,3);
            String Contrasena = (String)datos.getValueAt(fila,5);



            txtNombre.setText(Nombre);
            txtApellido.setText(Apellido);
            txtCorreoElectronico.setText(Correo);
            txttelefono.setText(Numero);
            txtusuario.setText(Usuario);
            txtcontrasena.setText(Contrasena);

        }  
    }//GEN-LAST:event_datosMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked

             System.exit(0);

    }//GEN-LAST:event_exitMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
             nuevo();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ProductosUsuarios principal = new ProductosUsuarios();
        principal.setVisible(true);
        this.setVisible(false);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        login principal = new login();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    
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
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud().setVisible(true);
            }
        });
    }
    
    void consultar(){
        
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        //Estableciendo conexión en mi base de datos.
        conexion objConexion= new conexion();
        //Try catch para el manejo de posibles errores.
          try {
            //Realizando consulta para traer todos los registros que esten en mi tabla usuario de mi base de datos sistema.
            ResultSet resultado = objConexion.consultarRegistros("SELECT * FROM registros");
            //Tomando todos los registros y guardandolo en un object para luego mostarlos en mi tabla del programa...
            while (resultado.next()) {
                System.out.println(resultado.getString("id"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("telefono"));
                System.out.println(resultado.getString("correo"));
                System.out.println(resultado.getString("contrasena"));
                System.out.println(resultado.getString("usuario"));
                Object[] oUsuario={resultado.getString("id"),resultado.getString("nombre"),resultado.getString("apellido"),resultado.getString("telefono"),resultado.getString("correo"),resultado.getString("contrasena"),resultado.getString("usuario")};
                modelo.addRow(oUsuario);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    
    }
     
    void modificar(){
           
        String nombre = txtNombre.getText();
        String apellido = txtApellido.getText();
        String email = txtCorreoElectronico.getText();
        String telefono = txttelefono.getText();
        String usuario = txtusuario.getText();
        String contrasena = txtcontrasena.getText();
        conexion objConexion= new conexion();
        //Recuperando los datos.

        int fila = datos.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(null,"Usuario no seleccionado");
        
        }else{
            int id = Integer.parseInt((String)datos.getValueAt(fila,0).toString());

        //Estableciendo mi sentencia DELETE para poder borrar los registros que contenga mi tabla usuario.
        String strSentenciaInsert= String.format("update registros set usuario ='"+usuario+"',contrasena='"+contrasena+"',correo='"+email+"',nombre='"+nombre+"',apellido='"+apellido+"',telefono='"+telefono+"' WHERE id = '"+id+"'");
        //Ejecutando sentencia...
        objConexion.ejecutarSentenciaMYSQL(strSentenciaInsert);
        JOptionPane.showMessageDialog(null,"Usuario modificado exitosamente");
        //Actualizando tabla para que cargue nuevamente los registros.
        this.consultar();
        //Limpiando mis txtFields.
        this.nuevo();
        }
    }
    
    void eliminar(){
        
//Estableciendo conexión con mi Base De Datos sistema.
        conexion objConexion= new conexion();
        //Recuperando los datos.

        int fila = datos.getSelectedRow();
        if (fila==-1){
            JOptionPane.showMessageDialog(null,"Usuario no seleccionado");

        }else{
            int id = Integer.parseInt((String)datos.getValueAt(fila,0).toString());

        //Estableciendo mi sentencia DELETE para poder borrar los registros que contenga mi tabla usuario.
        String strSentenciaInsert= String.format("DELETE FROM registros WHERE id = %d",id);
        //Ejecutando sentencia...
        objConexion.ejecutarSentenciaMYSQL(strSentenciaInsert);
        JOptionPane.showMessageDialog(null,"Usuario eliminado exitosamente");
        //Actualizando tabla para que cargue nuevamente los registros.
        this.consultar();
        this.nuevo();
        }
        }
    
    void nuevo(){

        txtNombre.setText("");
        txtApellido.setText("");
        txtCorreoElectronico.setText("");
        txttelefono.setText("");
        txtusuario.setText("");
        txtcontrasena.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Actualizar;
    private javax.swing.JButton Eliminar;
    private javax.swing.JTable datos;
    private javax.swing.JScrollPane datoss;
    private javax.swing.JLabel exit;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtcontrasena;
    private javax.swing.JTextField txttelefono;
    private javax.swing.JTextField txtusuario;
    // End of variables declaration//GEN-END:variables

}


