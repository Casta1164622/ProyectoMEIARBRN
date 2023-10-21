

/**
 * @author cesar y castq
 */

public class register extends javax.swing.JFrame {

    public register() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFileChooser1 = new javax.swing.JFileChooser();
        txtUsuario = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        btnFoto = new javax.swing.JButton();
        lblImagen = new javax.swing.JLabel();
        btnRegistrarse = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        lblUsuario2 = new javax.swing.JLabel();
        lblUsuario3 = new javax.swing.JLabel();
        lblUsuario4 = new javax.swing.JLabel();
        lblUsuario5 = new javax.swing.JLabel();
        lblUsuario6 = new javax.swing.JLabel();
        lblUsuario7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        btnFoto.setBackground(new java.awt.Color(255, 204, 112));
        btnFoto.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnFoto.setForeground(new java.awt.Color(0, 0, 0));
        btnFoto.setText("SELECCIONAR IMAGEN");
        btnFoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFotoActionPerformed(evt);
            }
        });

        btnRegistrarse.setBackground(new java.awt.Color(255, 204, 112));
        btnRegistrarse.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnRegistrarse.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrarse.setText("ENVIAR");
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        lblUsuario.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("USUARIO");
        lblUsuario.setOpaque(true);

        lblUsuario2.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario2.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario2.setText("NOMBRE");
        lblUsuario2.setOpaque(true);

        lblUsuario3.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario3.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario3.setText("APELLIDO");
        lblUsuario3.setOpaque(true);

        lblUsuario4.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario4.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario4.setText("PASSWORD");
        lblUsuario4.setOpaque(true);

        lblUsuario5.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario5.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario5.setText("FECHA DE NACIMIENTO");
        lblUsuario5.setOpaque(true);

        lblUsuario6.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario6.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario6.setText("CORREO ELECTRONICO");
        lblUsuario6.setOpaque(true);

        lblUsuario7.setBackground(new java.awt.Color(255, 193, 112));
        lblUsuario7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblUsuario7.setForeground(new java.awt.Color(0, 0, 0));
        lblUsuario7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario7.setText("TELEFONO");
        lblUsuario7.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre)
                                    .addComponent(txtUsuario)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblUsuario4, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                                        .addComponent(lblUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtApellido)
                                    .addComponent(txtPassword)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(4, 4, 4)
                                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblUsuario6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtCorreo))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(lblUsuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(20, 20, 20))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(lblUsuario2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblUsuario3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(lblUsuario4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addComponent(lblUsuario5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(lblUsuario6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUsuario7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFoto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnFotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFotoActionPerformed
       
    }//GEN-LAST:event_btnFotoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFoto;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JLabel lblUsuario4;
    private javax.swing.JLabel lblUsuario5;
    private javax.swing.JLabel lblUsuario6;
    private javax.swing.JLabel lblUsuario7;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
