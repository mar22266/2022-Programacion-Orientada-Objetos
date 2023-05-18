//Andre marroqui, 22266
//PO
//LAB 1
//import java.text.StringCharacterIterator;
import java.util.Random;

public class persona {
    //atributos
    private int galleta;
    private float confiabilidad;



 

    //metodos
    public persona(){
        galleta = 1;
        confiabilidad = 0;
  
    }

    public persona(int galleta, float confiabilidad){
        this.galleta = galleta;
        this.confiabilidad = confiabilidad;
    
    }

    public int Resta(){
       return galleta-1;
        
    }


    public float confiabilidad(){
        Random rand = new Random();
        confiabilidad = rand.nextFloat(0, 10);
        return confiabilidad;
    }

    public float Ga(){
        return galleta;

    }

    public int getGalleta(int i) {
        return this.galleta;
    }

    public void setGalleta(int galleta) {
        this.galleta = galleta;
    }

    public float getConfiabilidad() {
        return this.confiabilidad;
    }

    public void setConfiabilidad(float confiabilidad) {
        this.confiabilidad = confiabilidad;
    }

    public String getGalleta() {
        return null;
    }



} 

