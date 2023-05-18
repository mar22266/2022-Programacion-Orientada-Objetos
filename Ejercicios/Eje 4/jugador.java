//ANDRE MARROQUIN 22266
//22 DE SEPT
// POO EJE 4
public class jugador {
    //ATRIBUTOS CLASE PADRE
    protected String pais;
    protected String nombre;
    protected int errores;
    protected int aces;
    protected int TotalServicios;
    
//METODOS CLASE PADRE
    public jugador(){
        pais = "";
        nombre = "";
        errores = 0;
        aces = 0;
        TotalServicios = 0;

    }
// CONSTRUCTOR CON PARAMETROS
    public jugador(String pais, String nombre, int errores, int aces, int TotalServicios) {
        this.pais = pais;
        this.nombre = nombre;
        this.errores = errores;
        this.aces = aces;
        this.TotalServicios = TotalServicios;
    }


    
    /** 
     * @return String
     */
    public String getPais() {
        return this.pais;
    }

    
    /** 
     * @param pais
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    
    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return int
     */
    public int getErrores() {
        return this.errores;
    }

    
    /** 
     * @param errores
     */
    public void setErrores(int errores) {
        this.errores = errores;
    }

    
    /** 
     * @return int
     */
    public int getAces() {
        return this.aces;
    }

    
    /** 
     * @param aces
     */
    public void setAces(int aces) {
        this.aces = aces;
    }

    
    /** 
     * @return int
     */
    public int getTotalServicios() {
        return this.TotalServicios;
    }

    
    /** 
     * @param TotalServicios
     */
    public void setTotalServicios(int TotalServicios) {
        this.TotalServicios = TotalServicios;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return 
            " Pais: " + getPais() + "," +
            " Nombre: " + getNombre() + "," +
            " Errores: " + getErrores() + "," +
            " Aces: " + getAces() + "," +
            " TotalServicios: " + getTotalServicios();
    }


}
