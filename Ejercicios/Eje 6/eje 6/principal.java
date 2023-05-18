/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        int e = 1;
        producto[] array = new producto[30];
        carrito op = new carrito();
        //MENU PRINCIPAL
        String menu = "-----BIENVENIDO------\n Elija una opcion\n\n 1. Crear Producto\n 2. Ver Productos\n 3. Ver carrito\n 4. Mostrar sucursales\n 5. Salir";
        persistencia miArchivo = new persistencia("./APP.csv");
        Scanner teclado = new Scanner(System.in);
        int opcion = 1;
        
        System.out.println(menu);
        System.out.println("\nElija una opcion");
        opcion = teclado.nextInt();
        teclado.nextLine();
        while (opcion<5 && opcion>=1){
            switch (opcion) {
                case 1:{
                    //MENU PARA CREAR PRODUCTO CON SUS CASES
                    System.out.println("\n 1. Celular\n 2. Laptop\n 3. Desktop\n 4. Tv\n 5. Smartwatch\n 6. Telefono Fijo\n 7. Smartwatch\n 8. Tablet. \n 9. Camara\n 10. Regresar a menu");
                    System.out.println("\nIngrese la opcion que desea");
                    int o = teclado.nextInt();
                    teclado.nextLine();
                    switch(o){
                        case 1:{

                            if((e-1) < array.length){
                                System.out.println("Producto: "+String.valueOf(e));
                                producto pr = new producto();
                                array[e] = new producto();
                                System.out.println("ingrese el nombre");
                                String nombre = teclado.nextLine();
                                array[e] = pr.setNombre(nombre);
                                System.out.println("ingrese el precio");
                                int precio = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setPrecio(precio);
                                System.out.println("ingrese la marca");
                                String marca = teclado.nextLine();
                                array[e] = pr.setMarca(marca);
                                System.out.println("ingrese la fecha de fabricacion");
                                String fechaFabricacion = teclado.nextLine();
                                array[e] = pr.setFechaFabricacion(fechaFabricacion);
                                System.out.println("ingrese la serie");
                                int serie = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setSerie(serie);
                                System.out.println("ingrese el numero de marcador AR");
                                int marcadorAR = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setMarcadorAR(marcadorAR);
                                System.out.println("Ingrese el tipo de dispositivo  ");
                                String tipo = teclado.nextLine();
                                array[e] = pr.setTipo(tipo);
                                array[e] = pr;
                                e++;
                            }


                            break;
                        }

                        case 2:{
                            
                           
                            if((e-1) < array.length){
                                System.out.println("Producto: "+String.valueOf(e));
                                producto pr = new producto();
                                array[e] = new producto();
                                System.out.println("ingrese el nombre");
                                String nombre = teclado.nextLine();
                                array[e] = pr.setNombre(nombre);
                                System.out.println("ingrese el precio");
                                int precio = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setPrecio(precio);
                                System.out.println("ingrese la marca");
                                String marca = teclado.nextLine();
                                array[e] = pr.setMarca(marca);
                                System.out.println("ingrese la fecha de fabricacion");
                                String fechaFabricacion = teclado.nextLine();
                                array[e] = pr.setFechaFabricacion(fechaFabricacion);
                                System.out.println("ingrese la serie");
                                int serie = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setSerie(serie);
                                System.out.println("ingrese el numero de marcador AR");
                                int marcadorAR = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setMarcadorAR(marcadorAR);
                                System.out.println("Ingrese el tipo ");
                                String tipo = teclado.nextLine();
                                array[e] = pr.setTipo(tipo);
                                array[e] = pr;
                                e++;

                                
                            }   
                            break;
                        }

                        case 3:{
                            if((e-1) < array.length){
                                System.out.println("Producto: "+String.valueOf(e));
                                producto pr = new producto();
                                array[e] = new producto();
                                System.out.println("ingrese el nombre");
                                String nombre = teclado.nextLine();
                                array[e] = pr.setNombre(nombre);
                                System.out.println("ingrese el precio");
                                int precio = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setPrecio(precio);
                                System.out.println("ingrese la marca");
                                String marca = teclado.nextLine();
                                array[e] = pr.setMarca(marca);
                                System.out.println("ingrese la fecha de fabricacion");
                                String fechaFabricacion = teclado.nextLine();
                                array[e] = pr.setFechaFabricacion(fechaFabricacion);
                                System.out.println("ingrese la serie");
                                int serie = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setSerie(serie);
                                System.out.println("ingrese el numero de marcador AR");
                                int marcadorAR = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setMarcadorAR(marcadorAR);
                                System.out.println("Ingrese el tipo ");
                                String tipo = teclado.nextLine();
                                array[e] = pr.setTipo(tipo);
                                array[e] = pr;
                                e++;

                                
                            }   
                            break;
                        }

                        case 4:{
                            if((e-1) < array.length){
                                System.out.println("Producto: "+String.valueOf(e));
                                producto pr = new producto();
                                array[e] = new producto();
                                System.out.println("ingrese el nombre");
                                String nombre = teclado.nextLine();
                                array[e] = pr.setNombre(nombre);
                                System.out.println("ingrese el precio");
                                int precio = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setPrecio(precio);
                                System.out.println("ingrese la marca");
                                String marca = teclado.nextLine();
                                array[e] = pr.setMarca(marca);
                                System.out.println("ingrese la fecha de fabricacion");
                                String fechaFabricacion = teclado.nextLine();
                                array[e] = pr.setFechaFabricacion(fechaFabricacion);
                                System.out.println("ingrese la serie");
                                int serie = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setSerie(serie);
                                System.out.println("ingrese el numero de marcador AR");
                                int marcadorAR = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setMarcadorAR(marcadorAR);
                                System.out.println("Ingrese el tipo ");
                                String tipo = teclado.nextLine();
                                array[e] = pr.setTipo(tipo);
                                array[e] = pr;
                                e++;

                                
                            }   
                            break;
                        }

                        case 5:{
                            if((e-1) < array.length){
                                System.out.println("Producto: "+String.valueOf(e));
                                producto pr = new producto();
                                array[e] = new producto();
                                System.out.println("ingrese el nombre");
                                String nombre = teclado.nextLine();
                                array[e] = pr.setNombre(nombre);
                                System.out.println("ingrese el precio");
                                int precio = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setPrecio(precio);
                                System.out.println("ingrese la marca");
                                String marca = teclado.nextLine();
                                array[e] = pr.setMarca(marca);
                                System.out.println("ingrese la fecha de fabricacion");
                                String fechaFabricacion = teclado.nextLine();
                                array[e] = pr.setFechaFabricacion(fechaFabricacion);
                                System.out.println("ingrese la serie");
                                int serie = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setSerie(serie);
                                System.out.println("ingrese el numero de marcador AR");
                                int marcadorAR = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setMarcadorAR(marcadorAR);
                                System.out.println("Ingrese el tipo ");
                                String tipo = teclado.nextLine();
                                array[e] = pr.setTipo(tipo);
                                array[e] = pr;
                                e++;

                                
                            }   
                            break;
                        }

                        case 6:{
                            if((e-1) < array.length){
                                System.out.println("Producto: "+String.valueOf(e));
                                producto pr = new producto();
                                array[e] = new producto();
                                System.out.println("ingrese el nombre");
                                String nombre = teclado.nextLine();
                                array[e] = pr.setNombre(nombre);
                                System.out.println("ingrese el precio");
                                int precio = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setPrecio(precio);
                                System.out.println("ingrese la marca");
                                String marca = teclado.nextLine();
                                array[e] = pr.setMarca(marca);
                                System.out.println("ingrese la fecha de fabricacion");
                                String fechaFabricacion = teclado.nextLine();
                                array[e] = pr.setFechaFabricacion(fechaFabricacion);
                                System.out.println("ingrese la serie");
                                int serie = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setSerie(serie);
                                System.out.println("ingrese el numero de marcador AR");
                                int marcadorAR = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setMarcadorAR(marcadorAR);
                                System.out.println("Ingrese el tipo ");
                                String tipo = teclado.nextLine();
                                array[e] = pr.setTipo(tipo);
                                array[e] = pr;
                                e++;

                                
                            }   
                            break;
                        }

                        case 7:{
                            if((e-1) < array.length){
                                System.out.println("Producto: "+String.valueOf(e));
                                producto pr = new producto();
                                array[e] = new producto();
                                System.out.println("ingrese el nombre");
                                String nombre = teclado.nextLine();
                                array[e] = pr.setNombre(nombre);
                                System.out.println("ingrese el precio");
                                int precio = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setPrecio(precio);
                                System.out.println("ingrese la marca");
                                String marca = teclado.nextLine();
                                array[e] = pr.setMarca(marca);
                                System.out.println("ingrese la fecha de fabricacion");
                                String fechaFabricacion = teclado.nextLine();
                                array[e] = pr.setFechaFabricacion(fechaFabricacion);
                                System.out.println("ingrese la serie");
                                int serie = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setSerie(serie);
                                System.out.println("ingrese el numero de marcador AR");
                                int marcadorAR = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setMarcadorAR(marcadorAR);
                                System.out.println("Ingrese el tipo ");
                                String tipo = teclado.nextLine();
                                array[e] = pr.setTipo(tipo);
                                array[e] = pr;
                                e++;

                                
                            }   
                            break;
                        }

                        case 8:{
                            if((e-1) < array.length){
                                System.out.println("Producto: "+String.valueOf(e));
                                producto pr = new producto();
                                array[e] = new producto();
                                System.out.println("ingrese el nombre");
                                String nombre = teclado.nextLine();
                                array[e] = pr.setNombre(nombre);
                                System.out.println("ingrese el precio");
                                int precio = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setPrecio(precio);
                                System.out.println("ingrese la marca");
                                String marca = teclado.nextLine();
                                array[e] = pr.setMarca(marca);
                                System.out.println("ingrese la fecha de fabricacion");
                                String fechaFabricacion = teclado.nextLine();
                                array[e] = pr.setFechaFabricacion(fechaFabricacion);
                                System.out.println("ingrese la serie");
                                int serie = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setSerie(serie);
                                System.out.println("ingrese el numero de marcador AR");
                                int marcadorAR = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setMarcadorAR(marcadorAR);
                                System.out.println("Ingrese el tipo ");
                                String tipo = teclado.nextLine();
                                array[e] = pr.setTipo(tipo);
                                array[e] = pr;
                                e++;

                                
                            }   
                            break;
                        }

                        case 9:{
                            if((e-1) < array.length){
                                System.out.println("Producto: "+String.valueOf(e));
                                producto pr = new producto();
                                array[e] = new producto();
                                System.out.println("ingrese el nombre");
                                String nombre = teclado.nextLine();
                                array[e] = pr.setNombre(nombre);
                                System.out.println("ingrese el precio");
                                int precio = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setPrecio(precio);
                                System.out.println("ingrese la marca");
                                String marca = teclado.nextLine();
                                array[e] = pr.setMarca(marca);
                                System.out.println("ingrese la fecha de fabricacion");
                                String fechaFabricacion = teclado.nextLine();
                                array[e] = pr.setFechaFabricacion(fechaFabricacion);
                                System.out.println("ingrese la serie");
                                int serie = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setSerie(serie);
                                System.out.println("ingrese el numero de marcador AR");
                                int marcadorAR = teclado.nextInt();
                                teclado.nextLine();
                                array[e] = pr.setMarcadorAR(marcadorAR);
                                System.out.println("Ingrese el tipo ");
                                String tipo = teclado.nextLine();
                                array[e] = pr.setTipo(tipo);
                                array[e] = pr;
                                e++;
                               

                                
                            }   
                            break;
                        }
                        //IMPRIMIR MENU PRINCIPAL
                        case 10:{
                            System.out.println(menu);
                            System.out.println("\nElija una opcion");
                            opcion = teclado.nextInt();
                            break;
                        }

            


                    }

                    break;
                }

                //MOSTRAR PRODUCTOS
                case 2:{
                    for (e = 0; e<array.length ;e++){
                        if(array[e] != null)
                            System.out.println("\n---------Producto: " + e+ "---------" + array[e]+"-----------------------------\n");
                    
                    }
                    //SEGUDNDO MENU AGREGAR A CARRITO O FINALIZAR LA COMPRA
                    System.out.println(" 1. Agregar a carrito\n 2. Finalizar Compra\n 3. Regresar a menu");
                    System.out.println("\nIngrese la opcion que desea");
                    int o = teclado.nextInt();
                    teclado.nextLine();
                    switch(o){
                        case 1:{
                            //AGREGAR A CARRITO
                            System.out.println("Elija el numero del producto que quiere agregar al carritos");
                            int respuesta = teclado.nextInt();
                            op.agregarAlcar(array[respuesta]);
                            System.out.println("Producto agregado\n");
                            



                            break;
                        }

                        case 2:{
                            //FINALIZAR COMPRA
                            Random rand = new Random();
                            
                            System.out.println("Ingrese los datos de su factura");
                            System.out.println("Ingrese su nit");
                            String nit = teclado.nextLine();
                            System.out.println("Ingrese el nombre de la sucursal");
                            String sucursal = teclado.nextLine();
                            System.out.println("Ingrese su nombre ");
                            String nombre = teclado.nextLine();
                            System.out.println("Ingrese la fecha");
                            String fecha = teclado.nextLine();
                            System.out.println("Fcatura No."+ rand.nextInt());
                            System.out.println("Ingrese el costo de su producto: ");
                            Float costo = teclado.nextFloat();



                            System.out.println("---------------- FACTURA --------------------");
                            System.out.println("Nombre: "+ nombre);
                            System.out.println("Sucursal: "+ sucursal);
                            System.out.println("NIT: "+nit);
                            System.out.println("Fecha de emision: "+fecha);
                            System.out.println("Fcatura No."+ rand.nextInt());
                            System.out.println("Total a pagar $. "+costo +"\n");
                        
                            break;
                        }

                        case 3:{
                            //MENU
                            System.out.println(menu);
                            System.out.println("\nElija una opcion");
                            opcion = teclado.nextInt();
                            

                            

                            break;
                        }




                    }
                            System.out.println(menu);
                            System.out.println("\nElija una opcion");
                            opcion = teclado.nextInt();
                            break;
                
                }

                case 3:{
                    //MOSTRAR EL CARRITO
                    for (e = 1; e<array.length ;e++){
                        if(op.getProductos() != null)
                            System.out.println("--------------Producto No." + e+" del carrito-----------" + op.getProductos()+"-------------------------------------------------\n");

                            System.out.println(menu);
                            System.out.println("\nElija una opcion");
                            opcion = teclado.nextInt();
                            

                    break;
                }
            }

                case 4:{
                    //IMPRIMIR FACTURA
                    System.out.println("-----------SUCURSALES DISPONIBLES------------\n");

                    System.out.println("---Tienda No 1---");
                    System.out.println("Nombre: La tiendita");
                    System.out.println("Pais: Guatemala");
                    System.out.println("Ciudad: Guatemala");
                    System.out.println("Codigo: 234512");
                    System.out.println("Dirreccion: 21 ave zona 13 ciudad de guatemala\n");

                    System.out.println("---Tienda No 2---");
                    System.out.println("Nombre: La pacha");
                    System.out.println("Pais: Colombia");
                    System.out.println("Ciudad: Bogota");
                    System.out.println("Codigo: 235611");
                    System.out.println("Dirreccion: 12 calle 11 ave ciudad de bogota\n");

                    System.out.println("---Tienda No 3---");
                    System.out.println("Nombre: El famoso");
                    System.out.println("Pais: Mexico");
                    System.out.println("Ciudad: Guadalajara");
                    System.out.println("Codigo: 330090");
                    System.out.println("Dirreccion: 40 ave 156th street guadalajara\n");

                    System.out.println("---Tienda No 4---");
                    System.out.println("Nombre: Electronics");
                    System.out.println("Pais: Estados Unidos");
                    System.out.println("Ciudad: Florida");
                    System.out.println("Codigo: 33133");
                    System.out.println("Dirreccion: 52th street nw pelican rd, florida \n");
            
                    
        
                    System.out.println(menu);
                    System.out.println("\nElija una opcion");
                    opcion = teclado.nextInt();


                }

                break;

                case 5:{
                    //SALIR

                    System.out.println("Hasta luego");
                }

            

                
                
            }
        
        }


        
       
   





    }
}
