/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */
public class tablet extends producto implements interfazFotos, interfazPortable, interfazReproducirVideo, interfazInternet {
    //atributos de clase padre y sus funcionalidades
    public tablet(String nombre, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo){
        super(nombre, precio, marca, fechaFabricacion, serie, marcadorAR, "tablet");    
        this.agregarFuncionalidad("Reproduce videos");
        this.agregarFuncionalidad("Toma fotos");
        this.agregarFuncionalidad("Navega en internet");
        this.agregarFuncionalidad("Portabilidad");
    }


        
        /** mensaje de portabulidad
         * @return String
         */
        public String portableM() {
            return "La camara " + this.getNombre() + " es portatil";
        }
    
        
        /** mensaje de reproducir video
         * @return String
         */
        public String reproducir() {
            return "Reproduciendo video " + this.getNombre();
        }
    
        
        /** mensje de tomar foto
         * @return String
         */
        public String tomarFoto() {
            return " Tomando foto con la camara " + this.getNombre();
        }

        
        /**  mensaje de navegar en intenet
         * @param link
         * @return String
         */
        public String navegar(String link) {
        return "Entrando a " + link + " desde mi Desktop " + this.getNombre();
        }
    


        
        /** compribar las funcionalidades
         * @param F
         * @param p
         * @return String
         */
        public String verificar(String F, String p) {
            switch(F){
                case "portabilidad":
                    return this.portableM();
                case "reproducirVideo":
                    return this.reproducir();
                case "navegarInternet":
                    return this.navegar(p);
                case "tomarFoto":
                    return this.tomarFoto();
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
        public boolean navegarInter() {
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
        public boolean tomarPics() {
            // TODO Auto-generated method stub
            return true;
        }

    
    
}
