import java.util.ArrayList;

public class estacionamiento {
    //nombnrar la lista
    ArrayList<parqueos> parqueosL;
    


    
    /** 
     * @return ArrayList<parqueos> get de la lista
     */
    public ArrayList<parqueos> getParqueosL(){
        return this.parqueosL;
    }
  
    
    /** 
     * @param getParqueosL declarar y crear la lista
     */
    public void setParqueosL( ArrayList<parqueos> getParqueosL){
        this.parqueosL = parqueosL;}

    public estacionamiento(){
        parqueosL = new ArrayList<parqueos>();
    }


    
    /** 
     * @param ancho
     * @param alto
     * @param largo contructor para agregar un parqueo
     * @param carac
     */
    public void agregarParqueo(double ancho, double alto,double largo, String carac){
        parqueos Nparq = new parqueos(ancho,alto,largo,carac);
        this.parqueosL.add(Nparq);
    }

    
    /** 
     * @return String to string de los parqueos
     */
    public String parqEsta(){
        int i = 0;
        String r ="";
        while(i<parqueosL.size()){
            r = r + "------ Parqueo "+ i + " ------\n";
            r = r + "Alto: " + parqueosL.get(i).getAlto()+"\n";
            r = r + "Largo: " + parqueosL.get(i).getLargo()+"\n";
            r = r + "Ancho: " + parqueosL.get(i).getAncho()+"\n";
            r = r + "Caracteristicas: " + parqueosL.get(i).getCarac()+"\n";
            r = r + "-----------------------------\n";
            i++;
        }
        return r;
    }

    
    /** 
     * @param i to string de la lista
     */
    public void Usarparq(int i){
        parqueosL.remove(i);
    }

    
    /** 
     * @return String to string de la lista
     */
    public String toString(){
        return "{" + 
        "parqueos = '" + getParqueosL() + "' "+
        "}";




}}
