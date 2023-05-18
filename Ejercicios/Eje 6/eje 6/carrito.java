/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */

import java.util.ArrayList;
import java.util.Collections;

//lista de carrito
public class carrito {

    private ArrayList<producto> productos;

    public carrito(){
        productos = new ArrayList<>();
    }



/** 
 * @return ArrayList<producto>
 */
public ArrayList<producto> getProductos(){
    return this.productos;
}



/** 
 * @param producto
 */
public void agregarAlcar(producto producto){

    productos.add(producto);
}


/** 
 * 
 * @param nombrec
 * @param nit
 * @return String
 */
public String compraterminada(String nombrec, String nit){
    String factura = "";
    return factura;

}


}
