/**
 * andre marroquin
 * carne 22266
 * poo lab 3
 * 19/10/22
 */

import java.util.ArrayList;
public class audio extends multimedia {
    private int samplerate; 
    private int bitDepth;

//contructor 


    public audio(String nombre,ArrayList<String> hashtags, String url, int TamanoKb, int samplerate, int bitDepth, String fecha){
        super(nombre,hashtags, url, TamanoKb,fecha);
        this.bitDepth= bitDepth;
        this.samplerate= samplerate;
        
    }


    
    /** sets y gets
     * @return int
     */
    public int getSamplerate() {
        return this.samplerate;
    }

    
    /** 
     * @param samplerate
     */
    public void setSamplerate(int samplerate) {
        this.samplerate = samplerate;
    }

    
    /** 
     * @return int
     */
    public int getBitDepth() {
        return this.bitDepth;
    }

    
    /** 
     * @param bitDepth
     */
    public void setBitDepth(int bitDepth) {
        this.bitDepth = bitDepth;
    }


//mostar audio
	public void mostrar(){
		System.out.println("\n"+"voy a SONAR este audio... con "+ samplerate + "kHz de sample rate y " + bitDepth+" de bit depth");
	}

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return ""+nombre+"  "+ fecha + "  "+ hora +" "+ 
        "Likes:"+ likes +" "+ "\n"+ hashtags + "\n[Audio] "+" "+ url+
         "\n"+TamanoKb+" Kb, "+"Samplerate: "+samplerate+"Khz"+" ,"+"BitDepth:"+
          bitDepth+"\n"+"===> Comentarios: "+ comentarios+"\n";
    }
}

