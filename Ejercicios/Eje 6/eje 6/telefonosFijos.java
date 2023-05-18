/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */

public class telefonosFijos extends producto implements iterfazLlamadas {
//atributos clase padre y sus funcionalidades
    public telefonosFijos(String nombre, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo){
        super(nombre, precio, marca, fechaFabricacion, serie, marcadorAR, "telefonosFijos");
        this.agregarFuncionalidad("Hace llamadas");

    }


    
    /** mensaje de llamar
     * @param numero
     * @return String
     */
    public String llamar(int numero) {
        return "llamando al numero " + numero + this.getNombre();
        
    }


    
    /** funcionalidad de llamar
     * @param f
     * @param p
     * @return String
     */
    public String verificar(String f, String p) {
        if(f.equals("llamar")){
            return this.llamar(Integer.parseInt(p));
        }else{
            return "ERROR INTENTE OTRA VEZ";
        }
    }
    

    
    /** interfaz de compare to
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


    
    /** interfaz usada
     * @return boolean
     */
    @Override
    public boolean hacerCalls() {
        // TODO Auto-generated method stub
        return true;
    }
}
