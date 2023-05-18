import java.util.ArrayList;

/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */

 //atributos de producto
public class producto implements Comparable<producto> {
    protected String nombre;
    protected int precio;
    protected String marca;
    protected String fechaFabricacion;
    protected int serie;
    protected int marcadorAR;
    protected String tipo;
    protected ArrayList<String> funcionalidades;

//constructor con y sin parametros de producto
    public producto(){
        nombre = "";
        precio = 0;
        marca = "";
        fechaFabricacion = "";
        serie = 0;
        marcadorAR = 0;
        tipo = "";
        

    }

    public producto(String nombre, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo) {
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.fechaFabricacion = fechaFabricacion;
        this.serie = serie;
        this.marcadorAR = marcadorAR;
        this.tipo = tipo;
        this.funcionalidades = new ArrayList<>();
    }


    
    /** setters y getters
     * 
     * 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     * @return 
     */
    public producto setNombre(String nombre) {
        this.nombre = nombre;
        return null;
    }


    
    /** 
     * @return int
     */
    public int getPrecio() {
        return this.precio;
    }

    
    /** 
     * @param precio
     * @return 
     */
    public producto setPrecio(int precio) {
        this.precio = precio;
        return null;
    }

    
    /** 
     * @return String
     */
    public String getMarca() {
        return this.marca;
    }

    
    /** 
     * @param marca
     * @return 
     */
    public producto setMarca(String marca) {
        this.marca = marca;
        return null;
    }

    
    /** 
     * @return String
     */
    public String getFechaFabricacion() {
        return this.fechaFabricacion;
    }

    
    /** 
     * @param fechaFabricacion
     * @return 
     */
    public producto setFechaFabricacion(String fechaFabricacion) {
        this.fechaFabricacion = fechaFabricacion;
        return null;
    }

    
    /** 
     * @return int
     */
    public int getSerie() {
        return this.serie;
    }

    
    /** 
     * @param serie2
     * @return 
     */
    public producto setSerie(float serie2) {
        this.serie = (int) serie2;
        return null;
    }

    
    /** 
     * @return int
     */
    public int getMarcadorAR() {
        return this.marcadorAR;
    }

    
    /** 
     * @param marcadorAR
     * @return 
     */
    public producto setMarcadorAR(int marcadorAR) {
        this.marcadorAR = marcadorAR;
        return null;
    }

    
    /** 
     * @return String
     */
    public String getTipo() {
        return this.tipo;
    }

    
    /** 
     * @param tipo
     * @return 
     */
    public producto setTipo(String tipo) {
        this.tipo = tipo;
        return null;
    }

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getFuncionalidades() {
        return this.funcionalidades;
    }

    
    /** 
     * @param funcionalidades
     */
    public void setFuncionalidades(ArrayList<String> funcionalidades) {
        this.funcionalidades = funcionalidades;
    }

    
    /** 
     * @param funcionalidad
     */
    protected void agregarFuncionalidad(String funcionalidad){
        this.funcionalidades.add(funcionalidad);
    }
 
    
    /** especificaciones de producto
     * @return String
     */
    public String Especificaciones(){
        String d = "";
        d += "Nombre: " + this.nombre + "\tMarca: " + this.marca + "\n";
        d += "Precio: Q." + this.precio + "\n";
        d += "Marcador AR: " + this.marcadorAR + "\tSerie: " + this.serie + "\n";
        d += "Fabricado el: " + this.fechaFabricacion;
        return d;
    }

    
    /** 
     * @return String
     * conclusion de producto
     */
    public String conclu(){
        String c = "";
        c = this.tipo + " // " + this.nombre + " // " + this.marca + " // $." + this.precio;
        return c;
    }

    


    
    /** 
     * @return String
     * 
     * to string de
     */
    @Override
    public String toString() {
        return 
            " \n Precio: " + getPrecio() + "\n" +
            " Marca: " + getMarca() + "\n"+ 
            " FechaFabricacion: " + getFechaFabricacion() + "\n" +
            " Serie: " + getSerie() + "\n" +
            " MarcadorAR: " + getMarcadorAR() + "\n" +
            " Tipo: " + getTipo() + "\n" +
            " Funcionalidades: " + getFuncionalidades() + "\n";
    }

    
    /** 
     * @param o
     * @return int
     */
    @Override
    public int compareTo(producto o) {
        // TODO Auto-generated method stub
        return 0;
    }



}
