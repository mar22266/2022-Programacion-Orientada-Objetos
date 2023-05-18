import java.util.ArrayList;

/* Programacion orientada a objetos
 * Laboratorio 3 
 * Andre Marroquin, 22266
 * Codigo
 */
public class SDR {
    ArrayList<programas> sdr;
    


    
  
   
   /** 
    * @return ArrayList<programas>
    get de la lista
    */
   public ArrayList<programas> getSdr(){
       return this.sdr;
   }
 
   
   
   /** 
    * @param getSdr
    set de la lista

    */
   public void setSdr( ArrayList<programas> getSdr){
       this.sdr = sdr;}

       // crea la list
   public SDR(){
       sdr = new ArrayList<programas>();
   }


  
   
   /** 
    * @param nombre
    * @param espacio
    * @param ciclo
    CONSTRUCTOR CON PARAMENTROS PARA AGREGAR A LA LISTA
    */
   public void agregarRams(String nombre, int espacio, double ciclo){
       programas agro = new programas(nombre,espacio,ciclo);
       this.sdr.add(agro);
   }
// TOTAL DE ESPACIO
   public void Total(){
    System.out.println("16GB total de disponible");
   }
// VER DISPONIBILIDAD EN LA COLA
   public void disponibleCola1(){
     if(sdr().getEspacio() >= 16384){
        System.out.println("ya no hay espacio");
     }
   }

   
 
   
   /** 
    * @return String ESCRIBE CADA OBJETO DE LAS POSCICIONES DE LA LISTA
    */
   public String rpun(){
       int i = 0;
       String r ="";
       while(i<sdr.size()){
           r = r + "------ Programa "+ i + " ------\n";
           r = r + "Nombre: " + sdr.get(i).getNombre()+"\n";
           r = r + "Espacio: " + sdr.get(i).getEspacio()+"\n";
           r = r + "Ciclo: " + sdr.get(i).getCiclo()+"\n";
           r = r + "-----------------------------\n";
           i++;
       }
       return r;
   }

   

   
   

   
// EL TO STRING DE LA MEMORIA SDR
   public String toString(){
       return "{" + 
       "Nombre = '" + getSdr() + "' "+
       "}";




}



/** 
 * @return programas
 */
public programas sdr() {
    return null;
}}

