/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */

import java.util.ArrayList;

public class emoticono extends post {
    //atributos
    private String emoticon; 

    //constructores
    public emoticono(String nombre,ArrayList<String> hashtags , String emoticon, String fecha){
        super(nombre,hashtags,fecha);
        this.emoticon= emoticon;
    }


    
    /** sets y gets
     * @return String
     */
    public String getEmoticon() {
        return this.emoticon;
    }

    
    /** 
     * @param emoticon
     */
    public void setEmoticon(String emoticon) {
        this.emoticon = emoticon;
    }

//motrar emoticon
	public void mostrar(){
		System.out.println("\n"+"No puedo reproducir esta expresión facial... "+ emoticon);
	}

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return " "+nombre+"  "+ fecha + "  "+ hora +" "+ "Likes:"+
         likes +" "+ "\n"+ hashtags + "\n[Emoticon]"+" "+ 
         emoticon+ "\n"+"===> Comentarios : "+ comentarios+"\n";
    }
}
