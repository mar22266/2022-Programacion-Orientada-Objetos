/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */
public class tv extends producto implements interfazInternet, interfazReproducirVideo {
//atrubtos clase padre y sus funcionalidades
    public tv(String nombre, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo){
        super(nombre, precio, marca, fechaFabricacion, serie, marcadorAR, "tv");
        this.agregarFuncionalidad("Reproduce video");
        this.agregarFuncionalidad("Navega en internet");


    }

    
    /** menaje de reproducir video
     * @return String
     */
    public String reproducir() {
        return "Reproduciendo video " + this.getNombre();
    }

    
    /** mensaje de navegar en internet
     * @param link
     * @return String
     */
    public String navegar(String link) {
        return "Entrando a " + link + " desde mi Desktop " + this.getNombre();
    }


    
    /** 
     * comprobar la sfuncionalidades
     * @param f
     * @param p
     * @return String
     */
    public String probar(String f, String p) {
        switch(f){
            case "reproducirVideo":
                return this.reproducir();
            case "navegarInternet":
                return this.navegar(p);
            default:
                return "ERROR INTENTE OTRA VEZ";
        }
    }


    
    /** interfaz compare to
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

    
    /** interfaces usadas
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
