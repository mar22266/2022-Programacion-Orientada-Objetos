/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */
import java.util.ArrayList;

public class imagen extends multimedia {

//atributos
    private String formato; 
    private int resolucion;

//constructor
    public imagen(String nombre, ArrayList<String> hashtags , String url, int TamanoKb, String formato, int resolucion, String fecha){
        super(nombre,hashtags, url, TamanoKb,fecha);
        this.formato= formato;
        this.resolucion=resolucion;
    }

//mostrar imagen
	public void mostrar(){
		System.out.println("\n"+"Estoy mostrando esta imagen... con "+ resolucion + " Megapixeles de resolución ");
	}


    
    /** 
     * @return String
     */
    public String getFormato() {
        return this.formato;
    }

    
    /** 
     * @param formato
     */
    public void setFormato(String formato) {
        this.formato = formato;
    }

    
    /** 
     * @return int
     */
    public int getResolucion() {
        return this.resolucion;
    }

    
    /** 
     * @param resolucion
     */
    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return " "+nombre+"  "+ fecha + "  "+ hora +" "+ "Likes:"+ likes +" "+ "\n"+ hashtags + 
        "\n[Imagen]"+ " " + url+ "\n"+TamanoKb+" Kb, "+formato+" ,"+ 
        resolucion+ " Megapixeles "+"\n"+"===> Comentarios : "+ comentarios+"\n" ;
    }
}
