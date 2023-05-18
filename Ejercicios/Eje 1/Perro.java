//Andre marroqui, 22266
//PO
//EJE 1
import java.util.Random;
public class Perro {

    private int anuncio;
    private int Llamar;
    private int contratar;
    private String perro;

   

    public Perro(){
        anuncio = 0;
        Llamar = 0;
        contratar = 0;
        perro = "Has creado un nuevo perro";
    }

    public Perro(int anuncio, int Llamar, int contratar, String perro){
        this.anuncio =  anuncio;
        this.Llamar =  Llamar;
        this.contratar =  contratar;
        this.perro =  perro;


    }

    
    /** 
     * @return int ver si enceuntra el perro a traves del anuncio 
     */
    public int Anu1(){
        Random rand2 = new Random();
        anuncio = rand2.nextInt(1, 21);
        return anuncio;

    }

    
    /** 
     * @return int ver si encuentra al perro a traves de una llamada
     */
    public int Lla(){
        Random rand3 = new Random();
        Llamar = rand3.nextInt(1,21);
        return Llamar;
    }

    
    /** 
     * @return int ver si encuentra al perro a traves de publicar un anuncio 
     */
    public int Co(){
        Random rand4 = new Random();
        contratar = rand4.nextInt(1, 21);
        return contratar;
    }
    
    
    /** 
     * @return String crea unn nuveo perro 
     */
    public String pe(){
        perro = "Acabas de crear un nuevo perro";
        return perro;
    }

    /** 
     * @return int sets y gets de todos los atributos de perro
     */
    public int getAnuncio() {
        return this.anuncio;
    }

    
    /** 
     * @param anuncio
     */
    public void setAnuncio(int anuncio) {
        this.anuncio = anuncio;
    }

    
    /** 
     * @return int
     */
    public int getLlamar() {
        return this.Llamar;
    }

    
    /** 
     * @param Llamar
     */
    public void setLlamar(int Llamar) {
        this.Llamar = Llamar;
    }

    
    /** 
     * @return int
     */
    public int getContratar() {
        return this.contratar;
    }

    
    /** 
     * @param contratar
     */
    public void setContratar(int contratar) {
        this.contratar = contratar;
    }

    
    /** 
     * @return String
     */
    public String getPerro() {
        return this.perro;
    }

    
    /** 
     * @param perro
     */
    public void setPerro(String perro) {
        this.perro = perro;
    }
}