/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */

public class camaras extends producto implements interfazFotos, interfazReproducirVideo, interfazPortable {
    
//atributos de clase padre y funcionalidad
    public camaras(String nombre, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo){
        super(nombre, precio, marca, fechaFabricacion, serie, marcadorAR, "camaras");
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("Toma Fotos");
        this.agregarFuncionalidad("Reproduce Videos");
    }

    
    /** 
     * mensaje portable
     * @return String
     */
    public String portableM() {
        return "La camara " + this.getNombre() + " es portatil";
    }

    
    /** mensaje video
     * @return String
     */
    public String reproducir() {
        return "Reproduciendo video " + this.getNombre();
    }

    
    /** mensaje foto
     * @return String
     */
    public String tomarFoto() {
        return " Tomando foto con la camara " + this.getNombre();
    }

    
    /** 
     * @return boolean 
     * interfaces usadas
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
    public boolean tomarPics() {
        // TODO Auto-generated method stub
        return true;
    }

    
    /** 
     * @return boolean
     */
    public boolean portable(){

        return true;
    }

    
    /** verificar
     * @param f
     * @return String
     */
    public String verificar(String f) { 
        switch(f){
            case "portabilidad":
                return this.portableM();
            case "reproducirVideo":
                return this.reproducir();
            case "tomarFoto":
                return this.tomarFoto();
            default:
                return "ERROR INTENTE OTRA VEZ";
        }
    }



    
    /** interfas compare to
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

}
