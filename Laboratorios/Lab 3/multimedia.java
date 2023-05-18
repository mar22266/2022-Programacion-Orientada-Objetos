/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */
import java.util.ArrayList;


//atributos
public abstract class multimedia extends post{
    protected String url; 
    protected int TamanoKb;



    //constructor
    public multimedia(String nombre,ArrayList<String> hashtags , String url, int TamanoKb, String fecha){
        super(nombre,hashtags,fecha);
        this.TamanoKb = TamanoKb;
        this.url= url;
     
    }


    
    /** likear post
     * @return int
     */
    public int likear(){
		if (likes<0){
			likes = 1;
		}else{
            likes= likes+1;
        }
		return likes; 
	}


    
    /** sets y gets
     * @return String
     */
    public String getUrl() {
        return this.url;
    }

    
    /** 
     * @param url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    
    /** 
     * @return int
     */
    public int getTamanoKb() {
        return this.TamanoKb;
    }

    
    /** 
     * @param TamanoKb
     */
    public void setTamanoKb(int TamanoKb) {
        this.TamanoKb = TamanoKb;
    }


    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return
            "url=" + getUrl() + "\n"+
            "TamanoKb=" + getTamanoKb() + "\n";
    }


}
