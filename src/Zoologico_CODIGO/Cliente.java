 
package Zoologico_CODIGO;


public class Cliente {
    
    // Informacion cliente (cedula, nombres y apellidos)
    private String cedulaCliente; //
    private String nombreCliente; //
    private String nombreApellido1; //
    private String nombreApellido2; //
    // Informacion cliente(telefono, correo, nacionalidad, edad)
    private String telefonoCliente; //
    private String correoElectronicoCliente; //
    private String nacionalidadCliente; //
    private int edad=10; //
    // Informacion sobre tarjeta: (Vísa, Master Card)
    private String tipoTarjetaCliente; //
    private String numeroTarjetaCliente; //
    private String fechaVencimientoTarjetaCliente; //
    private String codigoSeguridadTarjeta; //
    // Tipo de moneda ha realizar la transaccion
    private String tipoMoneda; //
    // POSIBLE CONCATENACION
    private int totalPagado;
    
    //Variables extra-oficiales:
      private int cantidadEntradas;

       private int numeroCliente;
       private int numeroArea;
    
    public  Cliente(){
        this.cedulaCliente="";
        this.codigoSeguridadTarjeta="";
        this.correoElectronicoCliente="";
        this.edad=0;
        this.fechaVencimientoTarjetaCliente="";
        this.nacionalidadCliente="";
        this.nombreApellido1="";
        this.nombreApellido2="";
        this.nombreCliente="";
        this.numeroTarjetaCliente="";
        this.telefonoCliente="";
        this.tipoMoneda="";
        this.tipoTarjetaCliente="";
        this.tipoTarjetaCliente="";
        
        this.cantidadEntradas=0;
        this.numeroCliente=0;
        
    }


    //Gets and Sets de los atributos de la clase, para ser  modificadas luego:
    public String getCedulaCliente() {
        return cedulaCliente;
    }
    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }
    public String getNombreCliente() {
        return nombreCliente;
    }
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }
    public String getNombreApellido1() {
        return nombreApellido1;
    }
    public void setNombreApellido1(String nombreApellido1) {
        this.nombreApellido1 = nombreApellido1;
    }
    public String getNombreApellido2() {
        return nombreApellido2;
    }
    public void setNombreApellido2(String nombreApellido2) {
        this.nombreApellido2 = nombreApellido2;
    }
    public String getTelefonoCliente() {
        return telefonoCliente;
    }
    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    public String getCorreoElectronicoCliente() {
        return correoElectronicoCliente;
    }
    public void setCorreoElectronicoCliente(String correoElectronicoCliente) {
        this.correoElectronicoCliente = correoElectronicoCliente;
    }
    public String getNacionalidadCliente() {
        return nacionalidadCliente;
    }
    public void setNacionalidadCliente(String nacionalidadCliente) {
        this.nacionalidadCliente = nacionalidadCliente;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getTipoTarjetaCliente() {
        return tipoTarjetaCliente;
    }
    public void setTipoTarjetaCliente(String tipoTarjetaCliente) {
        this.tipoTarjetaCliente = tipoTarjetaCliente;
    }
    public String getNumeroTarjetaCliente() {
        return numeroTarjetaCliente;
    }
    public void setNumeroTarjetaCliente(String numeroTarjetaCliente) {
        this.numeroTarjetaCliente = numeroTarjetaCliente;
    }
    public String getFechaVencimientoTarjetaCliente() {
        return fechaVencimientoTarjetaCliente;
    }
    public void setFechaVencimientoTarjetaCliente(String fechaVencimientoTarjetaCliente) {
        this.fechaVencimientoTarjetaCliente = fechaVencimientoTarjetaCliente;
    }
    public String getCodigoSeguridadTarjeta() {
        return codigoSeguridadTarjeta;
    }
    public void setCodigoSeguridadTarjeta(String codigoSeguridadTarjeta) {
        this.codigoSeguridadTarjeta = codigoSeguridadTarjeta;
    }
    public String getTipoMoneda() {
        return tipoMoneda;
    }
    public void setTipoMoneda(String tipoMoneda) {
        this.tipoMoneda = tipoMoneda;
    } 

    public int getCantidadEntradas() {
        return cantidadEntradas;
    }
    public void setCantidadEntradas(int cantidadEntradas) {
        this.cantidadEntradas = cantidadEntradas;
    } 

    public int getNumeroCliente() {
        return numeroCliente;
    }
    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public int getNumeroArea() {
        return numeroArea;
    }
    public void setNumeroArea(int numeroArea) {
        this.numeroArea = numeroArea;
    }
    
    
    
}// fin de la clase