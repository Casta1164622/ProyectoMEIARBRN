import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author casta y caser
 */


public class registrosMenu extends javax.swing.JFrame {
  
    /**
     * Creates new form registrosMenu
     */
    public String nombreArchivo = "C:/MEIA/usuario.txt";
    public String rutaBinacle = "C:/MEIA/bitusuario.txt";
    public String rutadescbitUsuario = "C:/MEIA/desc_bitusuario.txt";
    public String rutadescUsuario = "C:/MEIA/desc_usuario.txt";
    
    public List<Users> listaRegistros = new ArrayList<>();
    public List<String> listaRegistrosMostrados = new ArrayList<>();
    public Users adminU = new Users();
    
    public List<Users> ConvertFileToList (String rutaArchivo) throws FileNotFoundException, IOException
    {
        FileReader leerFila = new FileReader(rutaArchivo);
        
        List<Users> resultList = new ArrayList<>();
        
        BufferedReader bufferedReader = new BufferedReader(leerFila);
        
        String linea = bufferedReader.readLine();
        
        while(linea != null)
        {
            Users usuario = new Users();
            usuario=usuario.StringToUser(linea);            
            resultList.add(usuario);  
            linea = bufferedReader.readLine();
        }
        return resultList;
    }
    
    public registrosMenu(Users adminUser) throws IOException {
        initComponents();
        listaRegistros = ConvertFileToList(nombreArchivo);
        DefaultListModel modeloListaRegistros = new DefaultListModel();
        for(int i = 0; i<listaRegistros.size();i++)
        {
            if(listaRegistros.get(i).getEstatus() != '0')
            {
                modeloListaRegistros.addElement(listaRegistros.get(i).UserPrint());
                listaRegistrosMostrados.add(listaRegistros.get(i).UserPrint());
            }
        }
        JlistRegistros.setModel(modeloListaRegistros);
        
        adminU = adminUser;
        lblName.setText(adminUser.getNombre()+" "+adminUser.getApellido());
    }
    private registrosMenu(){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtPassword2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtSearchUsuario = new javax.swing.JTextField();
        txtSearchNombre = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        btnBuscarUsuario = new javax.swing.JButton();
        btnBuscarNombre = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        JlistRegistros = new javax.swing.JList<>();
        canvas1 = new java.awt.Canvas();
        btnEditar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnAñadir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        btnRecargar = new javax.swing.JButton();

        txtPassword2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassword2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MENU REGISTROS (ADMIN)");

        jLabel2.setBackground(new java.awt.Color(255, 193, 112));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USUARIO");
        jLabel2.setOpaque(true);

        jLabel3.setBackground(new java.awt.Color(255, 193, 112));
        jLabel3.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("USUARIO");
        jLabel3.setOpaque(true);

        jLabel4.setBackground(new java.awt.Color(255, 193, 112));
        jLabel4.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("NOMBRE");
        jLabel4.setOpaque(true);

        lblName.setBackground(new java.awt.Color(255, 193, 112));
        lblName.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        lblName.setForeground(new java.awt.Color(0, 0, 0));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblName.setText("USUARIO: WILBERT (ADMIN)");
        lblName.setOpaque(true);

        jLabel7.setBackground(new java.awt.Color(255, 193, 112));
        jLabel7.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NOMBRE");
        jLabel7.setOpaque(true);

        jLabel8.setBackground(new java.awt.Color(255, 193, 112));
        jLabel8.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("APELLIDO");
        jLabel8.setOpaque(true);

        jLabel9.setBackground(new java.awt.Color(255, 193, 112));
        jLabel9.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("FECHA DE NACIMIENTO");
        jLabel9.setOpaque(true);

        jLabel10.setBackground(new java.awt.Color(255, 193, 112));
        jLabel10.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("CORREO");
        jLabel10.setOpaque(true);

        jLabel11.setBackground(new java.awt.Color(255, 193, 112));
        jLabel11.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("TELEFONO");
        jLabel11.setOpaque(true);

        btnBuscarUsuario.setBackground(new java.awt.Color(255, 204, 112));
        btnBuscarUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBuscarUsuario.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarUsuario.setText("BUSCAR");
        btnBuscarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarUsuarioActionPerformed(evt);
            }
        });

        btnBuscarNombre.setBackground(new java.awt.Color(255, 204, 112));
        btnBuscarNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnBuscarNombre.setForeground(new java.awt.Color(0, 0, 0));
        btnBuscarNombre.setText("BUSCAR");
        btnBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarNombreActionPerformed(evt);
            }
        });

        JlistRegistros.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        JlistRegistros.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "njghmuktj" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        JlistRegistros.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(JlistRegistros);

        btnEditar.setBackground(new java.awt.Color(255, 204, 112));
        btnEditar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(0, 0, 0));
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(255, 204, 112));
        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnAñadir.setBackground(new java.awt.Color(255, 204, 112));
        btnAñadir.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAñadir.setForeground(new java.awt.Color(0, 0, 0));
        btnAñadir.setText("AÑADIR");
        btnAñadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirActionPerformed(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(255, 204, 112));
        btnRegresar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRegresar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegresar.setText("REGRESAR");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        btnRecargar.setBackground(new java.awt.Color(255, 204, 112));
        btnRecargar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnRecargar.setForeground(new java.awt.Color(0, 0, 0));
        btnRecargar.setText("RECARGAR");
        btnRecargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRecargarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearchUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtSearchNombre)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnBuscarNombre, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(btnBuscarUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(btnRecargar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRecargar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtSearchUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(btnBuscarUsuario)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtSearchNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBuscarNombre))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8))
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassword2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassword2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassword2ActionPerformed

    private void btnBuscarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarUsuarioActionPerformed
        // TODO add your handling code here:
        if(!"".equals(txtSearchUsuario.getText()))
        {
            List<String> ListaResults = GetCoinciding(txtSearchUsuario.getText(),1);
            
            DefaultListModel modeloListaRegistros = new DefaultListModel();
            for(int i = 0; i<ListaResults.size();i++)
            {
                    modeloListaRegistros.addElement(ListaResults.get(i));
            }
            JlistRegistros.setModel(modeloListaRegistros);
        }
    }//GEN-LAST:event_btnBuscarUsuarioActionPerformed

    private void btnBuscarNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarNombreActionPerformed
        
        if(!"".equals(txtSearchNombre.getText()))
        {
            List<String> ListaResults = GetCoinciding(txtSearchNombre.getText(),2);
            
            DefaultListModel modeloListaRegistros = new DefaultListModel();
            for(int i = 0; i<ListaResults.size();i++)
            {
                    modeloListaRegistros.addElement(ListaResults.get(i));
            }
            JlistRegistros.setModel(modeloListaRegistros);
        }
        
    }//GEN-LAST:event_btnBuscarNombreActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        
        ManipulateFiles MPF = new ManipulateFiles();
        String SelUserString = JlistRegistros.getSelectedValue();
        int selIndex = listaRegistrosMostrados.indexOf(SelUserString);
        List<Users> users = new ArrayList<>();
        try
        {
            users = MPF.EnListFile(nombreArchivo);
            Users usuarioAEditar= users.get(selIndex);
            register registerFrame = new register('3', usuarioAEditar);
            registerFrame.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
            registerFrame.setAlwaysOnTop(false); // Para que se muestre por encima del otro JFrame
            registerFrame.setVisible(true);
            this.dispose();    
        } catch (IOException ex)
        {
            Logger.getLogger(registrosMenu.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParseException ex)
        {
            Logger.getLogger(registrosMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        ManipulateFiles MPF = new ManipulateFiles();
        String SelUserString = JlistRegistros.getSelectedValue();
        int selIndex = listaRegistrosMostrados.indexOf(SelUserString);
        List<Users> users = new ArrayList<>();
        
        try
        {
            users = MPF.EnListFile(nombreArchivo);
            Users usuarioAEliminar = users.get(selIndex);
            if(!usuarioAEliminar.getUsuario().equals(adminU.getUsuario()))
            {
                MPF.DeleteFromFiles(usuarioAEliminar,nombreArchivo,rutaBinacle,rutadescUsuario,rutadescbitUsuario,adminU);
                listaRegistros.get(selIndex).setEstatus('0');
                
                DefaultListModel modeloListaRegistros = new DefaultListModel();
                for(int i = 0; i<listaRegistros.size();i++)
                    {
                if(listaRegistros.get(i).getEstatus() != '0')
                {
                    modeloListaRegistros.addElement(listaRegistros.get(i).UserPrint());
                }
                    }
        JlistRegistros.setModel(modeloListaRegistros);
                
            }
        } catch (IOException ex)
        {
            Logger.getLogger(registrosMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirActionPerformed
        
       register registerFrame;
        try {
            registerFrame = new register('2', adminU);
            registerFrame.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
        registerFrame.setAlwaysOnTop(false); // Para que se muestre por encima del otro JFrame
        registerFrame.setVisible(true);
        this.dispose();
        } catch (ParseException ex) {
            Logger.getLogger(registrosMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnAñadirActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed

        menuPrincipal menuPrincipal = new menuPrincipal(adminU);
        menuPrincipal.setLocationRelativeTo(null); // Para mostrar en el centro de la pantalla
        menuPrincipal.setAlwaysOnTop(true); // Para que se muestre por encima del otro JFrame
        menuPrincipal.setVisible(true);
        this.dispose();
        
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnRecargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRecargarActionPerformed

        DefaultListModel modeloListaRegistros = new DefaultListModel();
                for(int i = 0; i<listaRegistros.size();i++)
                    {
                if(listaRegistros.get(i).getEstatus() != '0')
                {
                    modeloListaRegistros.addElement(listaRegistros.get(i).UserPrint());
                }
                    }
        JlistRegistros.setModel(modeloListaRegistros);
    }//GEN-LAST:event_btnRecargarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(registrosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(registrosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(registrosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(registrosMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new registrosMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> JlistRegistros;
    private javax.swing.JButton btnAñadir;
    private javax.swing.JButton btnBuscarNombre;
    private javax.swing.JButton btnBuscarUsuario;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRecargar;
    private javax.swing.JButton btnRegresar;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtPassword2;
    private javax.swing.JTextField txtSearchNombre;
    private javax.swing.JTextField txtSearchUsuario;
    // End of variables declaration//GEN-END:variables

    public List<String> GetCoinciding (String search, int searchType)
    {
        List<String> resultLists = new ArrayList<>();
        for(int i = 0; i < listaRegistros.size();i++)
        {
            switch(searchType)
            {
                case 1:
                    if(listaRegistros.get(i).getUsuario().equals(search) && listaRegistros.get(i).getEstatus() != '0')
                    {
                        resultLists.add(listaRegistros.get(i).UserPrint());
                    }
                    break;
                case 2:
                    if(listaRegistros.get(i).getNombre().equals(search) && listaRegistros.get(i).getEstatus() != '0')
                    {
                        resultLists.add(listaRegistros.get(i).UserPrint());
                    }
                    break;
            }
        }
        return resultLists;
    }
}
