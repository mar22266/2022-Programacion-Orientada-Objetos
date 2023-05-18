/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */

public class celulares extends producto implements interfazPortable, iterfazLlamadas {
    
    //atributos clase padre y funcionalidades
    public celulares(String nombre, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo){
        super(nombre, precio, marca, fechaFabricacion, serie, marcadorAR, "celulares");
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("Hace Llamadas");
    }

        
        /** 
         * @return String portabilidad mensaje
         */
        public String portableM() {
            return "El celular " + this.getNombre() + " es portatil";
        }

        
        /** llamar mensaje
         * @param numero
         * @return String
         */
        public String llamar(int numero) {
            return "llamando al numero " + numero + this.getNombre();
            
        }

        
        /** verificar si llama y si portable
         * @param f
         * @param w
         * @return String
         */
        public String verificar(String f, String w) {
            switch(f){
                case "portabilidad":
                    return this.portableM();
                case "llamar":
                    return this.llamar(Integer.parseInt(w));
                default:
                    return "ERROR INTENTE OTRA VEZ";
            }
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
    public boolean portable() {
        // TODO Auto-generated method stub
        return true;
    }

    
    /** 
     * @param o
     * interfas compar to
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