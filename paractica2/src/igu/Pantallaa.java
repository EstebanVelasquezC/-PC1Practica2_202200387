
package igu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.table.DefaultTableModel;
import logica.venta;

public final class Pantallaa extends javax.swing.JFrame {
    String productos[] = {"", "Pizza", "Pasta", "Hamburguesa", "Coca-Cola"};
    double precios[] = {0, 45.00, 50.00, 40.00, 7.00};
    String vehiculo[] = {"Motocicleta 1", "Motocicleta 2", "Motocicleta 3"};
    double precio = 0;
    int cantidad = 0;
    int distancia = 0;
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel model = new DefaultTableModel();
    ArrayList<venta> listaVentas = new ArrayList<venta>();
     private final Timer animacion1;
    private final Timer animacion2;
    private final Timer animacion3;
   

    public Pantallaa() {
        initComponents();
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel(productos);
        DefaultComboBoxModel comboModelm = new DefaultComboBoxModel(vehiculo);
        cboProducto.setModel(comboModel);
        cbomoto.setModel(comboModelm);
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");
        actualizarTabla();
        cbomoto.setModel(comboModelm);
        model.addColumn("Vehiculo");
        model.addColumn("Distancia");
        model.addColumn("Monto");
        model.addColumn("Creacion");
        model.addColumn("Entrega");
        actualizartabla(); 
          animacion1 = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moverMoto1();
            }
        });

        animacion2 = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moverMoto2();
            }
        });

        animacion3 = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moverMoto3();
            }
        });

        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblproductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spndistancia = new javax.swing.JSpinner();
        cbomoto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lbltotal = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        spncantidad = new javax.swing.JSpinner();
        cboProducto = new javax.swing.JComboBox<>();
        jbeliminar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jbEnviar1 = new javax.swing.JButton();
        jbEnviar2 = new javax.swing.JButton();
        jbEnviar3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jbMoto2 = new javax.swing.JLabel();
        jbMoto3 = new javax.swing.JLabel();
        jbMoto1 = new javax.swing.JLabel();
        jldistancia1 = new javax.swing.JLabel();
        jldistancia2 = new javax.swing.JLabel();
        jldistancia3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtbHistorial = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Producto");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Cantidad");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblproductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblproductos);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Vehiculo");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Distancia");

        spndistancia.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spndistancia.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));

        cbomoto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbomoto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbomoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbomotoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Total");

        jButton1.setText("Confirmar pedido");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lbltotal.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbltotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbltotal.setText("Q.00.00");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("----Pedido---");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Valor");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Precio");

        lblPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPrecio.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblPrecio.setText("Q.00.00");

        lblImporte.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblImporte.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblImporte.setText("Q.00.00");

        spncantidad.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        spncantidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        spncantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spncantidadStateChanged(evt);
            }
        });

        cboProducto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });

        jbeliminar.setText("Eliminar");
        jbeliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbeliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(spndistancia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbomoto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(lbltotal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(72, 72, 72))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 514, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregar)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(spncantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(51, 51, 51)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblImporte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addComponent(jbeliminar)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(cboProducto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)))
                    .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(jLabel4)
                        .addComponent(lblImporte))
                    .addComponent(spncantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(jbeliminar))
                .addGap(20, 20, 20)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(lbltotal))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbomoto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(spndistancia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))))
                .addContainerGap(83, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Restaurante", jPanel1);

        jbEnviar1.setText("Enviar");
        jbEnviar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviar1ActionPerformed(evt);
            }
        });

        jbEnviar2.setText("Enviar");
        jbEnviar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviar2ActionPerformed(evt);
            }
        });

        jbEnviar3.setText("Enviar");
        jbEnviar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEnviar3ActionPerformed(evt);
            }
        });

        jLabel6.setText("Motocicleta 1");

        jLabel10.setText("Motocicleta 2");

        jLabel11.setText("Motocicleta 3");

        jbMoto2.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jbMoto2.setText("🏍");

        jbMoto3.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jbMoto3.setText("🏍");

        jbMoto1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jbMoto1.setText("🏍");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jldistancia2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                                .addComponent(jbEnviar1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jldistancia1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jbEnviar2)
                            .addComponent(jbEnviar3)))
                    .addComponent(jldistancia3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbMoto1)
                    .addComponent(jbMoto2)
                    .addComponent(jbMoto3))
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jldistancia1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jbEnviar1))
                    .addComponent(jbMoto1))
                .addGap(39, 39, 39)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jldistancia2, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEnviar2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                        .addComponent(jLabel11))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jbMoto2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jldistancia3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbEnviar3))
                    .addComponent(jbMoto3))
                .addGap(80, 80, 80))
        );

        jTabbedPane1.addTab("Delivery", jPanel2);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("Historial");

        jtbHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jtbHistorial);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 517, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Historial", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
    venta ventas = new venta();
        ventas.setId(cboProducto.getSelectedIndex());
        ventas.setDescripcion(cboProducto.getSelectedItem().toString());
        ventas.setPrecio(precio);
        ventas.setCantidad(cantidad);
        ventas.setValor(precio * cantidad);
        ventas.setVehiculo((String) cbomoto.getSelectedItem());
        ventas.setDistancia(distancia);
        if (!buscarVenta(ventas)) {
            listaVentas.add(ventas);
        }
        actualizarTabla();
        borrarVenta();
    }//GEN-LAST:event_btnAgregarActionPerformed

    public boolean buscarVenta(venta nueva) {
        for (venta v : listaVentas) {
            if (v.getId() == nueva.getId()) {
                int nuevaCantidad = v.getCantidad() + nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setValor(v.getPrecio() * nuevaCantidad);
                return true;
            }
        }
        return false;
    }
    public void borrarVenta(){
        precio = 0;
        cantidad = 1;
        cboProducto.setSelectedIndex(0);
        spncantidad.setValue(1);
        calcularPrecio();
    }
    
    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
    calcularPrecio();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void spncantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spncantidadStateChanged
    calcularPrecio();
    }//GEN-LAST:event_spncantidadStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       // O // Obtener la fecha y hora actual
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String fechaHora = dateFormat.format(new Date());

    // Obtener el vehículo seleccionado y la distancia
    String vehiculoSeleccionado = cbomoto.getSelectedItem().toString(); // Corregido
    int distanciaSeleccionada = (int) spndistancia.getValue();

    // Obtener el total actual
    double total = 0;
    for (venta v : listaVentas) {
        total += v.getValor();
    }

    // Agregar la información a la tabla
    Object[] rowData = new Object[5];
    rowData[0] = vehiculoSeleccionado;
    rowData[1] = distanciaSeleccionada;
    rowData[2] = aMoneda(total);
    rowData[3] = fechaHora;
    rowData[4] = "";  // Aquí debes establecer la lógica para la fecha de entrega
    model.addRow(rowData);

    // Limpiar la lista de ventas y actualizar la tabla de productos
    listaVentas.clear();
    actualizarTabla();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbomotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbomotoActionPerformed

    }//GEN-LAST:event_cbomotoActionPerformed

    private void jbeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbeliminarActionPerformed
        int selectedRow = tblproductos.getSelectedRow();

        if (selectedRow >= 0) {
            // Obtener la fila seleccionada
            venta ventaSeleccionada = listaVentas.get(selectedRow);

            if (ventaSeleccionada.getCantidad() == 1) {
                // Si la cantidad es 1, eliminar la fila completa
                listaVentas.remove(selectedRow);
            } else {
                // Si la cantidad es mayor que 1, mostrar el cuadro de diálogo
                String cantidadAEliminar = JOptionPane.showInputDialog("Ingrese la cantidad a eliminar:");

                if (cantidadAEliminar != null) {
                    try {
                        int cantidadEliminar = Integer.parseInt(cantidadAEliminar);

                        if (cantidadEliminar > 0 && cantidadEliminar <= ventaSeleccionada.getCantidad()) {
                            // Reducir la cantidad y actualizar el total
                            ventaSeleccionada.setCantidad(ventaSeleccionada.getCantidad() - cantidadEliminar);
                            ventaSeleccionada.setValor(ventaSeleccionada.getPrecio() * ventaSeleccionada.getCantidad());
                        } else {
                            JOptionPane.showMessageDialog(this, "Cantidad no válida. Ingrese un valor entre 1 y " + ventaSeleccionada.getCantidad() + ".");
                        }

                        // Actualizar la tabla
                        actualizarTabla();
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(this, "Ingrese una cantidad válida (número entero).");
                    }
                }
            }

            // Actualizar la tabla
            actualizarTabla();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona una fila para modificar o eliminar.");
        }
    }//GEN-LAST:event_jbeliminarActionPerformed

    private void jbEnviar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviar1ActionPerformed
   int distanciaSeleccionada = (int) spndistancia.getValue();
        int velocidadAnimacion = calcularVelocidad(distanciaSeleccionada);
        animacion1.setDelay(velocidadAnimacion);
        animacion1.start();

        // Mostrar la distancia en jldistancia1
        jldistancia1.setText("Distancia: " + distanciaSeleccionada + " km");
    }//GEN-LAST:event_jbEnviar1ActionPerformed

    private void jbEnviar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviar2ActionPerformed
      int distanciaSeleccionada = (int) spndistancia.getValue();
        int velocidadAnimacion = calcularVelocidad(distanciaSeleccionada);
        animacion2.setDelay(velocidadAnimacion);
        animacion2.start();

       
        jldistancia2.setText("Distancia: " + distanciaSeleccionada + " km");
    }//GEN-LAST:event_jbEnviar2ActionPerformed

    private void jbEnviar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEnviar3ActionPerformed
        int distanciaSeleccionada = (int) spndistancia.getValue();
        int velocidadAnimacion = calcularVelocidad(distanciaSeleccionada);
        animacion3.setDelay(velocidadAnimacion);
        animacion3.start();

        
        jldistancia3.setText("Distancia: " + distanciaSeleccionada + " km");
    }//GEN-LAST:event_jbEnviar3ActionPerformed

   public void calcularPrecio() {
        precio = precios[cboProducto.getSelectedIndex()];
        cantidad = Integer.parseInt(spncantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio * cantidad));
    }
   
   public String aMoneda(double precio) {
        return "Q" + Math.round(precio * 100.0) / 100.0 + " GTQ";
    }
   public void actualizarTabla() {
        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }
        double total = 0;
        for (venta v : listaVentas) {
            Object x[] = new Object[4];
            x[0] = v.getDescripcion();
            x[1] = aMoneda(v.getPrecio());
            x[2] = v.getCantidad();
            x[3] = aMoneda(v.getValor());
            total += v.getValor();
            modelo.addRow(x);
        }
        lbltotal.setText(aMoneda(total));
        tblproductos.setModel(modelo);
    }
    public void actualizartabla() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
        double total = 0;

        for (venta v : listaVentas) {
            Object x[] = new Object[5];
            x[0] = v.getVehiculo();
            x[1] = v.getDistancia();
            x[2] = aMoneda(v.getValor());
            x[3] = "";
            x[4] = "";
            model.addRow(x);
        }
        lbltotal.setText(aMoneda(total));
        jtbHistorial.setModel(model);
    }
      private void moverMoto1() {
        int x = jbMoto1.getX();
        if (x < 500) {
            jbMoto1.setLocation(x + 1, jbMoto1.getY());
        } else {
            // Llegó al destino, detener la animación
            animacion1.stop();
        }
    }

    private void moverMoto2() {
        int x = jbMoto2.getX();
        if (x < 500) {
            jbMoto2.setLocation(x + 1, jbMoto2.getY());
        } else {
            // Llegó al destino, detener la animación
            animacion2.stop();
        }
    }

    private void moverMoto3() {
        int x = jbMoto3.getX();
        if (x < 500) {
            jbMoto3.setLocation(x + 1, jbMoto3.getY());
        } else {
            // Llegó al destino, detener la animación
            animacion3.stop();
        }
    }

    private int calcularVelocidad(int distancia) {
        int velocidadMinima = 10; // La más rápida (distancia corta)
        int velocidadMaxima = 100; // La más lenta (distancia larga)

        int velocidad = velocidadMinima + (distancia - 1) * (velocidadMaxima - velocidadMinima) / 9;

        return velocidad;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JComboBox<String> cbomoto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton jbEnviar1;
    private javax.swing.JButton jbEnviar2;
    private javax.swing.JButton jbEnviar3;
    private javax.swing.JLabel jbMoto1;
    private javax.swing.JLabel jbMoto2;
    private javax.swing.JLabel jbMoto3;
    private javax.swing.JButton jbeliminar;
    private javax.swing.JLabel jldistancia1;
    private javax.swing.JLabel jldistancia2;
    private javax.swing.JLabel jldistancia3;
    private javax.swing.JTable jtbHistorial;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lbltotal;
    private javax.swing.JSpinner spncantidad;
    private javax.swing.JSpinner spndistancia;
    private javax.swing.JTable tblproductos;
    // End of variables declaration//GEN-END:variables

   
  
}
