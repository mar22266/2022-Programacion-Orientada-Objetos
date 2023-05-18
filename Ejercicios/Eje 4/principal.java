//ANDRE MARROQUIN 22266
//22 DE SEPT
// POO EJE 4

import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class principal {
    
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        torneo Volley = new torneo();
        Scanner teclado = new Scanner(System.in);
        String menu = "\n1. Agregar Jugador\n2. Mostrar Jugadores del torneo \n3. Calcular cantidad de pasadores con mas de 80% de efectividad \n4. Mostrar mejores liberos\n5. Salir\n";
        int opcion = 1;
        System.out.println(menu);
        System.out.println("Ingrese la opción que desea: ");
        opcion = teclado.nextInt();
        teclado.nextLine();
        while (opcion<5 && opcion>=1){
            switch (opcion){
                //AGREGA LOS JUGADORES AL TORNEO
                case 1: {
                    try{
                        System.out.println("¿Quiere ingresar un jugador pasador (0) o auxiliar (1) o libero (2)?");
                        int tipo = teclado.nextInt();
                        teclado.nextLine();
                        String pais = "";
                        String nombre = "";
                        int errores = 0;
                        int ataquesEfectivos = 0;
                        int recibosEfectivos = 0;
                        int TotalServicios = 0;
                        int aces = 0;
                        int bloqueosEfectivos = 0;
                        int bloqueosFallidos = 0;
                        int pasesEfectivos = 0;
                        int fintasEfectivas = 0;
                        System.out.println("Ingrese el nombre: ");
                        nombre = teclado.nextLine();
                        System.out.println("Ingrese el pais: ");
                        pais = teclado.nextLine(); 
                        System.out.println("Ingrese la cantidad de errores: ");
                        errores = teclado.nextInt(); 
                        System.out.println("Ingrese la cantidad de aces: ");
                        aces = teclado.nextInt(); 
                        System.out.println("Ingrese la cantidad de servicios: ");
                        TotalServicios = teclado.nextInt();
                        teclado.nextLine();
                        if (tipo == 0){
                            System.out.println("Ingrese la cantidad de pases efectivos del jugador: ");
                            pasesEfectivos = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese la cantidad de fintas efectivos del jugador: ");
                            fintasEfectivas = teclado.nextInt();
                        }

                        if (tipo == 1){
                            System.out.println("Ingrese la cantidad de atques efectivos del jugador");
                            ataquesEfectivos = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese la cantidad de bloqueos efectivos del jugador");
                            bloqueosEfectivos = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Ingrese la cantidad de bloqueos fallidos del jugador");
                            bloqueosFallidos = teclado.nextInt();
                            teclado.nextLine();

                        }

                        if (tipo==2){
                            System.out.println("Ingrese la cantidad de recibos efectivos del jugador");
                            recibosEfectivos = teclado.nextInt();
                            teclado.nextLine();

                        }
                        Volley.agregaJugador(tipo, recibosEfectivos, ataquesEfectivos, bloqueosEfectivos, bloqueosFallidos, pasesEfectivos, fintasEfectivas, pais, nombre, errores, aces, TotalServicios);
                        System.out.println(menu);
                        System.out.println("Ingrese la opción que desea: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        

                    }
                    catch (Exception e){
                        teclado.next();
                        System.out.println("Entrada incorrecta");
                        System.out.println(menu);
                        System.out.println("Ingrese la opción que desea: ");
                        opcion = teclado.nextInt();
                        teclado.nextLine();
                        }

                        break;
                    }
                    //MUESTRA JUGADORES DEL TORNEO
                case 2:{
                    System.out.println("LISTA DE JUGADORES:\n ");
                    System.out.println(Volley.mostrarJugadores());
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    break;
                    }

                    //MUESTRA CANTIDAD DE PASADORES CON UNA EFECTIVIDAD MAYOR DE 80%
                case 3:{
                    String pais = "";
                    String nombre = "";
                    int errores = 0;
                    int TotalServicios = 0;
                    int aces = 0;
                    int pasesEfectivos = 0;
                    int fintasEfectivas = 0;
                    System.out.print("El numero de pasadores con  mas de 80% de eficiencia es de: ");
                    System.out.println(Volley.MostrarmejoresPasadores(pasesEfectivos, fintasEfectivas, pais, nombre, errores, aces, TotalServicios));
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
                }
                //MUESTRA A LOS TOP 3 MEJJORES LIBEROS
                case 4:{
                    String pais = "";
                    String nombre = "";
                    int errores = 0;
                    int recibosEfectivos = 0;
                    int TotalServicios = 0;
                    int aces = 0;
                    System.out.println(Volley.JuLibero());
                    System.out.println("La eficiencia promedio es de: " + Volley.MejoresLiberos(recibosEfectivos, pais, nombre, errores, aces, TotalServicios));
                    System.out.println(menu);
                    System.out.println("Ingrese la opción que desea: ");
                    opcion = teclado.nextInt();
                    teclado.nextLine();
                    break;
       
                }

                }
                
             
            }
        }
        }



