//ANDRE MARROQUIN 22266
//22 DE SEPT
// POO EJE 5


// ATRIBUTOS
public class pasador extends jugador {
    private int pasesEfectivos;
    private int fintasEfectivas;

    //METODOS
    public pasador(){
        super();
        pasesEfectivos = 0;
        fintasEfectivas = 0;

    }
    
//CONSTRUCTOR CON PARAMETROS
    public pasador(int pasesEfectivos, int fintasEfectivas, String pais, String nombre, int errores, int aces, int TotalServicios) {
        super(pais, nombre, errores, aces, TotalServicios);
        this.pasesEfectivos = pasesEfectivos;
        this.fintasEfectivas = fintasEfectivas;
    }



    
    public pasador(int pasesEfectivos2, int fintasEfectivas2, int errores, int aces, int totalServicios) {
    }

    /** 
     * @return int
     */
    public int getPasesEfectivos() {
        return this.pasesEfectivos;
    }

    
    /** 
     * @param pasesEfectivos
     */
    public void setPasesEfectivos(int pasesEfectivos) {
        this.pasesEfectivos = pasesEfectivos;
    }

    
    /** 
     * @return int
     */
    public int getFintasEfectivas() {
        return this.fintasEfectivas;
    }

    
    /** 
     * @param fintasEfectivas
     */
    public void setFintasEfectivas(int fintasEfectivas) {
        this.fintasEfectivas = fintasEfectivas;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        String datosJugador = super.toString();
        datosJugador = datosJugador + " pasesEfectivos: " + getPasesEfectivos() + "," +
        " fintasEfectivas: " + getFintasEfectivas();
        return datosJugador;
    }


}
