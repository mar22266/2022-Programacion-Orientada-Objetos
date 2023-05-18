/* Programacion orientada a objetos
 * Laboratorio 3 
 * Andre Marroquin, 22266
 * Codigo
 */


//ATRIBUTOS
public class programas{
    private String nombre;
    private int espacio;
    private double ciclo;

//METODOS
    public programas(){
        nombre = "";
        espacio = 0;
        ciclo = 0;
       

    }
    //CONSTRUCTOR CON PARAMETROS
    public programas(String nombre, int espacio, double ciclo){
        this.nombre = nombre;
        this.espacio = espacio;
        this.ciclo = ciclo;
       

    }

    
    /** 
     * @return String CREA EL ARREGLO INICIAL CON LOS PROGRAMAS Y SU ESPACIO Y CICLO
     */
    public String Arr(){
    programas arr[] = {new programas("Youtube", 128, 8.2),new programas("Google", 64, 6.2),
        new programas("Spotify", 64, 4.1),new programas("Visual", 64, 8.6),
        new programas("Calendario", 64, 3.1),new programas("PowerPoint", 64, 5.5),
        new programas("GoogleSheets", 256, 5.5),new programas("Settings", 128, 5.4),
        new programas("PrimeVideo", 128, 1.5),new programas("Instagram", 64, 3),
        new programas("Solitario", 64, 8.5),new programas("Fortnite", 64, 4.3) };
        for(int i= 0;i<arr.length; i ++ ){
            System.out.println(arr[i]);
        }
        return nombre;}


    
    /** 
     * @return String EMPIEZAN LOS SETS Y GETS DE LOS ATRIBUTOS
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
    public int getEspacio() {
        return this.espacio;
    }

    
    /** 
     * @param espacio
     */
    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    
    /** 
     * @return double
     */
    public double getCiclo() {
        return this.ciclo;
    }

    
    /** 
     * @param ciclo
     */
    public void setCiclo(double ciclo) {
        this.ciclo = ciclo;
    }


    
    /** 
     * @return String TO STRING DE LA CLASE
     */
    @Override
    public String toString() {
        return 
            " Nombre = " + getNombre() + 
            " \tEspacio = " + getEspacio() + 
            " \tCiclo = " + getCiclo() 
            
        ;
    }


  
}