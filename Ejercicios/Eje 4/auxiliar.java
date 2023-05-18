//ANDRE MARROQUIN 22266
//22 DE SEPT
// POO EJE 4

public class auxiliar extends jugador {
    //ATRIBUTOS
    private int ataquesEfectivos;
    private int bloqueosEfectivos;
    private int bloqueosFallidos;

//METODOS
    public auxiliar(){
        super();
        ataquesEfectivos = 0;
        bloqueosEfectivos = 0;
        bloqueosFallidos = 0;
    }

//CONSTRUCTOR CON PARAMETROS
    public auxiliar(int ataquesEfectivos, int bloqueosEfectivos, int bloqueosFallidos,String pais, String nombre, int errores, int aces, int TotalServicios) {
        super(pais, nombre, errores, aces, TotalServicios);
        this.ataquesEfectivos = ataquesEfectivos;
        this.bloqueosEfectivos = bloqueosEfectivos;
        this.bloqueosFallidos = bloqueosFallidos;
    }


    
    /** 
     * @return int
     */
    public int getAtaquesEfectivos() {
        return this.ataquesEfectivos;
    }

    
    /** 
     * @param ataquesEfectivos
     */
    public void setAtaquesEfectivos(int ataquesEfectivos) {
        this.ataquesEfectivos = ataquesEfectivos;
    }

    
    /** 
     * @return int
     */
    public int getBloqueosEfectivos() {
        return this.bloqueosEfectivos;
    }

    
    /** 
     * @param bloqueosEfectivos
     */
    public void setBloqueosEfectivos(int bloqueosEfectivos) {
        this.bloqueosEfectivos = bloqueosEfectivos;
    }

    
    /** 
     * @return int
     */
    public int getBloqueosFallidos() {
        return this.bloqueosFallidos;
    }

    
    /** 
     * @param bloqueosFallidos
     */
    public void setBloqueosFallidos(int bloqueosFallidos) {
        this.bloqueosFallidos = bloqueosFallidos;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        String datosJugador = super.toString();
        datosJugador = datosJugador +
            " ataquesEfectivos: " + getAtaquesEfectivos() + "," +
            " bloqueosEfectivos: " + getBloqueosEfectivos() + "," +
            " bloqueosFallidos: " + getBloqueosFallidos();
        return datosJugador;
    }





}
