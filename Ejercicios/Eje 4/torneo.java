//ANDRE MARROQUIN 22266
//22 DE SEPT
// POO EJE 4

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
//se ponenen los atributos de las array list
public class torneo{
    private ArrayList<pasador> jugadorPasador;
    private ArrayList<auxiliar> jugadorAuxiliar;
    private ArrayList<libero> jugadorLibero;
  
// se crean los 3 array lists    
public torneo(){
    jugadorPasador = new ArrayList<pasador>();
    jugadorAuxiliar = new ArrayList<auxiliar>();
    jugadorLibero = new ArrayList<libero>();
    
    
}


/** 
 * @param tipo
 * @param recibosEfectivos
 * @param ataquesEfectivos
 * @param bloqueosEfectivos
 * @param bloqueosFallidos
 * @param pasesEfectivos
 * @param fintasEfectivas
 * @param pais
 * @param nombre
 * @param errores
 * @param aces
 * @param TotalServicios
 * SE AGREGA AL JUGADOR A LA LISTA DEPENDIENDO LA DECISION DEL USUARIO
 */
public void agregaJugador(int tipo, int recibosEfectivos,int ataquesEfectivos, int bloqueosEfectivos,
 int bloqueosFallidos,int pasesEfectivos, int fintasEfectivas,
 String pais, String nombre, int errores, int aces, int TotalServicios){

    switch (tipo){
        //PASADOR
        case 0:{
            pasador jugPasador = new pasador(pasesEfectivos,fintasEfectivas,pais,nombre,errores,aces,TotalServicios);
            jugadorPasador.add(jugPasador);
            break;
        }
        //AUXILIAR
        case 1:{
            auxiliar jugAuxiliar = new auxiliar(ataquesEfectivos,bloqueosEfectivos,bloqueosFallidos,pais,nombre,errores,aces,TotalServicios);
            jugadorAuxiliar.add(jugAuxiliar);
            break;
        }
        //LIBERO
        case 2:{
            libero jugLibero = new libero(recibosEfectivos,pais,nombre,errores,aces,TotalServicios);
            jugadorLibero.add(jugLibero);

            break;
        }
    }


}





/** 
 * @param recibosEfectivos
 * @param pais
 * @param nombre
 * @param errores
 * @param aces
 * @param TotalServicios
 * @return float
 * CALCULO DE LOS MEJORES LIBEROS SEGUN SU EFECTIVIDAD
 */
public float MejoresLiberos(int recibosEfectivos,String pais, String nombre, int errores, int aces, int TotalServicios){
    float mejoresL = 0;
    libero juLibero = new libero(errores, recibosEfectivos, aces, TotalServicios);
    for(libero lib: jugadorLibero){
        mejoresL = mejoresL + ((lib.getRecibosEfectivos() - lib.getErrores())*100 / (lib.getRecibosEfectivos() + lib.getErrores())) + lib.getAces() *100 / lib.getTotalServicios();
    }
       
    
    return mejoresL;

}




/** 
 * @param pasesEfectivos
 * @param fintasEfectivas
 * @param pais
 * @param nombre
 * @param errores
 * @param aces
 * @param TotalServicios
 * @return int
 * CALCULO DE LOS MEJORES PASADORES CON ARRIBA DE 80% DE EFECTIVIDAD
 */
public int MostrarmejoresPasadores(int pasesEfectivos, int fintasEfectivas,
 String pais, String nombre, int errores, int aces, int TotalServicios){
    float mejores = 0;
    int contador = 0;
    pasador juPasador = new pasador(pasesEfectivos,fintasEfectivas,errores,aces,TotalServicios);
    for (pasador pas: jugadorPasador){
        mejores =  ((pas.getPasesEfectivos() + pas.getFintasEfectivas() - pas.getErrores()) *100/(pas.getPasesEfectivos() + pas.getFintasEfectivas() + pas.getErrores())) + pas.getAces() *100/pas.getTotalServicios();
        if (mejores > 80){
            contador ++;
        }
    }
    return contador;
   
}

public String JuLibero(){
    
    String r = "";
    int c = 1;
    r = r + "\n--------------Top Jugadores Liberos--------------------------\n";
    for (libero jugLibero : jugadorLibero) {
        r = r + jugLibero.getNombre() + " "+ "<-- Nombre Jugadador" + " "+ c + "\n";
        c++;
        
    }
    return r;
}


/** 
 * @return String
 * TO STRING DE LAS LISTAS
 */
public String mostrarJugadores(){
    String resultado = "";
    resultado = "\n--------------Jugadores Pasadores--------------------------\n";
    for (pasador jugPasador : jugadorPasador) {
        resultado = resultado + jugPasador.toString()+"\n";
    }
    resultado = resultado + "\n--------------Jugadores Auxiliares--------------------------\n";
    for (auxiliar jugAuxiliar : jugadorAuxiliar) {
        resultado = resultado + jugAuxiliar.toString()+"\n";
    }
    resultado = resultado + "\n--------------Jugadores Liberos--------------------------\n";
    for (libero jugLibero : jugadorLibero) {
        resultado = resultado + jugLibero.toString()+"\n";
    }
    return resultado;

}




}
