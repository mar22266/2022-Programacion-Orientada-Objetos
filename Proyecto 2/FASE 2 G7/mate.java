/*
 * author: Nelson Eduardo García Bravatti
 * 22434
 * fecha: 28-9-2022
 * clase mate, se encarga de la materia matemática
 */


import java.util.Scanner;
import java.util.ArrayList;



public class mate {

    private int Progreso;
    private int Errores;
    private ArrayList<String> Ejercicios;
    private ArrayList<String> Respuestas; 

    public mate() {

        Ejercicios = new ArrayList<String>(5);
        Respuestas = new ArrayList<String>(5);
    }

        
       /** 
        * @return int
        */
       public int getProgreso() {
        return this.Progreso;
    }

    
    /** 
     * @param Progreso
     */
    public void setProgreso(int Progreso) {
        this.Progreso = Progreso;
    }

    
    /** 
     * @return int
     */
    public int getErrores() {
        return this.Errores;
    }

    
    /** 
     * @param Errores
     */
    public void setErrores(int Errores) {
        this.Errores = Errores;
    }

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getEjercicios() {
        return this.Ejercicios;
    }

    
    /** 
     * @param Ejercicios
     */
    public void setEjercicios(ArrayList<String> Ejercicios) {
        this.Ejercicios = Ejercicios;
    }

    
    /** 
     * @return ArrayList<String>
     */
    public ArrayList<String> getRespuestas() {
        return this.Respuestas;
    }

    
    /** 
     * @param Respuestas
     */
    public void setRespuestas(ArrayList<String> Respuestas) {
        this.Respuestas = Respuestas;
    }

    
    /** 
     * @param Progreso
     * @return mate
     */
    public mate Progreso(int Progreso) {
        setProgreso(Progreso);
        return this;
    }

    
    /** 
     * @param Errores
     * @return mate
     */
    public mate Errores(int Errores) {
        setErrores(Errores);
        return this;
    }

    
    /** 
     * @param Ejercicios
     * @return mate
     */
    public mate Ejercicios(ArrayList<String> Ejercicios) {
        setEjercicios(Ejercicios);
        return this;
    }

    
    /** 
     * @param Respuestas
     * @return mate
     */
    public mate Respuestas(ArrayList<String> Respuestas) {
        setRespuestas(Respuestas);
        return this;
    }

       
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "{" +
            " Progreso='" + getProgreso() + "'" +
            ", Errores='" + getErrores() + "'" +
            ", Ejercicios='" + getEjercicios() + "'" +
            ", Respuestas='" + getRespuestas() + "'" +
            "}";
    }

    /** 
     * método sumar, crea los ejercicios y respuesta de la suma
     */
        public void sumar(){

        Ejercicios.add("¿Cuánto  es 1 + 1?");
        Ejercicios.add("¿Cuánto es 3 + 7?");
        Ejercicios.add("¿Cuánto es 0 + 7?");
        Ejercicios.add("¿Cuánto es 10 + 2?");
        Ejercicios.add("¿Cuánto es 6 + 5?");

        Respuestas.add("2");
        Respuestas.add("10");
        Respuestas.add("7");
        Respuestas.add("12");
        Respuestas.add("11");    

        
    }

    /** 
     * método resta, crea los ejercicios y respuesta de la resta
     */
    public void restar(){

        Ejercicios.add("¿Cuánto  es 1 - 1?");
        Ejercicios.add("¿Cuánto es 3 - 7?");
        Ejercicios.add("¿Cuánto es 0 - 7?");
        Ejercicios.add("¿Cuánto es 10 - 2?");
        Ejercicios.add("¿Cuánto es 6 - 5?");

        Respuestas.add("0");
        Respuestas.add("-4");
        Respuestas.add("-7");
        Respuestas.add("8");
        Respuestas.add("1");

        
    }

}
