/* Andre marroquin
 * Nelson garcia
 * Jose alejandro anton
 * Andy fuentes
 * POO proyecto entrega 3
 */


import java.util.Scanner;/*Importamos el Scanner para poder pedirle ingresar datos al usuario*/
import java.io.File; /*Importamos el .io para los documentos*/
import java.io.FileNotFoundException;/* Importamos el found exception para los documentos*/
import java.io.FileWriter;/*Importamos el .io.filewriter esta se utiliza para escribir archivos en forma de caracteres del mismo*/
import java.io.IOException;/* Se importa el .io.exception clase base para excepciones que se producen mientras se tiene acceso a la información mediante secuencias, archivos y directorios*/
import java.util.InputMismatchException; /*s lanzada por la clase Scanner cuando el elemento recibido no corresponde al tipo de dato esperado*/
/*creamos la clase principal*/
public class principal { 
    
    public static void main(String [] args){ /* creamos el metodo para el menu*/
        String menu = "\n1. Lenguaje\n2. Matemáticas \n3. Geografía \n4. Guardar Progreso \n5. Mostrar Datos  \n6. Salir";/* creamos el menu con los casos*/
        int opcion = 1; /* inicializamos algunos punteos, a mate y M2 para que el promedio no de negativo*/
        int punteo = 0;
        int punteoL = 0;
        int punteoMate = 5;
        int punteoM2 = 5;
        estudiante es = new estudiante();
        geografia g = new geografia();
        lengua l = new lengua();
        mate m = new mate();
        System.out.println("\n----------BIENVENIDO AL PROGRAMA DE EDUCACION BASICA------------\n");
        Scanner techword = new Scanner(System.in);
        Scanner teclado = new Scanner(System.in);
        String nombre = "";
        int edad = 0;
        int DPI = 0;
        String centroEducativo = "";
        String correo = "";
        String contraseña = "";
        String añoAcademico = "";

        /*
         * Se piden datos iniciales a usuarios
         */
        System.out.println("ingrese su nombre:");
        nombre = techword.nextLine();
        System.out.println("Ingrese su edad:");
        edad = techword.nextInt();
        techword.nextLine();
        System.out.println("Ingrese su año academico:");
        añoAcademico = techword.nextLine();
        System.out.println("Ingrese su centro educativo:");
        centroEducativo = techword.nextLine();
        System.out.println("Ingrese su DPI:");
        DPI = techword.nextInt();
        techword.nextLine();
        System.out.print("Ingrese su correo electronico:");
        correo = techword.nextLine();
        System.out.println("Ingrese lo que sera su contraseña:");
        contraseña = techword.nextLine();
        System.out.println("Ahora puede ingresa al menu de inicio:");


            System.out.println(menu);
            System.out.println("Ingrese una opción del menú: ");

            /*
             * 
             * se manejan los errores en caso de ingresar alguna letra en vez de numero
             */
            try{
            opcion = teclado.nextInt();
            teclado.nextLine();
            }
            catch (InputMismatchException e) {
                System.out.println("Error Ingrese uno de los numeros anteriores");
                opcion = teclado.nextInt();
                teclado.nextLine();
            }
     
            /*
             * Se crean el archivo csv con manejo de errores
             */
            try {
                File myObj = new File("Alumnos.csv");
                if (myObj.createNewFile()) {
                  System.out.println("Archivo creado: " + myObj.getName());
                } else {
                  System.out.println("Archivo ya es existente.");
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error.");
                e.printStackTrace();
            }

        // ciclo while del menu para las opciones
        while (opcion < 6 && opcion>=1 ){
            switch(opcion){
            
                
                // clase lengauje
                case 1: {
                    String menuL = "1. Repasar \n2. Evaluar\n3. Regresar a menu principal";
                    int opcionL = 1;
                    System.out.println(menuL);
                    System.out.println("Ingrese una opción del menú: ");
                    opcionL = teclado.nextInt();
                    teclado.nextLine();
                    l.valoresLengua();
                    l.repasaLengua();
                    String [][] matrizL = l.getRepasaL();
                    String[][] matrizEN = l.getEnsenaL();
                    while (opcionL < 3 && opcionL>=1 ){
                        switch(opcionL){
                            //area de repaso de lemguaje
                            case 1:{
                                System.out.println("\n");
                                System.out.println("\n La tilde o acento ortográfico es la marca escrita que se coloca sobre una letra"); 
                                System.out.println("\npara indicar que esa sílaba se pronuncia con mayor intensidad."); 
                                System.out.println("\nLas mayúsculas también se escriben con tilde."); 
                                System.out.println("\nHay que tener en cuenta que el sentido de una palabra puede ser modificado según la sílaba que se acentúe."); 
                                System.out.println("\nAsimismo, la colocación correcta de la tilde permite distinguir funciones y significados en casos de duda o ambigüedad.");
                                System.out.println("\nPalabras agudas, se acentúan en la última sílaba, llevan tilde cuando terminan en n, s o vocal.");
                                System.out.println("\nPalabras graves, se acentúan en la penúltima sílaba, llevan tilde cuando no terminan en n, s o vocal.");
                                System.out.println("\nPalabras esdrújulas, se acentúan en la antepenúltima sílaba, llevan tilde siempre.");
                                System.out.println("\nPalabras sobreesdrújulas, se acentúan en la sílaba anterior a la antepenúltima, llevan tilde siempre.");
                                System.out.println("\n");
                                System.out.println("\nEjemplos:\n");
                                for (int fila = 0; fila <6; fila++){
                                    for(int col = 0; col<2; col ++){
                                        System.out.print(matrizEN[fila][col]);
                                        
                                    }
                                }
                                System.out.println("\n");
                                System.out.println();
                                System.out.println(menuL);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionL = teclado.nextInt();
                                teclado.nextLine();


                                break;
                            }
                            //area de evaluacion de lenjuage
                            case 2:{
                                System.out.println("SE LE HARAN 5 PREGUNTAS SOBRE SI SE TILDAN O NO LAS PALABRA\n");
                                System.out.println("La palabra organizacion se tilda?\n");
                                String L1 = teclado.nextLine();

                                if(L1.equalsIgnoreCase(matrizL[1][1])){
                                    punteoL ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }

                                System.out.println("La palabra vagon se tilda?\n");
                                String L2 = teclado.nextLine();
                                if(L2.equalsIgnoreCase(matrizL[2][1])){
                                    punteoL ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("La palabra sofa se tilda?\n");
                                String L3 = teclado.nextLine();
                                if(L3.equalsIgnoreCase(matrizL[3][1])){
                                    punteoL ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("La palabra escuitla se tilda?\n");
                                String L4 = teclado.nextLine();
                                if(L4.equalsIgnoreCase(matrizL[4][1])){
                                    punteoL ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("La palabra jugaras se tilda?\n");
                                String L5 = teclado.nextLine();
                                if(L5.equalsIgnoreCase(matrizL[5][1])){
                                    punteoL ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }

                                System.out.println("Su punteo es de: "+ punteoL*100/5);



                                System.out.println(menuL);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionL = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            }


                        }
                    }
                    
                    break;
                }

                

                //clase MATE
                case 2: {
                    String menuMate = "1. Repasar \n2. Sumas \n3. Restas \n4. Regresar a menu principal";
                    int opcionMate = 1;
                    System.out.println(menuMate);
                    System.out.println("Ingrese la opción que desea: ");
                    opcionMate = teclado.nextInt();
                    teclado.nextLine();
                    
                    while (opcionMate < 4 && opcionMate>=1 ){
                        switch(opcionMate){
                            //area de repaso de matematica
                            case 1:{
                                System.out.println("\n");
                                System.out.println("\nLas sumas y restas son las primeras operaciones matemáticas que aprendemos. ");
                                System.out.println("\nAntes de aprender a sumar y restar, vamos a explicar qué es una suma y qué es una resta:");
                                System.out.println("\nSumar: Sumar es juntar dos o más cosas en un grupo, para saber cuántas hay en total");
                                System.out.println("\nRestar: Restar es quitar una cierta cantidad a otra que ya teníamos");
                                System.out.println("\nEjemplo de suma: ");
                                System.out.println("\nSi tengo 2 manzanas verdes y 3 manzanas rojas, y quiero saber cuántas manzanas tengo"+ 
                                "en total, junto todas las manzanas en un solo cesto y las cuento: tengo 5 manzanas en total, por lo tanto 2 + 3  es igual a 5.");
                                System.out.println("\nEjemplo de resta: ");
                                System.out.println("\nSi tengo 5 manzanas en una cesta, y quito 2, dentro de la cesta me quedarán 3 manzanas,"+
                                 "es decir que 5 menos 2 es igual a 3.");

                                System.out.println(menuMate);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionMate = teclado.nextInt();
                                teclado.nextLine();
                                //sd

                                break;
                            }
                            //area de evaluaicon de de matematica
                            case 2:{
                                System.out.println("SE LE HARAN 5 PREGUNTAS DE SUMAS\n");
                                m.sumar();
                                m.restar();
                                String res1 = "";
                                System.out.println("\nResuelva los siguientes ejercicios:");
                                System.out.println("\n");
                                for (int i = 0; i <5; i++){
                                    System.out.println("\n"+m.getEjercicios().get(i));
                                    res1 = teclado.nextLine();
                                    String resp = m.getRespuestas().get(i);
                                    if(res1.equals(resp)){
                                        System.out.println("Buen trabajo"); 
                                        punteoMate++;
                                    }
                                    else{
                                        System.out.println("Respuesta incorrecta");
                                        m.setErrores(punteoMate);
                                    }
                                }

                                //promedio de sumas y del modulo en matematica
                                System.out.println("Respuestas correctas: "+(punteoMate-5));
                                System.out.println("Respuestas incorrectas: "+(10-punteoMate));
                                System.out.println("Su punteo es de: " + (punteoMate-5)*100/5);
                                System.out.println("Su punteo promedio de sumas y restas es de: "+(((punteoM2-5)*100/5)+(punteoMate-5)*100/5)/2);
                                System.out.println("\n");


                                System.out.println(menuMate);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionMate = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            }

                            //area de evaluacion de matematica
                            case 3:{
                                System.out.println("SE LE HARAN 5 PREGUNTAS SOBRE RESTAS\n");
                                m.sumar();
                                m.restar();
                                String res2 = "";
                                System.out.println("\nResuelva los siguientes ejercicios:");
                                System.out.println("\n");
                                for (int i = 5; i <10; i++){
                                    System.out.println("\n"+m.getEjercicios().get(i));
                                    String resp2 = m.getRespuestas().get(i);
                                    res2 = teclado.nextLine();
                                    if(res2.equals(resp2)){
                                        System.out.println("Buen trabajo");
                                        punteoM2++;
                                    }
                                    else{
                                        System.out.println("Respuesta incorrecta");
                                        m.setErrores(punteoM2);
                                    }
                                }
                                System.out.println("Respuestas correctas: "+(punteoM2-5));
                                System.out.println("Respuestas incorrectas: "+(10-punteoM2));
                                System.out.println("Su punteo es de: " + (punteoM2-5)*100/5);
                                System.out.println("Su punteo promedio de sumas y restas es de: "+(((punteoM2-5)*100/5)+(punteoMate-5)*100/5)/2);
                                System.out.println("\n");
                                System.out.println(menuMate);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionMate = teclado.nextInt();
                                teclado.nextLine();
                                break;
                            }

                        }
                        
                    }
                    break;
                }

                //clase GEOGRAFIA
                case 3: {
                    String menuGeo = "1. Repasar \n2. Evaluar\n3. Regresar a menu principal";
                    int opcionGeo = 1;
                    System.out.println(menuGeo);
                    System.out.println("Ingrese una opción del menú: ");
                    opcionGeo = teclado.nextInt();
                    teclado.nextLine();
                    g.asignarValores();
                    g.repasar();
                    String [][] matrizR = g.getRepasa();
                    String[][] matriz = g.getEnsena();
                    while (opcionGeo < 3 && opcionGeo>=1 ){
                        switch(opcionGeo){
                            //area de repaso de geografia
                            case 1:{
                        
                                for (int fila = 0; fila <8; fila++){
                                    for(int col = 0; col<2; col ++){
                                        System.out.print(matriz[fila][col]);
                                        
                                    }
                                }
                                System.out.println();
                                System.out.println(menuGeo);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionGeo = teclado.nextInt();
                                teclado.nextLine();
                                break;
                                
                            }

                            case 2: {
                                System.out.println("SE LE HARAN 7 PREGUNTAS SOBRE CABECERAS DE LOS DEPARTAMENTOS DE GUATEMALA\n");
                                // area de evaluacion de geografia
                                System.out.println("Cual es la cabecera de El Progreso?\n");
                                String r1 = teclado.nextLine();

                                if(r1.equalsIgnoreCase(matrizR[1][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }

                                System.out.println("Cual es la cabecera de Peten?\n");
                                String r2 = teclado.nextLine();
                                if(r2.equalsIgnoreCase(matrizR[2][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("Cual es la cabecera de Alta Verapaz?\n");
                                String r3 = teclado.nextLine();
                                if(r3.equalsIgnoreCase(matrizR[3][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("Cual es la cabecera de Escuintla?\n");
                                String r4 = teclado.nextLine();
                                if(r4.equalsIgnoreCase(matrizR[4][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("Cual es la cabecera de Santa Rosa?\n");
                                String r5 = teclado.nextLine();
                                if(r5.equalsIgnoreCase(matrizR[5][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("Cual es la cabecera de Zacapa?\n");
                                String r6 = teclado.nextLine();
                                if(r6.equalsIgnoreCase(matrizR[6][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA");
                                }
                                System.out.println("Cual es la cabecera de Guatemala?\n");
                                String r7 = teclado.nextLine();
                                if(r7.equalsIgnoreCase(matrizR[7][1])){
                                    punteo ++;
                                }
                                else{
                                    System.out.println("RESPUESTA INCORRECTA\n");
                                }
                                
                                if(punteo < 5){
                                    System.out.println("Necesita seguir repasando\n" + "Su promedio es de: "+ punteo*100/7 + "\n");
                                }
                                else{
                                    System.out.println("Su promedio es de: " + punteo*100/7 + "\n");

                                }
                                
                                
                                System.out.println(menuGeo);
                                System.out.println("Ingrese una opción del menú: ");
                                opcionGeo = teclado.nextInt();
                                teclado.nextLine();
                                break;
                                
                            }
                           
                        }

                    }
                }

                /*
                 * Se gurdan los datos en el archivo csv
                 */
                case 4:{
                    try {
                        FileWriter myWriter = new FileWriter("Alumnos.csv");
                        myWriter.write("Nombre,Edad,Año academico,Centro Educativo,DPI,Correo electronico,contraseña,Promedio Mate,Promedio Lenguaje,Promedio Geografia\n");
                        myWriter.write(nombre+ ","+edad+ ","+añoAcademico+","+ centroEducativo+ "," +DPI+","+correo+","+contraseña+","+(((punteoM2-5)*100/5)+(punteoMate-5)*100/5)/2+","+punteoL*100/5+","+punteo*100/7);
                        myWriter.close();                                                                                               
                    
                    }catch (IOException e) {
                        System.out.println("Ha ocurrido un error.");
                        e.printStackTrace();
                    }
                
                    break;
                }

                /*
                 * Se leen los datos que estan el archivo csv
                 */

                case 5:{
                    try {
                        File my = new File("Alumnos.csv");
                        Scanner myReader = new Scanner(my);
                        while (myReader.hasNextLine()) {
                          String data = myReader.nextLine();
                          System.out.println(data);
                        }
                        myReader.close();
                      } catch (FileNotFoundException e) {
                        System.out.println("Ha ocurrido un error.");
                        e.printStackTrace();
                      }
                    break;
                    
                }
            }
    
            System.out.println(menu);
            System.out.println("Ingrese la opción que desea: ");
            opcion = teclado.nextInt();
            teclado.nextLine();

                
       //cierre del prgrama
        }
        System.out.println("CERRANDO PROGRAMA HASTA LUEGO...");
    }

}
