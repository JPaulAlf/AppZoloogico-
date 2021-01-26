package Zoologico_VENTANAS;

import Zoologico_CODIGO.*;
import java.awt.Dimension;
import javax.swing.*;


public class Ventana_ADMINISTRADOR extends javax.swing.JFrame {
                Zoologico zoo=Zoologico.getInstanciaZoo();
                
                //Cliente cliente;
                AREAS_ZOOLOGICO areas;
                Area area= Area.getInstancia();
    
    public Ventana_ADMINISTRADOR() {
        initComponents();
         this.setSize(new Dimension(1300,750));
        this.setMinimumSize(new Dimension(1300,750));
        this.setMaximumSize(new Dimension(1300,750));
        this.setLocationRelativeTo(null);
        this.setTitle("Elabaorado por John Paul Alfaro Carballo");
        
        //cliente = new Cliente();
        //zoo= new Zoologico();
        this.txtSalidaDatosPrincipal.setVisible(false);
        this.btoLIMPIAR.setVisible(false);

        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu2 = new javax.swing.JMenu();
        txtSalidaDatosPrincipal = new javax.swing.JScrollPane();
        txtSalidaDeDatos = new javax.swing.JTextArea();
        lblEtiqueta2 = new javax.swing.JLabel();
        lblEtiqueta1 = new javax.swing.JLabel();
        btoLIMPIAR = new javax.swing.JButton();
        lblFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnMostrarEstadoArea_ = new javax.swing.JMenuItem();
        mnReporteIngresosArea_ = new javax.swing.JMenuItem();
        mnReporteEspaciosVaciosArea = new javax.swing.JMenuItem();
        mnReporteCantidadEntradasCompradasPorCliente_ = new javax.swing.JMenuItem();
        mnModificarPrecioArea_ = new javax.swing.JMenuItem();
        mnModificarTipoCambioMoneda_ = new javax.swing.JMenuItem();
        mnModificarOpcionesCompra = new javax.swing.JMenuItem();
        mnBotonAtras_ = new javax.swing.JMenu();

        jMenu2.setText("jMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        txtSalidaDeDatos.setEditable(false);
        txtSalidaDeDatos.setBackground(new java.awt.Color(204, 204, 204));
        txtSalidaDeDatos.setColumns(20);
        txtSalidaDeDatos.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtSalidaDeDatos.setForeground(new java.awt.Color(0, 0, 0));
        txtSalidaDeDatos.setRows(5);
        txtSalidaDeDatos.setText("Informacion:\n");
        txtSalidaDatosPrincipal.setViewportView(txtSalidaDeDatos);

        getContentPane().add(txtSalidaDatosPrincipal);
        txtSalidaDatosPrincipal.setBounds(110, 30, 1030, 600);

        lblEtiqueta2.setBackground(new java.awt.Color(255, 255, 255));
        lblEtiqueta2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEtiqueta2.setForeground(new java.awt.Color(0, 0, 0));
        lblEtiqueta2.setText("Las opciones disponibles se encuentran en la barra de menu, arriba a tu izquierda");
        getContentPane().add(lblEtiqueta2);
        lblEtiqueta2.setBounds(40, 90, 930, 40);

        lblEtiqueta1.setBackground(new java.awt.Color(255, 255, 255));
        lblEtiqueta1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        lblEtiqueta1.setForeground(new java.awt.Color(0, 0, 0));
        lblEtiqueta1.setText("Favor seleccionar una opcion a realizar...");
        getContentPane().add(lblEtiqueta1);
        lblEtiqueta1.setBounds(40, 50, 610, 40);

        btoLIMPIAR.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btoLIMPIAR.setText("LIMPIAR");
        btoLIMPIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoLIMPIARActionPerformed(evt);
            }
        });
        getContentPane().add(btoLIMPIAR);
        btoLIMPIAR.setBounds(1020, 630, 120, 40);

        lblFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_PROYECTO/Imagen_ADMINISTRADOR.jpg"))); // NOI18N
        getContentPane().add(lblFondo);
        lblFondo.setBounds(-30, -20, 1360, 760);

        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jMenuBar1.setMinimumSize(new java.awt.Dimension(10, 10));
        jMenuBar1.setPreferredSize(new java.awt.Dimension(400, 50));

        jMenu1.setText("OPCIONES DISPONIBLES");
        jMenu1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        mnMostrarEstadoArea_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnMostrarEstadoArea_.setText("1- Mostrar estado de cada área.");
        mnMostrarEstadoArea_.setPreferredSize(new java.awt.Dimension(300, 25));
        mnMostrarEstadoArea_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnMostrarEstadoArea_ActionPerformed(evt);
            }
        });
        jMenu1.add(mnMostrarEstadoArea_);

        mnReporteIngresosArea_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnReporteIngresosArea_.setText("2- Reporte de ingresos por área.");
        mnReporteIngresosArea_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReporteIngresosArea_ActionPerformed(evt);
            }
        });
        jMenu1.add(mnReporteIngresosArea_);

        mnReporteEspaciosVaciosArea.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnReporteEspaciosVaciosArea.setText("3- Reporte de la cantidad de espacios vendidos por cada área.");
        mnReporteEspaciosVaciosArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReporteEspaciosVaciosAreaActionPerformed(evt);
            }
        });
        jMenu1.add(mnReporteEspaciosVaciosArea);

        mnReporteCantidadEntradasCompradasPorCliente_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnReporteCantidadEntradasCompradasPorCliente_.setText("4- Reporte de la cantidad de entradas comprados por cada cliente.");
        mnReporteCantidadEntradasCompradasPorCliente_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnReporteCantidadEntradasCompradasPorCliente_ActionPerformed(evt);
            }
        });
        jMenu1.add(mnReporteCantidadEntradasCompradasPorCliente_);

        mnModificarPrecioArea_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnModificarPrecioArea_.setText("5- Modificar precio de área.");
        mnModificarPrecioArea_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnModificarPrecioArea_ActionPerformed(evt);
            }
        });
        jMenu1.add(mnModificarPrecioArea_);

        mnModificarTipoCambioMoneda_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnModificarTipoCambioMoneda_.setText("6- Modificar tipo de cambio de monedas en dólares y euros. ");
        mnModificarTipoCambioMoneda_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnModificarTipoCambioMoneda_ActionPerformed(evt);
            }
        });
        jMenu1.add(mnModificarTipoCambioMoneda_);

        mnModificarOpcionesCompra.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnModificarOpcionesCompra.setText("7- Modificar Opciones de compras.");
        mnModificarOpcionesCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnModificarOpcionesCompraActionPerformed(evt);
            }
        });
        jMenu1.add(mnModificarOpcionesCompra);

        jMenuBar1.add(jMenu1);

        mnBotonAtras_.setText("MENU INICIO");
        mnBotonAtras_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        mnBotonAtras_.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mnBotonAtras_MouseClicked(evt);
            }
        });
        jMenuBar1.add(mnBotonAtras_);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
    private void mnBotonAtras_MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mnBotonAtras_MouseClicked
        // TODO add your handling code here:
        this.dispose();
        Ventana_INICIO vi = new Ventana_INICIO();
        vi.setVisible(true);
    }//GEN-LAST:event_mnBotonAtras_MouseClicked
// TERMINADO
    private void mnMostrarEstadoArea_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnMostrarEstadoArea_ActionPerformed
       this.lblEtiqueta1.setVisible(false);
       this.lblEtiqueta2.setVisible(false);
       
        String areas[]={ "AREA_DE_AVES_","AREA_ACUATICA_","AREA_DE_ANIMALES_SALVAJES_","AREA_ANIMALES_COMICOS_","FOSILES_"};
       
       //Objetos para seleccionar datos y asiganar precio
      JComboBox combo = new JComboBox(areas);
      //panel de datos (VENTANA EMERGENTE)
      JPanel panel = new JPanel();
      panel.add(new JLabel("Areas:"));
      panel.add(combo);
      // Agrego las estructuras pasadas(MyPanel) a una ventna JOption, para hacerla emergente y lograr cerrarla al click
      int emergente = JOptionPane.showConfirmDialog( null, panel, "Seleccione area a mostrar: ", JOptionPane.OK_CANCEL_OPTION );
      
      int fila= combo.getSelectedIndex();
      // llamo a lo que deso hacer, instancia y metodo, en este caso
        if(emergente==0){
             this.txtSalidaDeDatos.setVisible(true);
             this.txtSalidaDatosPrincipal.setVisible(true);
             this.btoLIMPIAR.setVisible(true);
                String estado=zoo.MuestraAreaESTADO(fila);
                this.txtSalidaDeDatos.setText(estado);
        }else{
            this.txtSalidaDeDatos.setText("Has cancelado la operacion...");
        }
       
      
    }//GEN-LAST:event_mnMostrarEstadoArea_ActionPerformed
// TERMINADO 1.1
    private void mnReporteIngresosArea_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReporteIngresosArea_ActionPerformed
        this.lblEtiqueta1.setVisible(false);
       this.lblEtiqueta2.setVisible(false);
       int emergente = JOptionPane.showConfirmDialog( this, "Esta es la opcion seleccionada?" ,"",JOptionPane.YES_NO_OPTION);
       String cont= zoo.ventaTotalPorArea();
      // llamo a lo que deso hacer, instancia y metodo, en este caso
        if(emergente==0){
            try{
             this.txtSalidaDeDatos.setVisible(true);
             this.txtSalidaDatosPrincipal.setVisible(true);
             this.btoLIMPIAR.setVisible(true);
             this.txtSalidaDeDatos.setText(cont);
            }catch(Exception e){
                System.out.println("Aun no han habido ventanas...");
            }
        }else{
            this.txtSalidaDeDatos.setText("Has dado a cancelar...");
        }
    }//GEN-LAST:event_mnReporteIngresosArea_ActionPerformed
// falta metodo que haga la accion !! FUNCIONA PERO SOLO EN VENTANA, NO EN LA CONSOLA!!!
    private void mnReporteEspaciosVaciosAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReporteEspaciosVaciosAreaActionPerformed
        this.lblEtiqueta1.setVisible(false);
       this.lblEtiqueta2.setVisible(false);
       try{
           
          int emergente = JOptionPane.showConfirmDialog( this, "Esta es la opcion seleccionada?" ,"",JOptionPane.YES_NO_OPTION);
      // llamo a lo que deso hacer, instancia y metodo, en este caso
        if(emergente==0){
             this.txtSalidaDeDatos.setVisible(true);
             this.txtSalidaDatosPrincipal.setVisible(true);
             this.btoLIMPIAR.setVisible(true);
             String entradas =zoo.entradasPorArea();
             this.txtSalidaDeDatos.setText(entradas);
        }else{
            this.txtSalidaDeDatos.setText("Has cancelado la operacion...");
        }
        
       }catch(NullPointerException ex){
           System.out.println("Has dado a cancelar....");
       }
    }//GEN-LAST:event_mnReporteEspaciosVaciosAreaActionPerformed
// TERMINADO 1.3
    private void mnReporteCantidadEntradasCompradasPorCliente_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnReporteCantidadEntradasCompradasPorCliente_ActionPerformed
       this.lblEtiqueta1.setVisible(false);
       this.lblEtiqueta2.setVisible(false);
       try{
           
       int emergente = JOptionPane.showConfirmDialog(this,"Esta es la opcion seleccionada?","",JOptionPane.YES_NO_OPTION);
      // llamo a lo que deso hacer, instancia y metodo, en este caso
        if(emergente==0){
             this.txtSalidaDeDatos.setVisible(true);
             this.txtSalidaDatosPrincipal.setVisible(true);
             this.btoLIMPIAR.setVisible(true);
             String cont= zoo.cantidadEntradasXCliente();
             this.txtSalidaDeDatos.setText(cont);
        }else{
            this.txtSalidaDeDatos.setText("No has cambiado ningun precio...");
        }
        
        
       }catch(NullPointerException ex){
           System.out.println("Has dado a cancelar...");
       }
    }//GEN-LAST:event_mnReporteCantidadEntradasCompradasPorCliente_ActionPerformed
// TERMINADO 1.4
    private void mnModificarPrecioArea_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnModificarPrecioArea_ActionPerformed
       this.lblEtiqueta1.setVisible(false);
       this.lblEtiqueta2.setVisible(false);
       String areas[]={ "AREA_DE_AVES_","AREA_ACUATICA_","AREA_DE_ANIMALES_SALVAJES_","AREA_ANIMALES_COMICOS_","FOSILES_"};
       
       //Objetos para seleccionar datos y asiganar precio
      JComboBox combo = new JComboBox(areas);
      JTextField precio = new JTextField(9);
      //panel de datos (VENTANA EMERGENTE)
      JPanel panel = new JPanel();
      panel.add(new JLabel("Areas:"));
      panel.add(combo);
      panel.add(Box.createHorizontalStrut(15)); 
      panel.add(new JLabel("Precio:"));
      panel.add(precio);
      // Agrego las estructuras pasadas(MyPanel) a una ventna JOption, para hacerla emergente y lograr cerrarla al click
      try{
      int emergente = JOptionPane.showConfirmDialog( null, panel, "Seleccione area y nuevo precio:", JOptionPane.OK_CANCEL_OPTION );
      int areap= combo.getSelectedIndex();
     int preciop= Integer.parseInt(precio.getText());
      // llamo a lo que deso hacer, instancia y metodo, en este caso
        if(emergente==0){
             this.txtSalidaDeDatos.setVisible(true);
             this.txtSalidaDatosPrincipal.setVisible(true);
             this.btoLIMPIAR.setVisible(true);
              
         if(areap==0){
            area.setPrecioAreaAves(preciop);
            this.txtSalidaDeDatos.setText("Valor de "+"[ "+combo.getSelectedItem()+" ]"+ " ha sido reajustado...");
        }else if(areap==1){
            area.setPrecioAreaAcuatica(preciop);
            this.txtSalidaDeDatos.setText("Valor de "+"[ "+combo.getSelectedItem()+" ]"+ " ha sido reajustado...");
        }else if(areap==2){
            area.setPrecioAreaSalvajes(preciop);
            this.txtSalidaDeDatos.setText("Valor de "+"[ "+combo.getSelectedItem()+" ]"+ " ha sido reajustado...");
        }else if(areap==3){
            area.setPrecioAreaComicos(preciop);
            this.txtSalidaDeDatos.setText("Valor de "+"[ "+combo.getSelectedItem()+" ]"+ " ha sido reajustado...");
        }else if(areap==4){
            area.setPrecioAreaFosiles(preciop);
            this.txtSalidaDeDatos.setText("Valor de "+"[ "+combo.getSelectedItem()+" ]"+ " ha sido reajustado...");
        }
         
        }else{
            this.txtSalidaDeDatos.setText("No has cambiado ningun precio...");
        }
   
      }catch(NullPointerException ex){
          System.out.println("Has dado a cancelar la operacion...");
      }
      
    }//GEN-LAST:event_mnModificarPrecioArea_ActionPerformed
// TERMINADO 1.5
    private void mnModificarTipoCambioMoneda_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnModificarTipoCambioMoneda_ActionPerformed
      this.lblEtiqueta1.setVisible(false);
       this.lblEtiqueta2.setVisible(false);
       String monedas[]={"DOLARES","EUROS" };

       //Objetos para seleccionar datos y asiganar precio
      JComboBox combo = new JComboBox(monedas);
      JTextField precio = new JTextField(9);
      //panel de datos (VENTANA EMERGENTE)
      JPanel panel = new JPanel();
      panel.add(new JLabel("Moneda:"));
      panel.add(combo);
      panel.add(Box.createHorizontalStrut(15)); 
      panel.add(new JLabel("Valor nuevo:"));
      panel.add(precio);
      // Agrego las estructuras pasadas(MyPanel) a una ventna JOption, para hacerla emergente y lograr cerrarla al click
      int emergente = JOptionPane.showConfirmDialog( null, panel, "Seleccione el tipo de moneda y nuevo valor de cambio:", JOptionPane.OK_CANCEL_OPTION );
      int monedap= combo.getSelectedIndex();
        int nValor=Integer.parseInt(precio.getText());
        if(emergente==0){
             this.txtSalidaDeDatos.setVisible(true);
       this.txtSalidaDatosPrincipal.setVisible(true);
       this.btoLIMPIAR.setVisible(true);
            if(monedap==0){
                zoo.setDolares(nValor);
                   this.txtSalidaDeDatos.setText("Valor de "+"[ "+combo.getSelectedItem()+" ]"+ " ha sido reajustado...");
            }else if(monedap==1){
                zoo.setEuros(nValor);
                this.txtSalidaDeDatos.setText("Valor de "+"[ "+combo.getSelectedItem()+" ]"+ " ha sido reajustado...");
            }
        }else{
             this.txtSalidaDeDatos.setText("No has cambiado ningun valor...");
        }
      
       
    }//GEN-LAST:event_mnModificarTipoCambioMoneda_ActionPerformed
// TERMINADO 1.6
    private void mnModificarOpcionesCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnModificarOpcionesCompraActionPerformed
       this.lblEtiqueta1.setVisible(false);
       this.lblEtiqueta2.setVisible(false);
        String paquetes[]={" COMBO_1_CON_GOLOSINAS_","COMBO_2_CON_GUIA_"};
       
       //Objetos para seleccionar datos y asiganar precio
      JComboBox combo = new JComboBox(paquetes);
      JTextField precio = new JTextField(9);
      //panel de datos (VENTANA EMERGENTE)
      JPanel panel = new JPanel();
      panel.add(new JLabel("Combos"));
      panel.add(combo);
      panel.add(Box.createHorizontalStrut(15)); 
      panel.add(new JLabel(""));
      panel.add(precio);
      // Agrego las estructuras pasadas(MyPanel) a una ventna JOption, para hacerla emergente y lograr cerrarla al click
      int emergente = JOptionPane.showConfirmDialog( null, panel, "Seleccione area y nuevo precio:", JOptionPane.OK_CANCEL_OPTION );
      int elecc= combo.getSelectedIndex();
       int nValor=Integer.parseInt(precio.getText());
      // llamo a lo que deso hacer, instancia y metodo, en este caso
        if(emergente==0){
             this.txtSalidaDeDatos.setVisible(true);
             this.txtSalidaDatosPrincipal.setVisible(true);
             this.btoLIMPIAR.setVisible(true);
             if(elecc==0){
                 area.setPrecioComboGolosinas(nValor);
                  this.txtSalidaDeDatos.setText("Valor de "+"[ "+combo.getSelectedItem()+" ]"+ " ha sido reajustado...");
             }else if(elecc==1){
                 area.setPrecioComboGuia(nValor);
                 this.txtSalidaDeDatos.setText("Valor de "+"[ "+combo.getSelectedItem()+" ]"+ " ha sido reajustado...");
             }
        }else{
              this.txtSalidaDeDatos.setText("No has cambiado ningun valor...");
        }
       
       
       
    }//GEN-LAST:event_mnModificarOpcionesCompraActionPerformed
// TERMINADO 1.7
    private void btoLIMPIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoLIMPIARActionPerformed
        this.txtSalidaDeDatos.setText("");
        this.txtSalidaDeDatos.setVisible(false);
        this.txtSalidaDatosPrincipal.setVisible(false);
        this.btoLIMPIAR.setVisible(false);
    }//GEN-LAST:event_btoLIMPIARActionPerformed
// TERMINADO
 
    

    public static void main(String args[]) {
  
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_ADMINISTRADOR.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_ADMINISTRADOR().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoLIMPIAR;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblEtiqueta1;
    private javax.swing.JLabel lblEtiqueta2;
    private javax.swing.JLabel lblFondo;
    private javax.swing.JMenu mnBotonAtras_;
    private javax.swing.JMenuItem mnModificarOpcionesCompra;
    private javax.swing.JMenuItem mnModificarPrecioArea_;
    private javax.swing.JMenuItem mnModificarTipoCambioMoneda_;
    private javax.swing.JMenuItem mnMostrarEstadoArea_;
    private javax.swing.JMenuItem mnReporteCantidadEntradasCompradasPorCliente_;
    private javax.swing.JMenuItem mnReporteEspaciosVaciosArea;
    private javax.swing.JMenuItem mnReporteIngresosArea_;
    private javax.swing.JScrollPane txtSalidaDatosPrincipal;
    private javax.swing.JTextArea txtSalidaDeDatos;
    // End of variables declaration//GEN-END:variables
}
