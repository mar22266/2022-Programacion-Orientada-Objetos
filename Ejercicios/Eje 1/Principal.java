//Andre marroqui, 22266
//PO
//EJE 1
import java.util.Scanner;
public class Principal {
     
     /** 
      * @param args main 
      */
     public static void main(String[] args) {
        boolean prog = true;
        Perro dog = new Perro();
        Amigo ami = new Amigo();

        
        while (prog){
        //teclado creado
        Scanner teclado = new Scanner(System.in);
        boolean loop = true;
        int i;
        
        do{
        //menu
       System.out.println("\n****Bienvenido lea el siguiente menu****\n");
       System.out.println("1: Nueva amigo");
       System.out.println("2: Nuevo Perro");
       System.out.println("3: Llamar perrera");
       System.out.println("4: Imprimir anuncio ");
       System.out.println("5: Publicar anuncio");
       System.out.println("6: Mostrar Dinero");
       System.out.println("7: Salir");
       System.out.println("\n-Elija una de las opciones (ingrese el numero)\n");
       i = teclado.nextInt();
       System.out.println("");
        }while(i>7);
            //nueva persona
            switch(i){
            case 1:{
                System.out.println(ami.AM());
                break;

            }
         
            case 2:{
                System.out.println(dog.pe());
                break;
            }
            
            case 3: {
                dog.Lla();
                if(dog.Lla() < 5){
                    System.out.print("Se ha Encontrado a su perro");
                }
                else {
                    System.out.print("No se ha encontrado");
                }
                break;
            
            }
            
            case 4: {
                dog.Anu1();
                if (dog.Anu1() < 10){
                    System.out.print("Se ha Encontrado a su perro");
                }
                else {
                    System.out.print("No se ha encontrado");
                }
                break;
                
            }
            case 5:{
                dog.Co();
                if(dog.Co()< 15){
                    System.out.print("Se ha Encontrado a su perro");
                }
                else {
                    System.out.print("No se ha encontrado");
                }
                break;
            }

            case 6:{
                System.out.println("Este es su dinero: " + ami.dinero());
                
                if(dog.Anu1() != 0){
                    System.out.println("Es el dinero que tendra disponible despues de hacer un anuncio: " + ami.Resta1());
                if(dog.Co() != 0 ){
                    System.out.println(" Es el dinero que tendra disponible despues de contratar un anuncio: " + ami.Resta2());
                }
                }
                }
                break;
            

            case 7: {
                System.out.println("Adios se ha salido del programa");
                System.exit(0);
                prog = false;
                break;
            }
        } 
            if (i > 7 || i < 1){
                System.out.println("Ingrese un numero del 1 al 7");
                do{
                    i = teclado.nextInt();
                }
                while(i < 8 );

         
                

        }
       
    }
        
        
     }}
    

