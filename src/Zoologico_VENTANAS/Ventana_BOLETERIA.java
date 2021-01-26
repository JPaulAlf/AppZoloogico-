
package Zoologico_VENTANAS;

import Zoologico_CODIGO.*;
import java.awt.Dimension;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class Ventana_BOLETERIA extends javax.swing.JFrame {
             Zoologico zoo= Zoologico.getInstanciaZoo();
            Area area= Area.getInstancia();
            Cliente  cliente;
            
         AREAS_ZOOLOGICO areas[]= AREAS_ZOOLOGICO.values();
         COMBOS_OPCIONES combos[]=COMBOS_OPCIONES.values();
         String combosAux[]={"ENTRADA_REGULAR_","COMBO_1_CON_GOLOSINAS_"};
         TIPO_MONEDA moneda[]=TIPO_MONEDA.values();
         TIPO_TARJETA tipoTarjeta[]=TIPO_TARJETA.values();
         String entradas[]={"1 entrada","2 entradas","3 entradas"};
         
         int totalVentaAuxPrincipal=0;
         
         // contadores de cliente, 
         int numCliente1=0;
         int numCliente2=0;
         int numCliente3=0;
         int numCliente4=0;
         int numCliente5=0;
         
         int contCliente=0;

    public Ventana_BOLETERIA() {
         initComponents();
         this.setSize(new Dimension(1300,800));
        this.setMinimumSize(new Dimension(1300,800));
        this.setMaximumSize(new Dimension(1300,800));
        this.setLocationRelativeTo(null);
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        
         // cliente = new Cliente();
            this.vntInterna.setVisible(false);
            this.btoLIMPIAR.setVisible(false);
            this.txtSalidaDeDatosConsola.setVisible(false);
            this.txtSCROLL.setVisible(false);
            
                 this.cbxAreaZoologico.removeAllItems();
                 this.cbxCombosZoologico.removeAllItems();
                 this.cbxTipoMoneda.removeAllItems();
                 this.cbxTipoTarjeta.removeAllItems();
                 this.cbxCantidadDEentradas.removeAllItems();
                 
                 for(int i=0; i< areas.length;i++){
                      this.cbxAreaZoologico.addItem(areas[i].toString());
                 }
//                 for(int j=0; j< this.combos.length;j++){
//                     this.cbxCombosZoologico.addItem(combos[j].toString());
//                 }

                 for(int x=0; x< this.moneda.length;x++){
                     this.cbxTipoMoneda.addItem(moneda[x].toString());
                 }
                 for(int y=0; y< this.tipoTarjeta.length;y++){
                      this.cbxTipoTarjeta.addItem(tipoTarjeta[y].toString());
                 }
                 for(int z=0;z<this.entradas.length; z++){
                     this.cbxCantidadDEentradas.addItem(entradas[z]);
                 }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        vntInterna = new javax.swing.JInternalFrame();
        txtApellido2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtApellido1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtCorreoElectronico = new javax.swing.JTextField();
        txtCVV = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtNacionalidad = new javax.swing.JTextField();
        cbxCombosZoologico = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtNumeroTarjeta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbxTipoTarjeta = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        cbxTipoMoneda = new javax.swing.JComboBox<>();
        cbxAreaZoologico = new javax.swing.JComboBox<>();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtFechaVencimientoANNO = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        cbxCantidadDEentradas = new javax.swing.JComboBox<>();
        btoInformacion = new javax.swing.JButton();
        btoComprar1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtSalidaInformacionCompra = new javax.swing.JTextArea();
        txtFechaVencimientoMES = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtSCROLL = new javax.swing.JScrollPane();
        txtSalidaDeDatosConsola = new javax.swing.JTextArea();
        btoLIMPIAR = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnOPCIONES = new javax.swing.JMenu();
        mnConsultarPreciosAreas_ = new javax.swing.JMenuItem();
        mnReporteEspaciosDisponibles = new javax.swing.JMenu();
        mnReporteEspaciosDisponibles_ = new javax.swing.JMenuItem();
        mnReporteEspaciosOcupados_ = new javax.swing.JMenuItem();
        mnRealizarCompra = new javax.swing.JMenuItem();
        mnModificarVentaEntrada_ = new javax.swing.JMenuItem();
        mnCancelarVentaEnttrada_ = new javax.swing.JMenuItem();
        mnReporteEntrada_ = new javax.swing.JMenuItem();
        mnSalirSistema_ = new javax.swing.JMenuItem();
        mnBtonInicio = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        vntInterna.setClosable(true);
        vntInterna.setTitle("Datos cliente: ");
        vntInterna.setToolTipText("");
        vntInterna.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        vntInterna.setVisible(true);
        vntInterna.getContentPane().setLayout(null);
        vntInterna.getContentPane().add(txtApellido2);
        txtApellido2.setBounds(840, 30, 260, 30);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Combos:");
        vntInterna.getContentPane().add(jLabel2);
        jLabel2.setBounds(710, 310, 70, 30);

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Appellido 1:");
        vntInterna.getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 30, 80, 30);
        vntInterna.getContentPane().add(txtApellido1);
        txtApellido1.setBounds(460, 30, 260, 30);

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Nombre");
        vntInterna.getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 30, 60, 30);
        vntInterna.getContentPane().add(txtNombre);
        txtNombre.setBounds(80, 30, 260, 30);

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Correo @ :");
        vntInterna.getContentPane().add(jLabel5);
        jLabel5.setBounds(10, 130, 70, 30);
        vntInterna.getContentPane().add(txtCorreoElectronico);
        txtCorreoElectronico.setBounds(80, 130, 390, 30);
        vntInterna.getContentPane().add(txtCVV);
        txtCVV.setBounds(1000, 220, 100, 30);

        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Apellido 2:");
        vntInterna.getContentPane().add(jLabel6);
        jLabel6.setBounds(770, 30, 70, 30);
        vntInterna.getContentPane().add(txtCedula);
        txtCedula.setBounds(80, 80, 260, 30);

        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Cedula:");
        vntInterna.getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 80, 60, 30);

        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Telefono:");
        vntInterna.getContentPane().add(jLabel8);
        jLabel8.setBounds(390, 80, 60, 30);
        vntInterna.getContentPane().add(txtTelefono);
        txtTelefono.setBounds(460, 80, 260, 30);

        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Nacionalidad:");
        vntInterna.getContentPane().add(jLabel9);
        jLabel9.setBounds(750, 80, 90, 30);
        vntInterna.getContentPane().add(txtNacionalidad);
        txtNacionalidad.setBounds(840, 80, 260, 30);

        cbxCombosZoologico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vntInterna.getContentPane().add(cbxCombosZoologico);
        cbxCombosZoologico.setBounds(780, 310, 280, 30);

        jLabel11.setForeground(new java.awt.Color(0, 0, 0));
        jLabel11.setText("Edad: ");
        vntInterna.getContentPane().add(jLabel11);
        jLabel11.setBounds(500, 130, 60, 30);
        vntInterna.getContentPane().add(txtEdad);
        txtEdad.setBounds(560, 130, 110, 30);

        jLabel15.setForeground(new java.awt.Color(0, 0, 0));
        jLabel15.setText("Numero Tarjeta:");
        vntInterna.getContentPane().add(jLabel15);
        jLabel15.setBounds(360, 220, 100, 30);
        vntInterna.getContentPane().add(txtNumeroTarjeta);
        txtNumeroTarjeta.setBounds(460, 220, 260, 30);

        jLabel1.setText("Compra de entrdas:");
        vntInterna.getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 280, 260, 20);

        jLabel10.setText("Informacion cliente:");
        vntInterna.getContentPane().add(jLabel10);
        jLabel10.setBounds(30, 4, 260, 20);

        jLabel16.setForeground(new java.awt.Color(0, 0, 0));
        jLabel16.setText("Año:");
        vntInterna.getContentPane().add(jLabel16);
        jLabel16.setBounds(900, 200, 40, 20);

        jLabel17.setForeground(new java.awt.Color(0, 0, 0));
        jLabel17.setText("Fecha vencimeinto:");
        vntInterna.getContentPane().add(jLabel17);
        jLabel17.setBounds(730, 220, 120, 30);

        jLabel12.setText("Informacion tarjeta:");
        vntInterna.getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 190, 260, 20);

        cbxTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vntInterna.getContentPane().add(cbxTipoTarjeta);
        cbxTipoTarjeta.setBounds(100, 220, 220, 30);

        jLabel14.setForeground(new java.awt.Color(0, 0, 0));
        jLabel14.setText("Tipo de moneda: ");
        vntInterna.getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 310, 120, 30);

        cbxTipoMoneda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vntInterna.getContentPane().add(cbxTipoMoneda);
        cbxTipoMoneda.setBounds(120, 310, 180, 30);

        cbxAreaZoologico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbxAreaZoologico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxAreaZoologicoItemStateChanged(evt);
            }
        });
        vntInterna.getContentPane().add(cbxAreaZoologico);
        cbxAreaZoologico.setBounds(370, 310, 280, 30);

        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Area:");
        vntInterna.getContentPane().add(jLabel18);
        jLabel18.setBounds(330, 310, 40, 30);

        jLabel19.setForeground(new java.awt.Color(0, 0, 0));
        jLabel19.setText("Tipo tarjeta: ");
        vntInterna.getContentPane().add(jLabel19);
        jLabel19.setBounds(10, 220, 90, 30);
        vntInterna.getContentPane().add(txtFechaVencimientoANNO);
        txtFechaVencimientoANNO.setBounds(900, 220, 50, 30);

        jLabel20.setForeground(new java.awt.Color(0, 0, 0));
        jLabel20.setText("Cantidad de entradas a comprar:");
        vntInterna.getContentPane().add(jLabel20);
        jLabel20.setBounds(10, 370, 210, 30);

        cbxCantidadDEentradas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        vntInterna.getContentPane().add(cbxCantidadDEentradas);
        cbxCantidadDEentradas.setBounds(210, 370, 100, 30);

        btoInformacion.setText("Informacion");
        btoInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoInformacionActionPerformed(evt);
            }
        });
        vntInterna.getContentPane().add(btoInformacion);
        btoInformacion.setBounds(110, 460, 170, 40);

        btoComprar1.setText("Comprar");
        btoComprar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoComprar1ActionPerformed(evt);
            }
        });
        vntInterna.getContentPane().add(btoComprar1);
        btoComprar1.setBounds(110, 520, 170, 40);

        txtSalidaInformacionCompra.setEditable(false);
        txtSalidaInformacionCompra.setColumns(20);
        txtSalidaInformacionCompra.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtSalidaInformacionCompra.setRows(5);
        jScrollPane1.setViewportView(txtSalidaInformacionCompra);

        vntInterna.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(350, 350, 740, 320);
        vntInterna.getContentPane().add(txtFechaVencimientoMES);
        txtFechaVencimientoMES.setBounds(850, 220, 50, 30);

        jLabel21.setForeground(new java.awt.Color(0, 0, 0));
        jLabel21.setText("CVV:");
        vntInterna.getContentPane().add(jLabel21);
        jLabel21.setBounds(960, 220, 40, 30);

        jLabel22.setForeground(new java.awt.Color(0, 0, 0));
        jLabel22.setText("Mes:");
        vntInterna.getContentPane().add(jLabel22);
        jLabel22.setBounds(850, 200, 40, 20);

        getContentPane().add(vntInterna);
        vntInterna.setBounds(90, 10, 1130, 710);

        txtSalidaDeDatosConsola.setEditable(false);
        txtSalidaDeDatosConsola.setColumns(20);
        txtSalidaDeDatosConsola.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        txtSalidaDeDatosConsola.setRows(5);
        txtSCROLL.setViewportView(txtSalidaDeDatosConsola);

        getContentPane().add(txtSCROLL);
        txtSCROLL.setBounds(210, 70, 820, 490);

        btoLIMPIAR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btoLIMPIAR.setText("LIMPIAR");
        btoLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoLIMPIARActionPerformed(evt);
            }
        });
        getContentPane().add(btoLIMPIAR);
        btoLIMPIAR.setBounds(1040, 70, 100, 40);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_PROYECTO/Imagen_BOLETERIA.jpg"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(-1040, -70, 2360, 1100);

        jMenuBar1.setPreferredSize(new java.awt.Dimension(400, 50));

        mnOPCIONES.setText("OPCIONES DISPONIBLES");
        mnOPCIONES.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnOPCIONES.setPreferredSize(new java.awt.Dimension(300, 25));

        mnConsultarPreciosAreas_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnConsultarPreciosAreas_.setText("1.- Consultar precio de áreas");
        mnConsultarPreciosAreas_.setPreferredSize(new java.awt.Dimension(400, 40));
        mnConsultarPreciosAreas_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnConsultarPreciosAreas_ActionPerformed(evt);
            }
        });
        mnOPCIONES.add(mnConsultarPreciosAreas_);

        mnReporteEspaciosDisponibles.setText("2.- Realizar venta de entrada");
        mnReporteEspaciosDisponibles.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        mnReporteEspaciosDisponibles_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnReporteEspaciosDisponibles_.setText("1.-Reportar espacios por área disponibles");
        mnReporteEspaciosDisponibles_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReporteEspaciosDisponibles_ActionPerformed(evt);
            }
        });
        mnReporteEspaciosDisponibles.add(mnReporteEspaciosDisponibles_);

        mnReporteEspaciosOcupados_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnReporteEspaciosOcupados_.setText("2.-Reportar espacios por área ocupados.");
        mnReporteEspaciosOcupados_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReporteEspaciosOcupados_ActionPerformed(evt);
            }
        });
        mnReporteEspaciosDisponibles.add(mnReporteEspaciosOcupados_);

        mnRealizarCompra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnRealizarCompra.setText("3.-Realizar Compra");
        mnRealizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnRealizarCompraActionPerformed(evt);
            }
        });
        mnReporteEspaciosDisponibles.add(mnRealizarCompra);

        mnOPCIONES.add(mnReporteEspaciosDisponibles);

        mnModificarVentaEntrada_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnModificarVentaEntrada_.setText("3.- Modificar venta de entrada");
        mnModificarVentaEntrada_.setPreferredSize(new java.awt.Dimension(181, 40));
        mnModificarVentaEntrada_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnModificarVentaEntrada_ActionPerformed(evt);
            }
        });
        mnOPCIONES.add(mnModificarVentaEntrada_);

        mnCancelarVentaEnttrada_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnCancelarVentaEnttrada_.setText("4.- Cancelar venta de entrada");
        mnCancelarVentaEnttrada_.setPreferredSize(new java.awt.Dimension(181, 40));
        mnCancelarVentaEnttrada_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnCancelarVentaEnttrada_ActionPerformed(evt);
            }
        });
        mnOPCIONES.add(mnCancelarVentaEnttrada_);

        mnReporteEntrada_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnReporteEntrada_.setText("5.- Reporte de entrada");
        mnReporteEntrada_.setPreferredSize(new java.awt.Dimension(181, 40));
        mnReporteEntrada_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReporteEntrada_ActionPerformed(evt);
            }
        });
        mnOPCIONES.add(mnReporteEntrada_);

        mnSalirSistema_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnSalirSistema_.setText("6.- Salir del sistema");
        mnSalirSistema_.setPreferredSize(new java.awt.Dimension(181, 40));
        mnSalirSistema_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnSalirSistema_ActionPerformed(evt);
            }
        });
        mnOPCIONES.add(mnSalirSistema_);

        jMenuBar1.add(mnOPCIONES);

        mnBtonInicio.setText("MENU INICIO");
        mnBtonInicio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnBtonInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnBtonInicioMouseClicked(evt);
            }
        });
        jMenuBar1.add(mnBtonInicio);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    
    private void mnConsultarPreciosAreas_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnConsultarPreciosAreas_ActionPerformed
        //Objetos para seleccionar datos y asiganar precio
      JComboBox combo = new JComboBox(areas);
      JLabel txt = new JLabel();
      JPanel panel = new JPanel();
      panel.add(new JLabel("Areas: "));
      panel.add(combo);
      panel.add(Box.createHorizontalStrut(15)); 
      // Agrego las estructuras pasadas(MyPanel) a una ventna JOption, para hacerla emergente y lograr cerrarla al click
      int emergente = JOptionPane.showConfirmDialog( null, panel, "Seleccione area: ", JOptionPane.OK_CANCEL_OPTION );
      // Llamo a lo que deso hacer, instancia y metodo, en este caso
      
      AREAS_ZOOLOGICO seleccion= areas [ combo.getSelectedIndex() ] ;
       int dato= combo.getSelectedIndex();
        System.out.println(dato);//*******************************************
        if(emergente==0){
             if(combo.getSelectedIndex()==0){
                 int precio = area.getPrecioAreaAves();
                 System.out.println(precio);//*******************************************
                 String pre= Integer.toString(precio);
                 System.out.println(pre); //*******************************************
                 txt.setText("Precio del area seleccionada: "+pre);
                 JOptionPane.showMessageDialog(null, txt);
             }else if(dato==1){
                 int precio = area.getPrecioAreaAcuatica();
                 System.out.println(precio);//*******************************************
                 String pre= Integer.toString(precio);
                 System.out.println(pre);//*******************************************
                 txt.setText("Precio del area seleccionada: "+pre);
                 JOptionPane.showMessageDialog(null, txt);
             }else if(dato==2){
                 int precio = area.getPrecioAreaSalvajes();
                 String pre= Integer.toString(precio);
                 System.out.println(pre);//*******************************************
                 txt.setText("Precio del area seleccionada:  "+pre);
                 JOptionPane.showMessageDialog(null, txt);
             }else if(dato==3){
                 int precio = area.getPrecioAreaComicos();
                 String pre= Integer.toString(precio);
                 System.out.println(pre);//*******************************************
                 txt.setText("Precio del area seleccionada: "+pre);
                 JOptionPane.showMessageDialog(null, txt);
             }else if(dato==4){
                 int precio = area.getPrecioAreaFosiles();
                 String pre= Integer.toString(precio);
                 System.out.println(pre);//*******************************************
                 txt.setText("Precio del area seleccionada: "+pre);
                 JOptionPane.showMessageDialog(null, txt);
             }
       // }else{
            
          
       }
     
    }//GEN-LAST:event_mnConsultarPreciosAreas_ActionPerformed
// TERMINADO
    private void mnModificarVentaEntrada_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnModificarVentaEntrada_ActionPerformed
  String areas[]={ "AREA_DE_AVES_","AREA_ACUATICA_","AREA_DE_ANIMALES_SALVAJES_","AREA_ANIMALES_COMICOS_","FOSILES_"};
  String opciones[]={"MODIFICAR_AREA","MODIFICAR_COMBO"};  
  String combos[]={"ENTRADA_REGULAR_","COMBO_1_CON_GOLOSINAS_","COMBO_2_CON_GUIA_"};
  String entradasCant[]={"1 entrada","2 entradas","3 entradas"};
  
        int totalVentaAux;
  
  try{
      JComboBox combo = new JComboBox(areas);
      JTextField Ncliente = new JTextField(9);
      JPanel panel = new JPanel();
      panel.add(new JLabel("Areas:"));
      panel.add(combo);
      panel.add(Box.createHorizontalStrut(15)); 
      panel.add(new JLabel("No.Cliente:"));
      panel.add(Ncliente); 
      int emergente = JOptionPane.showConfirmDialog( null, panel, "Ingrese area y numero de cliente",  JOptionPane.OK_CANCEL_OPTION  ); 
      int areap= combo.getSelectedIndex();
      int numCliente= Integer.parseInt(Ncliente.getText());     
      // Ventana #1  ****PIDE TIPO DE AREA Y NUMERO DE CLIENTE A BUSCAR
      
       if(zoo.verificaCliente(areap, numCliente)) { // verifica antes de seguir si el usuario existe
           
        if(emergente==0){    
      JComboBox cbxOpciones = new JComboBox(opciones);
      JPanel panel2 = new JPanel();
      panel2.add(new JLabel("Areas:"));
      panel2.add(cbxOpciones);
      panel2.add(Box.createHorizontalStrut(15)); 
      int emergente2 = JOptionPane.showConfirmDialog( null, panel2, "Seleccione modificacion a realizar: ", JOptionPane.OK_CANCEL_OPTION ); 
      // Ventana #2    *****PIDE MODIFICACION A REALIZAR
       if(emergente2==0){
  
       if(cbxOpciones.getSelectedItem()=="MODIFICAR_AREA"){ // METODO PARA TRASLADAR CLIENTE DE AREA
      JComboBox comboOp = new JComboBox(areas);
      JComboBox entradas = new JComboBox(entradasCant);
      JPanel panel3 = new JPanel();
      panel3.add(new JLabel("Areas:"));
      panel3.add(comboOp);
      panel3.add(Box.createHorizontalStrut(15)); 
      panel3.add(new JLabel("N.Entradas"));
      panel3.add(entradas);  
      int emergente3 = JOptionPane.showConfirmDialog( null, panel3, "Modificacion de area: ",  JOptionPane.CANCEL_OPTION ); 
                
       Cliente cliente2= zoo.encuentraCliente(areap,numCliente); // extrae cliente a modificar  
       System.out.println("Original: "+cliente2.getNombreCliente()); // verifica cliente original
       zoo.setClienteAux(cliente2);
       System.out.println("Auxiliar: "+zoo.getClienteAux().getNombreCliente());// verifica si gurda en el auxiliar el ciente
                
                int entradasSeleccionadas= entradas.getSelectedIndex()+1;
                int area= comboOp.getSelectedIndex();
                
          if(emergente3==0){ //metodo modifica area y entradas
               
                //Primeros dos parametros area y cantidad nueva
                    if(zoo.modificaArea(area,entradasSeleccionadas)){ // Cliente transferido de area...
                        
                       AREAS_ZOOLOGICO areasZoo= this.areas[area];
                       zoo.setPreciosAreas(areasZoo);
                       cliente.setCantidadEntradas(entradasSeleccionadas);
                       this.area.setNumeroDeArea(area);
                       
                       //si obtiene la diferencia de la entrada
                        System.out.println(zoo.diferenciaCliente(entradasSeleccionadas, area));
                       
                        System.out.println("modificado de lugar...");
                        // this.txtSalidaDeDatosConsola.setText(zoo.informacionDeCompra());
                                  this.txtSalidaDeDatosConsola.setVisible(true);
                                  this.txtSCROLL.setVisible(true);
                                  this.btoLIMPIAR.setVisible(true);
                        System.out.println(zoo.informacionDeCompra());
                        totalVentaAux=zoo.entradaCONcombo();
                        zoo.setDiferencia(totalVentaAux);
                        this.txtSalidaDeDatosConsola.setText(zoo.reciboMODIFICADO());
                      //this.txtSalidaDeDatosConsola.setText(zoo.informacionDeCompra());
                        zoo.borraEntradasCliente(areap, numCliente); // si borra las entradas
                          
                    }else{
                        System.out.println("No hay entradas disponibles...");
                    }
            }
        
        }else if(cbxOpciones.getSelectedItem()=="MODIFICAR_COMBO"){
      JComboBox entradas3 = new JComboBox(this.combos);     
      JPanel panel5 = new JPanel();
      panel5.add(Box.createHorizontalStrut(15)); 
      panel5.add(new JLabel("Combos:"));
      panel5.add(entradas3); 
      int emergente5 = JOptionPane.showConfirmDialog( null, panel5, "Modificacion de tipo de combo",  JOptionPane.CANCEL_OPTION ); 
                          //Mostrar recibo con la diferencia, ya sea favor o en contra...
               
            if(emergente5==0){ // metodo modifica combo
                COMBOS_OPCIONES combosZoo= this.combos[entradas3.getSelectedIndex()];
                 this.zoo.setCombosOpciones(combosZoo);
                
                 this.txtSalidaDeDatosConsola.setVisible(true);
                 this.txtSCROLL.setVisible(true);
                 this.btoLIMPIAR.setVisible(true);
                   totalVentaAux=zoo.entradaCONcombo();
                   zoo.setDiferencia(totalVentaAux);
                 System.out.println(zoo.reciboMODIFICADO());
                 this.txtSalidaDeDatosConsola.setText(zoo.reciboMODIFICADO());
            }
        }
    
       }else{
           System.out.println("....");   }      
        }else{  System.out.println("Usuario no encontrado1");  }
       }else{   System.out.println("Usuario no encontrado");    }
        
      }catch(NullPointerException ex){
          System.out.println("Has dado a cancelar la operacion...");
      }

    }//GEN-LAST:event_mnModificarVentaEntrada_ActionPerformed
// **********TERMINADO*********
    private void mnCancelarVentaEnttrada_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnCancelarVentaEnttrada_ActionPerformed
//       String result = zoo.reporteDeCancelacion();
//        this.txtSalidaDeDatosConsola.setVisible(true);
//         this.txtSCROLL.setVisible(true);
//        this.btoLIMPIAR.setVisible(true);
//       this.txtSalidaDeDatosConsola.setText(result);

   String areas[]={ "AREA_DE_AVES_","AREA_ACUATICA_","AREA_DE_ANIMALES_SALVAJES_","AREA_ANIMALES_COMICOS_","FOSILES_"};
       
       //Objetos para seleccionar datos y asiganar precio
      JComboBox combo = new JComboBox(areas);
      JTextField cliente = new JTextField(9);
      //panel de datos (VENTANA EMERGENTE)
      JPanel panel = new JPanel();
      panel.add(new JLabel("Areas:"));
      panel.add(combo);
      panel.add(Box.createHorizontalStrut(15)); 
      panel.add(new JLabel("No.Cliente:"));
      panel.add(cliente);
      // Agrego las estructuras pasadas(MyPanel) a una ventna JOption, para hacerla emergente y lograr cerrarla al click
      try{
      int emergente = JOptionPane.showConfirmDialog( null, panel, "Seleccione area y nuevo precio:", JOptionPane.OK_CANCEL_OPTION );
      int areap= combo.getSelectedIndex();
      int numCliente= Integer.parseInt(cliente.getText());
      
      // llamo a lo que deso hacer, instancia y metodo, en este caso
        if(emergente==0){
         String cedula= cliente.getText();
        this.txtSalidaDeDatosConsola.setVisible(true);
         this.txtSCROLL.setVisible(true);
        this.btoLIMPIAR.setVisible(true);
        
        Cliente clienteAux= zoo.encuentraCliente(areap, numCliente);
       zoo.setClienteAux(clienteAux);
       
       String result = zoo.cancelacionMODIFICADO();
       this.txtSalidaDeDatosConsola.setText(result);
       zoo.borraEntradasCliente(areap, numCliente);
      //  zoo.borraCampos(areap, numCliente);
        }else{
             this.txtSalidaDeDatosConsola.setText("Usuario no encontrado...");
        }
   
      }catch(NullPointerException ex){
          System.out.println("Usuario no encontrado...");
      }
    }//GEN-LAST:event_mnCancelarVentaEnttrada_ActionPerformed
// TERMINADO
    private void mnReporteEntrada_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReporteEntrada_ActionPerformed
       String result = zoo.reporteEntrada();
       try{
        this.txtSalidaDeDatosConsola.setVisible(true);
         this.txtSCROLL.setVisible(true);
        this.btoLIMPIAR.setVisible(true);
     //  this.txtSalidaDeDatosConsola.setText(result);
      this.txtSalidaDeDatosConsola.setText(zoo.reciboMODIFICADO());
       }catch(Exception b){
           System.out.println("Recibo ha sido ya mostrado...");
       }
    }//GEN-LAST:event_mnReporteEntrada_ActionPerformed
// TERMINADO
    private void mnSalirSistema_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnSalirSistema_ActionPerformed
     try{
           
          int emergente = JOptionPane.showConfirmDialog( this, "Desea salir del programa?","",JOptionPane.CANCEL_OPTION);
          
          
        if(emergente==0){
            System.exit(0);
        }else{
            this.txtNombre.setText("");    this.txtApellido1.setText("");
    this.txtApellido2.setText("");    this.txtCedula.setText("");
    this.txtTelefono.setText("");        this.txtNacionalidad.setText("");
     this.txtCorreoElectronico.setText("");     this.txtEdad.setText("");
    this.cbxTipoTarjeta.setSelectedItem("");  this.txtNumeroTarjeta.setText(""); 
   this.txtFechaVencimientoMES.setText(""); this.txtFechaVencimientoANNO.setText("");  this.txtCVV.setText("");
   this.vntInterna.show();
        }
        
       }catch(NullPointerException ex){
           System.out.println("Has salido del sistema...adios.."); }
        
    
    }//GEN-LAST:event_mnSalirSistema_ActionPerformed
// TERMINADO opcion 6
    private void mnBtonInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnBtonInicioMouseClicked
        this.dispose();
        Ventana_INICIO vi = new Ventana_INICIO();
        vi.setVisible(true);
    }//GEN-LAST:event_mnBtonInicioMouseClicked
// TERMINADO Regresa al menu principal
    private void mnReporteEspaciosDisponibles_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReporteEspaciosDisponibles_ActionPerformed
        // zoo= new Zoologico();
        String result = zoo.MuestraAreaDISPONIBLES();
        this.txtSalidaDeDatosConsola.setVisible(true);
         this.txtSCROLL.setVisible(true);
        this.btoLIMPIAR.setVisible(true);
       this.txtSalidaDeDatosConsola.setText(result);
        
    }//GEN-LAST:event_mnReporteEspaciosDisponibles_ActionPerformed
// TERMINADO...submenu 1
    private void mnRealizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnRealizarCompraActionPerformed
         this.vntInterna.setVisible(true);
    }//GEN-LAST:event_mnRealizarCompraActionPerformed
// SUBMENU 3.....HACE APARECER LA VENTANA*** TERMINADO
    private void mnReporteEspaciosOcupados_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReporteEspaciosOcupados_ActionPerformed
        String result = zoo.MuestraAreaDISPONIBLES();
        this.txtSalidaDeDatosConsola.setVisible(true);
          this.txtSCROLL.setVisible(true);
        this.btoLIMPIAR.setVisible(true);
       this.txtSalidaDeDatosConsola.setText(result);
        
    }//GEN-LAST:event_mnReporteEspaciosOcupados_ActionPerformed
// TERMINADO...submenu 2
    private void btoLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoLIMPIARActionPerformed
         this.txtSalidaDeDatosConsola.setVisible(false);
          this.txtSCROLL.setVisible(false);
         this.btoLIMPIAR.setVisible(false);
    }//GEN-LAST:event_btoLIMPIARActionPerformed
// TERMINADO...Elimina ventana con datos de la pantalla de boleteria
    private void cbxAreaZoologicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxAreaZoologicoItemStateChanged
        this.cbxCombosZoologico.removeAllItems();   
        if(this.cbxAreaZoologico.getSelectedItem()=="FOSILES_" ){
             //this.cbxCombosZoologico.removeAllItems();
             for(int j=0; j< this.combos.length;j++){
                     this.cbxCombosZoologico.addItem(combos[j].toString());
                 }
         }else if(this.cbxAreaZoologico.getSelectedItem()=="AREA_DE_AVES_" || this.cbxAreaZoologico.getSelectedItem()=="AREA_ACUATICA_" || 
                this.cbxAreaZoologico.getSelectedItem()=="AREA_DE_ANIMALES_SALVAJES_" ||  this.cbxAreaZoologico.getSelectedItem()=="AREA_ANIMALES_COMICOS_" ){
             // this.cbxCombosZoologico.removeAllItems();    
             for(int j=0; j< this.combosAux.length;j++){
                     this.cbxCombosZoologico.addItem(combosAux[j]);
                 }
         }
    }//GEN-LAST:event_cbxAreaZoologicoItemStateChanged
// TERMINADO.... hace combos anidados
    private void btoComprar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoComprar1ActionPerformed
     
   cliente = new Cliente();
   
    String nombre= this.txtNombre.getText();    String apellido1=this.txtApellido1.getText();
    String apelido2= this.txtApellido2.getText();    String cedula = this.txtCedula.getText();
    String telefono = this.txtTelefono.getText();       String nacionalidad= this.txtNacionalidad.getText();
    String correo= this.txtCorreoElectronico.getText();     int edad= Integer.parseInt(this.txtEdad.getText());
    TIPO_TARJETA tipoTarjeta= this.tipoTarjeta[this.cbxTipoTarjeta.getSelectedIndex()];
    String numeroTarjeta= this.txtNumeroTarjeta.getText(); 
    String mes=this.txtFechaVencimientoMES.getText(); String anno=this.txtFechaVencimientoANNO.getText();
    String fechaTarjeta=mes+"/"+anno;   String cvv= this.txtCVV.getText();
    AREAS_ZOOLOGICO areasZoo= this.areas[this.cbxAreaZoologico.getSelectedIndex()];
    COMBOS_OPCIONES combosZoo= this.combos[this.cbxCombosZoologico.getSelectedIndex()];
    TIPO_MONEDA monedaZoo= this.moneda[this.cbxTipoMoneda.getSelectedIndex()];
    int cantidadEntradas= this.cbxCantidadDEentradas.getSelectedIndex()+1;
    int numeroDeArea= this.cbxAreaZoologico.getSelectedIndex();
    
    this.area.setNumeroDeArea(numeroDeArea);
    cliente.setNombreCliente(nombre); 
    cliente.setNombreApellido1(apellido1);
    cliente.setNombreApellido2(apelido2);
    cliente.setCedulaCliente(cedula); 
    cliente.setTelefonoCliente(telefono); 
    cliente.setNacionalidadCliente(nacionalidad);
    cliente.setCorreoElectronicoCliente(correo); 
    cliente.setEdad(edad); this.zoo.setTipoTarjeta(tipoTarjeta);
    cliente.setNumeroTarjetaCliente(numeroTarjeta); 
    cliente.setFechaVencimientoTarjetaCliente(fechaTarjeta);
    cliente.setCodigoSeguridadTarjeta(cvv); 
    zoo.setPreciosAreas(areasZoo); 
    this.zoo.setCombosOpciones(combosZoo);
    this.zoo.setMoneda(monedaZoo); 
    cliente.setCantidadEntradas(cantidadEntradas);
    
    
    int areaSeleccionada=this.cbxAreaZoologico.getSelectedIndex();

       if(numeroDeArea==0){
            cliente.setNumeroCliente(numCliente1);
            zoo.setNumeroCliente(numCliente1);
             this.numCliente1++;
        }else if(numeroDeArea==1){
            cliente.setNumeroCliente(numCliente2);
            zoo.setNumeroCliente(numCliente2);
             this.numCliente2++;
        }else  if(numeroDeArea==2){
            cliente.setNumeroCliente(numCliente3);
            zoo.setNumeroCliente(numCliente3);
             this.numCliente3++;
        }else  if(numeroDeArea==3){
            cliente.setNumeroCliente(numCliente4);
            zoo.setNumeroCliente(numCliente4);
             this.numCliente4++;
        }else  if(numeroDeArea==4){
            cliente.setNumeroCliente(numCliente5);
           zoo.setNumeroCliente(numCliente5);
             this.numCliente5++;
        }
       
        String tarjeta= numeroTarjeta;
        int longTarjeta=  tarjeta.length();
        String cvv1=  cvv;
        int longCVV= cvv1.length();
        String fecha= fechaTarjeta;
        char a,b,c; 
        char aux; 
        int num;
        try{
        switch(tipoTarjeta){
            case VISA:
                 if(longTarjeta==16 && longCVV==3){      
                     a=tarjeta.charAt(0);
                     if(a=='4' ){
                             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
                             simpleDateFormat.setLenient(false);
                            Date caducidad = simpleDateFormat.parse(fecha);
                        if(caducidad.after(new Date())){
                              int s1 = 0, s2 = 0;
                                String reversa = new StringBuffer(tarjeta).reverse().toString();
                                 for(int i = 0 ;i < reversa.length();i++){
                                        int digito = Character.digit(reversa.charAt(i), 10);
                                                  if(i % 2 == 0){
                                                        s1 += digito;
                                                     }else{
                                                       s2 += 2 * digito;
                                               if(digito >= 5){
                                                  s2 -= 9;
                                                }
                                       }
                               }
                                 if((s1+s2)%10==0){
                                    //Tarjeta aprobada:
                                    if(zoo.llenaMatrizCliente(areaSeleccionada, cliente, cantidadEntradas)==true){
                                         zoo.setContCliente(this.contCliente);
                                         zoo.setClienteAux(cliente);
                                         totalVentaAuxPrincipal=zoo.entradaCONcombo();
                                         zoo.setOrginal(this.totalVentaAuxPrincipal);
                                         this.txtSalidaInformacionCompra.setText(zoo.reciboMODIFICADO());
                                        //this.txtSalidaInformacionCompra.setText(zoo.informacionDeCompra());
                                          System.out.println(zoo.informacionDeCompra());
                                    }
                                 }else{
                                     this.txtSalidaInformacionCompra.setText("Favor revisar tarjeta ingresada algo ha salido mal...");
                                 }
                            }else{
                            this.txtSalidaInformacionCompra.setText("Favor revisar caducidad de la  tarjeta... ");
                        }
                       }else{
                         this.txtSalidaInformacionCompra.setText("Favor revisar tarjeta no concuerda con una tipo VISA...");
                     }
                    }else{
                          //Tarjeta no aprobada:
                             this.txtSalidaInformacionCompra.setText("Favor revisar longitud de la tarjeta...s");
                    }
                break;
            case MASTER_CARD:
                 if(longTarjeta==16 && longCVV==3){
                     b=tarjeta.charAt(0);
                     c= tarjeta.charAt(1);
                  if(b=='5' && c=='1' || b=='5' && c=='2' || b=='5' && c=='3' || b=='5' && c=='4' || b=='5' && c=='5' ){
                             SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/yy");
                             simpleDateFormat.setLenient(false);
                            Date caducidad = simpleDateFormat.parse(fecha);
                        if(caducidad.after(new Date())){
                            int s1 = 0, s2 = 0;
                                String reversa = new StringBuffer(tarjeta).reverse().toString();
                                 for(int i = 0 ;i < reversa.length();i++){
                                        int digito = Character.digit(reversa.charAt(i), 10);
                                                  if(i % 2 == 0){
                                                        s1 += digito;
                                                     }else{
                                                       s2 += 2 * digito;
                                               if(digito >= 5){
                                                  s2 -= 9;
                                                }
                                      }
                             }
                                if((s1+s2)%10==0){
                                    //Tarjeta aprobada:
                                         if(zoo.llenaMatrizCliente(areaSeleccionada, cliente, cantidadEntradas)==true){
                                         zoo.setContCliente(this.contCliente);
                                           zoo.setClienteAux(cliente);
                                            totalVentaAuxPrincipal=zoo.entradaCONcombo();
                                         zoo.setOrginal(this.totalVentaAuxPrincipal);
                                         this.txtSalidaInformacionCompra.setText(zoo.reciboMODIFICADO());
                                        // this.txtSalidaInformacionCompra.setText(zoo.informacionDeCompra());
                                          System.out.println(zoo.informacionDeCompra());
                                    }else{
                                             this.txtSalidaInformacionCompra.setText("No hay mas campos disponibles, favor revisar otra area");
                                         }
                            }else{
                                  this.txtSalidaInformacionCompra.setText("Tarjeta no aprobada.."); 
                                }
                        }else{
                         this.txtSalidaInformacionCompra.setText("Favor revisar caducidad de tarjeta");   
                        }
                      }else{
                      this.txtSalidaInformacionCompra.setText("Tarjeta no concuerda con MASTERCARD");
                  }
                      }else{
                     //Tarjeta no aprobada:
                        this.txtSalidaInformacionCompra.setText("Favor revisar longitud de tarjeta ingresada algo ha salido mal...");
                  }
                break;
        }
 
        }catch(Exception e){
            this.txtSalidaInformacionCompra.setText("No hay mas espacios disponibles favor escoger otra area...");
        }
       
    this.contCliente++;
    }//GEN-LAST:event_btoComprar1ActionPerformed
 // boton comprar esta en la ventana emergente [JInternalFrame]  TERMINADO
    private void btoInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoInformacionActionPerformed
         // zoo= new Zoologico();
        String result = zoo.MuestraAreaDISPONIBLES();
        this.txtSalidaDeDatosConsola.setVisible(true);
         this.txtSCROLL.setVisible(true);
        this.btoLIMPIAR.setVisible(true);
       this.txtSalidaInformacionCompra.setText(result);
        
    }//GEN-LAST:event_btoInformacionActionPerformed
 // boton informacion esta en la ventana emergente  TERMINADO




    
    
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_BOLETERIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_BOLETERIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_BOLETERIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_BOLETERIA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_BOLETERIA().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoComprar1;
    private javax.swing.JButton btoInformacion;
    private javax.swing.JButton btoLIMPIAR;
    private javax.swing.JComboBox<String> cbxAreaZoologico;
    private javax.swing.JComboBox<String> cbxCantidadDEentradas;
    private javax.swing.JComboBox<String> cbxCombosZoologico;
    private javax.swing.JComboBox<String> cbxTipoMoneda;
    private javax.swing.JComboBox<String> cbxTipoTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JMenu mnBtonInicio;
    private javax.swing.JMenuItem mnCancelarVentaEnttrada_;
    private javax.swing.JMenuItem mnConsultarPreciosAreas_;
    private javax.swing.JMenuItem mnModificarVentaEntrada_;
    private javax.swing.JMenu mnOPCIONES;
    private javax.swing.JMenuItem mnRealizarCompra;
    private javax.swing.JMenuItem mnReporteEntrada_;
    private javax.swing.JMenu mnReporteEspaciosDisponibles;
    private javax.swing.JMenuItem mnReporteEspaciosDisponibles_;
    private javax.swing.JMenuItem mnReporteEspaciosOcupados_;
    private javax.swing.JMenuItem mnSalirSistema_;
    private javax.swing.JTextField txtApellido1;
    private javax.swing.JTextField txtApellido2;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFechaVencimientoANNO;
    private javax.swing.JTextField txtFechaVencimientoMES;
    private javax.swing.JTextField txtNacionalidad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNumeroTarjeta;
    private javax.swing.JScrollPane txtSCROLL;
    private javax.swing.JTextArea txtSalidaDeDatosConsola;
    private javax.swing.JTextArea txtSalidaInformacionCompra;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JInternalFrame vntInterna;
    // End of variables declaration//GEN-END:variables
}

