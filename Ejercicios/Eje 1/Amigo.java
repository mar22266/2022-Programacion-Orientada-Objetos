//Andre marroqui, 22266
//PO
//EJE 1
import java.util.Random;
public class Amigo {
    private String amigo;
    private int dinero;
    private int resta1;
    private int resta2;


    public Amigo(){
        amigo = "Has creado un nuevo amigo";
        dinero = 0;

    }

    public Amigo(String amigo, int dinero, int resta1, int resta2){
        this.amigo = amigo;
        this.dinero = dinero;
        this.resta1 = resta1;
        this.resta2 = resta2;

    }

    
    /** 
     * @return int la cantidad de dinero que tiene el usuario 
     */
    public int dinero(){
        Random rand1 = new Random();
        dinero = rand1.nextInt(1, 1001);
        return dinero;
    }

    
    /** 
     * @return String crear un nuevo amigo
     */
    public  String AM(){
        amigo = "Acabas de crear un nuevo amigo";
        return amigo;
    }

    
    /** 
     * @return int la resta de dinero para un anuncio 
     */
    public int Resta1(){
         resta1 = dinero - 25;
         return resta1;
    }

    
    /** 
     * @return int la resta de publicar un anuncio
     */
    public int Resta2(){
        resta2 = dinero - 125;
        return resta2;
   }
   




    
    /** 
     * @return String sets y gets de todos los atributos
     */
    public String getAmigo() {
        return this.amigo;
    }

    
    /** 
     * @param amigo
     */
    public void setAmigo(String amigo) {
        this.amigo = amigo;
    }

    
    /** 
     * @return int
     */
    public int getDinero() {
        return this.dinero;
    }

    
    /** 
     * @param dinero
     */
    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    
    /** 
     * @return int
     */
    public int getResta1() {
        return this.resta1;
    }

    
    /** 
     * @param resta1
     */
    public void setResta1(int resta1) {
        this.resta1 = resta1;
    }

    
    /** 
     * @return int
     */
    public int getResta2() {
        return this.resta2;
    }

    
    /** 
     * @param resta2
     */
    public void setResta2(int resta2) {
        this.resta2 = resta2;
    }



    
}
