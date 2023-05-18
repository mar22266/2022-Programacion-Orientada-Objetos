//ANDRE MARROQUIN 22266
//22 DE SEPT
// POO EJE 5

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;
//se ponenen los atributos de las array list
public class torneo{
    private ArrayList<jugador> jugadores;
    
  
// se crean los 3 array lists    
public torneo(){
    jugadores = new ArrayList<jugador>();
   
    
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
    jugador juga = null;

    switch (tipo){
        //PASADOR
        case 0:{
            juga = new pasador(pasesEfectivos,fintasEfectivas,pais,nombre,errores,aces,TotalServicios);
            break;
        }
        //AUXILIAR
        case 1:{
            juga = new auxiliar(ataquesEfectivos,bloqueosEfectivos,bloqueosFallidos,pais,nombre,errores,aces,TotalServicios);
            break;
        }
        //LIBERO
        case 2:{
            juga = new libero(recibosEfectivos,pais,nombre,errores,aces,TotalServicios);

            break;
        }
    }
jugadores.add(juga);

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
    for(jugador juga: jugadores){
        if(juga instanceof libero){
        mejoresL = mejoresL + ((((libero)juga).getRecibosEfectivos() - ((libero)juga).getErrores())*100 / (((libero)juga).getRecibosEfectivos() + ((libero)juga).getErrores())) + ((libero)juga).getAces() *100 / ((libero)juga).getTotalServicios();
    }
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
    for (jugador juga: jugadores){
        if(juga instanceof pasador){
            mejores =  ((((pasador)juga).getPasesEfectivos() + ((pasador)juga).getFintasEfectivas() - ((pasador)juga).getErrores()) *100/(((pasador)juga).getPasesEfectivos() + ((pasador)juga).getFintasEfectivas() + ((pasador)juga).getErrores())) + ((pasador)juga).getAces() *100/((pasador)juga).getTotalServicios();
            
            if (mejores > 80){
                contador ++;
            }
        }}
    return contador;
   
}

// REGRESA LOS MEJORES LIBEROS
public String JuLibero(){
    
    String r = "";
    int c = 1;
    r = r + "\n--------------Top Jugadores Liberos--------------------------\n";
    for(jugador juga: jugadores){
        if(juga instanceof libero){
        r = r + juga.getNombre() + " "+ "<-- Nombre Jugadador" + " "+ c + "\n";
        c++;
        
        }
    
    }
    return r;
}


/** 
 * @return String
 * TO STRING DE LAS LISTAS
 */
public String mostrarJugadores(){
    String resultado = "";
    resultado = "\n--------------Jugadores--------------------------\n";
    for (jugador juga : jugadores) {
        resultado = resultado + juga.toString()+"\n";
        if(juga instanceof libero)
        resultado = resultado + "tipo: LIBERO\n"+ "\n";
        if(juga instanceof pasador)
        resultado = resultado + "tipo: PASADOR\n"+ "\n";
        if(juga instanceof auxiliar)
        resultado = resultado + "tipo: AUXILIAR\n"+ "\n";
    }
    return resultado;

}




}
