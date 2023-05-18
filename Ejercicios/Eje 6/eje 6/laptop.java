/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */

public class laptop extends producto implements interfazInternet, interfazPortable, interfazReproducirVideo,interfazVideoJuego {
   
   //atributos clase padre y sus funcionalidades
    public laptop(String nombre, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo){
        super(nombre, precio, marca, fechaFabricacion, serie, marcadorAR, "laptop");
        this.agregarFuncionalidad("Reproduce video");
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("juega Videojuegos");
        this.agregarFuncionalidad("Navega en internet");


    }
    
    /** mesaje si es portable
     * @return String
     */
    public String portableM() {
        return "La laptop " + this.getNombre()+ "es portatil";
    }
    

    
    /** 
     * mensaje de video
     * @return String
     */
    public String reproducir() {
        return "Reproduciendo el video desde mi Laptop " + this.getNombre();
    }
    

    
    /** 
     * mensaje de videojuego
     * @return String
     */
    public String ejecutar() {
        return "El juego"+ this.getNombre()+ "se ha ejecutado";

    }
    

    
    /** mensaje de navegar en internet
     * @param link
     * @return String
     */
    public String navegar(String link) {
        return "Entrando a " + link + " desde mi Desktop " + this.getNombre();
    }
    

    
    /** verificar si ejecuta video juego etc....
     * @param f
     * @param p
     * @return String
     */
    public String verificar(String f, String p) {
        switch(f){
            case "ejecutarVideojuego":
                return this.ejecutar();
            case "navegarInternet":
                return this.navegar(p);
            case "reproducirVideo":
                return this.reproducir();
            case "portabilidad":
                return this.portableM();
            default:
                return "ERROR INTENTE OTRA VEZ"; 
        }
    }
    
    /** 
     * interfaces usadas
     * @return boolean
     */
    @Override
    public boolean reproJuego() {
        // TODO Auto-generated method stub
        return true;
    }
    
    /** 
     * @return boolean
     */
    @Override
    public boolean reproducirvideo() {
        // TODO Auto-generated method stub
        return true;
    }
    
    /** 
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



}
