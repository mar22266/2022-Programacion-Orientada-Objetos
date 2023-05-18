public class lengua{

    private String [][] ensenaL;
    private String [][] repasaL;

    public lengua(){
        ensenaL = new String[6][2]; 
        repasaL = new String[6][2];

    }

//matriz para mostrar al usuario 
public void valoresLengua(){
    ensenaL [0][0] = "\nPALABARA" + " ";
    ensenaL [0][1] = "\tSE TILDA O NO" + "\n\n";
    ensenaL [1][0] = "-organización" + " ";
    ensenaL [1][1] = "\t-SI, Tilde en la o"+ "\n";
    ensenaL [2][0] = "-vagón\t"+ " ";
    ensenaL [2][1] = "\t-SI, tilde en la o"+ "\n";
    ensenaL [3][0] = "-sofá\t"+ " ";
    ensenaL [3][1] = "\t-SI, tilde en la a"+ "\n";
    ensenaL [4][0] = "-Escuintla"+ " ";
    ensenaL [4][1] = "\t-No se tilda"+ "\n";
    ensenaL [5][0] = "-jugarás"+ " ";
    ensenaL [5][1] = "\t-SI, tilde en la a"+ "\n";


}
//matriz para repasar
public void repasaLengua(){
    repasaL [0][0] = "PALABRA";
    repasaL [0][1] = "SE TILA SI O NO";
    repasaL [1][0] = "organización";
    repasaL [1][1] = "si";
    repasaL [2][0] = "vagón";
    repasaL [2][1] = "si";
    repasaL [3][0] = "sofá";
    repasaL [3][1] = "si";
    repasaL [4][0] = "Escuintla";
    repasaL [4][1] = "no";
    repasaL [5][0] = "jugarás";
    repasaL [5][1] = "si";
}


    public String[][] getEnsenaL() {
        return this.ensenaL;
    }

    public void setEnsenaL(String[][] ensenaL) {
        this.ensenaL = ensenaL;
    }

    public String[][] getRepasaL() {
        return this.repasaL;
    }

    public void setRepasaL(String[][] repasaL) {
        this.repasaL = repasaL;
    }


    @Override
    public String toString() {
        return "{" +
            " ensenaL='" + getEnsenaL() + "'" +
            ", repasaL='" + getRepasaL() + "'" +
            "}";
    }



}

