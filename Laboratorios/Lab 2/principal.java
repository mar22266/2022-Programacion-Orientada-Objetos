/* Programacion orientada a objetos
 * Laboratorio 3 
 * Andre Marroquin, 22266
 * Codigo
 */
import java.net.Socket;
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class principal {
    public static void main(String[] args) {
        //MATRZI QUE DEMUESTRA COMO FUNCIONA VISULMENTE LA RAM EN UNA COMPUTADORA
        String [ ] [ ]c = new String [ 3 ] [3 ] ;
        c [ 0 ][ 0 ] = "GOOGLE";
        c [ 0 ][ 1 ] = "GOOGLE";
        c [ 0][ 2 ]= "SPOTIFY";
        c [ 1 ][ 0 ] = "JAVA" ;
        c [ 1 ][ 1 ]= "FOTOS";
        c [ 1 ][ 2]= "FOTOS";
        c [ 2 ][ 0 ] = "WORD";
        int lm = c[ 0 ].length ;
        int lo = c[ 1 ].length ;
        System.out.println("\n|||||||Asi se guardan las aplicaciones en la RAM, donde dice null es que no hay nada guardado y quedan todavia 2 bloques|||||||\n");
        for ( int  y = 0 ; y < lm ;  y++ ){
            for( int  x = 0 ; x < lo ;  x++ ){
                    System.out.print(c[y][x]);
                    System.out.print("  ");     
            }
            System.out.println();
        }
        //CREA LOS OBJETOS Y LISTAS Y MENU
        programas p = new programas();
        SDR r1 = new SDR();
        DDR r2 = new DDR();
        espera esp = new espera();
        System.out.println("\n****Estos son los siguientes programas que puede utilizar****\n");
        System.out.println(p.Arr());
        Scanner teclado = new Scanner(System.in);
        System.out.println("******Bienvenido al Programa******\n");
        String menu1 = "1. Memoria DDR \n2. Memoria SDR";
        System.out.println(menu1);
        System.out.println("Ingrese una opción del menú  (dependiendo de la memoria que tiene): \n");
        int o = teclado.nextInt();
        teclado.nextLine();
        while (o < 3 && o>0 ){
            switch (o){
                case 1:{
                    //MENU DE MEMORIA DDR
                    String menu2 = "1. Ingresar Programas, con los cuales inicia la memoria RAM\n2. Ingresar Programas que serán procesos para utilizar memoria RAM\n3. Saber la cantidad de memoria RAM total\n4. Saber la cantidad de memoria RAM disponible\n5. Saber la cantidad de memoria RAM en uso\n6. Saber los programas en ejecución\n7. Saber los programas en cola\n8. Saber los espacios que ocupa un programa\n9. Visualizar los ciclos de reloj, actualizaciones\n10. Determinar los programas que pueden ser ingresados a la RAM de la lista de en cola\n11. Determinar si la memoria necesita aumentar o disminuir si se seleccionó el tipo DDR\n12. Finalizar programas según su tiempo de ejecución\n13. Actualizar los programas en ejecución\n";
                    System.out.println(menu2);
                    System.out.println("Ingrese una opción del menú  : ");
                    int u = teclado.nextInt();
                    teclado.nextLine();
                    while(u <14 && u >=1){
                      switch(u){
                        case 1:{
                            //AGREGA PROGRAMAS QUE INICIALIZAN EN LA RAm
                            String rpta = "si";
                            int i = 1;
                            System.out.println("Ingrese los programas con los que quiere iniciar de los mostrados anteriormente");
                            while (rpta.equalsIgnoreCase("si")){
                                System.out.println("Programa "+String.valueOf(i-1));
                                System.out.println("Ingrese el Nombre: ");
                                String nombre = teclado.nextLine();
                                System.out.println("Ingrese el espacio que ocupa: ");
                                int espacio = teclado.nextInt();
                                teclado.nextLine();
                                System.out.println("Ingrese el ciclo: ");
                                double ciclo = teclado.nextDouble();
                                teclado.nextLine();
                                System.out.println("------------------------------------\n");
                                r2.agregarRam(nombre, espacio, ciclo);
                                i++;
                                System.out.println("¿Quiere seguir ingresando? si o no");
                                rpta = teclado.nextLine();
            
                            }
                            
                            break;
                        
                        }
                        case 2:{
                            //AGREGA PROGRAMAS A LA RAM
                            String rpta2 = "si";
                            int i = 1;
                            while (rpta2.equalsIgnoreCase("si")){
                                System.out.println("Programa "+String.valueOf(i-1));
                                System.out.println("Ingrese el Nombre: ");
                                String nombre = teclado.nextLine();
                                System.out.println("Ingrese el espacio que ocupa: ");
                                int espacio = teclado.nextInt();
                                teclado.nextLine();
                                System.out.println("Ingrese el ciclo: ");
                                double ciclo = teclado.nextDouble();
                                teclado.nextLine();
                                System.out.println("------------------------------------\n");
                                r2.agregarRam(nombre, espacio, ciclo);
                                i++;
                                System.out.println("¿Quiere seguir ingresando? si o no");
                                rpta2 = teclado.nextLine();
                            }
                           break; 
                            
                        }
                        case 3:{
                            //DEMUESTRA ESPACIO TOTAL DE SU COMPUTADORA
                            System.out.println("Su espacio total es de 8GB por el momentos");
                            break;
                        }
                        case 4:{
                            //DEMUESTRA ESPACIO DISPONIBLE
                            System.out.println(8192- r2.ram().getEspacio());
                            break;
                        }
                        case 5:{
                            //DEMUESTRA EL ESPACIO EN USO
                            int i;
                            for(i = 0; i < r2.ram.size(); i++){
                                System.out.println(r2.ram().getEspacio());
                        
                            }
                            
                          
                            break;
                        }
                        case 6:{
                            //DEMUESTRA PROGRAMS EN LA RAM
                            System.out.println(r2.rpan());
                            break;
                        }
                        case 7:{
                            //DEMUESTRA PROGRAMAS EN ESPERA
                            System.out.println(esp.rpin());
                            break;
                        }
                        case 8:{
                            //DEMUESTRA ESPACIO DE LOS PROGRAMAS
                            System.out.println(p.Arr());
                            break;
                        }
                        case 9:{
                            //DEMUESTRA CICLOS DE LOS PROGRAMAS
                            System.out.println("Los ciclos de reloj de cad Programa son los siguientes:\n");
                            System.out.println(p.Arr());
                            break;
                        }
                        case 10:{
                            //PROGRAMAS QUE VAN A COLA DE RAM
                            if(r2.ram().getEspacio() >= 8192){
                                String rpta3 = "si";
                                int i = 1;
                                while (rpta3.equalsIgnoreCase("si")){
                                    System.out.println("Programa "+String.valueOf(i-1));
                                    System.out.println("Ingrese el Nombre: ");
                                    String nombre = teclado.nextLine();
                                    System.out.println("Ingrese el espacio que ocupa: ");
                                    int espacio = teclado.nextInt();
                                    teclado.nextLine();
                                    System.out.println("Ingrese el ciclo: ");
                                    double ciclo = teclado.nextDouble();
                                    teclado.nextLine();
                                    System.out.println("------------------------------------\n");
                                    esp.agregarR(nombre, espacio, ciclo);
                                    i++;
                                    System.out.println("¿Quiere seguir ingresando? si o no");
                                    rpta3 = teclado.nextLine();
                                }
                                
                            }
                           
                            break;
                        }
                        case 11:{
                            //VERIFICA SI NECESITA AUMENTAR LA MEMORIA O NO
                            if(r2.ram().getEspacio() >= 8192){
                                System.out.println("La memoria necesita aumentar");
                            }
                
                            else{
                                System.out.println("La memoria puede disminuir");
                            }
                            break;
                        }
                        case 12:{
                            //FINALIZA TODOS LOS PROGRAMAS
                            r2.ram.clear();
                            esp.espi.clear();
                            System.out.println("Se han finalizado los programas");
                            break;
                        }
                        case 13:{
                            //CIERRA LOS PROGRAMS QUE EL USUARIO QUIERE
                            System.out.println("Ingrese el programa que quiere cerrar");
                            String i = teclado.nextLine();
                            boolean existe = r2.rpan().contains(i);
                            int f = r2.ram.indexOf(i);
                            if(existe){
                                r2.ram.remove(f+1);
                            System.out.println("Se actualizaran los programas");
                            }
                            else{
                            System.out.println("No se encontro");
                            }

                            break;
                        }
                        
                      }
                        break; 
                    
                    }
                }
                    
                case 2: {
                    //MENU PARA LA MEMORIA SDR
                    String menu3 = "1. Ingresar Programas, con los cuales inicia la memoria RAM\n2. Ingresar Programas que serán procesos para utilizar memoria RAM\n3. Saber la cantidad de memoria RAM total\n4. Saber la cantidad de memoria RAM disponible\n5. Saber la cantidad de memoria RAM en uso\n6. Saber los programas en ejecución\n7. Saber los programas en cola\n8. Saber los espacios que ocupa un programa\n9. Visualizar los ciclos de reloj, actualizaciones\n10. Determinar los programas que pueden ser ingresados a la RAM de la lista de en cola\n11. Determinar si la memoria necesita aumentar o disminuir si se seleccionó el tipo DDR\n12. Finalizar programas según su tiempo de ejecución\n13. Actualizar los programas en ejecución\n";;
                    System.out.println(menu3);
                    System.out.println("Ingrese una opción del menú  : \n");
                    int z = teclado.nextInt();
                    teclado.nextLine();
                    while(z <14 && z >=1){
                        switch(z){
                        case 1:{
                            //INGRESA PROGRAMAS CON LOS CUALES INICIALIZA LA RAM
                            String rpta4 = "si";
                            int i = 1;
                            System.out.println("Ingrese los programas con los que quiere iniciar de los mostrados anteriormente");
                            while (rpta4.equalsIgnoreCase("si")){
                                System.out.println("Programa "+String.valueOf(i-1));
                                System.out.println("Ingrese el Nombre: ");
                                String nombre = teclado.nextLine();
                                System.out.println("Ingrese el espacio que ocupa: ");
                                int espacio = teclado.nextInt();
                                teclado.nextLine();
                                System.out.println("Ingrese el ciclo: ");
                                double ciclo = teclado.nextDouble();
                                teclado.nextLine();
                                System.out.println("------------------------------------\n");
                                r1.agregarRams(nombre, espacio, ciclo);
                                i++;
                                System.out.println("¿Quiere seguir ingresando? si o no");
                                rpta4 = teclado.nextLine();
                            }
                            


                            break;
                        }
                        case 2:{
                            //INGRESA PROGRAMAS PARA LA RAM
                            String rpta5 = "si";
                            int i = 1;
                            while (rpta5.equalsIgnoreCase("si")){
                                System.out.println("Programa "+String.valueOf(i-1));
                                System.out.println("Ingrese el Nombre: ");
                                String nombre = teclado.nextLine();
                                System.out.println("Ingrese el espacio que ocupa: ");
                                int espacio = teclado.nextInt();
                                teclado.nextLine();
                                System.out.println("Ingrese el ciclo: ");
                                double ciclo = teclado.nextDouble();
                                teclado.nextLine();
                                System.out.println("------------------------------------\n");
                                r1.agregarRams(nombre, espacio, ciclo);
                                i++;
                                System.out.println("¿Quiere seguir ingresando? si o no");
                                rpta5 = teclado.nextLine();
                            }
                           break; 
                        }
                        case 3:{
                            // IMPRIME EL ESPACIO DE RAM QUE TIENE SU COMPUTADORA
                            System.out.println("Su espacio total es de 16GB");
                            break;
                        }
                        case 4:{
                            //SABER LA MEMORIA DISPONIBLE
                            System.out.println(16384-r1.sdr().getEspacio());
                            break;
                        }
                        case 5:{
                            //DEMUESTRA LA CANTIDAD DE MEMORIA EN USO
                            int i;
                            for(i = 0; i < r1.sdr.size(); i++){
                                System.out.println(r1.sdr().getEspacio());  
                        
                            }
                        
                            break;
                        }
                        case 6:{
                            // demuestra los programas en la RAM
                            System.out.println(r1.rpun());
                            break;
                        }
                        case 7:{
                            //demuestra los programas que estan en espera
                            System.out.println(esp.rpin());
                            break;
                        }
                        case 8:{
                            //demuestra los espacios que ocupa cada programa
                            System.out.println(p.Arr());
                            break;
                        }
                        case 9:{
                            // demuestra los ciclos de reloj de cada programa
                            System.out.println("Los ciclos de reloj de cad Programa son los siguientes:\n");
                            System.out.println(p.Arr());
                            break;
                        }
                        case 10:{
                            //determina programas en cola
                            if(r1.sdr().getEspacio() >= 16384){
                                String rpta6 = "si";
                                int i = 1;
                                while (rpta6.equalsIgnoreCase("si")){
                                    System.out.println("Programa "+String.valueOf(i-1));
                                    System.out.println("Ingrese el Nombre: ");
                                    String nombre = teclado.nextLine();
                                    System.out.println("Ingrese el espacio que ocupa: ");
                                    int espacio = teclado.nextInt();
                                    teclado.nextLine();
                                    System.out.println("Ingrese el ciclo: ");
                                    double ciclo = teclado.nextDouble();
                                    teclado.nextLine();
                                    System.out.println("------------------------------------\n");
                                    esp.agregarR(nombre, espacio, ciclo);
                                    i++;
                                    System.out.println("¿Quiere seguir ingresando? si o no");
                                    rpta6 = teclado.nextLine();
                                }
                                
                            }
                            break;
                        }
                        case 11:{
                            //determina si la memoria puede aumentar
                            if(r1.sdr().getEspacio() >= 16384){
                                System.out.println("La memoria necesita aumentar");
                            }
                
                            else{
                                System.out.println("La memoria puede disminuir");
                            }
                            break;
                        }
                        //cierra todos los programas abiertos
                        case 12:{
                            r1.sdr.clear();
                            esp.espi.clear();
                            System.out.println("Se han finalizado los programas");
                            break;
                        }
                        case 13:{
                        //cierra el programa que el usuario desee
                            System.out.println("Ingrese el programa que quiere cerrar");
                            String i = teclado.nextLine();
                            boolean existe = r1.rpun().contains(i);
                            int f = r1.sdr.indexOf(i);
                            if(existe){
                            r1.sdr.remove(f+1);
                            System.out.println("Se actualizaran los programas");
                        }
                        else{
                            System.out.println("No se encontro");
                        }

                            break;
                        }
                    }
                    break;
                }
            }
                
            }
            
    
 
            }
                
            
                }
            
        }
      
    


        


