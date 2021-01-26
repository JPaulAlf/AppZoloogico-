
package Zoologico_CODIGO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Random;


public class Zoologico {
    
    // Variables oficiales...
    private String cedulaJuridica; // echo en el constructor
    private String nombre; // echo en el constructor
    private String ubicacion; // echo en el constructor
    private Area[] arrayArea; // sin uso por el momento
    private Cliente[][] matrizCliente;
    private final int FIL = 5, COL = 6;

    //Extra-oficiales variables:
    private Area areap= Area.getInstancia();
    private static Zoologico zoo=null;
    private AREAS_ZOOLOGICO preciosAreas;
    private COMBOS_OPCIONES combosOpciones;
    private COMBOS_OPCIONES combosOpciones2;
    private TIPO_TARJETA tipoTarjeta;
    private TIPO_MONEDA moneda;
    private MODIFICACIONES_BOLETERIA modifiacion;
    private int contCliente=0;
    
    //Cliente auxuliar, lo guardo, para no perderlo, y poder trasladarlo
    // Es un cliente especifico, y en dado caso que no se utilice, tambien es el cliente unico...
    private Cliente clienteAux;

    int numeroArea;
    int numeroCliente;
    
    //Variables auxiliares para atraer si el cliente hcae algun cambio en su precio o lugar
    int orginal=0;
    int diferencia=0;

    private int dolares=565;
    private int euros=624;
    // Valores tomados el dia 24/11/19 del BCCR.com
    

    
    //Constructor utilizando patron de disenno *Singleton*
    private Zoologico() {
        this.arrayArea = new Area[5];
        this.matrizCliente = new Cliente[FIL][COL];
     //   arrayCliente= new Cliente[30];
        this.nombre = "Zoologico Buena Vista de Costa Rica";
        this.cedulaJuridica = "53334952E";
        this.ubicacion = "Del quisco del Parque Morazán 300 metros norte y 175 metros noreste, San José, 10101";
        
        //this.cliente= new Cliente();
        dolares=565;
        euros=624;
        
         numeroArea=0;
        numeroCliente=0;
                

    }
    public static Zoologico getInstanciaZoo(){
        if(zoo==null){
            zoo= new Zoologico();
        }
        return zoo;
    }

    
    //Gets and Sets de los atributos de la clase, para ser  modificadas luego:
    public String getCedulaJuridica() {
        return cedulaJuridica;
    }
    public void setCedulaJuridica(String cedulaJuridica) {
        this.cedulaJuridica = cedulaJuridica;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getUbicacion() {
        return ubicacion;
    }
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public AREAS_ZOOLOGICO getPreciosAreas() {
        return preciosAreas;
    }
    public void setPreciosAreas(AREAS_ZOOLOGICO preciosAreas) {
        this.preciosAreas = preciosAreas;
    }

    public COMBOS_OPCIONES getCombosOpciones() {
        return combosOpciones;
    }
    public void setCombosOpciones(COMBOS_OPCIONES combosOpciones) {
        this.combosOpciones = combosOpciones;
    }

    public TIPO_TARJETA getTipoTarjeta() {
        return tipoTarjeta;
    }
    public void setTipoTarjeta(TIPO_TARJETA tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    
    public int getDolares() {
        return dolares;
    }
    public void setDolares(int dolares) {
        this.dolares = dolares;
    }
    public int getEuros() {
        return euros;
    }
    public void setEuros(int euros) {
        this.euros = euros;
    }
    public void setMoneda(TIPO_MONEDA moneda) {
        this.moneda = moneda;
    }
    public TIPO_MONEDA getMoneda() {
        return moneda;
    }
   
    public int getNumeroArea() {
        return numeroArea;
    }
    public void setNumeroArea(int numeroArea) {
        this.numeroArea = numeroArea;
    }
    public int getNumeroCliente() {
        return numeroCliente;
    }
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    
    public int getContCliente() {
        return contCliente;
    }
    public void setContCliente(int contCliente) {
        this.contCliente = contCliente;
    }

    public MODIFICACIONES_BOLETERIA getModifiacion() {
        return modifiacion;
    }
    public void setModifiacion(MODIFICACIONES_BOLETERIA modifiacion) {
        this.modifiacion = modifiacion;
    }

    public Cliente getClienteAux() {
        return clienteAux;
    }
    public void setClienteAux(Cliente clienteAux) {
        this.clienteAux = clienteAux;
    }

    public COMBOS_OPCIONES getCombosOpciones2() {
        return combosOpciones2;
    }
    public void setCombosOpciones2(COMBOS_OPCIONES combosOpciones2) {
        this.combosOpciones2 = combosOpciones2;
    }

    public int getOrginal() {
        return orginal;
    }
    public void setOrginal(int orginal) {
        this.orginal = orginal;
    }
    public int getDiferencia() {
        return diferencia;
    }
    public void setDiferencia(int diferencia) {
        this.diferencia = diferencia;
    }

    
    
    // <<<<<<<<<<<< METODOS GENERALES A UTILIZAR: >>>>>>>>>>>>
    public void llenarAreaMatriz() {
        for (int i = 0; i < this.FIL; i++) {
            for (int j = 0; j < this.COL; j++) {
                this.matrizCliente[i][j] = null;
            }
        }
    } // Metodo interno    
    public boolean llenaMatrizCliente(int area, Cliente cl, int entradas ){
     int aux= entradas; int cuentaEntradas=0; int numCliente=1;
        for(int i=0; i<=COL;i++){
            if(entradas!=cuentaEntradas){
                if(this.matrizCliente[area][i]==null){
                this.matrizCliente[area][i] = cl;
               zoo.setNumeroArea(area);
               // this.arrayCliente[i]=cl;
                //this.matrizCliente[area][i].setNumeroCliente(i+1);
                cuentaEntradas++;
            }
            }else if(entradas==cuentaEntradas){
               // numCliente++;
                return true;
            }
        }
        return false;
    }
    public void vaciaMatriz(int area,int entradas){
         int aux= entradas; int cuentaEntradas=0; int numCliente=1;
        for(int i=0; i< COL;i++){
            if(entradas!=cuentaEntradas){
                if(this.matrizCliente[area][i] != null){
                this.matrizCliente[area][i] =null;
                cuentaEntradas++;
            }
        }
        }
    }
    public Cliente retornaCliente(int area, int posicion){
        Cliente posicCliente;
          if( this.matrizCliente[area][posicion]==null) {
               return null;       
           }else{
        posicCliente= this.matrizCliente[area][posicion];
          }
        return posicCliente;
    }

    
    
    // <<<<<<<<<<<< PANTALLA INICIAL: >>>>>>>>>>>>
    public boolean validacionDeContrasenna(String contrasenna) {
        char caracter, carct2, carct3;
        char[] arrayChar= contrasenna.toCharArray();
        int contNumero = 0, contLetraMay = 0, contLetraMin = 0, contCarctEspecial = 0;
        
        if (contrasenna.contains("a") || contrasenna.contains("e") || contrasenna.contains("i") || contrasenna.contains("o") || contrasenna.contains("u")
                || contrasenna.contains("A") || contrasenna.contains("E") || contrasenna.contains("I") || contrasenna.contains("O") || contrasenna.contains("U")) {
            return false;
           } else{
            for(int x=0; x< arrayChar.length; x++){
                carct2= arrayChar[x];
                for(int y=x+1; y< arrayChar.length; y++){
                            carct3=arrayChar[y];
                    if(carct2==carct3){
                        return false;
                    }else{
                        for (int i = 0; i < contrasenna.length(); i++) {
                            caracter = contrasenna.charAt(i);
                            String valor = String.valueOf(caracter);
                            if (valor.matches("[A-Z]")) {
                                contLetraMay++;
                            } else if (valor.matches("[a-z]")) {
                                contLetraMin++;
                            } else if (valor.matches("[0-9]")) {
                                contNumero++;
                            } else if (valor.matches("@") || valor.matches(".")
                                    || valor.matches("-") || valor.matches("_")) {
                                contCarctEspecial++;
                            }
                        }
                        if (contNumero >= 1 && contLetraMay >= 1 && contLetraMin >= 1
                                && contCarctEspecial >= 1 && contrasenna.length() >= 4) {
                            return true;
                          }
                      }
                 }
            }
        }  
        return false;
    } //Listo *Valida la contrasenna, pero no genera una*
    public String generacionDeContrasenna(){
        String contrasenna="";
        int d1,d2,d3; String num,p1,p2,p3;
         String minusculas= "bcdfghjklmnpqrstvwxyz";
         String especiales="@-_." ;
         String mayusculas="BCDFGHJKLMNPQRSTVWXYZ";
         
         Random azar = new Random();
         int numero= (int)(Math.random()*9);
         d1= azar.nextInt(minusculas.length());
         d2= azar.nextInt(mayusculas.length());
         d3=azar.nextInt(especiales.length());
         
         num= Integer.toString(numero);
         p1= minusculas.charAt(d1)+"";
         p2=mayusculas.charAt(d2)+"";
         p3=especiales.charAt(d3)+"";
         
         contrasenna= contrasenna+ p2+p1+p3+num;
 
        return contrasenna;
    } 
    //Listo, verificar en la ventana si la introducida y esta son iguales, ademas genera contrasenna! Si lo son, se deja entrar sino, no!!
    public String generacionDeContrasennaAUX(){
        String contrasenna="";
        int d1,d2,d3; String num,p1,p2,p3;
         String minusculas= "bcdfghjklmnpqrstvwxyz";
         String especiales="@-_." ;
         String mayusculas="BCDFGHJKLMNPQRSTVWXYZ";
         
         Random azar = new Random();
        int  contador=0;
         while(contador<100){
         int numero= (int)(Math.random()*9);
         d1= azar.nextInt(minusculas.length());
         d2= azar.nextInt(mayusculas.length());
         d3=azar.nextInt(especiales.length());
         
         num= Integer.toString(numero);
         p1= minusculas.charAt(d1)+"";
         p2=mayusculas.charAt(d2)+"";
         p3=especiales.charAt(d3)+"";
         
         contrasenna= contrasenna+ p2+p1+p3+num+"\t";
 
         if(contador%2==0){
             contrasenna= contrasenna+"\n";
         }
         contador++;
         } 
        return contrasenna;
    } //Para hacer pruebas!!!!
    public String infoZoologico(){
        String info= "Nombre: "+this.nombre+"\n"+
                "Cedula Juridica: "+this.cedulaJuridica+"\n"+
               "Ubicacion: "+ this.ubicacion+"\n";
        return info;
    }
    
    
    //<<<<<<<<<<<< PANTALLA ADMINISTRADOR: >>>>>>>>>>>>
    public String MuestraAreaESTADO(int fila) {
        String contenido = "\r\nOcupado: X  //  Libre: ? \r\n\r\n  ";
        for (int j = 0; j < this.COL; j++) {
            if (matrizCliente[fila][j] == null) {
                contenido = contenido + "[" + " ? " + "] \t";
            } else {
                contenido = contenido + "[ " + " X " + " ]\t";
            }
        }
        return contenido;
    }  // listo 1.1 Admin
    public String ventaTotalPorArea() {
        String venta= "Las ventas generadas por area del zoologico son: \n\n"; 
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
       if(this.numeroArea==0){
           cont1=cont1+this.entradaCONcombo();
       } if(this.numeroArea==1){
           cont2=cont2+this.entradaCONcombo();
       } if(this.numeroArea==2){
           cont3=cont3+this.entradaCONcombo();
       } if(this.numeroArea==3){
           cont4=cont4+this.entradaCONcombo();
       } if(this.numeroArea==4){
           cont5=cont5+this.entradaCONcombo();
       }
        venta =venta +  "AREA_DE_AVES_   : " + cont1
                + "\n\nAREA_ACUATICA_  : " + cont2
                + "\n\nAREA_DE_ANIMALES_SALVAJES_  : " + cont3
                + "\n\nAREA_ANIMALES_COMICOS_  : " + cont4
                + "\n\nFOSILES_  : " + cont5;
        return venta;
    }   //*** ADMINISTRADOR  1.2****  Funciona solo en la ventana?????*******
    public String entradasPorArea() {
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;
        String contenido = "Las entradas vendidas por area del zoologico son: \n\n";
        for (int j = 0; j < this.COL; j++) {
            if (this.matrizCliente[0][j] != null) {
                cont1++;
            } 
        }
             for (int i = 0; i < this.COL; i++) {
                if (this.matrizCliente[1][i] != null) {
                    cont2++;
                } 
             } 
              for (int x = 0; x < this.COL; x++) {
                    if (this.matrizCliente[2][x] != null) {
                        cont3++;
                    } 
              }
               for (int y = 0; y < this.COL; y++) {
                        if (this.matrizCliente[3][y] != null) {
                            cont4++;
                        } 
               }
                for (int z = 0; z < this.COL; z++) {
                            if (this.matrizCliente[4][z] != null) {
                                cont5++;
                            }
                }

        contenido =contenido+  "AREA_DE_AVES_   : " + cont1
                + "\n\nAREA_ACUATICA_  : " + cont2
                + "\n\nAREA_DE_ANIMALES_SALVAJES_  : " + cont3
                + "\n\nAREA_ANIMALES_COMICOS_  : " + cont4
                + "\n\nFOSILES_  : " + cont5;
        return contenido;
    }   // listo Admin 1.3
    public String cantidadEntradasXCliente(){
        String entradas="Las entradas compradas por cliente son: \n\n";
         String cantidad="";
          for (int i = 0; i < this.FIL; i++) {
              if (i==0) {
                entradas= entradas+"AREA_DE_AVES_ : \n";
            } else {
                if (i==1) {
                  entradas= entradas+"\n\nAREA_ACUATICA_: \n";
                } else {
                    if (i==2) {
                        entradas= entradas + "\n\nAREA_DE_ANIMALES_SALVAJES_:\n ";
                    } else {
                        if (i==3) {
                            entradas= entradas+"\n\nAREA_ANIMALES_COMICOS_: \n" ;
                        } else {
                            if (i==4) {
                                entradas= entradas+"\n\nFOSILES_: \n" ;
                            }
                        }
                    }
                }
            }
            for (int j = 0; j < this.COL; j++) {
                if(matrizCliente[i][j]!=null){                    
                     cantidad= Integer.toString(this.matrizCliente[i][j].getCantidadEntradas());
                    entradas= entradas + "Cliente "+(this.matrizCliente[i][j].getNumeroCliente()+1)+": "+cantidad+"\n";
                }
            }
        }
          return entradas;
          
//                     if(matrizCliente[i][j]==null){
//                    cantidad="0";
//                     entradas= entradas + "Cliente "+(j+1)+": "+cantidad+"\n";
//                }else{
//                     cantidad= Integer.toString(this.matrizCliente[i][j].getCantidadEntradas());
//                    entradas= entradas + "Cliente "+(j+1)+": "+cantidad+"\n";
    }// listo 
    // Listo Admin 1.4  /  Admin 1.5 en ventana listo  / Admin 1.6 en ventana listo   / Admin 1.7 en ventana listo
  

    //<<<<<<<<<<<< PANTALLA BOLETERIA: >>>>>>>>>>>>
    public String MuestraAreaDISPONIBLES() {
        String contenido = "\r\nOcupado: [ X ]    //    Libre: [ ? ] \r\n\n";
        for(int i=0; i< this.FIL; i++){
              if (i==0) {
                contenido= contenido+"AREA_DE_AVES_ : \n";
            } else  if (i==1) {
                  contenido= contenido+"\n\nAREA_ACUATICA_: \n";
                } else {
                    if (i==2) {
                        contenido= contenido + "\n\nAREA_DE_ANIMALES_SALVAJES_:\n ";
                    } else  if (i==3) {
                            contenido= contenido+"\n\nAREA_ANIMALES_COMICOS_: \n" ;
                        } else  if (i==4) {
                                contenido= contenido+"\n\nFOSILES_: \n" ;
                            }
                        }  
        for (int j = 0; j < this.COL; j++) {
            if (matrizCliente[i][j] == null) {
                contenido = contenido + "[" + " ? " + "] \t";
            } else {
                contenido = contenido + "[ " + " X " + " ]\t";
            }
        }
        }
        return contenido;
    } // listo SubMenu 1 && 2 [ pt.2 ]
    // Talvez se puede hacer en un mismo boton, y no dos por separado....
    
    //Sub-Menu del punto 3 [REALIZAR COMPRA]
    public int ventaTiqueteArea(){
         int precioPagar=0;
         int annos=this.matrizCliente[this.numeroArea][this.numeroCliente].getEdad();
        switch(preciosAreas){
            case AREA_DE_AVES_:
                if( annos >= 65 || annos <= 3 ){
                    precioPagar= areap.getPrecioAreaAves()/2;
                }else{
                    precioPagar=  areap.getPrecioAreaAves();
                }
               break;
            case AREA_ACUATICA_:
                if( annos >= 65 || annos <= 3 ){
                    precioPagar= areap.getPrecioAreaAcuatica()/2;
                }else{
                    precioPagar=areap.getPrecioAreaAcuatica();
                }
               break;
               
            case AREA_DE_ANIMALES_SALVAJES_:
                if( annos >= 65 || annos <= 3 ){
                    precioPagar= areap.getPrecioAreaSalvajes()/2;
                }else{
                    precioPagar= areap.getPrecioAreaSalvajes();
                }
                break;
            case AREA_ANIMALES_COMICOS_:
                if( annos >= 65 || annos <= 3 ){
                    precioPagar= areap.getPrecioAreaComicos()/2;
                }else{
                    precioPagar= areap.getPrecioAreaComicos();
                }
                break;
                
            case FOSILES_:
                if( annos >= 65 || annos <= 3 ){
                    precioPagar= areap.getPrecioAreaFosiles()/2;
                }else{
                    precioPagar= areap.getPrecioAreaFosiles();
                }
                break;
                
        } // fin del switch
        return precioPagar;
    } //SubMenu 3  [ pt.1 ] LISTO
    public int entradaCONcombo(){
          int totalAPagar=0;
          int cantidadEntradas= this.matrizCliente[this.numeroArea][this.numeroCliente].getCantidadEntradas();
         switch(this.combosOpciones){
             case ENTRADA_REGULAR_:
                 totalAPagar=this.ventaTiqueteArea()*cantidadEntradas;
                 break; 
             case COMBO_1_CON_GOLOSINAS_:
                 totalAPagar=(this.ventaTiqueteArea()+areap.getPrecioComboGolosinas())*cantidadEntradas;
                 break;
             case COMBO_2_CON_GUIA_:
                 // solo es valida para el**** area de fosiles*****, entonces hacer validacion en la ventana!!!!
                 // Con la opcion escogida arriba,en el otro comboBox de las areas!!!
                 totalAPagar=(this.ventaTiqueteArea()+areap.getPrecioComboGuia())*cantidadEntradas;
                 break;
         }
         return totalAPagar;
    } //Submenu 3 [ pt.4&7 ] LISTO
    public int precioXAreaInformacion(){
     int precioPagar=0;
         int annos=this.matrizCliente[this.numeroArea][this.numeroCliente].getEdad();
        switch(preciosAreas){
            case AREA_DE_AVES_:
                    precioPagar=  areap.getPrecioAreaAves(); 
               break;
            case AREA_ACUATICA_:
                    precioPagar=areap.getPrecioAreaAcuatica();
               break;
               
            case AREA_DE_ANIMALES_SALVAJES_:
                    precioPagar= areap.getPrecioAreaSalvajes();              
                break;
            case AREA_ANIMALES_COMICOS_:
                    precioPagar= areap.getPrecioAreaComicos();             
                break;           
            case FOSILES_:
                    precioPagar= areap.getPrecioAreaFosiles();
                break;   
        }
        return precioPagar;
    }
    public int descuentoXArea(){
         int precioPagar=0;
         int annos=this.matrizCliente[this.numeroArea][this.numeroCliente].getEdad();
        switch(preciosAreas){
            case AREA_DE_AVES_:
                if( annos >= 65 || annos <= 3 ){
                    precioPagar= areap.getPrecioAreaAves()/2;
                }else{
                    precioPagar=  0;
                }
               break;
            case AREA_ACUATICA_:
                if( annos >= 65 || annos <= 3 ){
                    precioPagar= areap.getPrecioAreaAcuatica()/2;
                }else{
                    precioPagar=0;
                }
               break;
               
            case AREA_DE_ANIMALES_SALVAJES_:
                if( annos >= 65 || annos <= 3 ){
                    precioPagar= areap.getPrecioAreaSalvajes()/2;
                }else{
                    precioPagar=0;
                }
                break;
            case AREA_ANIMALES_COMICOS_:
                if( annos >= 65 || annos <= 3 ){
                    precioPagar= areap.getPrecioAreaComicos()/2;
                }else{
                    precioPagar= 0;
                }
                break;
                
            case FOSILES_:
                if( annos >= 65 || annos <= 3 ){
                    precioPagar= areap.getPrecioAreaFosiles()/2;
                }else{
                    precioPagar= 0;
                }
                break;
                
        } // fin del switch
        return precioPagar;
    }
    public int tipoMoneda(){
        int moneda=0;
        switch(this.moneda){
            case DOLARES:
                moneda=this.dolares;
                break;
            case  COLONES:
                moneda=1;
                break;
            case EUROS:
                moneda=this.euros;
                break;     
        }
        return moneda;
    }
    public String formadeMoneda(){
         String moneda="";
        switch(this.moneda){
            case DOLARES:
                moneda="$";
                break;
            case  COLONES:
                moneda="₡";
                break;
            case EUROS:
                moneda="€";
                break;     
        }
        return moneda;
    }
    public int totalDeVenta(){
        int combos= this.entradaCONcombo();
        int moneda= this.tipoMoneda();
        int venta=combos/moneda;
        return venta;
    }
    
    public boolean hayCamposSuficientes(int area, int cantidad){
        int aux=1;
        while(aux<=cantidad){
        if(this.matrizCliente[area][aux]==null){
            aux++; 
             if(aux==cantidad){
                return true;
            }
        }
    }
        return false;
    }//Submenu 3 ***Falta terminarlo, ademas testeo!
    public boolean validacionTajetaCredito() throws ParseException {
        String tarjeta= this.matrizCliente[this.numeroArea][this.numeroCliente].getNumeroTarjetaCliente(); int longTarjeta= tarjeta.length();
        String cvv= this.matrizCliente[this.numeroArea][this.numeroCliente].getCodigoSeguridadTarjeta();  int longCVV= cvv.length();
        String fecha= this.matrizCliente[this.numeroArea][this.numeroCliente].getFechaVencimientoTarjetaCliente();
        char a,b,c; char aux; int num;
        
        switch(this.tipoTarjeta){
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
                                        return true;
                                 }
                            }
                       }
                    }else{
                          return false;
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
                                    return true;
                            }
                        }
                      }
                      }else{
                     return false;
                  }
                break;
        }
 
    return false;
    } // SubMenu LISTO
    public String informacionDeCompra(){
    // Informacion cliente (cedula, nombres y apellidos)
     String cedulaCliente= this.matrizCliente[this.numeroArea][this.numeroCliente].getCedulaCliente();
     String nombreCliente=this.matrizCliente[this.numeroArea][this.numeroCliente].getNombreCliente();
     String nombreApellido1= this.matrizCliente[this.numeroArea][this.numeroCliente].getNombreApellido1();
    // Informacion cliente(telefono, correo, nacionalidad, edad,etc)
     int edad= this.matrizCliente[this.numeroArea][this.numeroCliente].getEdad();
     int numeroDeArea=areap.getNumeroDeArea()+1;
    // int numeroAleatorio=(int)(Math.random()*1000+1);
     DateTimeFormatter ftr= DateTimeFormatter.ofPattern("MM/dd/YY hh:mm a");
     String fecha= ftr.format(LocalDateTime.now());  
     int numCliente= this.matrizCliente[this.numeroArea][this.numeroCliente].getNumeroCliente();
    // Informacion sobre tarjeta: (Vísa, Master Card)
     String numeroTarjetaCliente=this.matrizCliente[this.numeroArea][this.numeroCliente].getNumeroTarjetaCliente();
     char unDigitos=numeroTarjetaCliente.charAt(12);
     char dosDigitos=numeroTarjetaCliente.charAt(13);
       char tresDigitos=numeroTarjetaCliente.charAt(14);
       char cuatroDigitos=numeroTarjetaCliente.charAt(15);
       String ultimos4Digitos= ""+unDigitos+dosDigitos+tresDigitos+cuatroDigitos;
      int cantidadEntradas= this.matrizCliente[this.numeroArea][this.numeroCliente].getCantidadEntradas();
      int precioOriginal= this.precioXAreaInformacion();
      int descuento= this.descuentoXArea();
      int subtotal= this.entradaCONcombo();
      int total= this.totalDeVenta();
      String forma= this.formadeMoneda();
      String colon="₡";
     String factura="";
     
     factura= "\n"+nombre+"\n"+
             "Cedula juridica: "+ cedulaJuridica+"\n\n"+
             "Numero de reservacion: "+(numCliente+1)+"\n"+
             "Fecha: "+fecha+"\n"+
             "Nombre del cliente: "+nombreCliente+" "+nombreApellido1+"\n"+
             "Edad: "+edad+"\n"+
             "Tarjeta "+tipoTarjeta+" No. xxxx-xxxx-xxxx-"+ultimos4Digitos+"\n"+
             "Area No. "+numeroDeArea+" : "+preciosAreas+"\n"+
             "Cantidad de entradas: "+ cantidadEntradas+"\n\n\n"+
             "Precio regular: "+colon+precioOriginal+"\n"+
             "Descuento: "+colon+ descuento+"\n"+
             "Subtotal a pagar: "+colon+subtotal+"\n"+
             "Total a pagar en "+"[ "+ this.moneda +" ] : "+forma+total+"\n";
  
     return factura;
    } // SubMenu 3 [RECIBO DE COMPRA EFECTUADA] 
    public String reporteEntrada(){
     // Informacion cliente (cedula, nombres y apellidos)
     String cedulaCliente= this.matrizCliente[this.numeroArea][this.numeroCliente].getCedulaCliente();
     String nombreCliente=this.matrizCliente[this.numeroArea][this.numeroCliente].getNombreCliente();
     String nombreApellido1= this.matrizCliente[this.numeroArea][this.numeroCliente].getNombreApellido1();
     String nombreApellido2= this.matrizCliente[this.numeroArea][this.numeroCliente].getNombreApellido2();
    // Informacion cliente(telefono, correo, nacionalidad, edad,etc)
     int edad= this.matrizCliente[this.numeroArea][this.numeroCliente].getEdad();
     String telefono= this.matrizCliente[this.numeroArea][this.numeroCliente].getTelefonoCliente();
     int numeroDeArea=areap.getNumeroDeArea()+1;
     String correoElec= this.matrizCliente[this.numeroArea][this.numeroCliente].getCorreoElectronicoCliente();
     String nacionalidad= this.matrizCliente[this.numeroArea][this.numeroCliente].getNacionalidadCliente();
     DateTimeFormatter ftr= DateTimeFormatter.ofPattern("MM/dd/YY hh:mm a");
     String fecha= ftr.format(LocalDateTime.now());  
     int numCliente= this.matrizCliente[this.numeroArea][this.numeroCliente].getNumeroCliente();
    // Informacion sobre tarjeta: (Vísa, Master Card)
     String numeroTarjetaCliente=this.matrizCliente[this.numeroArea][this.numeroCliente].getNumeroTarjetaCliente();
     String ultimos4Digitos=numeroTarjetaCliente.charAt(12)+""+numeroTarjetaCliente.charAt(13)+""
             +numeroTarjetaCliente.charAt(14)+""+numeroTarjetaCliente.charAt(15)+"";
      int cantidadEntradas= this.matrizCliente[this.numeroArea][this.numeroCliente].getCantidadEntradas();
      int precioOriginal= this.precioXAreaInformacion();
      int descuento= this.descuentoXArea();
      int subtotal= this.entradaCONcombo();
      int total= this.totalDeVenta();
      String forma= this.formadeMoneda();
      String colon="₡";
     String factura="";
     
     factura= "\n"+nombre+"\n"+
             "Cedula juridica: "+ cedulaJuridica+"\n\n"+
             "Numero de reservacion: "+numCliente+"\n"+
             "Fecha: "+fecha+"\n"+
             "Nombre del cliente: "+nombreCliente+" "+nombreApellido1+" "+nombreApellido2+"\n"+
             "Cedula: "+cedulaCliente+"\n"+
             "Telefono: "+telefono+"\n"+
             "Correo @: " +correoElec+"\n"+
             "Naconalidad: "+ nacionalidad +"\n"+
             "Edad: "+edad+"\n"+
             "Tarjeta "+tipoTarjeta+" No. xxxx-xxxx-xxxx-"+ultimos4Digitos+"\n"+
             "Area No. "+(numeroDeArea+1)+" : "+preciosAreas+"\n"+
             "Cantidad de entradas: "+ cantidadEntradas+"\n\n\n"+
             "Precio regular: "+colon+precioOriginal+"\n"+
             "Descuento: "+colon+ descuento+"\n"+
             "Subtotal a pagar: "+colon+subtotal+"\n"+
             "Total a pagar en "+"[ "+ this.moneda +" ] : "+forma+total+"\n\n\n";
  
     return factura;
    } //Menu, ultima opcion!! Factura de compra de la entrada
    
    public String cancelacionEntradas(){
         String forma= this.formadeMoneda();
        int deduccion=(int) (this.totalDeVenta()*0.25);
        int ahDevolver= this.totalDeVenta()-deduccion;
              String retorno= "Rebajo por cancelacion: "+forma+ahDevolver+"\n"+
                                        "Devolucion: "+forma+deduccion+"\n";
              return retorno;
    }//Listo, muestra cuanto es lo que se pierde en la transaccion
    public String reporteDeCancelacion(){
        // Informacion cliente (cedula, nombres y apellidos)
     String cedulaCliente= this.matrizCliente[this.numeroArea][this.numeroCliente].getCedulaCliente();
     String nombreCliente=this.matrizCliente[this.numeroArea][this.numeroCliente].getNombreCliente();
     String nombreApellido1= this.matrizCliente[this.numeroArea][this.numeroCliente].getNombreApellido1();
     String nombreApellido2= this.matrizCliente[this.numeroArea][this.numeroCliente].getNombreApellido2();
    // Informacion cliente(telefono, correo, nacionalidad, edad,etc)
     int edad= this.matrizCliente[this.numeroArea][this.numeroCliente].getEdad();
     String telefono= this.matrizCliente[this.numeroArea][this.numeroCliente].getTelefonoCliente();
     int numeroDeArea=areap.getNumeroDeArea();
     String correoElec= this.matrizCliente[this.numeroArea][this.numeroCliente].getCorreoElectronicoCliente();
     String nacionalidad= this.matrizCliente[this.numeroArea][this.numeroCliente].getNacionalidadCliente();
     DateTimeFormatter ftr= DateTimeFormatter.ofPattern("MM/dd/YY hh:mm a");
     String fecha= ftr.format(LocalDateTime.now());  
     int numCliente= this.matrizCliente[this.numeroArea][this.numeroCliente].getNumeroCliente();
    // Informacion sobre tarjeta: (Vísa, Master Card)
     String numeroTarjetaCliente=this.matrizCliente[this.numeroArea][this.numeroCliente].getNumeroTarjetaCliente();
     String ultimos4Digitos=numeroTarjetaCliente.charAt(12)+""+numeroTarjetaCliente.charAt(13)+""
             +numeroTarjetaCliente.charAt(14)+""+numeroTarjetaCliente.charAt(15)+"";
      int cantidadEntradas= this.matrizCliente[this.numeroArea][this.numeroCliente].getCantidadEntradas();
      int precioOriginal= this.precioXAreaInformacion();
      int descuento= this.descuentoXArea();
      int subtotal= this.entradaCONcombo();
      int total= this.totalDeVenta();
      String forma= this.formadeMoneda();
      String colon="₡";
      String factura="";
      String cancelacion= this.cancelacionEntradas();
     
   //metodo para borrar los campos tomados por el cliente
//     int contador=0;
//     for(int i=0; i< this.COL; i++){
//         if(contador<=cantidadEntradas){
//         this.matrizCliente[numeroDeArea][i]=null;
//         contador++;
//         }
//     }
     
     
     factura= "\n"+nombre+"\n"+
             "Cedula juridica: "+ cedulaJuridica+"\n\n"+
             "Numero de reservacion: "+numCliente+1+"\n"+
             "Fecha: "+fecha+"\n"+
             "Nombre del cliente: "+nombreCliente+" "+nombreApellido1+" "+nombreApellido2+"\n"+
             "Cedula: "+cedulaCliente+"\n"+
             "Telefono: "+telefono+"\n"+
             "Correo @: " +correoElec+"\n"+
             "Naconalidad: "+ nacionalidad +"\n"+
             "Edad: "+edad+"\n"+
             "Tarjeta "+tipoTarjeta+" No. xxxx-xxxx-xxxx-"+ultimos4Digitos+"\n"+
             "Area No. "+(numeroDeArea+1)+" : "+preciosAreas+"\n"+
             "Cantidad de entradas: "+ cantidadEntradas+"\n\n\n"+
             "Precio regular: "+colon+precioOriginal+"\n"+
             "Descuento: "+colon+ descuento+"\n"+
             "Subtotal a pagar: "+colon+subtotal+"\n"+
             "Total a pagar en "+"[ "+ this.moneda +" ] : "+forma+total+"\n"+
             cancelacion+"\n";
        return factura;
    }// listo ya libera los campos ocupados
    
    public boolean borraCampos(int area,int numero){
        int contador=0;
        for(int j=0; j<this.COL; j++){
            if(this.matrizCliente[area][j].getNumeroCliente()==numero){
               int cantidadEntradas= matrizCliente[area][j].getCantidadEntradas();
                for(int i=0; i< this.COL; i++){
                     if(contador<=cantidadEntradas){
                             this.matrizCliente[area][i]=null;
                             contador++;
                      }else{
                         return true;
                     }
                 }          
            }
        }
        return false;
    } 
    
    //metodos de modificacion del area y busqueda de un cliente especifico
    public Cliente encuentraCliente(int area,int numeroCliente){
       for(int i=0; i< this.COL; i++){
            if(this.matrizCliente[area][i].getNumeroCliente()== numeroCliente-1){
                return this.matrizCliente[area][i];
            }else{
                return null;
            }
       }
        return null;  
    }
    public boolean verificaCliente(int area,int numeroCliente){
       for(int i=0; i< this.COL; i++){
            if(this.matrizCliente[area][i].getNumeroCliente()== numeroCliente-1){
                return true;
            }
       }
        return false;
    }
    public void borraEntradasCliente(int area,int numeroCliente){
         for(int i=0; i< this.COL; i++){
            if(this.matrizCliente[area][i].getNumeroCliente() == numeroCliente-1){
                    this.matrizCliente[area][i]=null;
            }
       }
    }
    public boolean modificaArea(int area, int entradas) {
        int cuentaEntradas=0;
        Cliente viejo=null;
         viejo= this.clienteAux;
        for(int i=0; i< COL;i++){
            if(entradas!=cuentaEntradas){
                if(this.matrizCliente[area][i]==null){
                this.matrizCliente[area][i] = viejo;
             //  zoo.setNumeroArea(area);
                cuentaEntradas++;
            }
            }else if(cuentaEntradas==entradas){
                return true;
            }
        }
        return false;
    }
    
    //Se encargan de realizar la modificacion del recibo de compra al modificar el cliente....
    public int entradaCONcombo2(){
          int totalAPagar=0;
          int cantidadEntradas= this.matrizCliente[this.numeroArea][this.numeroCliente].getCantidadEntradas();
         switch(this.combosOpciones){
             case ENTRADA_REGULAR_:
                 totalAPagar=this.ventaTiqueteArea()*cantidadEntradas;
                 break; 
             case COMBO_1_CON_GOLOSINAS_:
                 totalAPagar=(this.ventaTiqueteArea()+areap.getPrecioComboGolosinas())*cantidadEntradas;
                 break;
             case COMBO_2_CON_GUIA_:
                 // solo es valida para el**** area de fosiles*****, entonces hacer validacion en la ventana!!!!
                 // Con la opcion escogida arriba,en el otro comboBox de las areas!!!
                 totalAPagar=(this.ventaTiqueteArea()+areap.getPrecioComboGuia())*cantidadEntradas;
                 break;
         }
         return totalAPagar;
    } 
    public int diferenciaCombos(){
      int total= this.entradaCONcombo2()-this.entradaCONcombo();
      return total;
  }
    
    // METOODOS QUE MUESTRAN RESULTADOS 
    // SIRVEN CON CUALQUIER CLIENTE
    public String reciboMODIFICADO(){
         // Informacion cliente (cedula, nombres y apellidos)
     String nombreCliente=this.clienteAux.getNombreCliente();
     String nombreApellido1= this.clienteAux.getNombreApellido1();
    // Informacion cliente(telefono, correo, nacionalidad, edad,etc)
     int edad= this.clienteAux.getEdad();
     int numeroDeArea=areap.getNumeroDeArea()+1;
    // int numeroAleatorio=(int)(Math.random()*1000+1);
     DateTimeFormatter ftr= DateTimeFormatter.ofPattern("MM/dd/YY hh:mm a");
     String fecha= ftr.format(LocalDateTime.now());  
     int numCliente= this.clienteAux.getNumeroCliente();
    // Informacion sobre tarjeta: (Vísa, Master Card)
     String numeroTarjetaCliente=this.clienteAux.getNumeroTarjetaCliente();
     char unDigitos=numeroTarjetaCliente.charAt(12);
     char dosDigitos=numeroTarjetaCliente.charAt(13);
       char tresDigitos=numeroTarjetaCliente.charAt(14);
       char cuatroDigitos=numeroTarjetaCliente.charAt(15);
       String ultimos4Digitos= ""+unDigitos+dosDigitos+tresDigitos+cuatroDigitos;
      int cantidadEntradas= this.clienteAux.getCantidadEntradas();
      int precioOriginal= this.precioXAreaInformacion();
      int descuento= this.descuentoXArea();
      int subtotal= this.entradaCONcombo();
      int total= this.totalDeVenta();
      String forma= this.formadeMoneda();
      String colon="₡";
     String factura="";
     
     factura= "\n"+nombre+"\n"+
             "Cedula juridica: "+ cedulaJuridica+"\n\n"+
             "Numero de reservacion: "+(numCliente+1)+"\n"+
             "Fecha: "+fecha+"\n"+
             "Nombre del cliente: "+nombreCliente+" "+nombreApellido1+"\n"+
             "Edad: "+edad+"\n"+
             "Tarjeta "+tipoTarjeta+" No. xxxx-xxxx-xxxx-"+ultimos4Digitos+"\n"+
             "Area No. "+numeroDeArea+" : "+preciosAreas+"\n"+
             "Cantidad de entradas: "+ cantidadEntradas+"\n\n\n"+
             "Precio regular: "+colon+precioOriginal+"\n"+
             "Descuento: "+colon+ descuento+"\n"+
             "Subtotal a pagar: "+colon+subtotal+"\n"+
             "Diferencia "+this.diferecniaPALABRA() +colon+this.diferencia()+"\n"+
             "Total a pagar en "+"[ "+ this.moneda +" ] : "+forma+total+"\n";
  
     return factura;
    }
    public String reporteMODIFICADO(){
          // Informacion cliente (cedula, nombres y apellidos)
     String cedulaCliente=this.clienteAux.getCedulaCliente();
     String nombreCliente=this.clienteAux.getNombreCliente();
     String nombreApellido1=this.clienteAux.getNombreApellido1();
     String nombreApellido2= this.clienteAux.getNombreApellido2();
    // Informacion cliente(telefono, correo, nacionalidad, edad,etc)
     int edad= this.clienteAux.getEdad();
     String telefono= this.clienteAux.getTelefonoCliente();
     int numeroDeArea=areap.getNumeroDeArea()+1;
     String correoElec= this.clienteAux.getCorreoElectronicoCliente();
     String nacionalidad= this.clienteAux.getNacionalidadCliente();
     DateTimeFormatter ftr= DateTimeFormatter.ofPattern("MM/dd/YY hh:mm a");
     String fecha= ftr.format(LocalDateTime.now());  
     int numCliente= this.clienteAux.getNumeroCliente();
    // Informacion sobre tarjeta: (Vísa, Master Card)
     String numeroTarjetaCliente=this.clienteAux.getNumeroTarjetaCliente();
     String ultimos4Digitos=numeroTarjetaCliente.charAt(12)+""+numeroTarjetaCliente.charAt(13)+""
             +numeroTarjetaCliente.charAt(14)+""+numeroTarjetaCliente.charAt(15)+"";
      int cantidadEntradas= this.clienteAux.getCantidadEntradas();
      int precioOriginal= this.precioXAreaInformacion();
      int descuento= this.descuentoXArea();
      int subtotal= this.entradaCONcombo();
      int total= this.totalDeVenta();
      String forma= this.formadeMoneda();
      String colon="₡";
     String factura="";
     
     factura= "\n"+nombre+"\n"+
             "Cedula juridica: "+ cedulaJuridica+"\n\n"+
             "Numero de reservacion: "+numCliente+"\n"+
             "Fecha: "+fecha+"\n"+
             "Nombre del cliente: "+nombreCliente+" "+nombreApellido1+" "+nombreApellido2+"\n"+
             "Cedula: "+cedulaCliente+"\n"+
             "Telefono: "+telefono+"\n"+
             "Correo @: " +correoElec+"\n"+
             "Naconalidad: "+ nacionalidad +"\n"+
             "Edad: "+edad+"\n"+
             "Tarjeta "+tipoTarjeta+" No. xxxx-xxxx-xxxx-"+ultimos4Digitos+"\n"+
             "Area No. "+(numeroDeArea+1)+" : "+preciosAreas+"\n"+
             "Cantidad de entradas: "+ cantidadEntradas+"\n\n\n"+
             "Precio regular: "+colon+precioOriginal+"\n"+
             "Descuento: "+colon+ descuento+"\n"+
             "Subtotal a pagar: "+colon+subtotal+"\n"+
             "Total a pagar en "+"[ "+ this.moneda +" ] : "+forma+total+"\n\n\n";
  
     return factura;
    }
    public String cancelacionMODIFICADO(){
            // Informacion cliente (cedula, nombres y apellidos)
     String cedulaCliente= this.clienteAux.getCedulaCliente();
     String nombreCliente=this.clienteAux.getNombreCliente();
     String nombreApellido1= this.clienteAux.getNombreApellido1();
     String nombreApellido2= this.clienteAux.getNombreApellido2();
    // Informacion cliente(telefono, correo, nacionalidad, edad,etc)
     int edad=this.clienteAux.getEdad();
     String telefono=this.clienteAux.getTelefonoCliente();
     int numeroDeArea=areap.getNumeroDeArea();
     String correoElec=this.clienteAux.getCorreoElectronicoCliente();
     String nacionalidad= this.clienteAux.getNacionalidadCliente();
     DateTimeFormatter ftr= DateTimeFormatter.ofPattern("MM/dd/YY hh:mm a");
     String fecha= ftr.format(LocalDateTime.now());  
     int numCliente=this.clienteAux.getNumeroCliente();
    // Informacion sobre tarjeta: (Vísa, Master Card)
     String numeroTarjetaCliente=this.clienteAux.getNumeroTarjetaCliente();
     String ultimos4Digitos=numeroTarjetaCliente.charAt(12)+""+numeroTarjetaCliente.charAt(13)+""
             +numeroTarjetaCliente.charAt(14)+""+numeroTarjetaCliente.charAt(15)+"";
      int cantidadEntradas= this.clienteAux.getCantidadEntradas();
      int precioOriginal= this.precioXAreaInformacion();
      int descuento= this.descuentoXArea();
      int subtotal= this.entradaCONcombo();
      int total= this.totalDeVenta();
      String forma= this.formadeMoneda();
      String colon="₡";
      String factura="";
      String cancelacion= this.cancelacionEntradas();

     factura= "\n"+nombre+"\n"+
             "Cedula juridica: "+ cedulaJuridica+"\n\n"+
             "Numero de reservacion: "+numCliente+1+"\n"+
             "Fecha: "+fecha+"\n"+
             "Nombre del cliente: "+nombreCliente+" "+nombreApellido1+" "+nombreApellido2+"\n"+
             "Cedula: "+cedulaCliente+"\n"+
             "Telefono: "+telefono+"\n"+
             "Correo @: " +correoElec+"\n"+
             "Naconalidad: "+ nacionalidad +"\n"+
             "Edad: "+edad+"\n"+
             "Tarjeta "+tipoTarjeta+" No. xxxx-xxxx-xxxx-"+ultimos4Digitos+"\n"+
             "Area No. "+(numeroDeArea+1)+" : "+preciosAreas+"\n"+
             "Cantidad de entradas: "+ cantidadEntradas+"\n\n\n"+
             "Precio regular: "+colon+precioOriginal+"\n"+
             "Descuento: "+colon+ descuento+"\n"+
             "Subtotal a pagar: "+colon+subtotal+"\n"+
             "Total a pagar en "+"[ "+ this.moneda +" ] : "+forma+total+"\n"+
             cancelacion+"\n";
        return factura;
    }

    // Calcula la diferencia si el cliente hace algun cambio
    public int diferenciaCliente(int entradas,int area){
        //hago el calculo de la diferencia, con la cantidad de entradas y numero de area
        // como si estuviera comprando inicialmente
        // luego este metodo se lo resto al total de la otra de seleccion de area, y eso me da la diferencia
        // y termino adjuntando ese metodo en la factura       
        // la diferencia si es a favor en contra la averiguo con un if   ( v>n es a favor  / n>v  en contra  )
        int diferencia=0;
        if(area==0){
            diferencia=areap.getPrecioAreaAves()*entradas;
        }else if(area==1){
            diferencia= areap.getPrecioAreaAcuatica()*entradas;
        }else if(area==2){
            diferencia=areap.getPrecioAreaSalvajes()*entradas;
        }else if(area==3){
            diferencia= areap.getPrecioAreaComicos()*entradas;
        }else if(area==4){
            diferencia= areap.getPrecioAreaFosiles()*entradas;
        }
        return diferencia;
    }
    public String muestraDiferenciaCliente(){
        String total="";
        // pensar como llamar el metodo sin tener que enviar de nuevo los parametros
        
        
       return total;
    }
    
    public int diferencia(){
         int diferencia;
      if(this.diferencia==0){
          diferencia=0;
      }else{
         diferencia= this.orginal- this.diferencia;
      }
        return diferencia;
    }
    public String diferecniaPALABRA(){
        String palabra="";
        if(this.diferencia> this.orginal){
            palabra="en contra: ";
        }else{
            palabra="a favor: ";     
                }
        return palabra;
    }
    
} // fin de la clase