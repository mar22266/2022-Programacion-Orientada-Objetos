import java.io.PipedWriter;
import java.util.Scanner;
public class principal{
    
    
    
    /** 
     * @param args
     */
    public static void main(String[] args) {
        //variables y arreglos
        String rpta2 = "si";
        int edads = 0;
        int hijos = 0;
        Scanner teclado = new Scanner(System.in);
        int pr = 0;
        int c = 0;
        int e = 1;
        int u = 1;
        int p = 1;
        int r = 1;
        int y = 0;
        int w = 0;
        String rpta5 = "si";
        String rpta3 = "si";
        perros[] array = new perros[30];
        perros[] f = new perros[4];
        perros[] m = new perros[4];
        perros[] fam = new perros[4];
        String peli[] = {"1. Pit bull terrier",
            "2. American Staffordshire terrier",
            "3. Tosa Inu",
            "4. Dogo argentino",
            "5. Dogo Guatemalteco",
            "6. Fila brasileño",
            "7. Presa canario",
            "8. Dóberman",
            "9. Gran perro japonés",
            "10. Mastín napolitano",
            "11. Presa Mallorqui",
            "12. Dogo de burdeos",
            "13. Bullmastiff",
            "14. Bull terrier inglés",
            "15. Bulldog americano",
            "16. Rhodesiano",
            "17. Rottweiler"};
    
        boolean prog = true;
   
       //loop del menu
        while (prog){
            int i;
            boolean loop = true;
            String rpta = "si";
           
   
            do{
                //menu princiapl
               System.out.println("\n****Bienvenido lea el siguiente menu****\n");
               System.out.println("1: Nuevo Perro");
               System.out.println("2: Adoptar perro");
               System.out.println("3: Mostrar perros y Razas peligrosas");
               System.out.println("4: Mostrar perros adoptados");
               System.out.println("5: Salir");
               System.out.println("\n-Elija una de las opciones (ingrese el numero)\n");
               i = teclado.nextInt();
               teclado.nextLine();
               System.out.println("");
               
                }
                
                while(i>5);
                    //nueva perro que el usuario crea
                    switch(i){
                    case 1:{
                        while(rpta.equalsIgnoreCase("si")){
                            if((e-1) < array.length){
                                System.out.println("Perro: "+String.valueOf(e));
                                perros dog = new perros();
                                array[e] = new perros();
                                System.out.println("Bienvenido al programa de perros");
                                System.out.println("ingrese el nombre del perro");
                                String nombre = teclado.nextLine();
                                array[e] = dog.setNombre(nombre);
                                System.out.println("ingrese la raza del perro");
                                String raza = teclado.nextLine();
                                array[e] = dog.setRaza(raza);
                                System.out.println("ingrese la edad del perro");
                                int edad = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = dog.setEdad(edad);
                                System.out.println("ingrese el color del  perro");
                                String color = teclado.nextLine();
                                array[e] = dog.setColor(color);
                                System.out.println("ingrese el estado  del perro");
                                float estado = teclado.nextFloat();
                                array[e] = dog.setEstado(estado);
                                System.out.println("ingrese el tamaño del perro(pequeño, mediano, grande)");
                                String tamaño = teclado.nextLine();
                                teclado.nextLine();
                                array[e] = dog.setTamaño(tamaño);
                                array[e] = dog;
                                e++;
                                System.out.println("¿Quiere seguir ingresando? si o no (ya no va a poder ingresar mas perros si elije no) ");
                                rpta = teclado.nextLine();

                                
                            }   
                            
                    
                            else{
                                System.out.println("Ya no hay espacio para mas perros");
                            }
                                
                        }


                        
                        
                    
                        break;
                    
                        
                    }
                //familia nueva hasta 3
                    case 2:{
                        for(int b = 1; b < 4; b++){
                            familias fasm = new familias();
                            System.out.println("Familia: " + b + "\nIngrese cuantos hijos tiene");
                            hijos = teclado.nextInt();
                            teclado.nextLine();
                            if(hijos!=0){
                                System.out.println("Ingrese la edad de su hijo menor");
                                edads = teclado.nextInt();
                                if (edads>10){
                                    while(rpta2.equalsIgnoreCase("si")){
                                        if((u-1) < fam.length){
                                            fasm.familia1();
                                            System.out.println("Que numero de perro es el que quiere adoptar ? (RECUERDE LA CONDICION)");
                                            pr = teclado.nextInt();
                                            fam[u] = array[pr];
                                            System.out.println("Los perros adoptados son: \n" + u + fam[u]);
                                            u++;
                                            System.out.println("Quiere adoptar otro perro? ");
                                            teclado.nextLine();
                                            rpta2 = teclado.nextLine();
                                            }

                                        else {
                                            System.out.println("Ya no puede adoptar mas perros");
                                        }}
                                
                                if (edads<10){
                                    while(rpta5.equalsIgnoreCase("si")){
                                        if((r-1) < f.length){
                                            fasm.familia2();
                                            System.out.println("Que numero de perro es el que quiere adoptar? (RECUERDE LA CONDICION) ");
                                            y = teclado.nextInt();
                                            f[r] = array[y];
                                            System.out.println("Los perros adoptados son: \n" + r + f[r]);
                                            r++;
                                            System.out.println("Quiere adoptar otro perro? ");
                                            teclado.nextLine();
                                            rpta5 = teclado.nextLine();
                                            }
    
                                        else {
                                            System.out.println("Ya no puede adoptar mas perros");
                                        }}
            
                                    
                                    }
                                }}
                            
                            else if (hijos != 1){
                                while(rpta3.equalsIgnoreCase("si")){
                                    if((c-1) < m.length){
                                        fasm.familia3();
                                        System.out.println("Que numero de perro es el que quiere adoptar? ");
                                        w = teclado.nextInt();
                                        m[c] = array[w];
                                        System.out.println("Los perros adoptados son: \n" + c + f[c]);
                                        c++;
                                        System.out.println("Quiere adoptar otro perro? ");
                                        teclado.nextLine();
                                        rpta3 = teclado.nextLine();
                                        }

                                    else {
                                        System.out.println("Ya no puede adoptar mas perros");}}
                            }
                        }

                            break;
                        
                    }
                    //imprime perros y las razas peligrosas
                    case 3: {
                        for (e = 0; e<array.length ;e++){
                            if(array[e] != null)
                                System.out.println("perro: " + e + array[e]);
                        }

                        System.out.println("\nLas razas de los perros peligrosos son: \n");
                        for (p = 0; p<peli.length ;p++){
                            if(peli[p] != null)
                                System.out.println( peli[p]);

                
                        
                        

                     
                        }
                    
                    break;
                    }
                    case 4:{

                        for (u = 0; e<fam.length ;u++){
                            if(fam[u] != null)
                                System.out.println("Familia 1 adoptados: \n");
                                System.out.println("perro: " + u + fam[u]);}
                        System.out.println("");

                        for (r = 0; r<f.length ;r++){
                            if(f[r] != null)
                                System.out.println("Familia 2 adoptados: \n");
                                System.out.println("perro: " + r + f[r]);}
                        System.out.println("");

                        for (c = 0; c<m.length ;c++){
                            if(m[c] != null)
                                System.out.println("Familia 3 adoptados: \n");
                                System.out.println("perro: " + c + m[c]);}
                    
                    }
                    //salirse del programa
                    case 5: {
                        System.out.println("Adios se ha salido del programa");
                        System.exit(0);
                        prog = false;
                        break;

                    
                    }
                }
                   
                    //while de la respuesta del menu tiene que ser entre 1 y 3
                    if (i > 5 || i < 1){
                        System.out.println("Ingrese un numero del 1 al 3");
                        do{
                            i = teclado.nextInt();
                        }
                        while(i < 5 );
                    }
                 
                        
            
                
        }
        }  
}

    




                                