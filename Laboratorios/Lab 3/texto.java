/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */
import java.util.ArrayList;

public class texto extends post {
    //atributos
    private String texto; 

 //constructor
    public texto(String nombre, ArrayList<String> hashtags , String texto, String fecha){
        super(nombre,hashtags,fecha);
        this.texto= texto;
    }


    
    /** sets y gets
     * @return String
     */
    public String getTexto() {
        return this.texto;
    }

    
    /** 
     * @param texto
     */
    public void setTexto(String texto) {
        this.texto = texto;
    }


//mostrar texto
	public void mostrar(){
		System.out.println("\n"+"Voy a pasarlo a voz Text to Speech... "+ texto);
	}

    
    /** 
     * @return String
     */
    public String toString() {
        return ""+nombre+"  "+ fecha + "  "+ hora +" "+ "Likes:"+ 
        likes +" "+ "\n"+ hashtags + 
        "\n[Texto]" +" "+ texto+"\n"+"===> Comentarios : "+ comentarios+"\n";
    }

}
