/* Programacion orientada a objetos
 * Laboratorio 3 
 * Andre Marroquin, 22266
 * Codigo
 */
import java.util.ArrayList;
public class espera {
   //nombnrar la lista
   ArrayList<programas> espi;
    


    
   /** 
    * @return ArrayList<parqueos> get de la lista
    */
   public ArrayList<programas> getEspi(){
       return this.espi;
   }
 
   
   /** 
    * @param getParqueosL declarar y crear la lista
    */
   public void setParqueosL( ArrayList<programas> getParqueosL){
       this.espi = espi;}
//CREA LA LISTA
   public espera(){
       espi = new ArrayList<programas>();
   }


  
   
   /** 
    * @param nombre
    * @param espacio
    * @param ciclo
    CONSTRUCTOR CON PARAMETROS PARA AGREGAR OBJETOS A LA LISTA
    */ 
   public void agregarR(String nombre, int espacio, double ciclo){
       programas agre = new programas(nombre,espacio,ciclo);
       this.espi.add(agre);
   }


 
   
   /** 
    * @return String AGREGA OBJETOS CON NOMBRE PARA CADA OBJETO EN LA LISTA
    */
   public String rpin(){
       int i = 0;
       String r ="";
       while(i<espi.size()){
           r = r + "------ Parqueo "+ i + " ------\n";
           r = r + "Nombre: " + espi.get(i).getNombre()+"\n";
           r = r + "Espacio: " + espi.get(i).getEspacio()+"\n";
           r = r + "Ciclo: " + espi.get(i).getCiclo()+"\n";
           r = r + "-----------------------------\n";
           i++;
       }
       return r;
   }

   

   
   /** 
    * @param i
    ELIMINAR ELEMENTO DE LA LISTA
    */
   public void Eliminar(int i){
       espi.remove(i);
   }

   

   
   /** 
    * @return String TO STRING DE LA LISTA
    */
   public String toString(){
       return "{" + 
       "Nombre = '" + getEspi() + "' "+
       "}";




}}
    
        

  
    
        


    
    
    
    
    