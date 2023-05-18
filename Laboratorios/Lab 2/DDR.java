/* Programacion orientada a objetos
 * Laboratorio 3 
 * Andre Marroquin, 22266
 * Codigo
 */
import java.util.ArrayList;
public class DDR {
   
   ArrayList<programas> ram;
    


    
  
   
   /** 
    * @return ArrayList<programas> GET DE LA LISTA
    */
   public ArrayList<programas> getRam(){
       return this.ram;
   }
 
   
   
   /** 
    * @param getParqueosL SET DE LA LISTA
    */
   public void setRam( ArrayList<programas> getRam){
       this.ram = ram;}

// CREA LA LISTA
   public DDR(){
       ram = new ArrayList<programas>();
   }


  
   
   /** 
    * @param nombre
    * @param espacio CONSTRUCTOR CON PARAMETROS PARA AGREGAR A LA LISTA
    * @param ciclo
    */
   public void agregarRam(String nombre, int espacio, double ciclo){
       programas agr = new programas(nombre,espacio,ciclo);
       this.ram.add(agr);
   }
// total de disponibilidad de ram de la computadora
   public void Total(){
    System.out.println("8GB total de disponible");
   }
// VER SI ESTA DISPONIBLE PARA IR A LA COLA
   public void disponibleCola(){
     if(ram().getEspacio() >= 1024){
        System.out.println("Ya no hay espacio");
     }
   }

   
 
   
   /** 
    * @return String ESCRIBE CADA OBJETO DE LA LISTA EN ORDEN CON SUS CARACTERISTICAS
    */
   public String rpan(){
       int i = 0;
       String r ="";
       while(i<ram.size()){
           r = r + "------ Programa "+ i + " ------\n";
           r = r + "Nombre: " + ram.get(i).getNombre()+"\n";
           r = r + "Espacio: " + ram.get(i).getEspacio()+"\n";
           r = r + "Ciclo: " + ram.get(i).getCiclo()+"\n";
           r = r + "-----------------------------\n";
           i++;
       }
       return r;
   }

   

   
   /** 
    * @param i ELIMINA OBJETO DE LA LISTA
    */
   public void Eliminar(int i){
       ram.remove(i);
   }

   

   
   /** 
    * @return String TO STRING DE LA LISTA
    */
   public String toString(){
       return "{" + 
       "Nombre = '" + getRam() + "' "+
       "}";




}



/** 
 * @return programas
 */
public programas ram() {
    return null;
}}

