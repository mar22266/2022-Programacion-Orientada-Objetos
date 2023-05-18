public class parqueos {
    //atributos
    private double ancho;
    private double alto;
    private double largo;
    private String carac;

//metodos
    public parqueos(){

        ancho = 8;
        alto = 14;
        largo = 16;
        carac = "techado";

    }
//contructor
    public parqueos(double ancho,double alto,double largo,String carac){
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.carac = carac;
    }

        
    

    //sets y gets de los atributos
    /** 
     * @return double
     */
    public double getAncho() {
        return this.ancho;
    }

    
    /** 
     * @param ancho
     */
    public void setAncho(float ancho) {
        this.ancho = ancho;
    }

    
    /** 
     * @return double
     */
    public double getAlto() {
        return this.alto;
    }

    
    /** 
     * @param alto
     */
    public void setAlto(float alto) {
        this.alto = alto;
    }

    
    /** 
     * @return double
     */
    public double getLargo() {
        return this.largo;
    }

    
    /** 
     * @param largo
     */
    public void setLargo(float largo) {
        this.largo = largo;
    }

    
    /** 
     * @return String
     */
    public String getCarac() {
        return this.carac;
    }

    
    /** 
     * @param carac
     */
    public void setCarac(String carac) {
        this.carac = carac;
    }


    
    /** 
     * @return String to string de los metodos
     */
    @Override
    public String toString() {
        return "{" +
            " ancho='" + getAncho() + "'" +
            ", alto='" + getAlto() + "'" +
            ", largo='" + getLargo() + "'" +
            ", caracteristicas='" + getCarac() + "'" +
            "}";
    }

 
}
