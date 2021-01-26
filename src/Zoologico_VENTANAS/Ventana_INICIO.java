
package Zoologico_VENTANAS;

import Zoologico_CODIGO.*;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Ventana_INICIO extends javax.swing.JFrame {
        Zoologico zoo=Zoologico.getInstanciaZoo();
        Ventana_ADMINISTRADOR  admin;
        Ventana_BOLETERIA bol;
        
        int intentos=3; // Intentos de la contrasenna
       
        
        
    public Ventana_INICIO() {
        initComponents();
        
        this.setSize(new Dimension(1300,747));
        this.setMinimumSize(new Dimension(1300,747));
        this.setMaximumSize(new Dimension(1300,747));
        this.setLocationRelativeTo(null);
        this.setTitle("Elaborado por John Paul Alfaro Carballo");
        
        //cliente = new Cliente();
        //zoo= new Zoologico();
        admin = new Ventana_ADMINISTRADOR();
        bol= new Ventana_BOLETERIA();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btoSalirAplicacion_ = new javax.swing.JButton();
        btoBoleteria_ = new javax.swing.JButton();
        btoAdministrador_ = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btoInformacion = new javax.swing.JButton();
        lbl_FONDO_Pantalla = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btoSalirAplicacion_.setBackground(new java.awt.Color(153, 153, 153));
        btoSalirAplicacion_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btoSalirAplicacion_.setText("Salir de la aplicacion");
        btoSalirAplicacion_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoSalirAplicacion_ActionPerformed(evt);
            }
        });
        getContentPane().add(btoSalirAplicacion_);
        btoSalirAplicacion_.setBounds(470, 380, 390, 50);

        btoBoleteria_.setBackground(new java.awt.Color(153, 153, 153));
        btoBoleteria_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btoBoleteria_.setText("Boleteria");
        btoBoleteria_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoBoleteria_ActionPerformed(evt);
            }
        });
        getContentPane().add(btoBoleteria_);
        btoBoleteria_.setBounds(470, 300, 390, 50);

        btoAdministrador_.setBackground(new java.awt.Color(153, 153, 153));
        btoAdministrador_.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btoAdministrador_.setText("Administrar Zoologico");
        btoAdministrador_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoAdministrador_ActionPerformed(evt);
            }
        });
        getContentPane().add(btoAdministrador_);
        btoAdministrador_.setBounds(470, 220, 390, 50);

        jLabel3.setFont(new java.awt.Font("Sinhala MN", 1, 48)); // NOI18N
        jLabel3.setText("Zoologico Buena Vista de Costa Rica 3.0");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(240, 110, 960, 80);

        jLabel1.setFont(new java.awt.Font("Phosphate", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Creado por: John Paul Alfaro Carballo");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 650, 500, 30);

        jLabel2.setFont(new java.awt.Font("Phosphate", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("UTN, SEDE CENTRAL 2019");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 680, 500, 30);

        btoInformacion.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btoInformacion.setText("Informacion");
        btoInformacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btoInformacionActionPerformed(evt);
            }
        });
        getContentPane().add(btoInformacion);
        btoInformacion.setBounds(1130, 680, 110, 30);

        lbl_FONDO_Pantalla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes_PROYECTO/Imagen_Menu_INICIO_2.jpg"))); // NOI18N
        lbl_FONDO_Pantalla.setText("I");
        getContentPane().add(lbl_FONDO_Pantalla);
        lbl_FONDO_Pantalla.setBounds(-440, -570, 1750, 1320);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    
    private void btoAdministrador_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoAdministrador_ActionPerformed
//        String contrasenna="";
//        if(intentos==2){
//        contrasenna= JOptionPane.showInputDialog("Ingrese contraseña valida: "+ contrasennaGenerada);
//        }
//        boolean resultado= this.zoo.validacionDeContrasenna(contrasenna);
//        if(resultado== true){
//            admin.show();
//            this.dispose();
//        }else{
//            if(intentos>0){
//             contrasenna= JOptionPane.showInputDialog("Contraseña incorrecta intenta de nuevo, te quedan estos intentos: "
//                                                                                                                                    + intentos + "\r\n"+contrasennaGenerada);
//            resultado= this.zoo.validacionDeContrasenna(contrasenna);
//            intentos--;
//             if(resultado== true){
//            admin.show();
//            this.dispose();
//            }else{
//                    JOptionPane.showMessageDialog(this, "No tiene mas intentos, por favor intenta de nuevo mas tarde."
//                            + "\r\n \r\n Puedes pedir ayuda donde el administrador a cargo \r\n \r\n");
//                    }
//            }
//        }
        //zoo= new Zoologico();
        
        try{
        String contrasennaGenerada= zoo.generacionDeContrasenna(); // clave generada en metodo
        String contrasenna="";
        if(intentos==2){
        contrasenna= JOptionPane.showInputDialog("Ingrese contraseña valida: "+ contrasennaGenerada);
        }
        String resultado= this.zoo.generacionDeContrasenna();
        if(contrasenna.equals(contrasennaGenerada)){
            admin.show();
            this.dispose();
        }else{
            if(intentos>0){
             contrasenna= JOptionPane.showInputDialog("Contraseña incorrecta intenta de nuevo, te quedan estos intentos: "
                                                                                                                                    + intentos + "\r\n"+contrasennaGenerada);
            resultado=  this.zoo.generacionDeContrasenna();
            intentos--;
             if(contrasenna.equals(contrasennaGenerada)){
            admin.show();
            this.dispose();
            }else{
                    JOptionPane.showMessageDialog(this, "No tiene mas intentos, por favor intenta de nuevo mas tarde."
                            + "\r\n \r\n Puedes pedir ayuda donde el administrador a cargo \r\n \r\n");
                    }
            }
        }
        }catch(NullPointerException e){
                System.out.println("Diste cancelar");
                }
        
        
    }//GEN-LAST:event_btoAdministrador_ActionPerformed
// Listo
    private void btoBoleteria_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoBoleteria_ActionPerformed
    bol.show();
    this.dispose();
    }//GEN-LAST:event_btoBoleteria_ActionPerformed
// Listo
    private void btoSalirAplicacion_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoSalirAplicacion_ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btoSalirAplicacion_ActionPerformed

    private void btoInformacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btoInformacionActionPerformed
     JOptionPane.showMessageDialog(this,zoo.infoZoologico());
      
 //     String generado=zoo.generacionDeContrasenna();   
//      try{
//        //Objetos para seleccionar datos y asiganar precio
//      JPasswordField contrasenna= new JPasswordField(10);
//      JLabel etiqueta = new JLabel(generado);
//      //panel de datos (VENTANA EMERGENTE)
//      JPanel panel = new JPanel();
//      panel.add(contrasenna);
//      panel.add(etiqueta);
//     if(intentos==3){
//      int ventana = JOptionPane.showConfirmDialog( null, panel, "Ingrese una contraseña valida: ", JOptionPane.OK_CANCEL_OPTION );
//        if(ventana==0){
//        String resultado= contrasenna.getText();
//        if(resultado.equals(generado)){
//            admin.show();
//            this.dispose();
//        }else{
//            if(intentos>0){
//           int ventana1 = JOptionPane.showConfirmDialog( null, panel, "Ingrese una contraseña valida: "+intentos, JOptionPane.OK_CANCEL_OPTION );
//           if(ventana1==0){
//            intentos--;
//             if(resultado.equals(generado)){
//            admin.show();
//            this.dispose();
//             }
//            }else{
//                    JOptionPane.showMessageDialog(this, "No tiene mas intentos, por favor intenta de nuevo mas tarde."
//                            + "\r\n \r\n Puedes pedir ayuda donde el administrador a cargo \r\n \r\n");
//                    }
//            }
//        }
//    }
//     }
//        }catch(NullPointerException e){
//                System.out.println("Diste cancelar");
//                }
    }//GEN-LAST:event_btoInformacionActionPerformed
//  Listo


    
    
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_INICIO().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btoAdministrador_;
    private javax.swing.JButton btoBoleteria_;
    private javax.swing.JButton btoInformacion;
    private javax.swing.JButton btoSalirAplicacion_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lbl_FONDO_Pantalla;
    // End of variables declaration//GEN-END:variables
}