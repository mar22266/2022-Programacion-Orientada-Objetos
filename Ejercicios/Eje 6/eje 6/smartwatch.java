/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */
public class smartwatch extends producto implements interfazFotos, interfazPortable, iterfazLlamadas {
//atributos de la clase padrre y sus funcionalidades
    public smartwatch(String nombre, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo){
        super(nombre, precio, marca, fechaFabricacion, serie, marcadorAR, "smartwatch");
        this.agregarFuncionalidad("Portabilidad");
        this.agregarFuncionalidad("Hace llamadas");
        this.agregarFuncionalidad("Toma fotos");

    }
        
        /** mensaje de tomar foto
         * @return String
         */
        public String tomarFoto() {
            return " Tomando foto con la camara " + this.getNombre();
        }

        
        /** mensaje de portabilidad
         * @return String
         */
        public String portableM() {
            return "La camara " + this.getNombre() + " es portatil";
        }
    
        
        /** mensaje de llamar
         * @param numero
         * @return String
         */
        public String llamar(int numero) {
            return "llamando al numero " + numero + this.getNombre();
            
        }

    
    /** comprobar las ufncionlidades
     * @param f
     * @param p
     * @return String
     */
    public String verificar(String f, String p) {
            switch(f){
                case "llamar":
                    return this.llamar(Integer.parseInt(p));
                case "tomarFoto":
                    return this.tomarFoto();
                case "portabilidad":
                    return this.portableM();
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
        
        /** interfaces utilizadas
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
         * @return boolean
         */
        @Override
        public boolean tomarPics() {
            // TODO Auto-generated method stub
            return true;
        }


    
    
}
