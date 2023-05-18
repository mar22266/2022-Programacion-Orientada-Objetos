public class geografia{

    private String [][] ensena;
    private String [][] repasa;

    public geografia(){
        ensena = new String[8][2]; 
        repasa = new String[8][2];

    }

//matriz para mostrar al usuario 
public void asignarValores(){
    ensena [0][0] = "\nDEPARTAMENTOS" + " ";
    ensena [0][1] = "\tCABECERAS" + "\n\n";
    ensena [1][0] = "-El Progreso" + " ";
    ensena [1][1] = "\t-Guastatoya"+ "\n";
    ensena [2][0] = "-Peten"+ " ";
    ensena [2][1] = "\t\t-Flores"+ "\n";
    ensena [3][0] = "-Alta Verapaz"+ " ";
    ensena [3][1] = "\t-Coban"+ "\n";
    ensena [4][0] = "-Escuintla"+ " ";
    ensena [4][1] = "\t-Escuintla"+ "\n";
    ensena [5][0] = "-Santa Rosa"+ " ";
    ensena [5][1] = "\t-Cuilapa"+ "\n";
    ensena [6][0] = "-Zacapa"+" ";
    ensena [6][1] = "\t-Zacapa"+ "\n";
    ensena [7][0] = "-Guatemala"+ " ";
    ensena [7][1] = "\t-Guatemala"+ "\n";


}
//matriz para repasar
public void repasar(){
    repasa [0][0] = "DEPARTAMENTOS";
    repasa [0][1] = "CABECERAS";
    repasa [1][0] = "El Progreso";
    repasa [1][1] = "Guastatoya";
    repasa [2][0] = "Peten";
    repasa [2][1] = "Flores";
    repasa [3][0] = "Alta Verapaz";
    repasa [3][1] = "Coban";
    repasa [4][0] = "Escuintla";
    repasa [4][1] = "Escuintla";
    repasa [5][0] = "Santa Rosa";
    repasa [5][1] = "Cuilapa";
    repasa [6][0] = "Zacapa";
    repasa [6][1] = "Zacapa";
    repasa [7][0] = "Guatemala";
    repasa [7][1] = "Guatemala";

}



    
    /** setters y getters
     * @return String[][]
     */
    public String[][] getRepasa() {
        return this.repasa;
    }

    
    /** 
     * @param repasa
     */
    public void setRepasa(String[][] repasa) {
        this.repasa = repasa;
    }


    
    /** 
     * @return String[][]
     */
    public String[][] getEnsena() {
        return this.ensena;
    }

    
    /** 
     * @param ensena
     */
    public void setEnsena(String[][] ensena) {
        this.ensena = ensena;

    }




    
    /** to string 
     * @return String
     */
    @Override
    public String toString() {

        return "{" +
            " ensena='" + getEnsena() + "'" +
            "}";
        
    }
 

}