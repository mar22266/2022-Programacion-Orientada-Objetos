/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */


public class desktop extends producto implements interfazInternet, interfazReproducirVideo, interfazVideoJuego{
    //atributos clase padre y funcionalidades
    public desktop(String nombre, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo){
       super(nombre, precio, marca, fechaFabricacion, serie, marcadorAR, "desktop");
        this.agregarFuncionalidad("jugar Videojuegos");
        this.agregarFuncionalidad("Navegar en Internet");
        this.agregarFuncionalidad("Reproduce videos");
    }
    

    
    /** mensaje de juego
     * @return String
     */
    public String ejecutar() {
        return  "El juego " + this.getNombre()+ "se ejecuta perfectamente!";  
        
    }
    

    
    /** mensaje de video 
     * @return String
     */
    public String reproducir() {
        return "Reproduciendo video desde mi Desktop " + this.getNombre();
    }
    

    
    /** mensaje de navergar en internet
     * @param link
     * @return String
     */
    public String navegar(String link) {
        return "Entrando a " + link + " desde mi Desktop " + this.getNombre();
    }
    

    
    /** 
     * @param f
     * 
     * verificar si reproduce video etc...
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
            default:
                return "ERROR INTENTE OTRA";
        }    
    }
    


    
    /** 
     * @param o
     * interfaz compare to
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

    
    /** interfases usadas
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
    public boolean navegarInter() {
        // TODO Auto-generated method stub
        return true;
    }
}
