public class registro {
    //atributos
    private String marca;
    private String modelo;
    private String placa;
    private double tiempo;

//metodos
    public registro(){
        marca = "";
        modelo = "";
        placa = "";
        tiempo = 0;
    

    }
//contructor
    public registro(String marca, String modelo, String placa, double tiempo){
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.tiempo = tiempo;


    }


    
    /** 
     * @return String empiezan los sets y gets de los atributos
     */
    public String getMarca() {
        return this.marca;
    }

    
    /** 
     * @param marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    
    /** 
     * @return String
     */
    public String getModelo() {
        return this.modelo;
    }

    
    /** 
     * @param modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    
    /** 
     * @return String
     */
    public String getPlaca() {
        return this.placa;
    }

    
    /** 
     * @param placa
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    
    /** 
     * @return double
     */
    public double getTiempo() {
        return this.tiempo;
    }

    
    /** 
     * @param tiempo
     */
    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    
    /** 
     * @return String el to string
     */
    @Override
    public String toString() {
        return "{" +
            " marca='" + getMarca() + "'" +
            ", modelo='" + getModelo() + "'" +
            ", placa='" + getPlaca() + "'" +
            ", tiempo='" + getTiempo() + "'" +
            "}";
    }

}
