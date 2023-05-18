/*Andre Marroquin, 22266
 * POO EJE 6
 * 27 de octubre 2022
 * CODIGO
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;

public class persistencia {
    private File archivo;

    //crear archivo
    public persistencia (String nombreArchivo){
        archivo = new File(nombreArchivo);
        try {
            archivo.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    /** 
     * escribir en el archivo
     * @param linea
     * @param tipo
     * @param marcadorAR
     * @param serie
     * @param fechaFabricacion
     * @param marca
     * @param precio
     */
    public void escribirArchivo(String linea, int precio, String marca, String fechaFabricacion, int serie, int marcadorAR, String tipo){
        try {
            FileWriter e = new FileWriter(archivo);
            e.write(linea);
            e.close();
        } catch (IOException e) {
            
            e.printStackTrace();
        }
    }
    
    /** archivo a arraylist
     * @return ArrayList<String>
     */
    public ArrayList<String> leerArchivo(){
        Scanner miLector;
        ArrayList<String> lineas = new ArrayList<String>();
        try {
            miLector = new Scanner(archivo);        
            while (miLector.hasNextLine()){
                lineas.add(miLector.nextLine());
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return lineas;
    }
    
    /** 
     * leer archhivo
     * @return String
     */
    public String leerArchivoString(){
        String texto = "";
        try {
            Scanner miLector = new Scanner(archivo);
            while (miLector.hasNextLine()){
                texto = texto + miLector.nextLine() + "\n";
            }
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return texto;
    }

    //eliminar archivo
    public void eliminarArchivo(){
        archivo.delete();
    }
}