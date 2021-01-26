
package Zoologico_CODIGO;


public class Area {
    // Atributos oficiales:
    private int numeroDeArea;
    private String descripcion;
    private int precio;
    private boolean estaOcupada;
    private int capacidadMaximaActual;
    
    // Atributos extra-oficiales:
    private AREAS_ZOOLOGICO preciosAreas;
    private Cliente cliente;
    private static Area area=null;
    private Zoologico zoo;
    private COMBOS_OPCIONES combosOpciones;
    
    private int precioAreaAves=3000;
    private int precioAreaAcuatica=3000;
    private int precioAreaSalvajes=4000;
    private int precioAreaComicos=4000;
    private int precioAreaFosiles=5000;
    
    private int precioComboGolosinas=6000;
    private int precioComboGuia=10000;
    

/***
 * Construye las areas para reservar el zoologico
 * @param preciosAreas Areas del zoologico
 * @param combosOpciones 
 */    
    public Area(AREAS_ZOOLOGICO preciosAreas,COMBOS_OPCIONES combosOpciones){
        this.capacidadMaximaActual=0;
        this.descripcion="";
        this.numeroDeArea=0;
        this.preciosAreas= preciosAreas;
        this.combosOpciones=combosOpciones;
        
               precioAreaAves=3000;
                    precioAreaAcuatica=3000;
                       precioAreaSalvajes=4000;
                         precioAreaComicos=4000;
                             precioAreaFosiles=5000;
    
                        precioComboGolosinas=6000;
                        precioComboGuia=10000;
    

        
    }
    public Area(AREAS_ZOOLOGICO preciosAreas){
         this.preciosAreas= preciosAreas;
    }
    public Area(Zoologico zoop){
        this.zoo= zoop;
    }
    
    // Constructor creado con *Patron de disenno ( Singleton) * Para que todas las clases tengan el mismo constructor e instancia
    private Area(){
        
               precioAreaAves=3000;
                    precioAreaAcuatica=3000;
                       precioAreaSalvajes=4000;
                         precioAreaComicos=4000;
                             precioAreaFosiles=5000;
    
                        precioComboGolosinas=6000;
                        precioComboGuia=10000;
        
    } 
    /***
     * @
     * @return 
     */
    public static Area getInstancia(){
        if(area==null){
            area = new Area();
        }
        return area;
    }
    
    
    //Gets and Sets de los atributos de la clase, para ser  modificadas luego:
    public int getNumeroDeArea() {
        return numeroDeArea;
    }
    public void setNumeroDeArea(int numeroDeArea) {
        this.numeroDeArea = numeroDeArea;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getPrecio() {
        return precio;
    }
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public int getCapacidadMaximaActual() {
        return capacidadMaximaActual;
    }
    public void setCapacidadMaximaActual(int capacidadMaximaActual) {
        this.capacidadMaximaActual = capacidadMaximaActual;
    }

    public AREAS_ZOOLOGICO getPreciosAreas() {
        return preciosAreas;
    }
    public void setPreciosAreas(AREAS_ZOOLOGICO preciosAreas) {
        this.preciosAreas = preciosAreas;
    }

    public int getPrecioAreaAves() {
        return precioAreaAves;
    }
    public void setPrecioAreaAves(int precioAreaAves) {
        this.precioAreaAves = precioAreaAves;
    }
    public int getPrecioAreaAcuatica() {
        return precioAreaAcuatica;
    }
    public void setPrecioAreaAcuatica(int precioAreaAcuatica) {
        this.precioAreaAcuatica = precioAreaAcuatica;
    }
    public int getPrecioAreaSalvajes() {
        return precioAreaSalvajes;
    }
    public void setPrecioAreaSalvajes(int precioAreaSalvajes) {
        this.precioAreaSalvajes = precioAreaSalvajes;
    }
    public int getPrecioAreaComicos() {
        return precioAreaComicos;
    }
    public void setPrecioAreaComicos(int precioAreaComicos) {
        this.precioAreaComicos = precioAreaComicos;
    }
    public int getPrecioAreaFosiles() {
        return precioAreaFosiles;
    }
    public void setPrecioAreaFosiles(int precioAreaFosiles) {
        this.precioAreaFosiles = precioAreaFosiles;
    }


    public int getPrecioComboGolosinas() {
        return precioComboGolosinas;
    }
    public void setPrecioComboGolosinas(int precioComboGolosinas) {
        this.precioComboGolosinas = precioComboGolosinas;
    }
    public int getPrecioComboGuia() {
        return precioComboGuia;
    }
    public void setPrecioComboGuia(int precioComboGuia) {
        this.precioComboGuia = precioComboGuia;
    }

    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public Area getArea() {
        return area;
    }
    public void setArea(Area area) {
        this.area = area;
    }
  
    
     // Metodos realizados dentro de la aplicacion:
 public int precioXAreaSeleccionada(){
        int precioPagar=0;
        int annos=this.cliente.getEdad();
        
        switch(this.preciosAreas){
            
            case AREA_DE_AVES_:
                 //  precioPagar= precios;
                if( annos >= 65 || annos <= 12 ){
                    precioPagar= this.precioAreaAves/2;
                }else{
                    precioPagar=  this.precioAreaAves;
                }
               break;
            case AREA_ACUATICA_:
             //  precioPagar= precios;
                if( annos >= 65 || annos <= 12 ){
                    precioPagar= this.precioAreaAcuatica/2;
                }else{
                    precioPagar= precioAreaAcuatica;
                }
               break;
               
            case AREA_DE_ANIMALES_SALVAJES_:
               //precioPagar= precios;
                if( annos >= 65 || annos <= 12 ){
                    precioPagar= this.precioAreaSalvajes/2;
                }else{
                    precioPagar= this.precioAreaSalvajes;
                }
                break;
            case AREA_ANIMALES_COMICOS_:
               //precioPagar= precios;
                if( annos >= 65 || annos <= 12 ){
                    precioPagar= this.precioAreaComicos/2;
                }else{
                    precioPagar= this.precioAreaComicos;
                }
                break;
                
            case FOSILES_:
               // precioPagar= precios;
                if( annos >= 65 || annos <= 12 ){
                    precioPagar= this.precioAreaFosiles/2;
                }else{
                    precioPagar= this.precioAreaFosiles;
                }
                break;
                
        } // fin del switch
        return precioPagar;
     } 
 public int precioConCombosTOTAL(){
          int totalAPagar=0;
          int cantidadEntradas= cliente.getCantidadEntradas();
         switch(this.combosOpciones){
             case ENTRADA_REGULAR_:
                 totalAPagar=this.precioXAreaSeleccionada()*cantidadEntradas;
                 break; 
             case COMBO_1_CON_GOLOSINAS_:
                 totalAPagar=(this.precioXAreaSeleccionada()+this.precioComboGolosinas)*cantidadEntradas;
                 break;
             case COMBO_2_CON_GUIA_:
                 // solo es valida para el**** area de fosiles*****, entonces hacer validacion en la ventana!!!!
                 // Con la opcion escogida arriba,en el otro comboBox de las areas!!!
                 totalAPagar=(this.precioXAreaSeleccionada()+this.precioComboGuia)*cantidadEntradas;
                 break;
         }
         return totalAPagar;
     }
     

}// fin de la clase
