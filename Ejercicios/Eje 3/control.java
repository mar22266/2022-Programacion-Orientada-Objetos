import java.util.ArrayList;

public class control {
    // nombrar lista
    ArrayList<registro> registroL;
    

    
    /** 
     * @return ArrayList<registro> get de la lista
     */
    public ArrayList<registro> getRegistroL(){
        return this.registroL;
    }

    
    /** 
     * @param getRegistroL hacer visible la lista
     */
    public void setRegistroL(ArrayList<registro> getRegistroL){
        this.registroL = registroL;
    }
    //crear lista
    public control(){
        registroL = new ArrayList<registro>();

    }

   

    
    /** 
     * @param tiempo
     * @param marca
     * @param modelo constructor con parametros para agregar carro
     * @param placa
     */
    public void agregarCarro(double tiempo, String marca, String modelo, String placa){
        registro Nregi = new registro(placa,marca,modelo,tiempo);
        this.registroL.add(Nregi);
    }

    

    
    /** 
     * @return String el to string para regresar valores
     */
    public String regiEsta(){
        int e = 0;
        String a = "";
        while(e<registroL.size()){
            a = a + "------ Registro "+ e + " ------\n";
            a = a + "Tiempo comprado: " + registroL.get(e).getTiempo()+"\n";
            a = a + "Marca: " + registroL.get(e).getMarca()+"\n";
            a = a + "Modelo: " + registroL.get(e).getPlaca()+"\n";
            a = a + "Caracteristicas: " + registroL.get(e).getModelo()+"\n";
            a = a + "-----------------------------\n";
            e++;
        }
        return a;}


        
        /** 
         * @return String to string de la lista
         */
        public String toString(){
            return "{" + 
            "Registro = '" + getRegistroL() + "' "+
            "}";
    
    }
    
}
