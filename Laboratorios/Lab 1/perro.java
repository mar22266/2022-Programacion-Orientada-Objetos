//Andre marroqui, 22266
//PO
//LAB 1
//import java.text.BreakIterator;
import java.util.Random;


    public class perro {
    //atributos
    private float estadoAnimo;
    private float nivelUmbral;
    private String comportamiento;
    private String comportamiento2;
    private String comportamiento3;

    
    //metodos
    public perro(){
        estadoAnimo = 0;
        nivelUmbral = 0;
        comportamiento = "-MORDIENDO";
        comportamiento2 = "-MOVIENDO LA COLA";
        comportamiento3 = "-LADRANDO";
    }
    public perro(float estadoAnimo, float nivelUmbral,String comportamiento,String comportamiento2, String comportamiento3){
        this.estadoAnimo = estadoAnimo;
        this.nivelUmbral = nivelUmbral;
        this.comportamiento = comportamiento;
        this.comportamiento2 = comportamiento2;
        this.comportamiento3 = comportamiento3;
        
    }
    //crear random de nivel animo del perro
    public float animo1(){
        Random rand1 = new Random();
        estadoAnimo = rand1.nextFloat(-5, 5);
        return estadoAnimo;
    }
    // crea random nivel umbral del perro
    public float umbral1(){
        Random rand2 = new Random();
        nivelUmbral = rand2.nextFloat(-20, 0);
        return nivelUmbral;
    }
    //muerde
    public String comportamiento(){
        if(animo1()< umbral1()){
            return comportamiento;
        }else{
            return "";
        }
    }
    //mueve  la cola
    public String comportamiento2(){
        if(animo1()>0){
            return comportamiento2;
        }
        else{
            return"";
        }
        }
            
      // ladra 
    public String comportamiento3(){
        if((animo1()<0) && animo1()>umbral1()){
            return comportamiento3;
        }
        else{
            return"";
        }
    
    }
            
    
    //sets y gets
    public float getEstadoAnimo() {
        return this.estadoAnimo;
    }

    public void setEstadoAnimo(float estadoAnimo) {
        this.estadoAnimo = estadoAnimo;
    }

    public float getNivelUmbral() {
        return this.nivelUmbral;
    }

    public void setNivelUmbral(float nivelUmbral) {
        this.nivelUmbral = nivelUmbral;
    }

    public String getComportamiento() {
        return this.comportamiento;
    }

    public void setComportamiento(String comportamiento) {
        this.comportamiento = comportamiento;
    }
    
    public String getComportamiento2() {
        return this.comportamiento2;
    }

    public void setComportamiento2(String comportamiento2) {
        this.comportamiento2 = comportamiento2;
    }

    public String getComportamiento3() {
        return this.comportamiento3;
    }

    public void setComportamiento3(String comportamiento3) {
        this.comportamiento3 = comportamiento3;
    }


    

}









    

    
    