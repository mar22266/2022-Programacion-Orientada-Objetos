/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */

//atributos de sucursal
public class sucursal {
    private String direccion;
    private int codigo;
    private String pais;
    private String ciudad;
    private String nombreS;

    //contructor
    public sucursal(String direccion, int codigo, String pais, String ciudad, String nombreS){
        this.direccion = direccion;
        this.codigo = codigo;
        this.pais = pais;
        this.ciudad = ciudad;
        this.nombreS = nombreS;
    }

    
    /** setter y getters
     * @return String
     */
    public String getDireccion() {
        return this.direccion;
    }

    
    /** 
     * @param direccion
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    /** 
     * @return int
     */
    public int getCodigo() {
        return this.codigo;
    }

    
    /** 
     * @param codigo
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
    public String getCiudad() {
        return this.ciudad;
    }

    
    /** 
     * @param ciudad
     */
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    
    /** 
     * @return String
     */
    public String getNombreS() {
        return this.nombreS;
    }

    
    /** 
     * @param nombreS
     */
    public void setNombreS(String nombreS) {
        this.nombreS = nombreS;
    }


    
    /** tyo string 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " direccion='" + getDireccion() + "'" +
            ", codigo='" + getCodigo() + "'" +
            ", pais='" + getPais() + "'" +
            ", ciudad='" + getCiudad() + "'" +
            ", nombreS='" + getNombreS() + "'" +
            "}";
    }


}
