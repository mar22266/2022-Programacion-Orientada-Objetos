/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */

import java.util.ArrayList;
public class video extends multimedia{
//atributos
    private int framerate; 

//constructor
    public video(String nombre,ArrayList<String> hashtags , String url, int TamanoKb,int framerate, String fecha){
    super(nombre, hashtags , url, TamanoKb,fecha);
    this.framerate= framerate;
    }

//mostrar video
	public void mostrar(){
		System.out.println("\n"+"voy a MOSTRAR este video... con "+ framerate + " fps ");
	}


    
    /** 
     * @return int
     */
    public int getFramerate() {
        return this.framerate;
    }

    
    /** 
     * @param framerate
     */
    public void setFramerate(int framerate) {
        this.framerate = framerate;
    }
    
    
    
    /** 
     * @return String
     */
    public String toString() {
        return " "+nombre+"  "+ fecha + "  "+ 
        hora +" "+ "Likes:"+ likes +" "+ "\n"+ hashtags + "\n[Video]" +
         " "+ url+ "\n"+TamanoKb+" Kb, "+"Framerate: "+ framerate+"\n"
         +"===> Comentarios: "+ comentarios+"\n";
    }
}
