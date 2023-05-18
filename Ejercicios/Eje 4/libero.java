//ANDRE MARROQUIN 22266
//22 DE SEPT
// POO EJE 4

public class libero extends jugador{
    //ATRIBUTOS
    private int recibosEfectivos;

//METODOS
    public libero(){
        super();
        recibosEfectivos = 0;
    }

//CONSTRUCTOR CON PARAMETROS
    public libero(int recibosEfectivos, String pais, String nombre, int errores, int aces, int TotalServicios) {
        super(pais, nombre, errores, aces, TotalServicios);
        this.recibosEfectivos = recibosEfectivos;
    }

    
    public libero(int errores, int recibosEfectivos2, int aces, int totalServicios) {
    }

    

    /** 
     * @return int
     */
    public int getRecibosEfectivos() {
        return this.recibosEfectivos;
    }

    
    /** 
     * @param recibosEfectivos
     */
    public void setRecibosEfectivos(int recibosEfectivos) {
        this.recibosEfectivos = recibosEfectivos;
    }



    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        String datosJugador = super.toString();
        datosJugador = datosJugador + 
            " recibosEfectivos: " + getRecibosEfectivos();
        return datosJugador;

    }



}
