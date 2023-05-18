//Andre marroqui, 22266
//PO
//LAB 1

import java.util.Scanner;
public class principal{
    
    public static void main(String[] args) {
        //llama las clases y las crea
        boolean prog = true;
        perro dog = new perro();
        persona person = new persona();
        
        while (prog){
        //teclado creado
        Scanner teclado = new Scanner(System.in);
        boolean loop = true;
        int i;
        
        do{
        //menu
       System.out.println("\n****Bienvenido lea el siguiente menu****\n");
       System.out.println("1: Nueva persona");
       System.out.println("2: Nuevo Perro");
       System.out.println("3: Sacar galleta");
       System.out.println("4: Interactuar");
       System.out.println("5: Salir");
       System.out.println("\n-Elija una de las opciones (ingrese el numero)\n");
       i = teclado.nextInt();
       System.out.println("");
        }while(i>5);
            //nueva persona
            switch(i){
            case 1:{
                System.out.println("Has creado una nueva persona");
                System.out.println("la confiabilidad de la nueva persona es de: " + person.confiabilidad());
                break;
                
            }
            //nuevo perro
            case 2:{
                System.out.println("Has creado un nuevo perro");
                System.out.println("Nivel de umbral del nuevo perro: " + dog.umbral1());
                System.out.println("Nivel de animo del nuevo perro: " + dog.animo1());
                break;
            }
            //dar galleta
            case 3: {
                System.out.println("Le acabas de dar 1 galletaa al perro, te quedan:  " + person.Resta());
                break;
            
            }
            //interactuar
            case 4: {
                System.out.println("El perro actualmente esta:");
                System.out.println(dog.comportamiento());
                System.out.println(dog.comportamiento2());
                System.out.println(dog.comportamiento3());
                break;
                
            }
            //salir
            case 5: {
                System.out.println("Adios se ha salido del programa");
                System.exit(0);
                prog = false;
                break;
            }
        }   //hace que ingrese un numero dentro del rango
            if (i > 4 || i < 1){
                System.out.println("Ingrese un numero del 1 al 5");
                do{
                    i = teclado.nextInt();
                }
                while(i < 6 );

         
                

        }
       
    }
        
        
}}
   

