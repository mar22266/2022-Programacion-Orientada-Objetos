/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */
public class smartphones extends producto implements interfazFotos, iterfazLlamadas, interfazInternet,interfazPortable,interfazReproducirVideo {
   //atributos de clase padre y funcionalidades de la clase
    public smartphones(String nombre, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo){
        super(nombre, precio, marca, fechaFabricacion, serie, marcadorAR, "smartphones");
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("Reproduce videos");
        this.agregarFuncionalidad("Navegar en Internet");
        this.agregarFuncionalidad("Toma fotos");
        this.agregarFuncionalidad("Realiza Llamadas");

    }

    
    /** mensaje para navegar en internet
     * @param link
     * @return String
     */
    public String navegar(String link) {
        return "Entrando a " + link + " desde mi Desktop " + this.getNombre();
    }
    
    
    /** mensaje para portabilidad
     * @return String
     */
    public String portableM() {
        return "La laptop " + this.getNombre()+ "es portatil";
    }
    

    
    /** mensaje para reproducir video
     * @return String
     */
    public String reproducir() {
        return "Reproduciendo el video desde mi Laptop " + this.getNombre();
    }

    
    /** 
     * mensaje para tomar foto
     * @return String
     */
    public String tomarFoto() {
        return " Tomando foto con la camara " + this.getNombre();
    }

    
    /** 
     * mensaje para llamer
     * @param numero
     * @return String
     */
    public String llamar(int numero) {
        return "llamando al numero " + numero + this.getNombre();
        
    }


    
    /** verificar si hace las funcionalidades 
     * @param F
     * @param P
     * @return String
     */
    public String verificar(String F, String P) {
        switch(F){
            case "portabilidad":
                return this.portableM();
            case "reproducirVideo":
                return this.reproducir();
            case "navegarInternet":
                return this.navegar(P);
            case "tomarFoto":
                return this.tomarFoto();
            case "llamar":
                return this.llamar(Integer.parseInt(P));
            default:
                return "ERROR INTENTE OTRA VEZ";
        }
    }

    
    /** interfas de comparet0
     * @param o
     * @return int
     */
    public int compareTo(producto o) {
        if(this.getPrecio() > o.getPrecio()){
            return 1;
        }else if(this.getPrecio() < o.getPrecio()){
            return -1;
        }else{
            return 0;
        }
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean reproducirvideo() {
        // TODO Auto-generated method stub
        return true;
    }

    
    /** iterfaces utilizadass
     * @return boolean
     */
    @Override
    public boolean portable() {
        // TODO Auto-generated method stub
        return true;
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean navegarInter() {
        // TODO Auto-generated method stub
        return true;
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean hacerCalls() {
        // TODO Auto-generated method stub
        return true;
    }

    
    /** 
     * @return boolean
     */
    @Override
    public boolean tomarPics() {
        // TODO Auto-generated method stub
        return true;
    }

}
