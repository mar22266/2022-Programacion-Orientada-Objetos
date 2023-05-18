
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;



public class principal {
    
   
    public static void main(String[] args) throws FileNotFoundException{

       
      
        Scanner teclado = new Scanner(System.in);
        estacionamiento e = new estacionamiento();
        control c = new control();
        System.out.println("******Bienvenido al Estacionamiento******\n");
        String menu = "1. Agregar parqueo\n2. Ver parqueos\n3. Agarrar parqueo\n4. Ver estadisticas\n5. Salir\n";
        System.out.println(menu);
        System.out.println("Ingrese una opción del menú: ");
        int o = teclado.nextInt();
        teclado.nextLine();
        while (o < 5 && o>=1 ){
            switch (o){
                case 1:{
                    String rpta = "si";
                    int i = 1;
                    while (rpta.equalsIgnoreCase("si")){
                        System.out.println("Parqueo "+String.valueOf(i-1));
                        System.out.println("Ingrese el ancho del Parqueo: ");
                        double ancho = teclado.nextDouble();
                        System.out.println("Ingrese el alto del Parqueo: ");
                        double alto = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.println("Ingrese si es techado o aereo? ");
                        String carac = teclado.nextLine();
                        System.out.println("Ingrese el largo del Parqueo: ");
                        double largo = teclado.nextDouble();
                        teclado.nextLine();
                        System.out.println("------------------------------------\n");
                        e.agregarParqueo(ancho, alto, largo, carac);
                        i++;
                        System.out.println(e.getParqueosL().get(i-2).getAlto());
                        
                        System.out.println("¿Quiere seguir ingresando? si o no");
                        rpta = teclado.nextLine();
                    }
                    break;
                }
                case 2:{
        
                    System.out.println("El estacionamiento tiene estos Parqueos: ");
                    System.out.println(e.parqEsta());   
                    
                  
                    break;
                }
                case 3:{
                    int u = 1;
                    System.out.println("Ingrese el numero del parqueo que quiere tomar");
                    int parqNum = teclado.nextInt();
                    teclado.nextLine();
                    e.Usarparq(parqNum);
                    System.out.println("Registro "+String.valueOf(u-1));
                    System.out.println("Ingrese la placa del carro: ");
                    String placa = teclado.nextLine();
                    System.out.println("Ingrese el modelo del carro: ");
                    String modelo = teclado.nextLine();
                    System.out.println("Ingrese la marca del carro ");
                    String marca = teclado.nextLine();
                    System.out.println("Ingrese el tiempo que desea comprar en minutos: ");
                    double tiempo = teclado.nextDouble();
                    teclado.nextLine();
                    System.out.println("------------------------------------\n");
                    c.agregarCarro(tiempo, marca, modelo, placa);
                    u++;
                    break;
                }
                case 4:{
                    
                    System.out.println("El registro de los carros es el siguiente: \n");
                    System.out.println(c.regiEsta());
                    System.out.println("------------------------------------\n");
                 
                   
                


                }
            }
            System.out.println(menu);
            System.out.println("Ingrese una opción del menú: ");
            o = teclado.nextInt();
            teclado.nextLine();
            
        }


    }
}

